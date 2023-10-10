import java.util.Scanner;
public class DoWhile23 {
    public static void main(String[] args){
        Scanner sc23 =new Scanner(System.in);

        int x = 0;
        do {
            System.out.println(x);
        } while (++x <= 8);
        System.out.println("Program berhenti");

        // int x = 10;
        // do {
        //    System.out.println(x);
        // } while (++x <= 8);
        // System.out.prrintln("Program berhenti");
    }
}