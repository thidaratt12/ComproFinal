package valuableThidarat;

import utilThidarat.Tool043;
public class Container043 {
    private final Item043[] items = new Item043[5];
    @Override
    public String toString() {
        return "Count: " + Tool043.count043(items) + ", " + Arrays.toString(items);
    }
    public boolean add(Item043 item) {
        int check = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null){
                items[i] = item;
                return true;
            } else if (item.isMatched(items[i])) {
                items[i] = item;
                return true;
            }else{
                check++; //นับว่ามีที่เหลือมั้ย
            }
        }
        //ถ้าเท่ากันแปลว่า ไม่มีที่ null เหลือ
        if (check == items.length) return false;
        return true;
    }
    public boolean remove(Item043 item) {
        for (int i = 0; i < items.length; i++) {

            if (items[i] != null && items[i].isMatched(item)){
                items[i] = null;
                return true;
//                for (int j = i; j < items.length - 1 ; j++) {
//                    items[j] = items[j + 1];
//                }
//                items[items.length - 1] = null;
//                return true;
            }
        }
        return false;
    }
}
