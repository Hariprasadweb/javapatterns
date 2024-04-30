package oops.code;

import java.util.Arrays;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        String s=reverse("Hyderabad");
        System.out.println(s);
        pattern();

    }

    static String reverse(String str){
       StringBuilder reverse= new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
          reverse.append(str.charAt(i)+" ");

        }
        return reverse.toString();


    }
    static void pattern(){

        for(int i=0;i<=4;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        for(int k=0;k<=5;k++){
            for(int l=5;l>=k;l--){
                System.out.print(" * ");

            }
            System.out.println();
        }

        for(int i=0;i<=5;i++){
            for(int j=0;j<=5;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        for(int i=0;i<=5;i++){
            for(int j=0;j<=i;j++){
                System.out.print(j+" ");

            }
            System.out.println();
        }

        for(int i=1;i<=5;i++){
            for(int k=1;k<=(5-i);k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
