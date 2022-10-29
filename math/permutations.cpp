class Solution {
public:
    set<vector<int>> st;
    
    void rec(vector<int>& v, int n, set<int> taken, vector<int> store) {
        if(taken.size()>=n) {
            st.insert(store);
            return;
        }
        
        for(int i=0;i<n;i++) {
            if(taken.find(i)==taken.end()) {
                store[taken.size()] = v[i];
                taken.insert(i);
                rec(v, n, taken, store);
                taken.erase(i);
            }
        }
    } 
     
    
    vector<vector<int>> permute(vector<int>& nums) {
        int  n = nums.size();
        for(int i=0;i<n;i++) {
            set<int> s;
            vector<int> v(n);
            s.insert(i);
            v[0]=nums[i];
            rec(nums, n, s, v);
        }
        vector<vector<int>> ans;
        for(auto i: st) {
            ans.push_back(i);
        }
        return ans;
    }
};
