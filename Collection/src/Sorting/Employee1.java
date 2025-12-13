package Sorting;

public class Employee1 implements Comparable<Employee1> {

	private int id;
	private String name;
	private int salary;

	Employee1(int id, String name, int salary) {

		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee1 o) {
		if (this.salary == o.salary) {
			return this.name.compareTo(o.name);
		}
		if (this.name == o.name) {
			return this.id - o.id;
		}
		return this.id - o.id;
	}

	public String toString() {

		return "id " + id + " name " + name + " Salary " + salary;
	}

}
