package in.arun;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class WayToBreakSingleton {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, FileNotFoundException, IOException, CloneNotSupportedException {
		
		Singleton originalSingletonInstance = Singleton.getInstance();
		Singleton duplicateSingletonInstance = Singleton.getInstance();

		System.out.println("Hashcode for originalSingletonInstance is : "+originalSingletonInstance.hashCode());
		System.out.println("Hashcode for duplicateSingletonInstance is : "+duplicateSingletonInstance.hashCode());

		//Reflection API
		Class<?> singletonClass = Class.forName("in.arun.Singleton");
		
		Constructor<Singleton> constructor =(Constructor<Singleton>) singletonClass.getDeclaredConstructor();
		constructor.setAccessible(true);
		System.out.println("Hashcode for originalSingletonInstance is : "+originalSingletonInstance.hashCode());

		Singleton brokenReflectionSingletonInstance = constructor.newInstance();
		System.out.println("brokenReflectionSingletonInstance is : "+ brokenReflectionSingletonInstance.hashCode());
		
		System.out.println("=========================================================");
		
		System.out.println("Serialization Broken Singleton ...! ");
		
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("C:\\Serialization\\Serialization.ser"));
		objectOutputStream.writeObject(originalSingletonInstance);
		objectOutputStream.close();
		
		//deserialization
		
		ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("C:\\Serialization\\Serialization.ser"));
		Object brokenSingletonUsingSerializations = (Singleton)inputStream.readObject();
		System.out.println("Hashcode for originalSingletonInstance is : "+originalSingletonInstance.hashCode());
		System.out.println("brokenSerializationSingletonInstance is : "+ brokenReflectionSingletonInstance.hashCode());

		System.out.println("================================================");
		System.out.println("Break using thread Clonable ...!");
		
		Singleton brokenSingletonUsingCloning = (Singleton) originalSingletonInstance.clone();
		System.out.println("Hashcode for originalSingletonInstance is : "+originalSingletonInstance.hashCode());
		System.out.println("brokenSingletonUsingCloning is : "+ brokenSingletonUsingCloning.hashCode());
	}

}
