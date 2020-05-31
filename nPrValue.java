public class nPrValue
{ 
    static int fact(int n) 
    { 
        if(n <= 1) 
            return 1; 
        return n * fact(n - 1); 
    } 
    static int nPr(int n, int r) 

    { 
        return fact(n) / fact(n - r); 
    } 
    public static void main(String args[]) 

    { 
        int n =6; 
        int r =4; 
        System.out.println(n + "P" + r + " = " + nPr(n, r)); 
    } 


} 
