package HW3;

public class Employee {

    private String name;

    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;

    int salary;


    public Employee(String name, int dayOfBirth, int monthOfBirth, int yearOfBirth) {
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public int comparison(int anotherDayOfBirth, int anotherMonthOfBirth, int anotherYearOfBirth) {
        int res = (this.yearOfBirth - anotherYearOfBirth)*10000;
        res += (this.monthOfBirth - anotherMonthOfBirth)*100;
        res += this.dayOfBirth - anotherDayOfBirth;
        return res;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
}
