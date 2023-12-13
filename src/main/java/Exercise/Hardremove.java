package Exercise;
import java.util.Arrays;
public class Hardremove {
    public static void main(String[] args) {
        String[] str = {"a","b","c","d","e"};
        System.out.println(Arrays.toString(str));
        remove(str, 0);
        remove(str, 1);
        remove(str, 2);
        remove(str, 3);
        remove(str, 4);
        remove(str, 4);
        System.out.println(Arrays.toString(str));
    }
    // [1,2,3,4]
    // [1,null,3,4]
    //
    static boolean remove(String[] arrStr,int index){
        int count = 0;
        for(int i = 0; i < arrStr.length;i++){
            if(arrStr[i] != null){
                count++;
            }
        }
        if(count == 0) return false;

        int i = 0;
        int j = 0;
        while(i != count){
            if(arrStr[j] != null){
                if(j == index){
                    arrStr[j] = null;
                    return true;
                }
                i++;
            }
            j++;
        }

        return false;
    }
}
