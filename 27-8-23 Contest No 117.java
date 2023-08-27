1)Silver and Gold

  There are N coins kept in a line. Each coin has two sides - one is colored gold and the other silver. You can flip two adjacent coins any number of times. 
  You need to make the gold-colored side of every coin facing up. You are given the initial status of coins in a binary string s where '1' represents the gold side 
  facing up and '0' represents the silver side facing up. If it is possible to make the gold-colored side of every coin facing up, return "Yes", otherwise return "No".

Example 1: 

Input:
N = 8, s = "11001100"
Output:
Yes
Explanation: 
Flipping 3rd and 4th coin together and 7th 
and 8th coin together will do the task.
Example 2: 

Input:
N = 8, s = "10010100"
Output:
No
Explanation: 
It is not possible to make the gold 
colored side of every coin facing up.
Your Task:
You don't need to read input or print anything. Your task is to complete the function flipCoins( ) which takes integer N and string s as input parameters and
  returns "Yes" or "No".

Constraints:
1 ≤ N ≤ 106




  
//User function Template for Java
class Solution {
    public String flipCoins(int N,String s) {
        // Code here
        int c=0;
        for(int i=0;i<N;i++){
            if(s.charAt(i)=='0')
            c++;
        }
        if(c%2==0)
        return "Yes";
        
        return "No";
    }
}




3)Minimum Distance Graph
Given N and a square matrix adj[ ][ ] of size N*N, you have to find whether it is possible to construct a undirected weighted graph of N nodes numbered from 0 to N-1 such that minimum distance between ith and jth node is given by adj[i][j].
Note:

adj[i][i] = 0 for every i.
adj[i][j] = adj[j][i]
Example 1: 

Input:
N = 2
adj[] = {{0, 8},
         {8, 0}}
Output:
Yes
Explanation: 
Constructed graph:
              0 
              |(8)
              1 
Example 2: 

Input:
N = 3
par[] = {{0, 1, 3},
         {1, 0, 1},
         {3, 1, 0}}
Output:
No
Explanation: 
Graph cannot be constructed because
shortest distance from node 0 to node 1 
is 1 and shortest distance from node 1
to node 2 is 1 which means that possible 
distance from node 0 to node 2 via node 1
can be 2 but given shortest distance from 
node 0 to node 2 is 3.
Your Task:
You don't need to read input or print anything. Your task is to complete the function graph( ) which takes number of nodes N and 2D array adj[ ][ ] as input parameters and returns true if graph can be constructed satisfying all conditions, else returns false.

Constraints:
1 ≤ N ≤ 200
0 ≤ adj[i][j] ≤ 106




  
//User function Template for Java
class Solution 
{ 
    boolean graph(int N, int adj[][]) 
    { 
        // code here
        int [][] dist=new int[N][N];
        
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                dist[i][j]=adj[i][j];
            }
        }
        
        for(int k=0;k<N;k++){
            for(int i=0;i<N;i++){
                for(int a=0;a<N;a++){
                    dist[i][a]=Math.min(dist[i][a], dist[i][k]+dist[k][a]);
                }
            }
        }
        
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(dist[i][j]!=adj[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
} 






2)Mean BST

  Geek has a list of integers and a value key. He is trying to find the mean of 

the element just less than or equal to the given key and
the element just greater than or equal to the given key
If either of them does not exist, take the value as -1. Both the values may even be the same.  
He has recently discovered the concept of Binary Search Tree. He is curious to see if he can use BST to solve this problem. Can you help him?

The mean of two numbers x and y is defined as ceil((x+y)/2).
For example,
if the numbers are 2 and 3 then mean is ceil(5/2) = ceil(2.5) = 3.
Here ceil(x) denotes the smallest integer that is not smaller than x.


Example 1:

Input:
     3
    /  \
   1    5
key = 2
Output: 2
Explaination : 
Here 1 is just less than 2 and
3 is just greater than 2. 
Required mean is (1+3)/2 = 2.

Example 2:

Input:
  2
   \
    5
   /  \
 3     7
key = 5
Output: 5
Explaination : 
Here we take both keys equal to given 
key i.e 5 , thus mean = (5 + 5)/2 = 5

Your Task:
You don't need to read input or print anything. Your task is to complete the function mean() which takes the root node of the tree and integer key as input parameters and returns an integer denoting the mean. 


Constraints:
1 <= Number of nodes <= 105
1 <= Data of a node <= 105




  //User function Template for Java

/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/
// class Solution{
//     void inHelper(Node root, ArrayList<Integer> in) {
// 	if(root== null)
// 	return;
	
	
// 	inHelper(root.left,in);
// 	in.add(root.data);
// 	inHelper(root.right,in);
// 	return;


//     }
//     int mean(Node root, int key){
//         // code here
//          ArrayList<Integer> in = new ArrayList<>();
//           inHelper(root,in);
//           int min=0;
//           int max=0;
//           for (int i=0;i<in.size()-1;i++){
//               if(in.get(i)==key){
//               min=in.get(i);
//               max=in.get(i);
                   
//               }
//               else if(in.get(i)!=key){
//                   min=in.get(i-1);
//               }
//               else 
//               max=in.get(i+1);
//           }
//           return (int)Math.ceil((min+max)/2);
           
//     }
    
     
// }



// class Solution{
//     int mean(Node root, int key){
//         // code here
        
//         // int less=(int)Math.floor(key);
//         // int high=(int)Math.ceil(key);
        
//         // if(less==-1 || high==-1)
//         // return -1;
        
//         // return (int)Math.ceil((less+high)/2);
        
        
        
        
//     }
// }


class Solution {
  int justLessThan = -1;
  int justGreaterThan = -1;

  public int mean(Node root, int key) {
    findJustLessThan(root, key);
    // Find the element just less than or equal to the given key
  
    // Find the element just greater than or equal to the given key
    findJustGreaterThan(root, key);
 return (int) Math.ceil((justLessThan + justGreaterThan) / 2.0);
    // Calculate the mean of the two elements
  }

  private void findJustLessThan(Node root, int key) {
    if (root == null) {
      return;
    }

    if (root.data <= key) {
      justLessThan = root.data;
      findJustLessThan(root.right, key);
    } else {
      findJustLessThan(root.left, key);
    }
  }

  private void findJustGreaterThan(Node root, int key) {
    if (root == null) {
      return;
    }

    if (root.data >= key) {
      justGreaterThan = root.data;
      findJustGreaterThan(root.left, key);
    } else {
      findJustGreaterThan(root.right, key);
    }
  }
}

