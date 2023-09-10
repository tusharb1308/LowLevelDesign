package inheritance;

import java.lang.management.MemoryNotificationInfo;

public class Main {
    public static void main(String[] args) {
        Mentor m1 = new Mentor(1, 5);
        Mentor m2 = new Mentor(1, "Tushar", "9914550644", 5);

        System.out.println(m1.name);
        System.out.println(m1.phoneNumber);
        System.out.println(m1.rating);
        System.out.println(m1.getId());

        System.out.println(m2.name);
        System.out.println(m2.phoneNumber);
        System.out.println(m2.rating);
        System.out.println(m2.getId());

        m2.setId(2);
        System.out.println(m2.getId());

        m2.greet();
        m2.greetAll();
        m2.greetFromMentor();

        User u = new User(3, "Bansal", "1234567");
        System.out.println(u.name);
        System.out.println(u.phoneNumber);
        System.out.println(u.getId());
        u.helloWorld();
//        u.greetFromMentor();

        // Upcasting and DownCasting - take example of old tv with old specs with old remote and a new upgraded tv
        //                             with new specs and new remote
        // upcasting is using old tv remote on new tv and downcasting is using new tv remote on old tv, in both the
        // cases new features which are present in new tv will not be accessible only the existing/common features will
        // get accessed whether we use any of the remote on any of the tv
        // similarly using reference variable of child class on parent class object and reference variable of parent class
        // on child class object only the attributes present in parent class will be accessible

        System.out.println("-------Upcasting---------");
        // upcasting(old remote on new tv)
        User up = new Mentor(1041, "TushaR BansaL", "8728030972", 4);

        System.out.println(up.name);
        System.out.println(up.getId());
        System.out.println(up.phoneNumber);
//        System.out.println(up.rating);          // not accessible as child class attribute
        up.greet();
//        up.greetFromMentor();                   // not accessible as child class attribute


        System.out.println("-------Downcasting---------");
        // downcasting(new remote on old tv)
        Mentor down = (Mentor) new User();  // runtime error

        // upcasting is doable(compilable without any error) and usable(runnable)
        // but downcasting is only doable but not usable in terms of inheritance, because highly prone to error
        // so next question is then why downcasting exists, it exists because of type casting
        // for eg.
//        long l = 100;
//        int x = (int)l;

    }
}
