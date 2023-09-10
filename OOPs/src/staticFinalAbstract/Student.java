package staticFinalAbstract;

public class Student {
    // we can access a static member directly using a class Name because these attributes are present as class
    // specific not object specific, these are kind of common attributes which are present in class structure
    // not in every object
    static int fullMarks = 100;
    int marks;

    public Student(){
    }

    public Student(int marks){
        this.marks = marks;
    }

    public Student(int marks, int fullMarks){
        this.marks = marks;
        this.fullMarks = fullMarks;
    }

    public void printStudentMarks(){
        System.out.println("Full marks = " + Student.fullMarks);
        System.out.println("Marks obtained = " + this.marks);
    }

    public static void printFullMarks(Student s){
        System.out.println("Static Full marks = " + Student.fullMarks);
//        System.out.println("Marks obtained = " + this.marks);   // from static method cant access non-static attributes,
//        because non-static attributes are object specific and static methods are present at class level
        System.out.println("Static Marks obtained = " + s.marks);  // non-static attributes can be accessed in static methods
//      only using object ref
    }

    public static void greet(){
        System.out.println("Hi, How are you ?");
    }

}
