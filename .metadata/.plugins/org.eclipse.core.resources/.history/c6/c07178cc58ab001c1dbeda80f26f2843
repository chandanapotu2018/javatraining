package project2;
import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
public class emailvalidation {
 public static void main(String[] args) {
 
 ArrayList<String> emailID = new ArrayList<String>();
 
 emailID.add("chandu@gmail.com");
 emailID.add("priya@gmail.com");
 emailID.add("rani@gmail.com");
 emailID.add("anu@gmail.com");
 emailID.add("aadi@gmail.com");
 emailID.add("aravind@gmail.com");
 emailID.add("rahul@gmail.com");
 
 String searchElement;
 System.out.println("E-mail: ");
 Scanner scanner = new Scanner(System.in);
 searchElement = scanner.nextLine();
 String regex = "^(.+)@(.+)$";
 
 Matcher matcher = Pattern.compile(regex).matcher(searchElement);
 
 if (matcher.matches() && emailID.stream().anyMatch(mail -> 
mail.equals(searchElement))) {
 System.out.println(searchElement + " = is present");
 } 
 else {
 System.out.println("Not a valid or is not present");
 }
 
 }
 

}
