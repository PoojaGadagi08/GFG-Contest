1)Array Game


  You are playing an array game in which you are given two arrays arr and brr, each of size n. Each array is a permutation of n positive integers. 

In one operation, you can perform either of the following two steps:

Rotate the array arr anti-clockwise.
Remove the first element of both the arrays if they are the same.
Find the minimum number of operations required to make both the arrays empty. 

Example 1:

Input:
n = 3
arr[] = {1, 2, 3}
brr[] = {2, 1, 3}
Output:
5
Explanation:
operation 1: Rotate arr anti-clockwise. 
It becomes {2, 3, 1}.
operation 2: Remove first element {2} from 
both the arrays. arr = {3, 1} and brr = {1, 3}.
operation 3: Rotate arr anti-clockwise. arr = {1, 3}.
operation 4: Remove {1} from both the arrays. 
operation 5: Remove {3} from both the arrays. 

Example 2:

Input:
n = 2
arr[] = {1, 2}
brr[] = {2, 1}
Output:
3
Explanation:
Rotate arr once and then remove both elements.

Your Task:
You don't need to print or output anything. Complete the function min_operations() which takes integer n, arrays arr and brr as input parameters and returns an integer denoting the minimum number of operations.


Constraints:

1 <= n <= 500
1 <= arr[i] <= n
1 <= brr[i] <= n
Both the arrays consists of elements from 1 to n, exactly once.



  class Solution{
    public:
    int min_operations(int n, vector<int>&arr, vector<int>&brr) {
	    // code here
	    
	    int c=0;
	    int j=0;
	    queue<int>q;
	    for(int i=0;i<arr.size();i++){
	        q.push(arr[i]);
	    }
	    while(!q.empty()){
	        c++;
	        if(q.front()==brr[j]){
	            j++;
	            q.pop();
	        }
	        else {
	            int t=q.front();
	            q.pop();
	            q.push(t);
	        }
	    }
	    return c;
    }
};








2)Subarray of length 2


  Given an array A[ ] of N elements.
In one operation, you can select any subarray of length 2 and multiply all elements of that subarray by -1. You can do any number of operations (possibly zero).
Your task is to maximize the sum of all elements of all subarrays of A[ ].

Example 1:

Input:
N = 3
A[] = {-1, -2, -3}
Output: 14
Explanation:
We can do 1 operation on subarray from 
index = 2 to index = 3. After performing 
the operation, modified array A[] = 
{-1, 2, 3}. All subarrays  of the  modified 
array A[] are [-1], [2], [3], [-1, 2], [2, 3] 
and [-1, 2, 3]. Thus total sum of all 
subarrays is 14. This is the maximum sum 
which we can get by performing the 
operations.
Example 2:

Input:
N = 2
A[] = {0, 1}
Output: 2
Explanation: There is no need to do any 
operation. All subarrays of the array A[] 
are [0], [1] and [0, 1] and sum of all 
subarrays = 0 + 1 + 1 = 2.
Your Task:  
You don't need to read input or print anything. Your task is to complete the function maxSum() which takes the array A[ ] and its size N as input parameters and returns the maximum sum of all subarrays after performing the above operations zero or more times optimally.

Constraints :
1 ≤ N ≤ 105
-103 ≤ A[i] ≤ 103


  //User function Template for Java
class Solution 
{ 
    long maxSum(int N, int a[]) 
    { 
        // code here
       long[][] dp=new long[N+1][2];
       
       for(int i=N-1;i>=0;i--){
           for(int pi=0;pi<2;pi++){
               long n=i;
               long m=a.length-i-1;
               
               long f=n*(m+1)+(m+1);
               long v=a[i];
               
               long ans=0;
               if(pi==0){
                   ans=dp[i+1][0]+(f*v);
                   if(i!=a.length-1){
                       long f2=dp[i+1][1]-(f*v);
                       ans=Math.max(ans,f2);
                   }
               }
                   else {
                       ans=dp[i+1][0]-(f*v);
                       if(i!=a.length-1){
                           long f2=dp[i+1][1]+(f*v);
                           ans=Math.max(ans,f2);
                       }
                   }
                   dp[i][pi]=ans;
               
           }
       }
       return dp[0][0];
    }
} 
