package Company;

import Company.Company;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {




        Mentor mentor = new Mentor(1234567890,"Petrov Andrei",28,'M',30000);
        Mentor mentor1 = new Mentor(1424567890,"Aleksandra Anna",25,'F',45000);
        Mentor mentor2 = new Mentor(1334567890,"Samaibekova Aijan",26,'F',35000);
        Mentor mentor3 = new Mentor(1232367890,"Jaiulov Azamat",35,'M',55000);
        Mentor mentor4 = new Mentor(1534567890,"Seiitov Mirlan",25,'M',35000);
        Mentor[] mentors = {mentor,mentor4,mentor1,mentor2,mentor3};

        Student student = new Student(12343535,"Kanatov Argen",18,'M',12000);
        Student student1 = new Student(13343535,"Aktanova Asel",20,'F',12000);
        Student student2 = new Student(13243535,"Majitova Aigerim",17,'F',12000);
        Student student3 = new Student(154343535,"Bakytbekov Sultan",18,'M',12000);
        Student student4 = new Student(11343535,"Sanjarov Atai",19,'M',12000);
        Student[] students = {student,student4,student1,student2,student3};

        Group group = new Group("Java-8",students, LocalDate.of(2021,12,1),LocalDate.of(2022,9,2));
        Group group1 = new Group("JS-8",students, LocalDate.of(2021,1,3),LocalDate.of(2022,10,2));
        Group group2 = new Group("Python-3",students, LocalDate.of(2022,9,3),LocalDate.of(2023,7,3));
        Group group3 = new Group("C++-4",students, LocalDate.of(2022,3,5),LocalDate.of(2023,4,6));
        Group[] groups = {group3,group1,group2,group};

        Instructor instructor = new Instructor(23445112,"Alekseev Sergei",30,'M',50000);
        Instructor instructor1 = new Instructor(23425112,"Asanova Diana",20,'F',45000);
        Instructor instructor2 = new Instructor(22345112,"Mirbekov Albert",27,'M',55000);
        Instructor instructor3 = new Instructor(11445112,"Maksatova Akmoor",25,'F',50000);
        Instructor[] instructors = {instructor,instructor1,instructor3,instructor2};

        Course course = new Course("Java",groups,instructor2,mentors);
        Course course1 = new Course("JS",groups,instructor1,mentors);
        Course course2 = new Course("Python",groups,instructor,mentors);
        Course course3 = new Course("C++",groups,instructor3,mentors);
        Course[] courses = {course,course3,course1,course2};

        PeaksoftHouse peaksoftHouse = new PeaksoftHouse("Peaksoft House","Grajdanskaia 119",courses,"kyrgyz");
        ItAcademy itAcademy = new ItAcademy("Makers","Sovetskii / Toktogul",courses,"russia");

        Company company = new Company();
      //  System.out.println("Sum contract students :"+Company.Company.income(students));

        for (Student massive:students) {
            for (Group massive1 : groups) {
                System.out.println("Pay contract"+" "+massive.period(massive1)+" "+massive.getFullName());
            }
        }
        for (Instructor massive:instructors) {
            for (Group massive1:groups) {
                System.out.println("Pay contract"+" "+massive.period(massive1)+" "+massive.getFullName());
            }
        }
        for (Mentor massive:mentors) {
            for (Group massive1:groups) {
                System.out.println("Pay contract"+" "+massive.period(massive1)+" "+massive.getFullName());
            }
        }

        Person.sortAge(instructors,students, mentors);


    }


}