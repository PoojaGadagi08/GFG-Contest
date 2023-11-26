Given an array of 0s and 1s. Find the length of the largest subarray with equal number of 0s and 1s.

Example 1:

Input:
N = 4
A[] = {0,1,0,1}
Output: 4
Explanation: The array from index [0...3]
contains equal number of 0's and 1's.
Thus maximum length of subarray having
equal number of 0's and 1's is 4.
Example 2:

Input:
N = 5
A[] = {0,0,1,0,0}
Output: 2
Your Task:
You don't need to read input or print anything. Your task is to complete the function maxLen() which takes the array arr[] and the size of the array as inputs and returns the length of the largest subarray with equal number of 0s and 1s.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N).

Constraints:
1 <= N <= 105
0 <= A[] <= 1



  class Solution {

    // arr[] : the input array containing 0s and 1s
    // N : size of the input array
    
    // return the maximum length of the subarray
    // with equal 0s and 1s
    int maxLen(int[] arr, int N)
    {
        // Your code here
         HashMap<Integer, Integer> map = new HashMap<>();
        //here we updated 0 in the array with -1,so, as to solve the problem using the subarray with zero sum
        int sum = 0, len = 0;
        for(int i=0;i<N;i++){
            if(arr[i]==0){
                arr[i]=-1;
            }
        }

//code for subarray with zero sum
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == 0) {
                len = i + 1;
            } else if (map.containsKey(sum)) {
                len = Math.max(len, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }
        return len;


    }
}
