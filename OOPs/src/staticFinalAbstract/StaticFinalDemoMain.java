package staticFinalAbstract;

public class StaticFinalDemoMain{
    public static void main(String[] args) {
        Student.fullMarks = 100;

        Student s1 = new Student(90);
        Student s2 = new Student(80);

        System.out.println(s1.marks + ", " + s1.fullMarks + ", " + Student.fullMarks);
        System.out.println(s2.marks + ", " + s2.fullMarks + ", " + Student.fullMarks);

        s2.fullMarks = 90;    // not a good practice, highly prone to errors, we should access static variables using
        // ClassName instead of object, because user might he has done change for only s2 object but it will change
        // for all the objects because static members are class specific

        System.out.println(s1.marks + ", " + s1.fullMarks + ", " + Student.fullMarks);
        System.out.println(s2.marks + ", " + s2.fullMarks + ", " + Student.fullMarks);

        Student obj = new Student(50);
        obj.printStudentMarks();
        obj.printFullMarks(new Student(40));

        Student.printFullMarks(obj);

        IntelligentStudent is = new IntelligentStudent();
        is.greet();  // is -> IntelligentStudent -> IntelligentStudent.greet()
        IntelligentStudent.greet();

        Student sref = new IntelligentStudent();
        sref.greet();  // sref -> Student -> Student.greet()

//        User.galaxy = "Parallel galaxy";     // error
        System.out.println(User.galaxy);

        User u = new User("O+");
//        u.bloodGroup = "O-";               // error
        System.out.println(u.bloodGroup);
        System.out.println(u.galaxy + " using object ref");
    }
}
