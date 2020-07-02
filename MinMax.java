// Java implementation to find the 
// minimum of the maximum difference 
import java.util.*; 
  
class MinMax { 
  
    // Function to find the minimum  
    // of the maximum difference of the 
    // adjacent elements after removing 
    // K elements from the array 
    static int minimumAdjacentDifference(int a[],  
                            int n, int k) 
    { 
        // Intialising the  
        // minimum difference 
        int minDiff = Integer.MAX_VALUE; 
      
        // Traversing over subsets  
        // in iterative manner 
        for (int i = 0; i < (1 << n); i++) { 
              
           int cnt = Integer.bitCount(i); 
      
            // If the removed  
            // set is of size k 
            if (cnt == n - k) { 
                  
                // Creating the new array 
                // after removing elements 
                 Vector<Integer> temp = new Vector<Integer>(); 
                for (int j = 0; j < n; j++) { 
                    if ((i & (1 << j)) != 0) 
                        temp.add(a[j]); 
                } 
  
                // Maximum difference of adjacent 
                // elements of remaining array 
                int maxDiff = Integer.MIN_VALUE; 
                for (int j = 0; j < temp.size() - 1; j++) { 
                    maxDiff = Math.max(maxDiff,  
                    temp.get(j + 1) - temp.get(j)); 
                } 
                minDiff = Math.min(minDiff, maxDiff); 
            } 
        } 
        return minDiff; 
    } 
      
    public static void main(String args[]) 
    { 
        int n = 5; 
        int k = 2; 
      
        int a[] = { 3, 7, 8, 10, 14 }; 
      
        System.out.println(minimumAdjacentDifference(a, n, k)); 
    } 
} 
  
  