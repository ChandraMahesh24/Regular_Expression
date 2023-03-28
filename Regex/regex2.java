import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex2 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[^a-zA-Z)-9]");
        Matcher m = p.matcher("a7b@z#9");
        Pattern p2= Pattern.compile("[abc]");
        Matcher m2 = p2.matcher("a7b@z#9");
        while(m.find()){
            System.out.println("patter p is:  "+m.start()+"........"+m.group());
        }
        while(m2.find()){
            System.out.println("patter p2 is: "+m2.start()+"........"+m2.group());
        }

    }
}
