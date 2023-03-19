//https://www.hackerrank.com/challenges/java-list/problem?isFullScreen=true
	import java.io.*;
	import java.util.*;
	
	public class JavaList {	
		public static void main(String[] args) {
			/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
			Scanner input= new Scanner(System.in);
			int t=input.nextInt();
			List <Integer>arr=new ArrayList<Integer>();
			for(int i=0;i<t;i++)
			arr.add(input.nextInt());
			
			int q=input.nextInt();
			while(q>0){
				String s=input.next();
				if(s.equals("Insert")){
					int x=input.nextInt();
					int y=input.nextInt();
					arr.add(x, y);
				}else{
					int x=input.nextInt();
					arr.remove(x);
				}
				q--;
			}
			for(int i=0;i<arr.size();i++)
			System.out.print(arr.get(i)+" ");
		}
	}
	