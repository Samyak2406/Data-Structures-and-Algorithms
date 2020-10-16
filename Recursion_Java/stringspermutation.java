import java.util.*;
class Main
{
    static Set<String> mySet = new HashSet();

    static void permutations(String s, int l, int r) {
        if (l == r) {
            if (!mySet.contains(s)) {
                mySet.add(s);
                System.out.println(s);
            }
        } else {
            for(int i = l; i < r; ++i) {
                s = interchangeChar(s, l, i);
                permutations(s, l + 1, r);
                s = interchangeChar(s, l, i);
            }

        }
    }

    static String interchangeChar(String s, int a, int b) {
        char[] array = s.toCharArray();
        char temp = array[a];
        array[a] = array[b];
        array[b] = temp;
        return String.valueOf(array);
    }

    public static void main (String[]args)
    {
        String query = "abcd";
        permutations(query, 0, query.length());
    }
}
