#include <stdio.h>
void primecheck(int n)
{
    int isprime=1;
    for(int i=2;i<n;i++){
           if(n%i==0 && n!=2){
               isprime=0;
           }
           }
       if(n<2){
           isprime=0;
       }
    if(isprime==1){
    printf("%d is prime no.\n",n);
    }
}
int main(){
    int n;
    printf("Enter the no.\n");
    scanf("%d",&n);
    for(int i=1;i<=n;i++){
        primecheck(i);
    }
}
