import java.io.*;
import java.util.*;

public class BigInteger {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
    	java.math.BigInteger a, b;
    	a = scan.nextBigInteger();
    	b = scan.nextBigInteger();
    	
    	System.out.println(a.add(b));
    	System.out.println(a.multiply(b));
    }
}

