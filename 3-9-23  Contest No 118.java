 1. Even Sum
You are given an array A consisting of n positive integers.
In one operation, you can choose any index i such that 1 <= i <=n and Ai is even, then you can assign Ai = Ai / 2. 

Your task is to make total sum of array even using minimum number of operations (possibly 0) or return -1 if it is not possible.

Example 1:

Input:
N = 5
A[] = {1, 2, 1, 2, 1}
Output: 1
Explanation: Initially sum is 7
which is odd. Assign A2 = A2/2
then array becomes 1, 1, 1, 2, 1
having sum 6 which is even. So total one
operation is required which is minimum
possible.

Example 2:

Input:
N = 3
B[] = {1, 1, 2}
Output: 0
Explanation: Sum is even ie 4.
 
Your Task:  
You don't need to read input or print anything. Your task is to complete the function findMin() which takes the array A[], its size N as input parameters and returns the an integer denoting minimum number of operations.
Constraints:
1 <= N <= 105
1 <= A[i] <= 109




  #User function Template for python3

class Solution:
    def solve(self, arr, n):
        # Check if the sum of elements in the array is already odd
        if not sum(arr) % 2:
            return 0
    
        operations, even_numbers, len_even_numbers = 0, [], 0
        
        # Find even numbers in the array and store them in 'even_numbers'
        for i in range(n):
            if arr[i] % 2 == 0:
                even_numbers.append(arr[i])
                len_even_numbers += 1
        
        # If there are no even numbers, it's impossible to make the sum odd
        if not len_even_numbers:
            return -1
        
        while True:
            operations += 1
            for i in range(len_even_numbers):
                # Divide even numbers by 2 until they become odd
                even_numbers[i] //= 2
                if even_numbers[i] % 2:
                    return operations
        


  
