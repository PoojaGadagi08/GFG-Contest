1.Maximum occurinmg digits 



  class Solution {
    static int countOccurrences(int num, int k) {
        int count = 0;
        while (num > 0) {
            int digit = num % 10;
            if (digit == k) {
                count++;
            }
            num /= 10;
        }
        return count;
    }

    static int maxoccourence(int[] arr, int n, int k) {
        // code here
        Map<Integer, Integer> occurrences = new HashMap<>();
        int maxOccurrences = 0;
        int smallestNumber = Integer.MAX_VALUE;
        int result = -1;

        for (int num : arr) {
            int count = countOccurrences(num, k);
            occurrences.put(num, count);
            if (count > maxOccurrences || (count == maxOccurrences && num < smallestNumber)) {
                maxOccurrences = count;
                smallestNumber = num;
                result = num;
            }
        }

        return result;
    }
}





2.Geeks Plant

  
  class Solution {
  public:
  
  
  // finding gcd
  long long goal(int x, int y){
      if (y==0)
      return x;
      else 
      return goal(y, x%y);
  }
    long long minimumBuckets(int n, vector<int> &arr) {
        // code here
        long long h =arr[0];
        for(int i=0;i<n;i++){
            h=goal(arr[i], h);
        }
        long long a=0;
        for(int i=0;i<n;i++){
            a=a+arr[i]/h;
            }
            return a;
    }
};





3.Cyclic tree

  class Solution{
    public String cyclicTree(int n, int e[][]){
        // Code Here. 
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                a[e[i][j]-1]=a[e[i][j]-1]+1;
                if(a[e[i][j]-1]>2)
                return "Yes";
            }
        }
        return "No";
    }
    
}
