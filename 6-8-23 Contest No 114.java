1)Beautiful Number


  Given n, check if it is a beautiful number or not. 
You will have to follow a process to determine if a number is beautiful or not:

Starting with the given number (guaranteed to be an integer), replace the number by the sum of the squares of its digits.
The process continues until the number equals 1, or it loops endlessly in a cycle which does not include 1.
Numbers for which this process ends in 1 are considered beautiful.

Example 1:

Input:
n = 19
Output: 
1
Explanation: 
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1
12 = 1
Example 2:

Input:
n = 2
Output: 
0
Explanation: 
22 = 4
42 = 16
12 + 62 = 37
32 + 72 = 58
52 + 82 = 89
82 + 92 = 145
12 + 42 + 52 = 42
42 + 22 = 20
22 + 02 = 4
The cycle will repeat after 4, and will never reach 1.
Your Task:

You don't need to read input or print anything. Your task is to complete the function beautifulNumber() which takes integer n as input parameter and returns a boolean value 1 if n is beautiful, otherwise 0.

Constraints: 
1 <= N <= 109


//User function Template for Java

class Solution {
    
     static int sumDigitSquare(int n)
    {
        int sq = 0;
        while (n != 0)
        {
            int digit = n % 10;
            sq += digit * digit;
            n = n / 10;
        }
        return sq;
    }
    public boolean beautifulNumber(int n) {
        // Your code here
          while (true)
        {
     
            // Number is Happy if
            // we reach 1
            if (n == 1)
                return true;
     
            // Replace n with sum
            // of squares of digits
            n = sumDigitSquare(n);
     
            // Number is not Happy
            // if we reach 4
            if (n == 4)
                return false;
        }
    }

    

}






2)Strong Students in School

  In Peculiar School, students are admitted based on their strength. The strength of n students is given to you in the form of an array arr. The PT teacher wants to analyse 2 sets of m students. Help him find the maximum possible difference between the sum of strengths of students in the two groups.

Note: One student can be a part of more than one group.

Example 1:

Input:
n = 5
m = 4
arr = {1, 2, 3, 4, 5}
Output: 
4
Explanation: 
Maximum difference can be achieved by making these two sets {1, 2, 3, 4} and {2, 3, 4, 5} of m=4 students.
Difference of sum of numbers of these two sets will be | (1+2+3+4) -  (2+3+4+5) | = 4.
Example 2:

Input:
n = 5
m = 2
arr = {5, 8, 40, 11, 15}
Output: 
42
Explanation: 
Maximum difference can be achieved by making these two sets {5, 8} and {40, 15} of m=2 students.
Difference of sum of numbers of these two sets will be | (5+8) -  (40+15) | = 4.
Your Task:
Complete the function diffSum() which takes 3 arguments n, m, and array of elements arr and returns the maximum difference.

Constraints: 
1 <= m <= n <= 105
1 <= arri <= 105


  
//User function Template for Java

class Solution
{
    public static int diffSum(int n,int m,int arr[])
    {
        //code here.
        Arrays.sort(arr);
        int sum1=0;
        for(int i=0;i<m;i++){
            sum1+=arr[i];
        }
        int sum2=0;
        for(int i=n-1;i>=n-m;i--){
            sum2+=arr[i];
        }
        return Math.abs(sum1-sum2);
    }
}
