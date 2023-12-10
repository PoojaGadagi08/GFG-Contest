1.antique collection



  class Solution {
    public int antiqueItems(int n, int it[], int p[]){
        HashMap<Integer,Integer> h=new HashMap<>();
        
        int ans=0;
        
        for(int i=0;i<it.length;i++){
            if(h.containsKey(it[i])){
                if(h.get(it[i])> p[i]){
                    h.put(it[i], p[i]);
                }
            }
            else {
                h.put(it[i], p[i]);
            }
        }
        
        for(int val : h.values())
        ans+=val;
        
        return ans;
    }
}



2. Occerrence of 101

  class Solution{
    public int count101(long n){
        // Code Here
        List<Integer> l =new ArrayList<>();
        
        int ans=0;
        
        int one=0;
        
        while( n!=0 ){
            if((n&1)==1)
            one++;
            else{
                l.add(one);
            }
            
            n >>=1;
        } 
            for(int x : l){
                int left=one-x;
                
                ans+=(left*x);
            }
        return ans;
    }
}
