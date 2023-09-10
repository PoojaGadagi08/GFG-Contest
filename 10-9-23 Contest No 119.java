1.High Frequency


  You are given a string S of lowercase Latin characters with size N. Your task is to find the lexicographically smallest substring with the maximum frequency.

Note: String p is lexicographically smaller than string q, if p is a prefix of q, is not equal to q or there exists i, such that pi < qi and for all j < i it is satisfied that pj = qj. For example, abc is lexicographically smaller than abcd, abd is lexicographically smaller than abec, afa is not lexicographically smaller than ab and a is not lexicographically smaller than a.

Input:
N = 4
S = "gfgg"
Output: 
"g"
Explanation: 
Substring "g" is present 3
in the string and it can be proved
that it is the lexicographically 
smallest one
Example 2:

Input:
N = 1
S = "a"
Output: 
"a"
Explanation: 
The only possible 
substring is "a"
Your Task:  
You don't need to read, input, or print anything. Your task is to complete the function solve( ), which takes N and string S as input parameters and returns the answer to the problem.

 

Constraints:
1 ≤ N ≤ 105
String S consists of lowercase Latin characters




  
class Solution {
    public static String solve(int N, String str) {
        // code here
          // Your code here
    //     int arr[]=new int[26];
    //     for(int i=0; i<str.length(); i++){
    //         char ch=str.charAt(i);
    //         int num=0; 
    //         num=ch-'a';
    //         arr[num]++;
    //     }
    //     int maxi=-1;
    //   String ans="";
    //     for(int i=0; i<26; i++){
    //         if(maxi<arr[i]){
    //           ans+=arr[i];
    //           maxi=arr[i];
    //           break;
    //         }
    //     }
    //     return ans;
     int[] charCount = new int[26]; // Assuming only lowercase Latin characters

        // Count the frequency of each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            charCount[ch - 'a']++;
        }

        char maxChar = 'a'; // Initialize maxChar to 'a'
        int maxCount = charCount[0]; // Initialize maxCount to the frequency of 'a'

        // Find the character with the maximum frequency
        for (char ch = 'a'; ch <= 'z'; ch++) {
            int charIndex = ch - 'a';
            if (charCount[charIndex] > maxCount) {
                maxCount = charCount[charIndex];
                maxChar = ch;
            }
        }
String s = String.valueOf( maxChar);
        return s;
    }
}




2.Plucking Flowers
As Women's Day is coming, Geek decided to give one flower to each woman he knows.
Geek knows K women. Geek's neighbour has a garden in which there are N flowers and each flower has a beauty associated with it i.e. ith flower has B[i] beauty. Geek wants to pluck exactly K flowers from his neighbour's garden such that the sum of beauties of all flowers he plucked is maximum but to not get caught he can't pluck more than one flower in a row, more formally he can't pluck two flowers if they are adjacent.
Your task is to find maximum sum of beauty of all flowers Geek can get.

Example 1:

Input:
N = 3
K = 2
B[] = {1, 1000000, 1}
Output:
2
Explanation: 
Geek has only one option i.e. plucking
first and third flower.
Example 2:

Input:
N = 4
K = 2
B[] = {1, 2, 4, 3}
Output:
5
Explanation: 
Geek can either pluck first and third
flower or second and fourth flower.
Your Task:
You don't need to read input or print anything. Your task is to complete the function maximumBeauty() which takes the number of flowers N, integer K and array B[ ] as input parameters and returns the maximum sum of beauty of plucked flowers.

Constraints:
1 ≤ N ≤ 1000
1 ≤ K ≤ ceil(N / 2)
1 ≤ B[i] ≤ 109



  class Solution{
    public:
    vector<vector<long long >> dp;
     long long solve(int i, vector<int>&B, int k, int c){
            if(i>=B.size()){
                if(c==k)
                return 0;
                return LONG_MIN;
            }
            if(c==k) return 0;
            
            if(dp[i][c]!=-1) return dp[i][c];
            
            long long a1=B[i]+solve(i+2, B, k, c+1);
            
            long long a2=solve(i+1, B, k, c);
            
            return dp[i][c]=max(a1,a2);
        }
    
    long long maximumBeauty(int N, int K, vector<int> &B){
        // code here
       
        dp.resize(N+1, vector<long long>(K+1, -1));
        return solve(0,B,K,0);
        
    }
};
