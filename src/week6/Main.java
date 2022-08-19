package week6;

public class Main {
    public static void main(String[] args) {
        // aaaaaaaa
        // aaaa
        // aa

        String regex1 = "a?"; // "a" or "" ( 0 or 1)
        String regex2 = "a+"; // "a" or "aaa" or "aaa" ... ( 1 or more)
        String regex3 = "a*"; // "a" or "" ( 0 or more )]

        String regex4 = "a{5}"; //(5)
        String regex5 = "a{5,10}"; //( 5 <= times < 10)
        String regex6 = "a{5,}"; //( 5 <= times < INFINITY)
        String regex7 = "a{0,5}"; //( 0 <= times < 5)


        System.out.println("aaaa".matches(regex1));
        System.out.println("aaaa".matches(regex2));
        System.out.println("aaaa".matches(regex3));
        System.out.println("aaaa".matches(regex4));
        System.out.println("aaaa".matches(regex5));
        System.out.println("aaaa".matches(regex6));
        System.out.println("aaaa".matches(regex6));
        System.out.println("aaaa".matches(regex7));

        String phoneNumberRegex = "^036\\d{6}6$";
        System.out.println("0361412421".matches(phoneNumberRegex));
        System.out.println("036112421".matches(phoneNumberRegex));

    }
}
