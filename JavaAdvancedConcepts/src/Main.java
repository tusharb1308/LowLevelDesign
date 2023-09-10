public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

// GENERICS
/*
with the help of Generic the constraint og datatype go away
        for eg. Box<Object>

        eg. class Box<T>{
            T x;
            T y;
        }
        Box<Integer> b = new Box<Integer>()/Box<>()
        b.x = 10;

        object/T could be int, long, char etc.
        Generic can only be object

primitive - int, float, char, double, boolean
wrapper - INTEGER, FLOAT, CHAR, DOUBLE, BOOLEAN
Autoboxing/unboxing

int x = 10;       // stored in stack
INTEGER y = x;    // stored in heap as it is a object   // autoboxing
int z = y        // unboxing
*/

// COLLECTIONS
// group of item/items kept together
// collections are ready to use data structures
// for eg. arraylist, hashset, hashmap, LL, stack, queue, PriorityQueue