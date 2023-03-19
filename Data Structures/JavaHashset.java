//https://www.hackerrank.com/challenges/java-hashset/problem?isFullScreen=true
	import java.io.*;
	import java.util.*;
	import java.text.*;
	import java.math.*;
	import java.util.regex.*;
	public class JavaHashset {
		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			int t = s.nextInt();
			String [] pair_left = new String[t];
			String [] pair_right = new String[t];
			
			for (int i = 0; i < t; i++) {
				pair_left[i] = s.next();
				pair_right[i] = s.next();
			}
	
	//Write your code here
	
			Set <String> pa=new HashSet<String>();
			for(int i = 0; i < t; i++) {
				String f=pair_left[i]+" "+pair_right[i];
				pa.add(f);
				System.out.println(pa.size());
			}
	
		}
	}