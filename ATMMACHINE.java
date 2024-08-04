import java.util.*;
class ATM{
    float balance=5000;
    int pin=12345;
    public void checkpin(){
        System.out.print("Enter your pin:");
        Scanner sc= new Scanner (System.in);
        int enteredpin=sc.nextInt();
        if(enteredpin==pin){
            menu();
        }
        else{
            System.out.println("You Entered A Wrong pin \nPlease Enter Write Pin Again");
            checkpin();
        }
    }
  public void menu(){
     System.out.println("Enter your choice:");
     System.out.println("1.Check A/C Balance");
     System.out.println("2.Withdraw Money");
     System.out.println("3.Deposite Money");
     System.out.println("4.Exit");
   Scanner sc=new Scanner(System.in);
   System.out.print("choose option you want:");
   int opt=sc.nextInt();
   if(opt==1){
    checkBalance();
   }
   else if(opt==2){
    withdrawMoney();
   }
   else if(opt==3){
    depositMoney();
   }
   else if(opt==4){
    return;
   }
   else{
    System.out.println("Choose valid option");
    menu();
   }
  } 
  public void checkBalance(){
  System.out.println("Balance in your account is:"+balance);
  menu();
  }
   public void withdrawMoney(){
    System.out.print("Enter Amount to withdraw:");
    Scanner sc=new Scanner(System.in);
    float amount=sc.nextFloat();
    if(amount>balance){
        System.out.println("you don't have sufficient balance to withdraw");
        System.out.println("you have only:"+balance+"Rs in your account");
    }
    else{
        balance=balance-amount;
        System.out.println("Amount: -"+amount+" Withdrawn Successfully");
    }
    menu();
   }
   public void depositMoney(){
    System.out.print("Enter amount to deposit:");
    Scanner sc=new Scanner(System.in);
    float Amount=sc.nextFloat();
    balance=balance+Amount;
    System.out.println("Amount: +"+Amount+" Deposited Successfully");
    menu();
   }
   
}
public class ATMMACHINE{
    public static void main(String[] args) {
      ATM obj=new ATM();
      obj.checkpin();  
    }
}




