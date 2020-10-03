#include <stdio.h>
void getarr(int a[10][10],int x,int y)
{
    printf("enter elements for this array\n");
    for(int i=0;i<x;i++)
    {
        for(int j=0;j<y;j++)
        {
            scanf("%d",&a[i][j]);
        }
    }
}
void multiarr(int a[10][10],int b[10][10],int c[10][10],int x1,int y1,int x2,int y2)
{
    if(y1 == x2)
    {
    int sum=0;
    for(int i=0;i<x1;i++)
    {
        for(int j=0;j<y2;j++)
        {
            for(int k=0;k<y1;k++)
            {
                sum+=a[i][k]*b[k][j];
            }
            c[i][j]=sum;
            sum=0;
        }
    }
        for(int i=0;i<x1;i++)
        {
            for(int j=0;j<y2;j++)
            {
                printf("%d\t",c[i][j]);
            }
            printf("\n");
        }
    }
    else
    {
        printf("given matrics cannot be multiplied\n");
    }
}
int main()
{
    int x1,y1,x2,y2,arr1[10][10],arr2[10][10],arr3[10][10];
    printf("Enter the no. of rows and colmn for 1st matrics\n");
    scanf("%d %d",&x1,&y1);
    printf("Enter the no. of rows and colmn for 2nd matrics\n");
    scanf("%d %d",&x2,&y2);
    getarr(arr1, x1, y1);
    getarr(arr2, x2, y2);
    multiarr(arr1, arr2, arr3, x1, y1, x2,y2);
    return 0;
}
