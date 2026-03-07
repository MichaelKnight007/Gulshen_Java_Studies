package test.day02_OOP.encapsulation;

import java.util.Scanner;

public class Student_Encapsulated {
    /*
   --------------------------- Static Blocks ---------------------------------------
    */
    static {
        System.out.println(" Bu constructor class'tır.");
    }


    // --------------------------- Fields ---------------------------------------

    private String name;
    private String surname;
    private int age;
    private String email;
    private char gender;
    private double salary;
    private boolean isMarried;
    // private String password;


// --------------------------- Constructor ---------------------------------------

    public Student_Encapsulated(String name, String surname, int age, String email, char gender, double salary, boolean isMarried) {
        // this.name = name;
        setName(name);
        this.surname = surname;
        this.age = age;
        this.email = email;
        this.gender = gender;
        this.salary = salary;
        this.isMarried = isMarried;
    }

    /*




     /*
   --------------------------- Getters/Setters ---------------------------------------
    */

    public String getName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the password to get tha name: ");
        String password = input.nextLine();

        if (!(password.equals("asdf"))) {
            System.err.println("Girdiğiniz password yanlıştır, kontrol ederek tekrar giriniz.");
            System.exit(1);

        }
        return name;
    }

    public void setName(String name) {

        if (name == null || name.length() < 3 || name.length() >
                50 || name == "        ") {
            System.err.println("Girdiğiniz ismi kontrol ediniz, yanlış.");
            System.exit(-1);
        }
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if (age < 0 || age > 150) {
            System.err.println("Yaşınızı kontrol ediniz, hatalı.");
            System.exit(-1);
        }
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }


    // --------------------------- Methods ---------------------------------------


    public void working() {
        System.out.println(this.name + " is working.");
    }

    public void sleeping() {
        System.out.println(this.name + " " + this.surname + " is sleeping");
    }

// --------------------------- toString() ---------------------------------------

    @Override
    public String toString() {
        return "Student_Encapsulated{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                ", salary=" + salary +
                ", isMarried=" + isMarried +
                '}';
    }
}
