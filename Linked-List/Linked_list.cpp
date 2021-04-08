#include<bits/stdc++.h>

using namespace std;

struct node{
	int data;
	struct node* next = NULL;
};

struct node* insert(struct node* head, int data){
	if(!head){
		struct node* block = new node();
		block->data = data;
		return block;
	}
	else{
		struct node* root = head;
		while(head->next!=NULL){
			head = head->next;
		}
		struct node* block = new node();
		head->next = block;
		block->data = data;
		return root;
	}
}

void printAll(struct node* head){
	if(head){
		while(head!=NULL){
			cout<<head->data<<"\n";
			head=head->next;
		}
	}
}

struct node* del(struct node* head, int val){
	struct node* prev, *cur;
	while(head->data == val){
		head = head->next;
		if(!head)
			return NULL;
	}
	cur = head->next;
	prev = head;
	while(cur!=NULL){
		if(cur->data == val){
			// delete this node
			prev->next = cur->next;
			free(cur);
			cur = prev->next;
			continue;
		}
		prev = cur;
		cur = cur->next;
	}
	return head;
}

int main(){
	struct node* head;
	head = insert(head, 10);
	head = insert(head, 15);
	head = insert(head, 25);
	// printAll(head);
	head = del(head, 10);
	// printAll(head);
	
	return 0;
}
