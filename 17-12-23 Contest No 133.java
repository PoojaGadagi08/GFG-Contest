1.Naughty Geek

  class Solution {
    public static long fact(int n){
        if(n==0 || n==1)
        return n;
        
        return n*fact(n-1);
    }
    public static long totalWays(int N) {
        // code here
        return fact(N);
    }
}
        


2. MAX Array

  class Solution {
	public:
	int minOperations(vector<int> a, int n) {
	    // Code here
	    int maxi =* max_element(a.begin(), a.end());
	    int i;
	    int cnt=0;
	    int ma=0;
	    int d=0;
	    
	    for(i=0;i<n;i++){
	       if(a[i]==maxi){
	           d=i;
	           while(i+1<n && a[i]==maxi)
	           i++;
	           ma=max(ma, abs(i-d));
	       } 
	    }
	    
	    if(a[n-1]==maxi)
	    ma=max(ma, abs(i-d));
	    
	    bool b=true;
	    int m=0;
	    
	    for(i=0;i<n;i++){
	        if(a[i]==maxi)
	        m++;
	    }
	    
	    return m-ma;
	}
};
