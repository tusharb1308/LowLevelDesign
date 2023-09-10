package staticFinalAbstract;

class Point{
    int x;
    int y;
}

public class passByValueAndPassByRef {
    public static void swap(int x, int y){
        int temp = x;
        x = y;
        y = temp;
    }

    // pass by value, but internal changing the attribute values that's why change happened
    public static void swap(Point p){
        int temp = p.x;
        p.x = p.y;
        p.y = temp;
    }

    // pass by value, that's why ref's didn't get swap
    public static void swap(Point p1, Point p2){
        Point p = p1;
        p1 = p2;
        p2 = p;
    }

    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        // pass by value - in java by default everything gets passed by value whether, it is object ref or variable
        swap(x, y);
        System.out.println(x);
        System.out.println(y);

        Point p1 = new Point();
        p1.x = 40;
        p1.y = 50;
        // pass by value but work as ref
        swap(p1);
        System.out.println(p1.x);
        System.out.println(p1.y);

        Point p2 = new Point();
        p2.x = 60;
        p2.y = 70;
        // pass by value
        swap(p1, p2);
        System.out.println(p1.x);
        System.out.println(p1.y);
    }
}
