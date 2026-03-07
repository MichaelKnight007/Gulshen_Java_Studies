package test.day01_ClassAndObject.student;

public class Student_RegularClass {

    /*
    --------------------------- Static Blocks ---------------------------------------
     */
    static{
        System.out.println(" Bu regular class'tır.");
    }


    /*
   --------------------------- Fields ---------------------------------------
    */
    String name;
    String surname;
    int age;
    String email;
    char gender;
    double salary;
    boolean isMarried;



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
        return "Student_RegularClass{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                ", isMarried=" + isMarried +
                '}';
    }
}
