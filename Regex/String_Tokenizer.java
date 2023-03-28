import java.util.StringTokenizer;

public class String_Tokenizer {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("this is string tokenizer");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
            System.out.println(st.countTokens());
        }
        StringTokenizer st1= new StringTokenizer("25-03-2023" ,"-");
        while(st1.hasMoreTokens()){
            System.out.println(st1.nextToken());
        }
    }
}
