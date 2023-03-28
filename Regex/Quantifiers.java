import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Quantifiers we used to specify no of occurrence of match
// abaabaaab

// 0.....a
// 2.....aa
// 5.....aaa

public class Quantifiers {
    public static void main(String[] args) {      
                        
        System.out.println("\na Exactly One a..........................m1");
        
        Pattern p1 = Pattern.compile("a");                      //Exactly One a
        Matcher m1 = p1.matcher("abaabaaab");
        while(m1.find()){
            System.out.println(m1.start()+"......."+m1.group());
        }

        System.out.println("\na+  Atleast One a..........................m2");
        
        Pattern p2 = Pattern.compile("a+");                      // Atleast One a
        Matcher m2 = p2.matcher("abaabaaab");
        while(m2.find()){
            System.out.println(m2.start()+"......."+m2.group());
        }

        System.out.println("\na* Any numbver of a's including zero number also....................m3");
        
        Pattern p3 = Pattern.compile("a*");           // Any numbver of a's including zero number also
        Matcher m3= p3.matcher("abaabaaab");
        while(m3.find()){
            System.out.println(m3.start()+"......."+m3.group());
        }

        System.out.println("\na? Atmost one a...........................m4");

        Pattern p4 = Pattern.compile("a?");                  //atmost one a
        Matcher m4= p4.matcher("abaabaaab");
        while(m4.find()){
            System.out.println(m4.start()+"......."+m4.group());
        }
    }
}
