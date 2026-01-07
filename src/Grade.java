import java.util.Scanner;
public class Grade {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enetr your marks");
        float g=sc.nextFloat();
        if(g>=90){
            System.out.println("Grade is O");
        } else if (g>=80 && g<=89) {
            System.out.println("Grade is A");
        } else if (g>=70 && g<=79) {
            System.out.println("Grade is A");
        } else if (g>=60 && g<=69) {
            System.out.println("Grade is B");
        } else if (g>=50 && g<=59) {
            System.out.println("Grade is C");
        } else if (g>=40 && g<=49) {
            System.out.println("Grade is D");
        }
        else if(g<40){
            System.out.println("YOU ARE FAIL");
        }
        else{
            System.out.println("Invalid Marks");
        }
    }
}
