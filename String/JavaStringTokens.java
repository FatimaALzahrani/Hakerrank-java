package String;
//https://www.hackerrank.com/challenges/java-string-tokens/problem?isFullScreen=true
import java.io.*;
import java.util.*;
public class JavaStringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        ArrayList<String>list=new ArrayList<String>();
        String re="";
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i)))
            re+=s.charAt(i);
            else if(re.equals("")==false){
            list.add(re);
            re="";
            }
            if(re.equals("")==false && Character.isLetter(s.charAt(i)) && i==s.length()-1){
            list.add(re);
            }
        }
        System.out.println(list.size());
        for(int i=0;i<list.size();i++)
        System.out.println(list.get(i));
        scan.close();
    }
}

