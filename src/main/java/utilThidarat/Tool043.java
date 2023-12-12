package utilThidarat;

public final class Tool043 {
    //private Tool(){}
    public static boolean isUsable999(String s){
        if (s != null && !s.isBlank()) return true;
        return false;
    }

    public static boolean isUsable999(Object[] objects) {
        if (objects != null && objects.length > 0) return true;
        return false;
    }
    public static int count999(Object[] objects){
        if (!isUsable999(objects)) return -1;
        int count = 0;
        for (Object item: objects){
            if (item != null) count++;
        }
        return count;
    }
}
