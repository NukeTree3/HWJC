import HW3.Director;
import HW3.Employee;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Employee> employees = new ArrayList<>();
        for(int i = 1; i <= 5; i++){
            Employee employee = new Employee("работник" + i, rand.nextInt(1,28), rand.nextInt(1, 12), rand.nextInt(1950, 2024));
            employee.setSalary(rand.nextInt(50000, 100000));
            employees.add(employee);
        }
        Director director = new Director("руководитель1", 4, 5,1990);
        director.setSalary(100000);
        employees.add(director);

        for(Employee employee : employees){
            System.out.println("зарплата "+ employee.getName()+" до: " + employee.getSalary());
            director.salaryIncrease(employee, employee.getSalary()/10);
            System.out.println("зарплата "+ employee.getName()+" после: " + employee.getSalary());
        }
    }
}