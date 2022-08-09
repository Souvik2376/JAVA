import java.util.Scanner;//java scanner class pack we have to import each time we use it 

class Scan{ // class name should not be Scanner it will through an error
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);//new name for scanner assigned
        System.out.println("What's ur name??");
        String name =scanner.nextLine();// new line will scan thevalue \n at theastf the array
        System.out.println("Hello "+name+"\nIt is nice finally meet you in person .");
        System.out.println("How old are you??");
        int age = scanner.nextInt();
        /*
        For int value the command is nextInt() it will scan upto the int number value
        like this for double it is Nextdouble() it will scan upto the double value 
        so we should always use newLine() at the end so that i can scan \n and move towards
        nextLine() should be always for string dataype
        */
        scanner.nextLine(); 
        System.out.println("ohhh You are "+age+" old.very young for such an establishment.");
        System.out.println("What u like to eat ?");
        String food= scanner.nextLine();
        System.out.println("Ohhhh smae pinch "+food+" is my fav food also bro!!");


    }
}