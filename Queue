#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

struct node
{
    int data;
    struct node *link;
};
typedef struct node Node;
Node *front=NULL;
Node *rear=NULL;

void enqueue()
{
    Node *new_node;
    new_node=(Node *)malloc(sizeof(Node));
    printf("Enter the element to enqueue : ");
    scanf("%d",&new_node->data);
    new_node->link=NULL;
    if(front==NULL && rear==NULL)
    {
        front=new_node;
        rear=new_node;
    }
    else
    {
        rear->link=new_node;
        rear=new_node;
    }
}
void dequeue()
{
    Node *temp;
    temp=front;
    if(front!=NULL)
    {
        printf("Element with dequeue Operation is %d\n",temp->data);
        front=front->link;
        free(temp);
    }
    else
    {
        printf("Queue is empty\n");
    }
}
void peek()
{
    if(front!=NULL && rear!=NULL)
    {
        printf("Element with Peek Operation is %d\n",front->data);
    }
    else
    {
        printf("Queue is empty\n");
    }
}
void display()
{
    Node *temp;
    temp=front;
    if(rear!=NULL)
    {
        printf("Elements of the Queue are :\n");
        while(temp!=NULL)
        {
            printf("%d\n",temp->data);
            temp=temp->link;
        }
    }
    else
    {
        printf("Queue is empty\n");
    }
}
void main()
{
    int choice=1;
    int num;
    printf("Queue Implementation using Singly Linked List\n");
    while(choice)
    {
        printf("..........\n");
        printf("1. Enqueue Operation\n");
        printf("2. Dequeue Operation\n");
        printf("3. Peek Operation\n");
        printf("4. Traverse Operation\n");
        printf("5. Exit\n");
        printf("Enter your choice : ");
        scanf("%d",&num);
        switch(num)
        {
            case 1:
                enqueue();
                break;
            case 2:
                dequeue();
                break;
            case 3:
                peek();
                break;
            case 4:
                display();
                break;
            case 5:
                return;
            default:
                printf("Invalid Operation\n");
        }
    }
    getch();
}
