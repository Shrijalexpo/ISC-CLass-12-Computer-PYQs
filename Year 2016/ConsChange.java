import java.util.Scanner;

/**
 * A class ConsChange has been defined with the following details: [10]
 * Class name: ConsChange
 * Data members/instance variables:
 * word: stores the word
 * len: stores the length of the word
 * Member functions/methods:
 * ConsChange(): default constructor
 * void readword(): accepts the word in lowercase
 * void shiftcons(): shifts all the consonants of the word at the beginning followed by the vowels
 * (e.g. spoon becomes spnoo)
 * void changeword(): changes the case of all occurring consonants of the shifted word to uppercase,
 * for e.g. (spnoo becomes SPNoo)
 * void show(): displays the original word, shifted word and the changed word
 * Specify the class ConsChange giving the details of the constructor ), void readword ( ), void shiftcons (),
 * void changeword() and void show(). Define the main() function to create an object and call the functions
 * accordingly to enable the task.
 */

class ConsChange{
    String word;
    String vow = "", cons = "";
    int len;
    String shiftwrd, chngwrd;
    char[] arr = {'a','e','i','o','u'};
    ConsChange(){
        word = "";
        len = 0;
        shiftwrd = "";
        chngwrd = "";
    }
    void readword(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word: ");
        word = sc.next().toLowerCase();
        len = word.length();
    }

    void shiftcons(){
        for (int i = 0; i < word.length(); i++) {
            int count = 0;
            for (int j = 0; j < 5; j++) {
                if (word.charAt(i) == arr[j]) {
                    count++;
                }
            }
            if (count == 1) {
                vow += word.charAt(i);
            } else {
                cons += word.charAt(i);
            }
        }
        shiftwrd =  cons + vow;

    }

    void changeword(){
        chngwrd = cons.toUpperCase() + vow;
    }

    void show(){
        System.out.println("Original Word: "+word + "\nShited word: "+shiftwrd + "\nChanged Word: " +chngwrd);
    }
    public static void main(String[] args) {
        ConsChange ob = new ConsChange();
        ob.readword();
        ob.shiftcons();
        ob.changeword();
        ob.show();
    }
}