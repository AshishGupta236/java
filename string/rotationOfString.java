public class rotationOfString {
    public static void main(String args[]) {
        String s = "ABCDE";
        String x = "CDEAF";
        s = s + s;
        if (s.indexOf(x) >= 0)
            System.out.println("yes");
        else
            System.out.println("No");
    }

}
