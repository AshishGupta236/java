class firstAndLastOccurrences {
    public static void main(String args[]) {
        int[] a = new int[] { 1, 3, 5, 5, 5, 5, 7, 123, 125 };
        // finding first occurrence
        int target = 5;
        int[] result = new int[2];
        int start = 0;
        int end = a.length - 1;

        while (start <= end) {
            int index = -1;
            int mid = start + (end - start) / 2;
            if (a[mid] >= target)
                end = mid - 1;
            else
                start = mid + 1;
            if (a[mid] == target)
                result[0] = mid;

        }
        start = 0;
        end = a.length - 1;
        while (start <= end) {
            int index = -1;
            int mid = start + (end - start) / 2;
            if (a[mid] <= target)
                start = mid + 1;
            else
                end = mid - 1;
            if (a[mid] == target)
                result[1] = mid;
        }
        System.out.println(result[0] + " " + result[1]);
    }
}