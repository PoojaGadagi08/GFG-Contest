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




2)Tree Transformation




Given a connected undirected tree with N nodes. In one move, you can merge any two adjacent nodes. Calculate the minimum number of moves required to turn the tree into a star tree.

-> Merging adjacent nodes means deleting the edge between them and considering both the nodes as a single one.

-> A Star tree is a tree with a center node, and all other nodes are connected to the center node only.

 

Example 1:

Input:
N = 5
p[] = {-1, 0, 0, 1, 1}
Output:
1
Explanation: 
Tree looks like:
            0
           / \ 
         1    2 
       /  \ 
      3    4
Merge the edge 0 - 2 in one operation

Example 2:

Input: N = 8
p[] = {-1 0 0 0 0 2 2 5}
Output:
2
Explanation:
Tree looks like:
              0
           / / \ \
          / |   |  \
        1   2   3   4
           / \
          5   6
          |
          7
Merge node 5 to 2 and then 2 to 0, 
thus tree formed will be a star tree. 
Your Task:
You don't need to read, input, or print anything. Your task is to complete the function solve( ), which takes integer N, and an array p[ ] as input parameters and returns the minimum number of moves required to turn the tree into a star tree.

 

Constraints:
1 ≤ N ≤ 105
0 ≤ p[i] < N
p[0] = -1, 0 is the root node.














  
class Solution {
    public static int solve(int N, int[] p) {
        // code here
        int con[]=new int[N];
        for(int i=1;i<N;i++){
            con[i]++;
            con[p[i]]++;
        }
        int ans=0;
        for(int x:con)
        if(x==1) ans++;
        
        
        if(p.length==2)
        return 0;
        
        return N-ans-1;
    }
}
        

