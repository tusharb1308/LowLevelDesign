package access_modifiers;

import access_modifiers.ampackage.c1;

public class accessModifiers extends c1 {
    public static void main(String[] args) {
        System.out.println("outside package class");

        c1 obj = new c1();
        System.out.println(obj.name);               // public(globally by importing the class)
//        System.out.println(obj.salary);           // private(only in class)
//        System.out.println(obj.role);             // default(cant access outside same package whether it is child class or not)
//        System.out.println(obj.phnNo);            // protected(reference variable of parent class)

        accessModifiers obj1 = new accessModifiers();
        System.out.println(obj1.name);               // public(globally by importing the class)
//        System.out.println(obj1.salary);           // private(only in class)
//        System.out.println(obj1.role);             // default(cant access outside same package whether it is child class or not)
        System.out.println(obj1.phnNo);              // protected(can access in child class using child class reference variable)

    }
}
