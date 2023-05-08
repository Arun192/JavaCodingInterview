package in.arun.java;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeSort {

	private String name;
	private int age;
	private String department;

	public EmployeeSort() {
		// TODO Auto-generated constructor stub
	}

	public EmployeeSort(String name, int age, String department) {
		super();
		this.name = name;
		this.age = age;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "EmployeeSort [name=" + name + ", age=" + age + ", department=" + department + "]";
	}
	
	public static void main(String[] args) {
		
		List<EmployeeSort> list = new ArrayList<>();
		list.add(new EmployeeSort("Arun", 26, "IT"));
		list.add(new EmployeeSort("Ajay", 31, "CS"));
		list.add(new EmployeeSort("Abhi", 36, "EXTC"));
		list.add(new EmployeeSort("Ashish", 24, "USER"));
		list.add(new EmployeeSort("Akhil", 28, "HR"));
		list.add(new EmployeeSort("Pratik", 29, "Manager"));
		
		System.out.println("All Employees : "+list);
		
		Stream<EmployeeSort> sorted = list.stream().sorted(Comparator.comparing(EmployeeSort::getName).thenComparing(Comparator.comparingInt(EmployeeSort::getAge))
				.thenComparing(Comparator.comparing(EmployeeSort::getDepartment)));
		for (EmployeeSort employeeSort : list) {
			System.out.println(employeeSort);
		}
		
	}

}
