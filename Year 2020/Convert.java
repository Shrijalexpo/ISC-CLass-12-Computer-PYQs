import java.util.Scanner;

/**
 * Design a class Convert to find the date and the month from a given day number for a [10]
 * particular year.
 * Example: If day number is 64 and the year is 2020, then the corresponding date would be:
 * March 4, 2020 i.e. (31 + 29 + 4 = 64) Some of the members of the class are given below:
 *
 *
 */
class Convert{
    int d, m, y, n;
    int[] daynum = {0,31,28,31,30,31,30,31,31,30,31,30,31};
    String[] months ={"", "January", "Feburary", "March", "April","May", "June", "July","August","September","October",
            "November","December"};
    Convert(){
        d = 0;
        m = 1;
        y = 0;
        n = 0;
    }
    void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day number: ");
        n = sc.nextInt();
        System.out.println("Enter year");
        y = sc.nextInt();
    }
    void day_to_date(){
        if((y%4 == 0 && y%100 != 0) || (y % 400 == 0)){
            daynum[2] = 29;
        }
        while(n != 0){
            if(n >= daynum[m]){
                n -= daynum[m ++];
            }
            else {
                d = n;
                n -= d;
            }
        }
    }
    void display(){
        System.out.println("Date: " + d +" " + months[m] +", " + y);
    }
    public static void main(String[] args) {
        Convert ob = new Convert();
        ob.accept();
        ob.day_to_date();
        ob.display();
    }
}
