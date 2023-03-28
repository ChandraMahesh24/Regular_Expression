import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class findText {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string: ");
        String text= sc.nextLine();
        // String text= "Goodbye bye bye world world world";
        int count =0;
        System.out.println("Enter the String you want to find: ");
        String find=sc.nextLine();
        Pattern p= Pattern.compile(find);
        Matcher m = p.matcher(text);// used  matcher obj to match the given pattern
        while(m.find()){
            count++;
            System.out.println("start index: "+m.start()+" end index: "+ m.end()+" group: "+ m.group());
        }
        System.out.println("the count is "+count);

    }
}
