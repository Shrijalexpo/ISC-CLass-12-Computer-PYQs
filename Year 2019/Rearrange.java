import java.util.Scanner;

/**
 * A class Rearrange has been defined to modify a word by bringing all the vowels in the word at the beginning followed
 * by the consonants.
 * Example:
 * ORIGINAL becomes OIIARGNL
 * Some of the members of the class are given below:
 * Class name: Rearrange
 * Data Member/instance variable:
 * wrd: to store a word
 * newwrd: to store the rearranged word
 * Member functions/methods:
 * Rearrange(): default constructor
 * void readword(): to accept the word in UPPER case
 * vow freq_vow_con(): finds the frequency of vowels and consonants in the word and displays them with an appropriate
 * message
 * void arrange(): rearranges the word by bringing the vowels at the beginning followed by consonants
 * void display(): displays the original word along with the rearranged word
 * Specify the class Rearrange, giving the details of the constructor(), void readword(), void freq _vow_con(),
 * void arrange() and void display(). Define the main() function to create an object and call the functions accordingly
 * to enable the task.
 */

class Rearrange{
    String wrd, newwrd;
    Scanner sc = new Scanner(System.in);
    char[] arr = {'A','E','I','O','U'};
    Rearrange(){
        newwrd = "";
        wrd = "";
    }
    void readword(){
        System.out.println("Enter word: ");
        wrd = sc.next().toUpperCase();
    }

    void freq_vow_con(){
        int vowfreq = 0;
        for (int i = 0; i < wrd.length(); i++) {
            for (int j = 0; j < 5; j++) {
                if(wrd.charAt(i) == arr[j]){
                    vowfreq += 1;
                }
            }
        }
        System.out.println("Frequency of Vowels: " + vowfreq +"\nFrequency of Consonants: " + (wrd.length() - vowfreq));
    }

    void arrange() {
        String vow = "", cons = "";
        for (int i = 0; i < wrd.length(); i++) {
            int count = 0;
            for (int j = 0; j < 5; j++) {
                if (wrd.charAt(i) == arr[j]) {
                    count++;
                }
            }
            if (count == 1) {
                vow += wrd.charAt(i);
            } else {
                cons += wrd.charAt(i);
            }
        }
        newwrd = vow + cons;
    }

    void display(){
        System.out.println("Original Word: "+wrd + "\nRearranged Word: "+newwrd);
    }
    public static void main(String[] args) {
        Rearrange ob = new Rearrange();
        ob.readword();
        ob.freq_vow_con();
        ob.arrange();
        ob.display();
    }
}