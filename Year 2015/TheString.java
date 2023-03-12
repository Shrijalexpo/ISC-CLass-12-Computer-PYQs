import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * A class TheString accepts a string of a maximum of 100 characters with only one blank space between the words. [10]
 * Some of the members of the class are as follows:
 * Class name: TheString
 * Data members/instance variables:
 * str: to store a string
 * len: integer to store the length of the string
 * wordCount: integer to store the number of words
 * cons: integer to store the number of consonants
 * Member functions/methods:
 * TheString(): default constructor to initialize the data members
 * TheString(String ds): parameterized constructor to assign str=ds
 * void countFreq(): to count the number of words and the number of consonants and store them in wordCount and cons
 * respectively
 * void display(): to display the original string, along with the number of words and the number of consonants
 * Specify the class TheString giving the details of the constructors, void countFreq() and void display().
 * Define the main() function to create an object and call the functions accordingly to enable the task.
 */

class TheString{
    String str;
    int len,wordCount,cons;
    TheString(){
        str = "";
        len = 0;
        wordCount = 0;
        cons = 0;
    }
    TheString(String ds){
        str = ds;
    }
    void countFreq(){
        int charlen = 0;
        char[] ch = {'a','e','i','o','u'};
        String temp = "";
        StringTokenizer st = new StringTokenizer(str," ");
        wordCount = st.countTokens();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != ' '){
                charlen++;
            }
        }
        if(charlen > 100){
            System.out.println("Too much characters!!! \nLimit exceeded\nYour momma gay");
            System.exit(0);
        }
        int flag;
        while (st.hasMoreTokens()){
            temp = st.nextToken().toLowerCase();
            for (int i = 0; i < temp.length(); i++) {
                flag = 0;
                for (int j = 0; j < 5; j++) {
                    if (ch[j] == temp.charAt(i)){
                        flag ++;
                    }
                }
                if (flag == 0){
                    cons ++;
                }
            }
        }
    }
    void display(){
        System.out.println("Origanal String: "+ str + "\nNo. of words: "+wordCount+"\nConsonant Frequescy: "+(cons));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TheString ob = new TheString();
        System.out.println("Enter str: ");
        TheString ob1 = new TheString(sc.nextLine());
        ob1.countFreq();
        ob1.display();
    }
}