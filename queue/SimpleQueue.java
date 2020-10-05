import java.util.*;
class Main
{
    static int r = -1;
    static int f = -1;
    static int size;
    static void push(int[] a)
    {
        Scanner in = new Scanner(System.in);
        if(r == size-1)
        {
            System.out.println("Stack OverFlow.");
            return;
        }
        System.out.print("Enter the number to be entered in the Queue :   ");
        int num = in.nextInt();
        r++;
        a[r] = num;
        if(f==-1)
            f = 0;
    }
    static void pop(int[] a)
    {
        if(f == -1)
        {
            System.out.println("Stack Empty.");
            return;
        }
        if(r == f - 1)
        {
            System.out.println("Stack Empty.");
            r = f = -1;
            return;
        }
        int del = a[f];
        f++;
        System.out.println("Popped element is : " + del);
    }
    static void display(int[] a)
    {
        if(r == f - 1)
        {
            System.out.println("Stack Empty");
        }
        if(r == -1)
        {
            System.out.println("No elements in the Stack");
        }
        System.out.println("Elements in the Stack array are :");
        int i;
        System.out.print("Elements  ");
        for(i=f;i<=r;i++)
            System.out.print(a[i]+ "  ");
        System.out.println();
        System.out.print("Index     ");
        for(i=f;i<=r;i++)
            System.out.print(i + "  ");
            System.out.println();
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
