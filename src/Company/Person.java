package Company;

import Company.Group;
import Company.Instructor;
import Company.Mentor;

import java.util.Arrays;

public abstract class Person {
    private long id;
    private String fullName;
    private int age;
    private char gender;

    public Person(long id, String fullName, int age, char gender) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
    }public Person (){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Company.Person{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
    public abstract double period (Group group);
    public static void sortAge(Instructor[] instructors, Student[] students, Mentor[] mentors){
      int [] array = new  int[instructors.length];
       int index = 0;
        for (Instructor instructor:instructors) {
           array[index] = instructor.getAge();
           index ++;
        }Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < instructors.length; j++) {
                if(array[i] == instructors[j].getAge()){
                    System.out.println(instructors[j]);
                }
            }
        }
        int [] array1 = new int [students.length];
        int index1 = 0;
        for (Student student:students) {
            array1[index1] = student.getAge();
            index1 ++;
        }Arrays.sort(array1);
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < students.length; j++) {
                if(array1[i] == students[j].getAge()){
                    System.out.println(students[j]);
                }
            }
        }
        int [] array2 = new  int [mentors.length];
        int index2 = 0;
        for (Mentor mentor:mentors) {
            array2[index2] = mentor.getAge();
            index2 ++;
        }Arrays.sort(array2);
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < mentors.length; j++) {
                if(array2[i] == mentors[j].getAge()){
                    System.out.println(mentors[j]);
                }
            }
        }
    }
}
