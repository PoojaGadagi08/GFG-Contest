1.

  class Solution{
  public:
  vector<vector<int>> generateAdjacencyList(int V, int E, vector<vector<int>> &edges)
  {
      // Write Code Here
      map<pair<int, int>, int> apr;
      vector<int> ans[V];
      for(int i = 0; i<edges.size() ; i++)
      {
          if(  !apr[{edges[i][0] ,edges[i][1]}])
          {
          ans[edges[i][0]].push_back(edges[i][1]);
          apr[{edges[i][0] ,edges[i][1]}] = 1;
          }
          if(!  apr[{edges[i][1] ,edges[i][0]}]){
          ans[edges[i][1]].push_back(edges[i][0]);
          apr[{edges[i][1] ,edges[i][0]}] = 1;
          }
      }
      vector<vector<int>> finalans;
      for(int i = 0; i<V; i++)
      {
          sort(ans[i].begin() , ans[i].end());
          finalans.push_back(ans[i]);
      }
      return finalans;
  }
};



2.

  class Solution
{
    public:
int smallSum(vector<int> &arr, int K)
 {
     // Code here
     //it is very very simple
     int sum = 0;
     int mod = 1e9 + 7;
     int n = arr.size();
     for(int i=0;i<n-1;i++){
         if(arr[i] < arr[i+1])
             sum = (sum + arr[i])%mod;
         else
             sum = (sum + arr[i]%K)%mod;
     }
     if(arr[n-1] < arr[0])
         sum = (sum + arr[n-1])%mod;
    else
     sum = (sum + arr[n-1] % K) % mod;
     return sum;
 }
};

3.
  class Solution {
  public:
    int maximizeFlavors(vector<int>& c, int k) {
        // Write your code here
        unordered_map<int,int>mp;
        int n = c.size();
        for(int i=k;i<n;i++)
            mp[c[i]]++;
        
        int count = mp.size();
        int maxi = count;
        int i =0;
        int j = k;
        while(j < n){
            mp[c[i]]++;
            if(mp[c[i]] == 1)
                count++;
            mp[c[j]]--;
            if(mp[c[j]] == 0)
                count--;
            maxi = max(maxi,count);
            i++;
            j++;
        }
        return maxi;
    }
};


4.
  
class Solution{
  public:
 int stableArray(vector<int>& a){
      //Code Here
      //it is also very simple
        unordered_map<int,int>mp;
        for(auto it:a)
        mp[it]++;
        vector<int>temp;
        int ans = INT_MAX;
        long long int sum1 = 0;
        long long int sum2 = 0;
        for(auto it:mp){
            sum1 += it.second;
            temp.push_back(it.second);
        }
        sort(temp.begin(),temp.end());
        
        int n = temp.size();
        for(int i=0;i<n;i++){
            int val = sum2 + (sum1 - (n-i)*temp[i]);
            ans = min(ans,val);
            int j = i;
            while(j<n && temp[j] == temp[i]){
                sum1 -= temp[j];
                sum2 += temp[j];
                j++;
            }
            i = j-1;
        }
        return ans;
  }
};
