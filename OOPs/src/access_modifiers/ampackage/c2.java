package access_modifiers.ampackage;

public class c2{
    private int companyId = 13197496;   // private

    public void display(){
        System.out.println(companyId + " in class c2");
    }

    public static void main(String[] args) {
        c1 obj = new c1();

        System.out.println(obj.name);           // public(global accessible)
        System.out.println(obj.phnNo);          // protected(child class, whether same or diff package using child class reference variable
                                                // and same package)
        System.out.println(obj.role);           // default(access inside same package, )
//        System.out.println(obj.salary);       // private(only in class)


    }
}
