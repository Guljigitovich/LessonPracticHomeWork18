package Company;

import Company.Group;

import java.time.LocalDate;

public class Instructor extends Person {
    private double salary;

    public Instructor(long id, String fullName, int age, char gender,double salary) {
        super(id, fullName, age, gender);
        this.salary=salary;

    }public Instructor(){

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Company.Instructor{" +
                "salary=" + salary +
                '}';
    }

    @Override
    public double period(Group group) {
        LocalDate localDate = group.getDateOfFinish().
                minusYears(group.getDateOfStart().getYear()).minusMonths(group.getDateOfStart().getMonthValue()).
                minusDays(group.getDateOfStart().getDayOfMonth());
        return localDate.getMonthValue() * getSalary();
    }
}
