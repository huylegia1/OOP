package Lab4;

public class Min {
    public static int min(int[] num) {
        int be = Integer.MAX_VALUE;
        for (int i=0; i< num.length; i++) {
            if (num[i] <= be) {
                be = num[i];
            }
        }
        return be;
    }
}
