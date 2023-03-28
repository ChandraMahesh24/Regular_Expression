import java.util.regex.Pattern;

import javax.sound.sampled.SourceDataLine;

public class Split {
    public static void main(String[] args) {
        String text ="The string split().";
        Pattern p1=Pattern.compile("\\s"); 
        Pattern p2=Pattern.compile("a"); //except a remaning are token
        String []s= p1.split(text);
        for(String str:s){
            System.out.println(str);
        }

        System.out.println("\n");
        String p4= "The string split";
        String []s4= p4.split("\\s");
        for(String str4:s4){
            System.out.println(str4);
        }

    System.out.println("\n ");
        Pattern p3= Pattern.compile("\\."); // used "\\.";     //don't use "."  it used for any char
        String []s3= p3.split("www.google.com");
        for(String str3:s3){
            System.out.println(str3);
        }
    
}

}