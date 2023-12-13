package int101final043;
import utilThidarat.Tool043;
import valuableThidarat.Container043;
import valuableThidarat.Item043;

import valuableThidarat.Item043;

public class int101w13final {
    public static void main(String[] args) {
        testTool();
        System.out.println("------------------");
        testItem();
        System.out.println("------------------");
        testContainer();
    }
    static void testTool(){
        Object[] objects = new Object[0];
        System.out.println(Tool043.isUsable999(""));
        System.out.println(Tool043.isUsable999("Hello"));
        System.out.println(Tool043.isUsable999(objects));
        System.out.println("Count : " + Tool043.count999(objects));
        objects = new Object[5];
        System.out.println(Tool043.isUsable999(objects));
        System.out.println(Tool043.count999(objects));
        objects[1] = "Hello";
        System.out.println(Tool043.count999(objects));
        System.out.println(objects[1]);
        objects[2] = 5;
        objects[3] = true;
        System.out.println(Tool043.isUsable999(objects));
        System.out.println(Tool043.count999(objects));
    }
    static void testItem() {
        System.out.println("Create: " + Item043.create("Fred", 10));
        System.out.println("Create: " + Item043.create("Viktor", 5));
        System.out.println("Create: " + Item043.create("", 5));
        System.out.println(".........");
        System.out.println("Add: " + Item043.create("Megan",5).add(Item043.create("Ted",4)));
        System.out.println(".........");
        System.out.println("Name Matched: " + Item043.create("Jason",1).isMatched(Item043.create("Jason",5)));
        System.out.println("Name Matched: " + Item043.create("Jason",1).isMatched(Item043.create("May",1)));

    }
    static void testContainer(){
        Item043 item1 = new Item043("Jason", 5);
        Item043 item2 = new Item043("Mandy", 3);
        Item043 item3 = new Item043("Ted", 10);
        Item043 item4 = new Item043("Freddy", 2);
        Item043 item5 = new Item043("Chick", 7);
        Item043 item6 = new Item043("Fox", 15);
        Container043 container = new Container043();
        container.add(item1);
        System.out.println(container);
        container.add(item2);
        System.out.println(container);
        container.add(item3);
        container.add(item4);
        container.add(item5);
        System.out.println(container);
        container.remove(item1);
        System.out.println(container);
    }
}
