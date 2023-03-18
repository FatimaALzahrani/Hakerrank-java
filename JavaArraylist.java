//https://www.hackerrank.com/challenges/java-arraylist/problem?isFullScreen=true
import java.io.*;
import java.util.*;
public class JavaArraylist {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        ArrayList <int[]> ar=new ArrayList<int[]>();
        while(t>0){
            int n=input.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=input.nextInt();
            }
            ar.add(arr);
            t--;
        }
        int q=input.nextInt();
        while(q>0){
            int x=input.nextInt();
            int y=input.nextInt();
            if(x<=ar.size() && y<=ar.get(x-1).length){
                System.out.println(ar.get(x-1)[y-1]);
            }else
            System.out.println("ERROR!");
            q--;
        }
    }
}
