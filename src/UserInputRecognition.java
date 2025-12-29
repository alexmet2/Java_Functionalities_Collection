import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class UserInputRecognition {
    UserInputRecognition(){
        try (Scanner scan = new Scanner(System.in, StandardCharsets.UTF_8)) {
            System.out.println("Input something");
            char a1 = scan.next().charAt(0);
            /* conversion from char to String to int */
            /* in case of error(character or symbol), it will recognize that it is not a number */
            try{
                /* for negative */
                if(a1 == '-'){
                    System.out.println("You inserted something lower than 0");
                }
                else{
                    System.out.println("The program is taking " + a1);
                    String a2 = String.valueOf(a1);
                    int b = Integer.parseInt(a2); /* the error happens here */
                    /* for numbers */
                    if(check_int(b)){
                        System.out.println("You inserted a number between 0-9");
                    }
                    else{
                        System.out.println("You inserted something bigger than 0-9");
                    }
                }
            }
            catch(NumberFormatException NFE){
                /* for characters or symbols */
                if(Character.isUpperCase(a1)){
                    if(check_cap_eng(a1,'A','Z')){
                        System.out.println("You inserted a UpperCase English Character");
                    }
                }
                else if(Character.isLowerCase(a1)){
                    if( check_lower_eng(a1,'a','z')){
                        System.out.println("You inserted a LowerCase English Character");
                    }
                }
                else{
                    System.out.println("You inserted a symbol");
                }
            }
        }
    }
    static boolean check_int(int b){
        return 0<=b && b<=9;
    }
    static boolean check_cap_eng(char a, char b, char c){
        return b<=a && a<=c;
    }
    static boolean check_lower_eng(char a, char b, char c){
        return b<=a && a<=c;
    }
}
