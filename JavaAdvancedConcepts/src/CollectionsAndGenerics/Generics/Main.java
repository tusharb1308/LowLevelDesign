package CollectionsAndGenerics.Generics;

public class Main {
    public static void main(String[] args) {
//        Box<Integer, Boolean> box = new Box<Integer, Boolean>();
        Box<Integer, Boolean> box = new Box<>();
        box.flag = true;
        box.x = 13;
        box.y = 9;

        int x = 10;
        Integer y = x; // primitive to wrapper -> Autoboxing
        int z = y; // wrapper to primitive -> Unboxing

        long a = 100;
        Integer i = 50;
        long l = i;

        int intVal = 10;
        long longVal = intVal;    // implicit

        long x1 =10;
        int i1 = (int)x1;        // explicit

        System.out.println(box.x);
        System.out.println(box.y);
        System.out.println(box.z);
        System.out.println(box.flag);
        System.out.println(box.a);
    }
}
