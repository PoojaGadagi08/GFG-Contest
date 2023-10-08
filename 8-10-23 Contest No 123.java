2.There are a lot of bots on one of the popular social media platform "GeeklandSter". Now since GeeklandSter has been acquired by the richest man of Geekland, he wants to remove every bot from his platform.

Geek used his magical powers and determined that the count of distinct characters at even positions (0th, 2nd, 4th, ...) of username is a prime number for every bot.

You have been given an array of strings usernames[], and for each of them tell if the user is a bot or not by returning an array of integers where i O corresponds to the human and 1 corresponds to the bot.

Example 1:

Input:

n - 4

usernames =\ ^ prime prime abcdef^ prime prime , "pqrs", "xyzuvabb", "aaaaaa")

Output:

answer - \{1, 1, 0, 0\}

Explanation:

Count of distinct characters at even

positions for different usernames are as follows

abcdef - 3

pqrs = 2

xyavabb = 4





  class Solution {
    
    public int distinctChar(String s) {
        HashSet<Character> set = new HashSet<>();
        int cnt = 1;
        
        // Add the first character to the set
        set.add(s.charAt(0));
        
        // Iterate through the string
        for (int i = 2; i < s.length(); i += 2) {
            char currentChar = s.charAt(i);
            // If the character is not in the set, it is distinct
            if (!set.contains(currentChar)) {
                cnt++;
                set.add(currentChar);
            }
        }
        return cnt;
    }



    
    public boolean isPrime(int num) {
    if (num <= 1) {
        return false;
    }
    if (num == 2) {
        return true;
    }
    if (num % 2 == 0) {
        return false;
    }
    for (int i = 3; i * i <= num; i += 2) {
        if (num % i == 0) {
            return false;
        }
    }
    return true;
}


    public int[] findBots(String u[], int n) {
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            int disChar = distinctChar(u[i]);
            if (isPrime(disChar)) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        return arr;
    }
}


// class Solution {

//     public int countDistinctChars(String s) {
//         int count = 1;
//         for (int i = 0; i < s.length() - 1; i += 2) {
//             if (s.charAt(i) != s.charAt(i + 1)) {
//                 count++;
//             }
//         }
//         return count;
//     }

//     public boolean isPrime(int num) {
//         if (num <= 1) {
//             return false;
//         }
//         if (num == 2) {
//             return true;
//         }
//         if (num % 2 == 0) {
//             return false;
//         }
//         for (int i = 3; i * i <= num; i += 2) {
//             if (num % i == 0) {
//                 return false;
//             }
//         }
//         return true;
//     }

//     public int[] findBots(String[] u, int n) {
//         int[] result = new int[n];
//         for (int i = 0; i < n; i++) {
//             int distinctChars = countDistinctChars(u[i]);
//             if (isPrime(distinctChars)) {
//                 result[i] = 1;
//             }
//         }
//         return result;
//     }
// }


1.Intially given a square of side = 2 ^ N you can perform following operation:

• Pick any square, if the side of the sqaure is 2 ^ M * (M > 0) then you can divide this square into four smaller squares of side - 2 ^ (M - 1) and replace the bigger square with these 4 square.

You can perform as many operations as you want. Your task is to find minimum number of operations needed to make atleast X boxes. If it is not possible to make X boxes return -1.






class Solution{
    public:
    int squares(int N, int X){
        int sq=1,cnt=0;
        while(N>0) {
            if(sq*4<X){
                cnt+=sq;
                sq*=4;
                N--;
            }
            
            else{
                int a=sq*4;
                int rem=X-sq;
                int b=ceil(rem/3.0);
                cnt+=b;
                //if(b*4+sq-b<x) cnt++;
                return cnt;
            }
        }
        return -1;
    }
};






