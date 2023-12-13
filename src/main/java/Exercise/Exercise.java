package Exercise;
import java.util.Arrays;

public class Exercise {
    public static int sumElementArray(int[] numArr){
        int sum = 0;
        // forEach
        // for(int num : numArr){
        // sum += num;
        // }
        for (int i = 0; i < numArr.length; i++) {
            sum += numArr[i];
        }
        return sum;
    }
    public static int avgElementArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum / arr.length;
    }
    // [1,2,3,4]
    // taget = 2
    // return index = 1
    public static int findIndexArray(int[] arr, int target) {
        // int index = 0;
        // for(int num : arr){
        // if(num == target){
        // return index;
        // }
        // index++;
        // }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    public static boolean arrayContain(int[] arr, int target) {
        // Arrays.sort(arr);
        // return Arrays.binarySearch(arr,target) >= 0;
        // for (int i = 0; i < arr.length; i++) {
        // if(arr[i] == target){
        // return true;
        // }
        // }
        for (int i : arr) {
            if (i == target) {
                return true;
            }
        }
        return false;
    }
    public static void sortArray(int[] arr) {
        Arrays.sort(arr);
    }
    public static void sortArrayEachIndex(int[] arr, int start, int ceiling) {
        Arrays.sort(arr, 0, 3);
    }
    public static int[] copyArray(int[] arr) {
        return Arrays.copyOf(arr, arr.length + 1);
    }
    public static int[] copyArrayEachIndex(int[] arr, int index) {
        // [1,2,3,4,5] // 5
        // 123
        // [1,2,3]
        int[] newArr = Arrays.copyOf(arr, index + 1);
        // [1,2,3,0,0]
        return Arrays.copyOf(newArr, arr.length);
    }
    public static int[] copySystemArray(int[] arr, int startIndex) {
        // [1,2,3,4,5]
        // [3,4,5]
        // [3,4,5,0,0]
        int[] newArr = { 0 };
        System.arraycopy(arr, startIndex, newArr, 0, arr.length - 1);
        return newArr;
    }
    public static int maximum(int[] arr) {
        int max = arr[0];
        // [1,8,3,4,5]
        // arr[i] > max
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static int min(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    public static int[] minAndmax(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return new int[] { min, max };
    }
    // แบบที่ 1
    // [1,2,3,4,5,6]
    // [1,3,4,5,6,0]
    // แบบที่ 2
    // [1,2,3,4,5,6]
    // [1,6,3,4,5,0]
    // index = 1
    // [1,2,3,4]
    // [1,3]
    public static boolean removeElementArray(int[] arr, int index) {
        for (int i = index; i < arr.length - 1; i++) {
            // arr[1] = arr[2]
            // arr[2] = arr[3]
            // arr[3] = arr[4]
            arr[i] = arr[i + 1];
        }
        // [1.2,3,4]
        // [1,3,3,4]
        // [1,3,4,4]
        arr[arr.length - 1] = 0;
        return true;
    }
    public static boolean removeElementString(String[] arr, String target) {
        if (arr[0] == null) {
            return false;
        }
        int count = 0;
        // [a,b,c,d]
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                count++;
            }
        }
        int index = 0;
        for (int i = 0; i < count; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }
        for (int i = index; i < count - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[count - 1] = null;
        return true;
    }
    public static boolean removeMethod_3(String[] arr, int index) {
        if (arr[0] == null) {
            return false;
        }
        // [a,b,c,d]
        // [a,d,c,null]
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                count++;
            }
        }
        arr[index] = arr[count - 1];
        // [a,d,c,d]
        arr[count - 1] = null;
        return true;
    }
}

