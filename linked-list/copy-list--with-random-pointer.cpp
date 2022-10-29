/*
// Definition for a Node.
class Node {
public:
    int val;
    Node* next;
    Node* random;
    
    Node(int _val) {
        val = _val;
        next = NULL;
        random = NULL;
    }
};
*/

class Solution {
public:
    
    void printer(Node *root){
        while(root) {
            cout<<root->val<<endl;
            root=root->next;
        }
    }
          
    Node* copyRandomList(Node* head) {
        if(!head)
            return NULL;
        Node* temp1 = head;
        while(temp1!=NULL) {
            Node* temp2 = new Node(temp1->val);
            temp2->next = temp1->next;
            temp1->next = temp2;
            temp1 = temp2->next;
        }
        temp1 = head;
        Node* ans = temp1->next;
        while(temp1!=NULL) {
            Node *temp2 = temp1->next;
            if(temp1->random)
                temp2->random = temp1->random->next;
            temp1=temp2->next;
        }
        
        temp1=head;
        while(temp1!=NULL) {
            Node* temp2 = temp1->next;
            temp1->next = temp2->next;
            temp1 = temp2->next;
            if(temp1) {
                temp2->next = temp1->next;
            }
            
        }        
        return ans;
    }
};
