/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    
    int ans = 0;
    
    void solve(TreeNode* root, long long int sum, int target) {
        sum+=root->val;
        if(sum == target) {
            ans++;
        }
        
        if(root->left) {
            solve(root->left, sum, target);
        }
        if(root->right) {
            solve(root->right, sum, target);
        }
        
    }
    
//  traverse for all nodes and check by dfs for each node
    void dfs(TreeNode* root, long long int target) {
//         dfs all possibilities for the root
        
        solve(root, 0, target);
        
        if(root->left) {
            dfs(root->left, target);
        }
        if(root->right) {
            dfs(root->right, target);
        }
    }
    
    int pathSum(TreeNode* root, int target) {
        if(!root) 
            return ans;
        dfs(root, target);
        return ans;
    }
};
