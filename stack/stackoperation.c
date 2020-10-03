#include <stdio.h>
int MAX = 10;
int stack[10];
int top = -1;
int isfull() {
   if(top == (MAX-1))
      return 1;
   else
      return 0;
}
int isempty() {
   if(top == -1)
      return 1;
   else
      return 0;
}
int peek() {
   return stack[top];
}
int pop() {
   int data;
   if(!isempty()) {
      data = stack[top];
      top = top - 1;
      return data;
   } else {
      printf("Stack is empty.\n");
       return 0;
   }
}
void push(int data) {
   if(!isfull()) {
      top = top + 1;
      stack[top] = data;
   } else {
      printf("Stack is full.\n");
   }
}
void traverse(){
    printf("Elements are:\n");
    while(!isempty()) {
       int data = pop();
       printf("%d\n",data);
    }
}
int main() {
   push(1);
   push(2);
   push(3);
   push(4);
   push(5);
   push(6);
   push(1);
   push(2);
   push(3);
   push(4);
   push(5);
   printf("Element at top of the stack is: %d\n" ,peek());
   traverse();
    printf("Stack %s empty.\n" , isempty()?"is":"is not");
    printf("Stack %s full.\n" , isfull()?"is":"is not");
   return 0;
}
