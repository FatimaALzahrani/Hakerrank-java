//https://www.hackerrank.com/challenges/java-loops/problem?isFullScreen=true
import java.util.*;
import java.io.*;
public class JavaLoopsII{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
        for(int k= 0;k<n;k++){
            int re=a;
            for(int j=0;j<=k;j++){
            re+=Math.pow(2,j)*b;
            }
            System.out.print(re+" ");
        }
            System.out.println();
        }
        in.close();
    }
}

// or more simple 

/*
import java.util.*;
import java.io.*;

public class JavaLoopsII{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int re=a;
            for(int j=0;j<n;j++){
            re+=Math.pow(2,j)*b;
            System.out.print(re+" ");
            }
            System.out.println();
        }
        in.close();
    }
}
 */