package Company;

import Company.Group;
import Company.Person;

import java.time.LocalDate;

public class Student extends Person {
    private double contract;

    public Student(long id, String fullName, int age, char gender,double contract) {
        super(id, fullName, age, gender);
        this.contract=contract;

    }

    public double getContract() {
        return contract;
    }

    public void setContract(double contract) {
        this.contract = contract;
    }

    @Override
    public String toString() {
        return "Company.Student{" +
                "contract=" + contract +
                '}';
    }

    @Override
    public double period(Group group) {
        LocalDate localDate = group.getDateOfFinish().
                minusYears(group.getDateOfStart().getYear()).minusMonths(group.getDateOfStart().getMonthValue()).
                minusDays(group.getDateOfStart().getDayOfMonth());
        return localDate.getMonthValue() * getContract();
    }

}
