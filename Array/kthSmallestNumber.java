public class kthSmallestNumber {
    // static int kthNumber(int[]a ,int k){
    // for (int i=0;i<a.length-1;i++){
    // for (int j=i;j>=0;j--){
    // if (a[i]>a[j]){
    // int temp = a[i];
    // a[i] = a[j];
    // a[j] = temp;
    // }
    // }
    // }
    // return 0;
    // }
    public static void main(String args[]) {
        int[] arr = new int[] { 7, 10, 4, 3, 20, 15 };
        int k = 3;
        int l = 0;
        int r = arr.length - 1;
        for (int i = l; i <= r; i++) {
            for (int j = i + 1; j <= r; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

}
