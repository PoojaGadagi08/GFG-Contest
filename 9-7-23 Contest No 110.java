1)Separate Stone

You have given a binary array arr of size N consists of 0 and 1. If arr[i]=0 then there is a white stone present at the index i and if arr[i]=1 then there is a black stone present at the index i.

You have infinite no of boxes of size K and you need to separate white and black stones by putting them into different boxes. Find the minimum no of box require to separate white and black stones by putting them into different boxes.

Note: You cannot put more than K stones in a single box.

Example 1:

Input:
N = 4, K = 2
arr[] = {1,0,1,0}

Output: 2
Explanation: We can put first and third black stones into 1st box and second and fourth white stones into 2nd box.
Example 1:

Input:
N = 5, K = 2
arr[] = {1,1,1,1,1}
Output: 3
Explanation: We can put first two stones in 1st box then next 2 stones in 2nd box and last stone in 3rd box.
Your Task: 
You don't need to read input or print anything. Your task is to complete the function separateStone() which takes the array arr[] and its size N and K as input parameters and returns an integer represents the minimum no of box required to separate the white and black stones.

Constraints:
1 <= N <= 106 
1 <= K <= 105
0 <= arr[i] <= 1




class Solution{
    public int separateStones(int N, int K, int arr[]) {
        // Code Here.
        // if(N%K==0)
        // return N/K;
        // return (N/K)+1;
        
        int zero=0;
        int sum=0;
        
        for(int i=0;i<N;i++){
            if(arr[i]==0)
            zero++;
        }
        
        int diff=N-zero;
        
        if(zero%K==0 && diff%K==0)
        sum=(zero/K)+(diff/K);
        
        if(zero%K!=0 && diff%K!=0)
        sum=((zero/K)+1)+((diff/K)+1);
        
         if(zero%K!=0 && diff%K==0)
        sum=((zero/K)+1)+(diff/K);
        
         if(zero%K==0 && diff%K!=0)
        sum=(zero/K)+((diff/K)+1);
        
        return sum;
    }
    
}





2)Remove the balls

Imagine an imaginary array of length N containing balls. Given 2 arrays color and radius of length N each, where color[i] represents the color of the ith ball while radius[i] represents the radius of ith ball. If two consecutive balls have the same color and size, both are removed from the array. Geek wants to know the length of the final imaginary array.

Example 1:

Input:
N = 3
color[] = {2, 2, 5}
radius[] = {3, 3, 4}
Output: 
1
Explanation: 
First ball and second ball have same color 2 and 
same radius 3.So,after removing only one ball 
is left.It could not be removed from the array. 
Hence, the final array has length 1.
Example 2:

Input:
N = 4 
color[] = {1, 3, 3, 1}
radius[] = {2, 5, 5, 2}
Output: 
0
Explanation: 
Ball 2 and ball 3 have same color 3 and same radius
5.So,they are removed. Now, we have got our 
color[]={1, 1} and radius[]={2, 2}.Both the left 
balls are consecutive now and they are having 
same color and radius. So,these two balls are 
removed as well. Now,we are left with empty 
final array. Hence, the length of final array is 0.

Your Task:  
You don't need to read input or print anything. Your task is to complete the function finLength(), which takes integer N and array color[ ] and array radius[ ] as input parameters and returns the size of the final imaginary array.


Constraints:
1 ≤ N ≤ 105
1 ≤ color[i] ≤ 109
1 ≤ radius[i] ≤ 109




class Solution {
    public static int finLength(int N, int[] c, int[] r) {
        // code here
        // int i=0;
        // int j=N-1;
        // int count=0;
        // while(i<N){
        //     if(c[i]==c[j+1] && r[i]==r[j+1])
        //     count++;
        //     j--;
        // }
        // i++;
        
        // return N-count;
        
        
        // Arrays.sort(c);
        // Arrays.sort(r);
        // int count1=0;
        // int count2=0;
        // for(int i=0;i<N;i++){
        //     for(int j=i+1;j<N;j++){
        //         if(c[i]==c[j] )
        //         count1++;
        //         if(r[i]==r[j] )
        //         count2++;
                
        //     }
        // }
        // return N-(count1+count2);
        
        
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<N;i++){
            if(!s.isEmpty()){
                int p=s.peek();
                if(c[p]==c[i] && r[p]==r[i])
                s.pop();
                else
                s.push(i);
            }else {
                s.push(i);
            }
        }
        return s.size();
    }
}
        
