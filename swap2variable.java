public class swap2variable {


    public static void main(String[] args){
        String a="Eren Yeger";
        String b="Mikasa Ackerman";
        String temp="Jean looser";
        
        temp=a;
        a=b;
        b=temp;//Temp value is gone if there is any so we should always use null variable to swap 2 variable
        System.out.println(a);
        System.out.println(b);
        System.out.println(temp);

    }
    
}
