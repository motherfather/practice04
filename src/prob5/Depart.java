package prob5;

public class Depart extends Employee {
	private String department;
	
//	public Depart() {
//	}
	
	public Depart(String name, int salary, String department) {
		setName(name);
		setSalary(salary);
		this.department = department;
	}
	
//	void Employee(String name, int salary, String department) {
//		setName(name);
//		setSalary(salary);
//		this.department = department;
//	}
	
	public void getInformation() {
		System.out.println("이름: " + getName() + " 연봉: " + getSalary() + " 부서: " + department);
	}
}
