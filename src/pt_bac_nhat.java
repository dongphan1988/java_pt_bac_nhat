import java.util.Scanner;

public class pt_bac_nhat {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = c', please enter constants:");

        double a;
        double b;
        double c;
        String x;

        System.out.println("enter a : \n");
        a = input.nextDouble();
        if(a == 0) {
            System.out.println("x value : vo nghiem") ;
            return;
        }
        System.out.println("enter b : \n");
        b = input.nextDouble();
        System.out.println("enter c : \n");
        c = input.nextDouble();
        System.out.println("x value : " + (c - b)/a) ;

    }

}
