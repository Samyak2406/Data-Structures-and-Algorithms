import java.util.*;                                                     //Scanner Class Imported
class 2.InversePermutationPS2                                                //InversePermutation class
{
    public static void main(String args[])                              //main 
    {
        Scanner sc = new Scanner(System.in);                            //Scanner class 
        System.out.println("Enter the number of elements to INVERSE PERMUTATION:");     //Printing to enter the numbr of elements
        int n = sc.nextInt();                                           //Number of elements scanned
        int[] arr = new int[n];                                         //Array arr of size n declared
        System.out.println("Enter the Permuted elements in the range of 1 to " + n + " :");     //Enter the elements 
        int i,j;                                                        //Loop control variables
        for(i=0;i<n;i++)                                                //Loop to scan elements of array 
            arr[i] = sc.nextInt();                                      //Elements of array scanned 
        System.out.println("Inverse Permutation is :");             
        System.out.print("{");                                  
        for(i=0;i<n;i++)                                                //Outer Loop 
        {
            for(j=0;j<n;j++)                                            //Inner Loop 
            {
                if(arr[j]==i+1)                                         //Checking the condition
                    System.out.print(" " + (j+1) + ",");                //Printing the values if the condition is satisfied 
            }
        }
        System.out.print("\b}");
    }
}                                                                       //END of the program


