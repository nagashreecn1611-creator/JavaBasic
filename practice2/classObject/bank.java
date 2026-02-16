package classObject;
import java.util.Scanner;

class bankAccount{
  int accountNumber;
  double balance;
 
  public void deposite(double amount){
    balance = balance + amount;
    System.out.println("Amount deposited : " + amount);
  }
  public void withdraw(double amount){
    if(amount < balance){
      balance=balance-amount;
      System.out.println("withdraw Amount : " +amount);
    }
    else {
      System.out.println("insufficient balance!");
    }
  }
  public void balanceamount(){
    System.out.println("Balanced Amount : "+balance);
  }
}

public class bank {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    bankAccount ba = new bankAccount();

    System.out.print("Enter the Account Number : ");
    ba.accountNumber = sc.nextInt();

    System.out.print("Enter the balance : ");
    ba.balance = sc.nextDouble();

    System.out.print("Enter the deposite Amount : ");
    double depositedamount = sc.nextDouble();
    ba.deposite(depositedamount);

    System.out.print("Enter the withdraw Amount : ");
    double withdrawamount = sc.nextDouble();
    ba.withdraw(withdrawamount);
    
    ba.balanceamount();
  }
}
