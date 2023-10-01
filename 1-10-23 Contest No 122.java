1. Naughty Geek

  
  class Solution {
    public static long totalWays(int N) {
        // code here
        long p=1;
        for(int i=1;i<=N;i++){
            p*=i;
        }
        return p;
    }
}
        


2. Same Character

  class Solution {
     public int solve(String str, int n) {
        // code here
                Map<Character, Integer> charCount = new HashMap<>();
        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Step 2: Find character(s) with maximum frequency
        // int maxFreq = 0;
        // for (int freq : charCount.values()) {
        //     maxFreq = Math.max(maxFreq, freq);
        // }

        // Step 3: Calculate minimum moves required
       
       

        // Step 4: Output the result
return charCount.size()-1;
    }
}



3.Maximum AND

  class Solution{
    public:
    int maxAnd(int N, vector<int> A){
        // code here
        vector<int > pre(N);
        pre[0]=A[0];
        for(int i=1;i<N;i++)
        pre[i]=A[i] & pre[i-1];
        
        vector<int> suf(N);
        suf[N-1]=A[N-1];
        
        for(int i=N-2;i>=0;i--)
        suf[i]=A[i] & suf[i+1];
        
        int ans=0;
        for(int i=0;i<N;i++){
            int maxi=0XFFFFFFFF;
            if(i==0)
            maxi=maxi & suf[i+1];
            else if(i==N-1)
            maxi=maxi & pre[i-1];
            else{
                maxi=maxi & pre[i-1];
                maxi=maxi & suf[i+1];
            }
            ans=max(ans, maxi);
        }
        return ans;
    }
};
