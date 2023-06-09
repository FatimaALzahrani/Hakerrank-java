package String;
//https://www.hackerrank.com/challenges/java-regex/problem
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Java_Regex{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}
//Write your code here
 class MyRegex{
    String pattern="(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])[.](\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])[.](\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])[.](\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
 }