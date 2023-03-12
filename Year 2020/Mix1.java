import java.util.Scanner;

/**
 * A class Mix has been defined to mix two words, character by character, in the following [10]
 * manner:
 * The first character of the first word is followed by the first character of the second word and
 * so on. If the words are of different length, the remaining characters of the longer word are put at the end.
 * Example: If the First word is “JUMP” and the second word is “STROLL”, then the required word
 * will be “JSUTMRPOLL”
 */

class Mix1{
    String wrd;
    int len;
    String nwrd = "";
    Mix1(){
        wrd = "";
        len = 0;
    }
    void feedword(){
        Scanner sc = new Scanner(System.in);
        wrd = sc.next().toLowerCase();
    }
    void mix_wrd(Mix1 P, Mix1 Q){
        String temp = "";
        int small = 0;
        if (P.wrd.length() > Q.wrd.length()){
            small = Q.wrd.length();
            temp = P.wrd.substring(small );
        }
        else if (P.wrd.length() < Q.wrd.length()){
            small = P.wrd.length();
            temp = Q.wrd.substring(small );
        }
        else {
            small = P.wrd.length();
        }
        for (int i = 0; i < small; i++) {
            nwrd += String.valueOf(P.wrd.charAt(i)) + String.valueOf(Q.wrd.charAt(i));
        }
        nwrd += temp;
    }
    void display(){
        System.out.println("The new Word: " + nwrd);
    }
    public static void main(String[] args) {
        Mix1 ob = new Mix1();
        Mix1 P = new Mix1();
        Mix1 Q = new Mix1();
        System.out.println("Enter words 1 and 2:");
        P.feedword();
        Q.feedword();
        ob.mix_wrd(P, Q);
        ob.display();
    }
}