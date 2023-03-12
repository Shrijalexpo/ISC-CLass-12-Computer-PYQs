import java.util.Scanner;

/**
 * A class Mix has been defined to mix two words, character by character, in the following [10]
 * manner:
 * The first character of the first word is followed by the first character of the second word and
 * so on. If the words are of different length, the remaining characters of the longer word are put at the end.
 * Example: If the First word is “JUMP” and the second word is “STROLL”, then the required word
 * will be “JSUTMRPOLL”
 */

class Mix{
    String wrd;
    int len;
    String nwrd = "";
    Mix(){
        wrd = "";
        len = 0;
    }
    void feedword(){
        Scanner sc = new Scanner(System.in);
        wrd = sc.next().toLowerCase();
    }
    void mix_wrd(Mix P, Mix Q){
        for (int i = 0; i < P.wrd.length() || i < Q.wrd.length(); i++) {

            if (i < P.wrd.length())
                nwrd += (P.wrd.charAt(i));

            if (i < Q.wrd.length())
                nwrd += (Q.wrd.charAt(i));
        }
    }
    void display(){
        System.out.println("The new Word: " + nwrd);
    }
    public static void main(String[] args) {
        Mix ob = new Mix();
        Mix P = new Mix();
        Mix Q = new Mix();
        System.out.println("Enter words 1 and 2:");
        P.feedword();
        Q.feedword();
        P.mix_wrd(P, Q);
        P.display();
    }
}