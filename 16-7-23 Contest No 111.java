1)Balloon Everywhere


  Bob is very fond of balloons. Once he visited an amusement park with his mother. The mother told Bob that she would buy him a balloon only if he answer her problem right. She gave Bob a string s and asked him to use the characters of string to form as many instances of the word "balloon" as possible. Return the maximum number of instances that can be formed.

Help Bob to solve the problem.

Note: You can use each character in the string at most once.

Example 1:

Input:
S: nlaebolko
Output: 1
Explanation:
Here, the number of occurence of 'b' = 1
of occurence of 'a' = 1
of occurence of 'l' = 2
of occurence of 'o' = 2
of occurence of 'n' = 1
So, we can form 1 "balloon" using the letters.
 
Example 2: 

Input:
S: loonbalxballpoon
Output: 2
Explanation:
Here, the number of occurence of 'b' = 2
of occurence of 'a' = 2
of occurence of 'l' = 4
of occurence of 'o' = 4
of occurence of 'n' = 2
So, we can form 2 "balloon" using the letters.
 

Your Task:
The task is to complete the function maxInstance() which takes a string as the only input parameter and should return the maximum instances that can be formed of the word "balloon" using the given string.

Constraints:

1 <= s.length <= 106









  
// User function Template for Java

class Solution {
    public int maxInstance(String s) {
        // Code here
        int arr[]=new int[26];
        
        for(char x:s.toCharArray())
        arr[x-'a']++;
        
        int ans=0;
        
        while(true){
            if(arr['b'-'a']>0 && arr['a'-'a']>0 && arr['l'-'a']>1 && arr['o'-'a']>1 && arr['n'-'a']>0){
                ans++;
                arr['b'-'a']--;
                arr['a'-'a']--;
                arr['l'-'a']-=2;
                arr['o'-'a']-=2;
                arr['n'-'a']--;
                
            }
            else 
            return ans;
        }
        
    }
}
