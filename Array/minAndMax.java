public class minAndMax {
    static int minNumber(int[] a) {
        int min = a[0];
        // for (int i : a) {
        // min = min < i ? min : i;
        // }
        for (int i : a) {
            if (min > i) {
                min = i;
            }

        }
        return min;
    }

    static int maxNumber(int[] a) {
        int max = 0;
        for (int i : a) {
            max = max < i ? i : max;
            // if (max < i) {
            // max = i;
            // }
        }
        return max;
    }
    // static int MinNumber(int[]a){
    // int l = 0;
    // int r = a.length -1;
    // int min = 0;
    // while(l<r){
    // if (a[l]>)
    // }
    // }

    public static void main(String args[]) {
        int[] a = new int[] { 2, 5, 8, 6, 4 };
        System.out.println(minNumber(a));
        System.out.println(maxNumber(a));
    }
}
