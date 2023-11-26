1.
  class Solution{
    public boolean isLeap(int N)
    {
      return (N % 4 ==0) && ((N % 100 != 0) || (N % 400 == 0));
    }
}

2.
  from typing import List


class Solution:
    def minimiseExpression(self, n : int, A : List[int]) -> int:
        # code here
        avg = sum(A) // n
        x = round(avg);
        return x
        



  3.
  //User function Template for Java
// class Solution
// {
//     public int subarraySumK(int[] A, int N, int k)
//     {
//         int sum=0;
//         HashMap<Integer, Integer> h =new HashMap<>();
//         int res = Integer.MAX_VALUE;
        
//         for(int i=0;i<N;i++){
//               sum+=A[i];
              
//               if( sum == k){
//                   int currLen = i+1;
//                   res = Math.min(res, currLen);
//               }
              
//               int reqSum = sum -k;
              
//               if(h.containsKey(reqSum)){
//                   int found = h.get(reqSum);
//                   int currInd =i - found;
                  
//                   res = Math.min(res, currInd-found);
//               }
              
//               h.put(sum , i);
//         }
        
//         if(res>=Integer.MAX_VALUE) return -1;
        
//         return res;
//     }
// };




    class Solution
    {
        public int subarraySumK(int[] a, int n, int k)
        {
            int res = n+1;
            long []b = new long[n+1];
            for(int i =0;i<n;i++){
                b[i+1] = b[i]+a[i];
            }
            
            Deque<Integer> d =new ArrayDeque<>();
            for(int i=0;i<n+1;i++){
                while(d.size()>0 && b[i]-b[d.getFirst()] >= k)
                res = Math.min(res, i-d.pollFirst());
                
                while(d.size() > 0 && b[i]<= b[d.getLast()])
                d.pollLast();
                
                d.addLast(i);
            }
            
            return res <= n ? res : -1;
        }
    }    
    
    
        
    
    
