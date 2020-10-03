#include<stdio.h>
#include<conio.h>
int main()
{
    int size=0;
    int SparseMatrix[4][5]={ {0,0,3,0,4},
                           {0,0,5,7,0},
                           {0,0,0,0,0},
                           {0,2,6,0,0}
                         };
    for(int i=0;i<4;i++)
    {
        for(int j=0;j<5;j++)
        {
            if(SparseMatrix[i][j]!=0)
            {
                size++;
            }
        }
    }
    int ResultMatrix[3][size];
    int k=0;
    for(int i=0;i<4;i++)
    {
        for(int j=0;j<5;j++)
        {
            if(SparseMatrix[i][j]!=0)
            {
                ResultMatrix[0][k]=i;
                ResultMatrix[1][k]=j;
                ResultMatrix[2][k]=SparseMatrix[i][j];
                k++;
            }
        }
    }
    for(int i=0;i<3;i++)
    {
        for(int j=0;j<size;j++)
        {
            printf("%d ",ResultMatrix[i][j]);
        }
        printf("\n");
    }
    return 0;
}
