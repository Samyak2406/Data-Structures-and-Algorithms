class Solution {
public:
    
    int bs1(int start, int end, vector<vector<int>> v, int target) {
        int n = v.size();
        if(v[end][0]<=target) {
                return end;
            }
        if(start <= end) {
            int mid = (start+end)/2;
            
            if(mid+1==n) {
                return -1;
            }
            if(v[mid][0] <= target && v[mid+1][0]>target) {
                return mid;
            }
            else if (v[mid][0]>target) {
                return bs1(start, mid-1, v, target);
            }
            else {
                return bs1(mid+1, end, v, target);
            }
        }   
        return -1;
    }
    
    bool bs2(int start, int end, vector<vector<int>> v, int target, int row) {
        int n = v[row].size();
        if(start<=end) {
            int mid = (start+end)/2;
            if(v[row][mid] == target) {
                return true;
            }
            if(start == end) {
                if(v[row][mid] == target) {
                    return true;
                }
                return false;
            }
            else if(v[row][mid] > target) {
                return bs2(start, mid-1, v, target, row);
            }
            else {
                return bs2(mid+1, end, v, target, row);
            }
        }
        return false;
    }
    
    bool searchMatrix(vector<vector<int>>& v, int target) {
        int m = v.size();
        int start = v[0][0];
        int end = v[m-1][0];
        int r1;
        if(target<=v[0][0]) {
            r1=0;
        }
        else 
        r1 = bs1(0, m-1, v, target);
        if(r1!=-1) {
            return bs2(0, v[r1].size()-1, v, target, r1);
        }
        return false;
    }
};
