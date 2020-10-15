import java.util.*;
class Main
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first word");
        String a = sc.nextLine();
        System.out.println("enter the second word");
        String b = sc.nextLine();
        a = a.trim();
        b = b.trim();
        boolean isAnagram = false;
        boolean[] repeat = new boolean[a.length()];
        if (a.length() == b.length()) {
            for(int i = 0; i < a.length(); ++i) {
                isAnagram = false;

                for(int j = 0; j < b.length(); ++j) {
                    if (b.charAt(j) == a.charAt(i) && !repeat[j]) {
                        repeat[j] = true;
                        isAnagram = true;
                        break;
                    }
                }

                if (!isAnagram) {
                    break;
                }
            }
        }

        if (isAnagram) {
            System.out.println("Strings are Anagram");
        } else {
            System.out.println("Strings are not Anagram");
        }
    }
}
