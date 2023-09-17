1.Weird Island

  Geek's island has weird rules. The king of the island ordered that if the price of any item is even then, it can only be used by boys, and if the price is odd, it can only be used by girls.
A person can only buy one type of item else he/she is punished.
The gender of a person on the island  can be determined by the type of item which he/she bought.
Geek bought exactly two items, the cost of which is A and B respectively. 
Return "He" if Geek is a boy, return "She" if Geek is a girl else return "Punished" if Gender cannot be determined.

 

Example 1:

Input:
A = 3, B = 7
Output: 
She
Explanation: 
Both are odd.
Example 2:

Input:
A = 2, B = 5
Output: 
Punished
Explanation: 
A is even and B is odd.
Your Task:  
You don't need to read input or print anything. Your task is to complete the function solve( ) which takes integers A and B as input parameters and returns the answer as a string.

Constraints:
1 ≤ A , B ≤ 109



  class Solution {
    static String solve(int A, int B) {
        //code here
        
        if(A%2!=0 && B%2!=0)
        return "She";
        else if(A%2==0 && B%2==0)
        return "He";
        
        return "Punished";
    }
}





2.Empty the String

  Given a String s, In one operation we can delete any occurences of "geek" as a substring in the String. Find the number of delete operations you have to perform to make the String Empty. 

Example 1:

Input:
s = "gegeekek"
Output:
2
Explanation:
gegeekek
We can first delete the bold characters
which form "geek", and then delete the
remaning string "geek" again from the string.
So, we will need 2 operations

Example 2:

Input:
s = "geekkgee"
Output:
-1
Explanation:
It's not possible to make the String empty.
Your Task:
You don't need to read input or print anything. Your task is to complete the function makeStringEmpty() which takes a String s as input and returns the minimum number of operations required to delete the String entirely. If it's not possible to do so return -1.

Constraints:
1 <= |s| <= 105





  
class Solution {
    static int makeStringEmpty(String s) {
        // code here
        
        
        //  int count = 0;
        // while (s.contains("geek")) {
        //     s = s.replaceFirst("geek", "");
        //     count++;
        // }
        
        // if(s.equals(""))
        // return count;
        
        // return -1;
        
        
        
        //  int count = 0;
        // int i = 0;
        // while (i < s.length()) {
        //     if (s.charAt(i) == 'g' && i + 3 < s.length() && s.charAt(i + 1) == 'e' && s.charAt(i + 2) == 'e' && s.charAt(i + 3) == 'k') {
        //         i += 4;
        //         count++;
        //     } else {
        //         i++;
        //     }
        // }
        // return count;
        
        
        
        
        //  int count = 0;
        // StringBuilder sb = new StringBuilder(s);

        // while (true) {
        //     int index = sb.indexOf("geek");
        //     if (index == -1) {
        //         break;
        //     }

        //     sb.delete(index, index + 4);
        //     count++;
        // }

        // if(sb.equals(""))
        // return count;
        
        // return -1;
        
        
        
    //      int count = 0;
    //     int index = s.indexOf("geek");

    //     while (index != -1) {
    //         s = s.substring(0, index) + s.substring(index + 4);
    //         index = s.indexOf("geek");
    //         count++;
    //     }

    //   if(s.equals(""))
    //     return count;
        
    //     return -1;  
    
    
    Stack<Character> st=new Stack<>();
    
    int ope=0;
    
    for(char ch: s.toCharArray() ){
        st.push(ch);
        
        if(st.size()>=4 && st.peek()=='k' && st.get(st.size()-2)=='e' && st.get(st.size()-3)=='e' && st.get(st.size()-4)=='g'){
            st.pop();
            st.pop();
            st.pop();
            st.pop();
            
            ope++;
        } 
    }
    
    return st.isEmpty() ? ope : -1;
        
    }
};

