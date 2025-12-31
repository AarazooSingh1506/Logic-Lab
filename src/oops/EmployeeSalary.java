package oops;

public class EmployeeSalary {
	private String name;
	private Double salary;
	
	public void setName(String name) {
		if(name==null || name.trim().isEmpty()) {
			System.out.println("Invalid name");
		}else {
			this.name = name;
		}
	}
	public void setSalary(double salary) {
		if(salary < 10000 || salary > 500000) {
			System.out.println("Invalid salary");
		}else {
			this.salary=salary;
		}
	}
	public void raise(double percent) {
		if(percent<0 || percent>100) {
			System.out.println("Invalid raise Percentage");
		}else {
			salary = salary + (salary * percent / 100);
			System.out.println("Updated salary: " + salary);
		}
	}
	public static void main(String[] args) {
		
		EmployeeSalary emp = new EmployeeSalary();
		
		emp.setName("");
		emp.setSalary(9000);
		emp.setSalary(120000);
		emp.raise(10);
		emp.raise(200);
		
	}

}
