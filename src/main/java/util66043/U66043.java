package util66043;
import java.util.Random;

public final class U66043 {
    private static long seed043 = 66130500043L;
    private U66043(){}
    public static long unique043() {
        long result = seed043;
        seed043 += 1 + (int)(9 * Math.random()); // 1-10 * 9
        return result;
    }
    public static int checkDigit043(long number){
        if (number < 10) return -1;
        int sum = 0;
        for (int sign = 1; number > 0; number /= 10 , sign = 0-sign){
                sum += number % 10 * sign;
        }
        if (sum < 0) sum = 0 - sum ;
        return sum % 10;
    }
}
