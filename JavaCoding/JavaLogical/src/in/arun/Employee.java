package in.arun;

import java.util.Date;

public class Employee {

	private final int id;
	private final String name;
	private final Date date;
	private final Address address;

	public Employee(int id, String name, Date date, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Date getDate() {
		return  new Date(date.getDate());
	}

	public Address getAddress() {
		return Address.getInstance(address);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", date=" + date + ", address=" + address + "]";
	}

	
}
