package Driver;

import java.time.LocalDate;
import java.time.Month;

public class Programmer extends Person{
    public Programmer(int id, String fullName, byte age, char gender, String email, String phoneNumber, double governmentsSalary) {
        super(id, fullName, age, gender, email, phoneNumber, governmentsSalary);
    }

    @Override
    public void favoriteSport() {
        System.out.println("Shahmat");
    }

    @Override
    public String favoriteLanguage() {
        return "English ";
    }

    @Override
    public Month favoriteMonth(int month) {
        return Month.of(month);
    }

    @Override
    public String getLastName() {
        return "Last name: "+getFullName();
    }

    @Override
    public LocalDate getDateOfBirth() {
        return LocalDate.now().minusYears(getDateOfBirth().getYear());
    }

    @Override
    public String getPhoneNumberAndEmail() {
        return "Phone number :"+getPhoneNumber();
    }

    @Override
    public long getPeopleOfAllAges(Person[] people) {
        for (Person person:people) {
            System.out.println(person.getAge());
        }
        return 0;
    }
}
