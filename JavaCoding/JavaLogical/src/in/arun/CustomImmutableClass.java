package in.arun;

import java.util.Date;

public class CustomImmutableClass {
	
	public static void main(String[] args) {

		Address address = new Address("Mumbai", "Maharashtra", "India");
		Employee employee = new Employee(101, "Arun", new Date(), address);
		System.out.println(employee);
		address.setCity("Andheri");
		System.out.println(employee);

	}

}
