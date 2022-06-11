public class arrangeInAlternative {
    public static void main(String args[]) {
        int[] arr = new int[] { 1, 2, 3, -4, -1, 4 };
        int neg = 0;
        int pos = 0;
        int i = 0;
        while (i < arr.length) {
            if (arr[neg] < 0) {
                while (pos < arr.length) {
                    if (arr[pos] > 0) {
                        int temp = arr[neg];
                        arr[neg] = arr[pos];
                        arr[pos] = temp;
                    }
                }
            }
            neg++;
            pos++;
            i++;

        }
        for (int j : arr) {
            System.out.println(j);
        }
    }
}
