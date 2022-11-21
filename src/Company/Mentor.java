package Company;

import Company.Group;
import Company.Instructor;

import java.time.LocalDate;

public class Mentor extends Instructor {

    public Mentor(long id, String fullName, int age, char gender, double salary) {
        super(id, fullName, age, gender, salary);
    }

    @Override
    public double period(Group group) {
        LocalDate localDate = group.getDateOfFinish().
                minusYears(group.getDateOfStart().getYear()).minusMonths(group.getDateOfStart().getMonthValue()).
                minusDays(group.getDateOfStart().getDayOfMonth());

        return localDate.getMonthValue() * getSalary();
    }
}
