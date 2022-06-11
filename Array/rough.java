public class rough {
    public static void main(String args[]) {
        int[] arr = new int[] { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
        int neg = 2;
        int pos = 1;
        int temp = arr[pos];
        arr[pos] = arr[neg];
        arr[neg] = temp;
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
