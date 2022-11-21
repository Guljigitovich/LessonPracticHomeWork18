package Driver;

import java.time.LocalDate;
import java.time.Month;

public class Doctor extends Person{
    public Doctor(int id, String fullName, byte age, char gender, String email, String phoneNumber, double governmentsSalary) {
        super(id, fullName, age, gender, email, phoneNumber, governmentsSalary);
    }

    @Override
    public void favoriteSport() {
        System.out.println("Voleibol");
    }

    @Override
    public String favoriteLanguage() {
        return "Franch";
    }

    @Override
    public Month favoriteMonth(int month) {
        return Month.of(month);
    }

    @Override
    public String getLastName() {
        return getFullName();
    }

    @Override
    public LocalDate getDateOfBirth() {
        return LocalDate.now().minusYears(getDateOfBirth().getYear());
    }

    @Override
    public String getPhoneNumberAndEmail() {
        return getPhoneNumber();
    }

    @Override
    public long getPeopleOfAllAges(Person[] people) {
        for (Person person:people) {
            System.out.println(person.getAge());
        }
        return 0;
    }
}
