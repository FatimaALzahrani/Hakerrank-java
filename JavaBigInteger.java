//https://www.hackerrank.com/challenges/java-biginteger/problem?isFullScreen=true
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class JavaBigInteger {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        BigInteger a = new BigInteger(input.next());
        BigInteger b=new BigInteger(input.next());
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
        input.close();
    }
}