package valuableThidarat;
import
public class Item043 {
    public class Item043;
    private final String name;
    private int amount;

    public Item043(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }
    public static Item043 create(String name, int amount){
        if (Tool043.isUsable043(name) && amount > 0) return new Item043(name,amount);
        return null;
    }
    @Override
    public String toString(){
        return String.format("Item999 (Name: %s, Amount: %d)", name,amount);
    }
    public int add(Item043 item){
        int sum = amount + item.amount;
        amount = sum;
        return sum;
    }
    public boolean isMatched(Item043 item){
        if (item.name != null && item.name.equals(name)) return true;
        return false;
    }
}

