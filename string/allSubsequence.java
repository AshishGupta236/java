public class allSubsequence {
    static void print_sub(String input, String output) {
        if (input.length() == 0) {
            System.out.print(output + " ");
            return;
        }
        print_sub(input.substring(1), output);
        print_sub(input.substring(1), output + input.charAt(0));
    }

    public static void main(String args[]) {

        print_sub("abc", "");
    }

}
