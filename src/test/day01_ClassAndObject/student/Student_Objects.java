package test.day01_ClassAndObject.student;

import test.day02_OOP.encapsulation.Student_Encapsulated;

public class Student_Objects {

    public static void main(String[] args) {


        // --------------------------- Objects ---------------------------------------

        Student_RegularClass student_1 = new Student_RegularClass();
        Student_RegularClass student_2 = new Student_RegularClass();
        Student_WithConstructor student_3_Constructor=new Student_WithConstructor("Gülşen", "Yurdakul", 18, "adsfa@gmail.com", 'F',250000,true);


        Student_WithConstructor student_4_Constructor=new Student_WithConstructor("Michael","Knight",52, "michael@gmail.com", 'M');
        Student_WithConstructor student_5_Constructor=new Student_WithConstructor();


        Student_Encapsulated student_6_Encapsulated=new Student_Encapsulated("Gülşen", "Yurdakul", 18, "adsfa@gmail.com", 'F',250000,true);


        System.out.println("student_1 = " + student_1);
        //student_1 = Student_RegularClass{age=0, name='null', surname='null', email='null', gender='null', salary=0.0, isMarried=false}


        //    --------------------------- Objects Values ---------------------------------------
        student_1.name = "Gülşen";
        student_1.surname = "Yurdakul";
        student_1.age = 25;
        student_1.email = "dsadfas@gmail.com";
        student_1.gender = 'F';
        student_1.salary = 250000;
        student_1.isMarried = true;


        student_2.name = "Michael";
        student_2.surname = "Knight";
        student_2.age = 52;
        student_2.email = "michael@gmail.com";
        student_2.gender = 'M';
        student_2.salary = 150000;
        student_2.isMarried = true;






         /*
    --------------------------- Printing Objects ---------------------------------------
     */

        System.out.println("---------------------------------------------------");
        System.out.println();
        System.out.println("student_1 = " + student_1);
        System.out.println();
        System.out.println("student_2 = " + student_2);
        System.out.println("---------------------------------------------------");
        System.out.println("student_3_Constructor = " + student_3_Constructor);

        System.out.println("---------------------------------------------------");
        System.out.println("student_4_Constructor = " + student_4_Constructor);


        student_2.name = "                          John";

        System.out.println("student_2 = " + student_2);

        student_6_Encapsulated.setName("EKE");
        student_6_Encapsulated.setAge(23);

        //System.out.println("student_6_Encapsulated = " + student_6_Encapsulated);

        System.out.println("==================================================================");
        System.out.println("student_6_Encapsulated.getName() = " + student_6_Encapsulated.getName());




         /*
    --------------------------- Methods/Actions ---------------------------------------
     */


        System.out.println("============================================================================");
        student_1.working();
        student_2.sleeping();

    }


}
