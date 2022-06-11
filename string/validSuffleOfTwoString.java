public class validSuffleOfTwoString {
    public static void main(String args[]) {
        String s1 = "XY";
        String s2 = "12";
        String res = "Y1X2";

        if (s1.length() + s2.length() != res.length()) {
            System.out.println("Invalid");
        }
        int i = 0;
        int status1 = 0;
        int status2 = 0;
        for (; i < s1.length() - 1; i++) {
            if (res.indexOf(s1.charAt(i)) < res.indexOf(s1.charAt(i + 1))) {
                status1 = 1;
            }

        }

        for (i = 0; i < s2.length() - 1; i++) {
            if (res.indexOf(s2.charAt(i)) < res.indexOf(s2.charAt(i + 1))) {
                status2 = 1;
            }
        }
        if (status1 == 1 && status2 == 1) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }

}
