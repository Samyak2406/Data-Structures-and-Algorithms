import java.util.*;
import java.io.*;

class Reader {
  static BufferedReader reader;
  static StringTokenizer tokenizer;
  static void init(InputStream input) {
      reader = new BufferedReader(
                   new InputStreamReader(input) );
      tokenizer = new StringTokenizer("");
  }
  static String next() throws IOException {
      while ( ! tokenizer.hasMoreTokens() ) {
          tokenizer = new StringTokenizer(
                 reader.readLine() );
      }
      return tokenizer.nextToken();
  }
  static int nextInt() throws IOException {
      return Integer.parseInt( next() );
  }
  static long nextLong() throws IOException {
      return Long.parseLong( next() );
  }    
  static double nextDouble() throws IOException {
      return Double.parseDouble( next() );
  }
}


class Main
{
    static int top = -1;
    static int size;
    static void push(int[] a)
    {
        Reader.init(System.in);
        if(top == size-1)
        {
            System.out.println("Stack Overflow");
            return;
        }
        System.out.print("Enter the number to be added in the Stack:   ");
        int num = Reader.nextInt();
        top++;
        a[top] = num;
    }
    static void pop(int[] a)
    {
        if(top == -1)
        {
            System.out.println("Stack UnderFlow");
            return;
        }
        int del = a[top];
        top--;
        System.out.println("Popped element is : " + del);
    }
    static void display(int[] a)
    {
        int i;
        if(top == -1)
        {
            System.out.println("Empty Stack");
            return;
        }
        for(i=top;i>=0;i--)
            System.out.println("|_____" + a[i] + "_____|");
    }
    public static void main (String[]args) throws IOException {
	    
        Reader.init(System.in);
		System.out.println ("----------STACK----------");
		System.out.print("Enter the size of the array :    ");
		size = Reader.nextInt();
		int[] stack = new int[size];
		int n;
		do {
			System.out.println ("1. Push");
			System.out.println ("2. Pop");
			System.out.println ("3. Display");
			System.out.println("Any other number to exit");
			System.out.print ("Enter your choice :    ");
			n = Reader.nextInt();
			switch(n)
			{
				case 1:
				push(stack);
				break;
				case 2:
				pop(stack);
				break;
				case 3:
				display(stack);
				break;
				default:
				break;
			}
		}while(n==1 || n==2 || n==3);
	}
}
