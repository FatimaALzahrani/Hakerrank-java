//https://www.hackerrank.com/challenges/java-negative-subarray/problem?isFullScreen=true
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaSubarray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        int total=0;
        for(int i=0;i<n;i++){//0 
            int sum=0;
            sum+=arr[i];
            if(sum<0)
                total++;
            for(int j=i+1;j<n && i+1 <n;j++){//0 
                sum+=arr[j];//1
                if(sum<0)
                total++;
            }
            }
        System.out.println(total);

    }
}