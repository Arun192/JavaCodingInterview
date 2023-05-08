package in.arun;

import java.io.Serializable;

public class Singleton implements Serializable,Cloneable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static Singleton instance= null;
	
	private Singleton() {
		// TODO Auto-generated constructor stub
	}
	
	public static synchronized Singleton getInstance() {
		
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
