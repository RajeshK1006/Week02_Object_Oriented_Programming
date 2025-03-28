import java.util.*;

class Q1{

  public static void main(String[] args){
    
    BankAccount obj1 = new BankAccount("rajesh",12345,10000);
    BankAccount obj2 = new BankAccount("sanjay",2342,90909);
    BankAccount.getTotalAccounts();
    
    obj1.display();
    
    obj2.display();
    
  }  
}

class BankAccount{
  private static String BankName = "Indian Bank";
  private static int total_acc = 0;
  
  private String name;
  private final int acc_no;
  private double balance;
  
  
  public BankAccount(String name, int acc_no, double balance){
    this.name  = name;
    this.acc_no = acc_no;
    this.balance = balance;
    total_acc++;
  }
  
  
  static void getTotalAccounts(){
    System.out.println("The total number of accounts created so far is : "+total_acc);
  }
  
  
  void display(){
    if(this instanceof BankAccount){
      System.out.println("The account holder name is : "+this.name);
      System.out.println("The account number is : "+this.acc_no);
      System.out.println("The account balance is : "+this.balance);
    }
    else{
      System.out.println("Invalid object or instance");
    }
  }
  
  
  
}