package lab5.ex3;
class EmployeeException extends Exception {
  
	private static final long serialVersionUID = -4927181229589389574L;

	public EmployeeException(String message) {
        super(message);
    }
}

class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void validateSalary() throws EmployeeException {
        if (salary < 3000) {
            throw new EmployeeException("Salary is below 3000 for employee: " + name);
        }
    }
}

public class Lab5Ex3 {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John", 2500);
        Employee employee2 = new Employee("Alice", 3500);

        try {
            employee1.validateSalary();
            System.out.println("Employee 1's salary is valid.");
        } catch (EmployeeException e) {
            System.out.println("Employee 1's salary exception: " + e.getMessage());
        }

        try {
            employee2.validateSalary();
            System.out.println("Employee 2's salary is valid.");
        } catch (EmployeeException e) {
            System.out.println("Employee 2's salary exception: " + e.getMessage());
        }
    }
}
