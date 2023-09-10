package constructor;

public class main {
    public static void main(String[] args) {
//        car Nexon = new car(); // default constructor call
//        System.out.println(Nexon.companyName);
//        System.out.println(Nexon.color);
//        System.out.println(Nexon.price);

//        default constructor and value initilization
//        deep copy
//        car Nexon = new car();
//        Nexon.color = "blue";
//        Nexon.price = 500000;
//        Nexon.companyName = "Tata";
//        Nexon.engineType = "electric";
//
//        System.out.println(Nexon.companyName);
//        System.out.println(Nexon.color);
//        System.out.println(Nexon.price);

        // 0 argument constructor call
//        car tataHarrier = new car();
//        System.out.println(tataHarrier.price);
//        System.out.println(tataHarrier.color);
//        System.out.println(tataHarrier.companyName);
//        System.out.println(tataHarrier.model);
//        System.out.println(tataHarrier.engineType);

//        argument/parameterised constructors
        car vitaraBrezza = new car("maruti", "brezza base model", 1300000);
//        System.out.println(vitaraBrezza.price);
//        System.out.println(vitaraBrezza.color);
//        System.out.println(vitaraBrezza.companyName);
//        System.out.println(vitaraBrezza.model);
//        System.out.println(vitaraBrezza.engineType);

        car hyundaiCreta = new car("hyundai", "creta", 1800000, "black", "diesel");
//        System.out.println(hyundaiCreta.price);
//        System.out.println(hyundaiCreta.color);
//        System.out.println(hyundaiCreta.companyName);
//        System.out.println(hyundaiCreta.model);
//        System.out.println(hyundaiCreta.engineType);

//        copy constructor
//        deep copy
        car hyundaiCreteNewModel = new car(hyundaiCreta);
//        System.out.println(hyundaiCreteNewModel.price);
//        System.out.println(hyundaiCreteNewModel.color);
//        System.out.println(hyundaiCreteNewModel.companyName);
//        System.out.println(hyundaiCreteNewModel.model);
//        System.out.println(hyundaiCreteNewModel.engineType);

        car vitaraBrezzaNewModel = new car(vitaraBrezza);
//        System.out.println(vitaraBrezzaNewModel.price);
//        System.out.println(vitaraBrezzaNewModel.color);
//        System.out.println(vitaraBrezzaNewModel.companyName);
//        System.out.println(vitaraBrezzaNewModel.model);
//        System.out.println(vitaraBrezzaNewModel.engineType);

//        shallow copy
        car vitaraBrezzaNewModelWithUpdation = vitaraBrezzaNewModel;
//        System.out.println(vitaraBrezzaNewModel.price);
//        System.out.println(vitaraBrezzaNewModel.color);
//        System.out.println(vitaraBrezzaNewModel.companyName);
//        System.out.println(vitaraBrezzaNewModel.model);
//        System.out.println(vitaraBrezzaNewModel.engineType);
    }
}
