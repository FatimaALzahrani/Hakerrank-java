//https://www.hackerrank.com/challenges/Java-End-Of-File/problem?isFullScreen=true
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaEndOfFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while (sc.hasNext()) {
            System.out.println(i++ + " " + sc.nextLine());
        }
        sc.close();
    }
}