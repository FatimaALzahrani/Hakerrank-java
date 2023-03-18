//https://www.hackerrank.com/challenges/java-primality-test/problem?isFullScreen=true
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class JavaPrimalityTest {
		public static void main(String[] args) throws IOException {
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	
			String n = bufferedReader.readLine();
			BigInteger b=new BigInteger(n);
			if(b.isProbablePrime(100)==true)
			System.out.println("prime");
			else
			System.out.println("not prime");
			bufferedReader.close();
		}
	}
	