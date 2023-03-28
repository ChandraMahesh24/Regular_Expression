import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class emailMatch {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the emial id");
        String email= sc.nextLine();
        // Pattern p= Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_.]*@gmail[.]com");
        Pattern p2= Pattern.compile("[a-zA-Z0-9][a-zA-Z0_9_.]*@[a-zA-z]+([.][a-zA-Z]+)+");
        Matcher m = p2.matcher(email);
        boolean isMatch= m.matches();
        System.out.println(isMatch);
    }
}
