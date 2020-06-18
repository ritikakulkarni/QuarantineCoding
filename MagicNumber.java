// Java program to find nth 
import java.io.*; 
class MagicNumber 
{ 
static int nthMagicNo(int n) 
{ 
	int pow = 1, answer = 0; 
	while (n != 0) 
	{ 
	pow = pow*5; 
	if ((int)(n & 1) == 1) 
		answer += pow; 
	n >>= 1; 
	} 
	return answer; 
} 
public static void main(String[] args) 
{ 
	int n = 5; 
	System.out.println("nth magic" + 
	" number is " + nthMagicNo(n)); 
} 
} 
