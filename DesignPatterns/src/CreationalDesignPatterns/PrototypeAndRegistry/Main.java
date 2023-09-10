package CreationalDesignPatterns.PrototypeAndRegistry;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception{
        RegistryStudent registryStudent = new RegistryStudent();
        // starting a new batch -> 100 students
        // create 1 enrollment at a time, and pass all the details
        // 2 -> create 100 enrollments with the common data, and later on add individual attribute values

        // 2 is better and preferable
        // for option 2, there should be a way to create clones of students

        Student s = new Student(1, "Tushar", 100, "Dec22", "LLD",
                "BE", 2023, "Sandeep", 2023, "Razorpay",
                70);
        List<Student> studentList =new ArrayList<>();
        for(int i=1; i<=100; i++){
            studentList.add(s.clone());
        }

        Student aug23 = new Student(0,"",0,"Aug23","LLD","BE",2023,"Naman",2023,"Razorpay",70);
        Student may23 = new Student(0,"",0,"May23","DSA","FS",2023,"Mohit",2023,"Razorpay",70);
        registryStudent.addToRegistry(aug23.getBatchName(), aug23);
        registryStudent.addToRegistry(may23.getBatchName(), may23);

        Student yasiAu23 = registryStudent.getFromRegistry("Aug23").clone();
        yasiAu23.setId(1);
        yasiAu23.setName("Yasi");
        yasiAu23.setPsp(99);
    }

    public static Student getClone(Student s){
//        Student s1 = new Student();

//        // Problems
//        // 1. Need to know all details about Student class
//        s1.setId(s.getId());
//        s1.setName(s.getName());
//        s1.setPsp(s.getPsp());
//        s1.setBatchName(s.getBatchName());
//        s1.setJoinYear(s.getJoinYear());
//        s1.setCompletionYear(s.getCompletionYear());
//        s1.setTrack(s.getTrack());
//        s1.setInstructorName(s.getInstructorName());
//        s1.setModuleName(s.getModuleName());
          // 3. hidden attributes will not get copied
//        // s1.setPaymentPartner(s.getPaymentPartner());
//
//        // 2. any change in student attributes will make this method change as well
//        s1.setBatchPSP(s.getBatchPSP());
//
//        return s1;
        return s.clone();
    }
}
