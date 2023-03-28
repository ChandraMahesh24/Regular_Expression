import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class moblieNo {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("entar a  moblie no: ");
        String phon_No=sc.nextLine(); 
        Pattern p = Pattern.compile("(0|91)?[7-9][0-9]{9}");
        Matcher m = p.matcher(phon_No);
        boolean isMatch= m.matches();
        System.out.println(isMatch);

    }
}
