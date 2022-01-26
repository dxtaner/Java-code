public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome("abba"));
        System.out.println(isPalindrome("abbaabas"));
        System.out.println(isPalindrome("!Ey edip adanada pide yE!"));
    }

    static boolean isPalindrome(String str) {
        String reverseStr = "";
        for(int i=str.length()-1; i>=0; i--){
            reverseStr+=str.charAt(i);
        }

        if(str.equals(reverseStr))
            return true;
        else
            return false;
    }
}
