import java.util.*;
class Main
{
    static int coinMax(int[] a, int l, int r) {
        return l + 1 == r ? Math.max(a[l], a[r]) : Math.max(a[l] + Math.min(coinMax(a, l + 1, r - 1), 
                coinMax(a, l + 2, r)), 
                a[r] + Math.min(coinMax(a, l, r - 2),
                coinMax(a, l + 1, r - 1)));
    }

    public static void main (String[]args)
    {
        Scanner sc = new Scanner(System.in);
	    System.out.println ("----------SIMPLE QUEUE----------");
        System.out.print("Enter the size of the array :    ");
        size = sc.nextInt();
        int[] queue = new int[size];
        int n;
        do {
	    System.out.println ("1. Push");
	    System.out.println ("2. Pop");
	    System.out.println ("3. Display");
	    System.out.println("Any other number to exit");
	    System.out.print ("Enter your choice :    ");
        n = sc.nextInt();
        switch(n)
        {
            case 1:
                push(queue);
                break;
            case 2:
                pop(queue);
                break;
            case 3:
                display(queue);
                break;
            default:
                break;
        }
        }while(n==1 || n==2 || n==3);
    }
}
