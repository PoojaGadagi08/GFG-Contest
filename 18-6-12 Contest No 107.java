1)Weight Problem

Geek wants to measure weight of some objects for which he has several iron blocks to compare with The weights of the iron blocks are powers of 2, i.e.,
their weights are 2 ^ 0 2 ^ 1 2 ^ 2 , 2 ^ 3 and so on. It Geek is given an object of weight 5, he can use two blocks of weight 2, and another of weight 1 
  to determine the total weight of the object.

You will be given weight w of an object, and you will have to determine the minimum number of such iron blocks required to compare the weight of the object.

Note: Geek always has sufficient amount of blocks to weigh an object.

Example 1:

Input:

w = 5

Output: 2

Explanation:

If you will take one iron block of weight 4, and another of weight





class Solution {
    public static int nBlocks(int w) {
        // code here
        // double p = Math.log10(w)/ Math.log10(2);
        // // checking to see if power is an integer or not
        // int ans=0;
        // if (p - (int)p == 0) 
        // ans=1;
        // return ans;
        
        
    //     int[] result = new int[w+1];  // use "n+1" otherwise it will throw exception
    // int i = 0;
    // int power = 1;   // initiate power = 1, not power = 0;
    // while (i <= w) 
    // {
    //     result[i] = power;
    //     power *= 2;
    //     i++;        // increments "i" otherwise its an infinite loop
    // }
    // int c=0;
    // for(int j=0;j<result.length;j++){
    //     if(result[j]<w)
    //     c++;
    // }
    // return c-1;
    
            int x=0;
            while(w>0){
                int y=(int)(Math.log(w) / Math.log(2));
                x=x+1;
                w=w-(int)Math.pow(2,y);
            }
            return x;
    }
}
        
