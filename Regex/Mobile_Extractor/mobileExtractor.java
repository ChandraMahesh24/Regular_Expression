import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.regex.*;


public class mobileExtractor{
    public static void main(String[] args) throws Exception{
        PrintWriter out = new PrintWriter("output.txt");// extracted phone numbers and email addresses to a file named "output.txt".
        Pattern moblie = Pattern.compile("(0|91)?[7-9][0-9]{9}");
        Pattern email = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_.]*[@][a-zA-Z0-9]+([.][a-zA-Z]+)+");
        BufferedReader br = new BufferedReader(new FileReader("input.txt")); //object that reads data from a file named "input.txt".
        String line = br.readLine(); // read each line of text
        while(line!= null){
            Matcher mobile_1 = moblie.matcher(line);
            Matcher email_1=email.matcher(line); 
            while(mobile_1.find()){
                out.println(mobile_1.group());
            }
            while(email_1.find()){
                out.println(email_1.group());
            }
            line=br.readLine();
        }
        out.flush();

    }
}