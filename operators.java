import java.util.Scanner;

public class operators {
    /*
     * The s mainly 5 types of operators + - * / %
     * + is for increment
     * - is for decremt
     * * is for multiplication
     * / is for division
     * % is for modulous
     */
    public static void main(String[] args){
        Scanner deploy = new Scanner(System.in);
        System.out.println("How many friends do you have ???");
        int num = deploy.nextInt();
        deploy.nextLine();
        System.out.println("Ohhh !!! You have a lot of friends.from now on I am your friend too.");
        num++;
        System.out.println("Total friends :"+num);
    }
}
