package int101w12;
import int101w12.Person;

public class Int101w12Array {
    public static void main(String[] args) {
        demoArray1();
    }

    static void demoArray1() {
        //declaration
        int i;
        double d;
        String s, t;
        Person p;
        // array declaration
        int[] is;
        double[] ds;
        int ii[], iii;
        String[] ss;
        Person[] ps;
        //intailization
        i = 10; //initialize
        d = 2.0; //initialize
        s = "First String";
        t = new String("Second String"); ////initialize,instantiate
        p = new Person("Somchai"); ////initialize,instantantiate

        //array instantaition
        is = new int[(int) d];
        ds = new double[i];
        ss = new String[5];
        ps = new Person[i];

        // array instantaition & initailization การให้ค่า Array
        double[] dArr = {10.0, 20.0, 30.0, 40.0}; // a different array
        var dArr2 = new double[]{1.1, 2.2, 3.3, 4.4, 5.5};
        String[] sArr = {"One", "Two", "Three"};
        var Arr2 = new String[]{"First", "Second", "Third"};
        Person[] pArr = {new Person("Mono"), new Person("Bi" + p)};
        ps = new Person[]{p, p, new Person("Noname")};
    }

    static void demoArray2() {
        var ps = new Person[]{new Person("One"), new Person("Two")};
        int len = ps.length;
        System.out.println("Length of ps " + len);
        System.out.println("Print ps round 1");
        for (int i = 0; i < len; i++) {
            System.out.format("ps[%d]: %s%n", i, ps[i]);
        }
        ps[0] = new Person("Three");
        System.out.println("Print ps round 2");
        for (Person p : ps) { // foe each
            System.out.println("p:" + p);
        }
        var x = new Person[7];
        int count = 0;
        x[0] = new Person("Mono");
        x[1] = new Person("Bi");
        x[2] = new Person("Tri");
        x[3] = new Person("Quad");
        count = 4;
        System.out.println("Print x round 1");
        for (Person p : x) {
            if (p != null)
            System.out.println("p:" + p);
        }
        System.out.println("Print x round 2");
        for (int i = 0; i < count; i++) {
            System.out.format("x[%d] : %s%n", i, x[i]);
        }
    }
}