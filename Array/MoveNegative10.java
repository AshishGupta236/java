class MoveNegative10 {
    public static void main(String args[]) {
        int[] arr = new int[] { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
        int neg = 0;
        int pos = arr.length - 1;
        while (neg <= pos) {
            if (arr[neg] < 0) {
                neg++;
            } else {
                int temp = arr[pos];
                arr[pos] = arr[neg];
                arr[neg] = temp;
                pos--;
            }
        }
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] < 0) {

        // if (neg != pos) {
        // int temp = arr[pos];
        // arr[pos] = arr[neg];
        // arr[neg] = temp;
        // }
        // pos++;
        // }

        // }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}