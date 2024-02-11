1.



  class Solution {
    // Function to find element with more appearances between two elements in an
    // array.
    public int majorityWins(int arr[], int n, int x, int y) {
        // code here
        int cntX=0;
        int cntY=0;
        
        for(int i =0;i<n;i++){
            if(arr[i] == x)
            cntX++;
            if(arr[i] == y)
            cntY++;
        }
        
        if(cntX > cntY)
        return x;
        else if(cntX< cntY)
        return y;
        
        return x<y ? x:y;
    }
}



class Solution{
    public int[] findBots(String usernames[], int n){
        // Code Here. 
        
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            if(isPrime(usernames[i]))
            ans[i]=1;
            else ans[i]=0;
        }
        
        return ans;
    }
    
    public boolean isPrime(String s){
        HashMap<Character, Integer> h =new HashMap<>();
        for(int i=0;i<s.length();i+=2){
            char ch = s.charAt(i);
            h.put(ch, h.getOrDefault(ch, 0)+1);
        }
        
        int dis = h.size();
        
        if(dis <= 1)
        return false;
        
        for(int i=2;i<=Math.sqrt(dis);i++){
            if(dis % i == 0)
            return false;
        }
        
        return true;
    }
}
