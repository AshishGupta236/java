class reverse {
    public static void main(String args[]) {
        int[] a = new int[5];
        for (int i = 0; i < 5; i++) {
            a[i] = i + 1;
        }
        for (int i : a) {
            System.out.print(i + " ");
        }
        int l = 0, r = a.length - 1;
        while (l <= r) {
            int temp = a[l];
            a[l] = a[r];
            a[r] = temp;
            l++;
            r--;
        }
        for (int i : a) {
            System.out.print(i + " ");
        }

    }
}