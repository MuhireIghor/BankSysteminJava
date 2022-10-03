import java.util.Scanner;
 class UserAgent{
    String name;
    String accId;
    double amount =0;
    int moneyOut;

    void register(String userInfo){
        accId = userInfo;
        Scanner objId = new Scanner(System.in);
        System.out.println("Enter your name");
        name = objId.nextLine();
        System.out.println("User "+name+" with account number " +accId+" has been successfully registered");
    }

    void storeMoney(){
        Scanner cap = new Scanner(System.in);
        System.out.println("Enter the amount of money to deposit : ");

        double newAmount = cap.nextDouble();
        amount += newAmount;
        System.out.println("You have successfully deposited an amount of "+newAmount +" Your new balance is "+amount);
    }
    void withDrawing(){
        Scanner removal = new Scanner(System.in);
        System.out.println("Enter the amount of money to withdraw : ");
        moneyOut = removal.nextInt();
        if(moneyOut>amount){
            System.out.println("The amount of money you have entered is more than your net balance please verify your account first!");
        }else{
            amount-=moneyOut;
            System.out.println("You have successfully with drawn an mount of "+moneyOut+" Your new balance is "+amount);

        }
    }
}
public class BankSystem{
     public static void main(String args[]) throws  Exception{
         UserAgent u1 = new UserAgent();
         u1.register("f9490e1170d24f4591c8811d");
         u1.storeMoney();
         u1.withDrawing();
     }
}