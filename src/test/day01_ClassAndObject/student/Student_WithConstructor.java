package test.day01_ClassAndObject.student;

public class Student_WithConstructor {

    /*
    --------------------------- Static Blocks ---------------------------------------
     */
    static {
        System.out.println(" Bu constructor class'tır.");
    }


    /*
   --------------------------- Fields ---------------------------------------
    */
    String name;
    public String surname;
    public int age;
    public String email;
    public char gender;
    public double salary;
    public boolean isMarried;


    // --------------------------- Constructors ---------------------------------------

    public Student_WithConstructor(String name, String surname, int age, String email, char gender, double salary, boolean isMarried) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.email = email;
        this.gender = gender;
        this.salary = salary;
        this.isMarried = isMarried;
    }

    public Student_WithConstructor(String name, String surname, int age, String email, char gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.email = email;
        this.gender = gender;
    }

    public Student_WithConstructor() {
    }

    /*
    --------------------------- Methods ---------------------------------------
     */

    public void working() {
        System.out.println(this.name + " is working.");
    }

    public void sleeping() {
        System.out.println(this.name + " " + this.surname + " is sleeping");
    }

// --------------------------- toString() ---------------------------------------

    @Override
    public String toString() {
        return "Student_WithConstructor{" +
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
