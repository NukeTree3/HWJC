package HW3;

public class Director extends Employee {
    public Director(String name, int dayOfBirth, int monthOfBirth, int yearOfBirth) {
        super(name, dayOfBirth, monthOfBirth, yearOfBirth);
    }

    public void salaryIncrease(Employee employee, int salary) {
        if(employee.getClass() != Director.class) {
            employee.setSalary(employee.getSalary() + salary);
        }
    }
}
