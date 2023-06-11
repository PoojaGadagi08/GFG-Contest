1)Geek's Plants
  
  Geek wants to water n plants (numbered 0 to n-1), where plant i requires arr[i] units of water daily. You have to use buckets of the same size and can not use one bucket
  more than one time in a day. Also Geek do not waste any water. Find the minimum number of buckets Geek needs to use daily for watering the plants.

Note: Each bucket can be designated for only one plant after receiving a fresh refill of water at the beginning of each day.
  
  Input:
N = 4
arr[] = {2, 6, 4, 10}
Output: 11
Explanation: Geek will use buckets of size 2 units daily. Then Geek will need 1, 3, 2, 5 numbers of 
buckets for plant 0, plant 1, plant 2, plant 3 respectively daily.
  
  
  
  
class Solution{
    public long minimumBuckets(int N, int arr[]){
        // Code here.
   
    
    int result = arr[0];
        for (int element: arr){
            result = gcd(result, element);
 
            // if(result == 1)
            // {
            //   return 1;
            // }
        }
 
        // return result;
        long sum=0;
        for(int i=0;i<N;i++){
            sum+=arr[i]/result;
        }
        return sum;
    
    
    
    
        // if(arr.length==1)
        // return 1;
        
        // long sum=0;
        // Arrays.sort(arr);
        // for(int i=0;i<N;i++){
        //     sum+=arr[i];
        // }
        // return sum/arr[0];
    }
         
         static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
}
