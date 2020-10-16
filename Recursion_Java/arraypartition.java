import java.util.*;

class Main
{
    private static boolean partition(int[] a, int sum, int i, ArrayList<Integer> ans) {
        if (i <= a.length && sum >= 0) {
            if (sum == 0) {
                return true;
            } else {
                ans.add(a[i]);
                boolean leftPossible = partition(a, sum - a[i], i + 1, ans);
                if (leftPossible) {
                    return true;
                } else {
                    ans.remove(ans.size() - 1);
                    return partition(a, sum, i + 1, ans);
                }
            }
        } else {
            return false;
        }
    }

    public static void main (String[]args)
    {
        int[] a = new int[]{2, 1, 2, 3, 4, 8};
        int sum = 0;

        for(int i = 0; i < a.length; ++i) {
            sum += a[i];
        }

        ArrayList<Integer> result = new ArrayList();
        if (sum % 2 == 0) {
            partition(a, sum, 0, result);
            Iterator var5 = result.iterator();

            while(var5.hasNext()) {
                int e = (Integer)var5.next();
                System.out.println(e + " ");
            }
        } else {
            System.out.println("Array partition cannot take place.");
        }
    }
}
