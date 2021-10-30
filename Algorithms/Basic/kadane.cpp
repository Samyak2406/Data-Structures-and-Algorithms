#include <bits/stdc++.h>

using namespace std;
int max_sumarray(int arr[],int n)//calculate the max sum; it has two parts
{
    int max_sum;
    int cur_sum;
    int count=0;
    for(int i=0;i<n;i++)
    {
        if(arr[i]<0)
        {
            count++;
        }
    }
    if(count!=n)//part 1 when elements are all +ve or +ve and -ve
    {
        max_sum=0;
        cur_sum=0;
        for(int i=0;i<n;i++)
        {
            cur_sum=cur_sum+arr[i];
            if(cur_sum>max_sum)
            {
                max_sum=cur_sum;
            }
            if(cur_sum<0)
            {
                cur_sum=0;
            }
        }
    }
    else if(count==n)//part 2 when all the elements are -ve
    {
        max_sum=arr[0];
        cur_sum=arr[0];
        for(int i=1;i<n;i++)
        {
            cur_sum=max(arr[i],cur_sum+arr[i]);
            max_sum=max(cur_sum,max_sum);
        }
    }
    return max_sum;
}

int main()
{
    int n;
    cout<<"enter the size of the array:"<<endl;
    cin>>n;
    int arr[n];
    cout<<"enter the elements of the array:"<<endl;
    for(int i=0;i<n;i++)
    {
        cin>>arr[i];
    }
    int max_subarray_sum=max_sumarray(arr,n);
    cout<<max_subarray_sum<<endl;
}
