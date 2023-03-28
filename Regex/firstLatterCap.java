import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class firstLatterCap{  
    public static void main(String[] args) {
        String text="The 1234 5 55 quick brown fox jumps over the lazy dog";
        String pattern1="\\b(\\w)(\\w*)\\b";
        // String pattern1="\\b(\\D+)\\b";
        Pattern regex= Pattern.compile(pattern1);

        Matcher matcher = regex.matcher(text);
        while(matcher.find()){
            String firstyLatter= matcher.group(1);
            String restLatter=matcher.group(2);
            System.out.println(firstyLatter.toUpperCase()+restLatter);
            // System.out.println(restLatter);

        }
    }
}