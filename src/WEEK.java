import java.util.Scanner;
public class WEEK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr your DAY number");
        int g = sc.nextInt();
        switch (g){
            case 1:{
                System.out.println("The day is MONDAY");
                break;
            } case 2:{
                System.out.println("The day is TUESDAY");
                break;
            } case 3:{
                System.out.println("The day is WEDNESDAY");
                break;
            } case 4:{
                System.out.println("The day is THURSDAY");
                break;
            } case 5:{
                System.out.println("The day is FRIDAY");
                break;
            } case 6:{
                System.out.println("The day is SATDAY");
                break;
            } case 7:{
                System.out.println("The day is SUNDAY");
                break;
            } default: {
                System.out.println("The day is INVALID");
                break;
            }
        }
    }
}
