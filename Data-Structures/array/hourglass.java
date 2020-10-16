import java.util.*;
class Main
{
    
    private static final Scanner scanner;
    
    public static void main (String[]args)
    {
        scanner = new Scanner(System.in);
        int max = -2147483648;
        int[][] arr = new int[6][6];
        System.out.println("Enter the elements");

        int i;
        int j;
        for(i = 0; i < 6; ++i) {
            for(j = 0; j < 6; ++j) {
                arr[i][j] = scanner.nextInt();
            }
        }

        for(i = 0; i < 4; ++i) {
            for(j = 0; j < 4; ++j) {
                int current = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                System.out.println(current);
                if (current > max) {
                    max = current;
                }
            }
        }

        System.out.println(max);
        scanner.close();
    }
}
