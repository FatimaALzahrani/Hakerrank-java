//https://www.hackerrank.com/challenges/java-static-initializer-block/problem?isFullScreen=true
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class JavaStaticInitializerBlock {
static Scanner input=new Scanner(System.in);
static int B=input.nextInt();
static int H =input.nextInt(); 
public static Boolean flag=false;
static{
    if(B>0 && H>0){
        flag = true;
    }
    else{
        System.out.println("java.lang.Exception: Breadth and height must be positive");
    }
}
public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

