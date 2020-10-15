import java.util.*;
class Main
{
    static void fillingVal(int[][] a, int r, int c, int toFill, int prevFill) {
        int rowSize = a.length;
        int colSize = a[0].length;
        if (r >= 0 && c >= 0 && r < rowSize && c < colSize) {
            if (a[r][c] == prevFill) {
                a[r][c] = toFill;
                fillingVal(a, r - 1, c, toFill, prevFill);
                fillingVal(a, r + 1, c, toFill, prevFill);
                fillingVal(a, r, c - 1, toFill, prevFill);
                fillingVal(a, r, c + 1, toFill, prevFill);
            }
        }
    }

    static void printFilling(int[][] arr) {
        for(int i = 0; i < arr.length; ++i) {
            for(int j = 0; j < arr[0].length; ++j) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }

    }
    
    public static void main (String[]args)
    {
        int[][] arr = new int[][]{{1, 1, 2, 1, 3, 2}, {1, 3, 2, 1, 1, 3}, {3, 2, 2, 1, 3, 2}, {1, 1, 2, 1, 2, 3}, {1, 1, 1, 1, 3, 2}};
        System.out.println("Pre Filling");
        printFilling(arr);
        fillingVal(arr, 0, 0, 4, 1);
        System.out.println();
        printFilling(arr);
    }
}
