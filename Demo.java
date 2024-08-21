import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Input: ");

        String nextLine = scan.nextLine();


        if(nextLine.equalsIgnoreCase("man") || nextLine.equalsIgnoreCase("m"))
        {
            Gitperson man = new Gitman();
            man.fight();
        }
        else if(nextLine.equalsIgnoreCase("woman") || nextLine.equalsIgnoreCase("w"))
        {
            Gitperson woman = new Gitwoman();
            woman.fight();
        }

        scan.close();
        
    }
    
}
