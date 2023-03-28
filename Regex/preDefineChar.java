import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class preDefineChar {
    public static void main(String[] args) {
        String text ="This indicates that the word 'Java' appears MORE than once IN the text. ";
        Pattern p = Pattern.compile("[\\s]");// space char 
        Pattern p2 = Pattern.compile("[\\S]"); //Any char except sapce
        Pattern p3 = Pattern.compile("[\\.]"); //Any symbol including Special character also
        Pattern p4 = Pattern.compile("[\\w]"); //any word character[a-zA-Z0-9]
        Pattern p5 = Pattern.compile("[\\W]");//except word Character(Special char)
        Pattern p6 = Pattern.compile("[\\d]");// any digit from 0-9
        Pattern p7 = Pattern.compile("[\\D]");// Any character Except digit
        Matcher m = p.matcher(text);
        while(m.find()){
            System.out.println("sapce is at"+m.start()+"......."+m.group());

        }

    }
}
