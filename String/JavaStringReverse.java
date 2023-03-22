package String;
//https://www.hackerrank.com/challenges/java-string-reverse/problem?isFullScreen=true
import java.io.*;
import java.util.*;
public class JavaStringReverse {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String re="";
        for(int i=A.length()-1;i>=0;i--){
            re+=A.charAt(i);
        }
        System.out.println((re.equals(A)?"Yes":"No"));
    }
}