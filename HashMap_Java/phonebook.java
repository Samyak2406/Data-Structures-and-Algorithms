import java.util.*;

class Main
{
    public static void main (String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the numbers");
        HashMap<String, Integer> caller = new LinkedHashMap();
        int n = in.nextInt();
        in.nextLine();

        for(int i = 0; i < n; ++i) {
            String name = in.nextLine();
            int phone = in.nextInt();
            caller.put(name, phone);
            in.nextLine();
        }

        while(in.hasNext()) {
            String s = in.nextLine();
            if (caller.containsKey(s)) {
                System.out.println(s + "=" + caller.get(s));
            } else {
                System.out.println("Not found");
            }
        }

        in.close();
    }
}
