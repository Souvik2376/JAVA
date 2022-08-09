import java.util.Scanner;

public class calculation {
    public static void main(String[] args){
        Scanner deploy = new Scanner(System.in);
        System.out.println("please enter the two numbers u want to add :");
        double num1=deploy.nextDouble();
        deploy.nextLine();
        double num2=deploy.nextDouble();
        deploy.nextLine();
        double add= num1+num2;
        System.out.println("The addition of the two numbers is :"+add);
        double sub= num1-num2;
        System.out.println("The subtraction of the two numbers is:"+sub);
        double mul= num1*num2;
        System.out.println("The multiplication of the two numbers is :"+mul);
        double divi= num1/num2;
        System.out.println("The divition of the two numbers is:"+divi);
        double modul= num1%num2;
        System.out.println("The remainder of the two numbers is:"+modul);
    }
    
}
