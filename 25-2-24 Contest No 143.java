1.


  class Solution {
    public static boolean isMagicArray(int n, int[] arr) {
        // code here
        
        for(int i=0;i<n-1;i++){
            if(isEven(arr[i]) == isEven(arr[i+1]))
            return false;
        }
        return true;
    }
    
    public static boolean isEven(int n){
        return n%2 ==0;
    }
}
        



2.


  class Solution {
    public static String smallestString(int n, String s) {
        // code here
        char[] ch =s.toCharArray();
        boolean p = true;
        for(int i=0;i<n/2;i++){
           if(ch[i] != 'a'){
               p=false;
               break;
           } 
        }
        
        if(p && n>1){
            ch[n-1]='b';
        }
        else{
            for(int i=0;i<n/2;i++){
                if(ch[i] != 'a'){
                    ch[i]='a';
                    break;
                }
            }
        }
        
        return isPalin(new String(ch)) ? "-1" : new String(ch);
    }
    
    public static boolean isPalin(String s){
        int l=0;
        int r=s.length()-1;
        while(l<r){
            if(s.charAt(l) != s.charAt(r))
            return false;
            
            l++;
            r--;
        }
        
        
        return true;
    }
}
        
