A.
class Solution {
    public static int countWays(int n) {
        int mod=1000000007;
        long tot=9*power(10, n-1, mod)%mod;
        long t=8*power(9, n-1, mod)%mod;
        
        long res=(tot-t)%mod;
        if(res<0) res+=mod;
        return (int)res;
        
    }
    
    public static long power(int base, int exp, int mod) {
       long result = 1;
        long baseMod = base % mod;
        
        while (exp > 0) {
            if ((exp % 2) == 1) {
                result = (result * baseMod) % mod;
            }
            baseMod = (baseMod * baseMod) % mod;
            exp /= 2;
        }
        
        return result;
    }
}


B.
  class Solution {
    public static long maximumSum(int n, int k) {
        // code here
        boolean[] arr = isP(n);

        ArrayList<Integer> ans= new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%2 != 0 && !arr[i]) ans.add(i);
        }
        if(ans.size()<k) return -1;
        
        Collections.sort(ans, Collections.reverseOrder());
        
        long sum=0;
        for(int i=0;i<k;i++) sum+=ans.get(i);
        
        return sum;
    }
    // public static boolean isP(int n){
    //     if(n<=1) return false;
    //     for(int i=2;i<=Math.sqrt(n);i++){
    //         if(n%i == 0) return false;
    //     }
    //     return true;
    // }
    
    public static boolean[] isP(int n) {
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }
        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
        }
        return isPrime;
    }

}

C.
  class Solution {
    public int getSegments(int[] arr, int n, int x) {
        // Your code here
        int seg=1;
        int or=0;
        
        for(int i=0;i<n;i++){
            int newOr=or | arr[i];
            
            if(newOr > x){
                seg++;
                or=arr[i];
            }
            else or=newOr;
        }
        return seg;
    }
}
