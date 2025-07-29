package superReducedString;

public class SuperReducedString {


    public static String reduceString(String s)
    {
        StringBuilder sb = new StringBuilder(s);
        int i = 0;
        while (i < sb.length() - 1) { // Iterate until the second-to-last character
            if (sb.charAt(i) == sb.charAt(i + 1)) {
                sb.delete(i, i + 2); // Delete the pair
                i = 0; // Restart from the beginning to re-check for new pairs
            } else {
                i++; // Move to the next character
            }
        }

        if (sb.length() == 0) {
            return "Empty String";
        } else {
            return sb.toString();
        }
    }
    public static void main(String[] args) {
        System.out.println("Reduce aaaabccdde : " + reduceString("aaaabccdde"));;
        System.out.println("Reduce abc : " + reduceString("abc"));
        System.out.println("Reduce adggda : " + reduceString("adggda"));;
    }
}
