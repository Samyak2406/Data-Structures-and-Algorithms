#include <stdio.h>
#define MAX 5
int queue[MAX];
int rear = - 1;
int front = - 1;
void insert()
{
    int add;
    if (rear == MAX - 1)
    printf("Queue Overflow!\n");
    else
    {
        if (front == - 1)
        front = 0;
        printf("Inset the element in queue : \n");
        scanf("%d", &add);
        rear = rear + 1;
        queue[rear] = add;
    }
}
void delete()
{
    if (front == - 1 || front > rear)
    {
        printf("Queue Underflow \n");
        return ;
    }
    else
    {
        printf("Element deleted from queue is : \n%d\n",queue[front]);
        front = front + 1;
    }
}
void traverse()
{
    int i;
    if (front == - 1)
        printf("Queue is empty \n");
    else
    {
        printf("Queue is : \n");
        for (i = front; i <= rear; i++)
            printf("%d ", queue[i]);
        printf("\n");
    }
}
int main(){
    insert();
    insert();
    insert();
    insert();
    insert();
    insert();
    delete();
    traverse();
}
