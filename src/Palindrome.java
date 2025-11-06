public class Palindrome {
    public static void main(String[] args) {
        String str = "Hello Java";
        String str2 = "t";
        for (int i = str.length() - 1; i >= 0; i--) {
            str2 += str.charAt(i);
        }
        if (args.equals(str2)) {
            System.out.printf("Jii HAi");
        } else {
            System.out.printf("Nhi Hai");
        }
    }
}
