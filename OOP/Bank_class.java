package OOP;

public class Bank_class {
   String account_name;
   int account_number;
   double balance;

   public void setAccountInfo(String account_name, int account_number, double balance){
      this.account_name = account_name;
      this.account_number = account_number;
      this.balance = balance;
   }

   public String getAccountinfo(){
      return "Account Name: " + account_name + "\nAccount Number: " + account_number + "\nBalance: " + balance;
   }

   public void deposit(double amount){
      this.balance += amount;
   }

   public void withdraw(double amount){
      this.balance -= amount;
   }

   public double getBalance(){
      return this.balance;
   }

   public static void main(String[] args){

      Bank_class bank = new Bank_class();
      bank.setAccountInfo("John Doe", 12345, 10000);
      System.out.println(bank.getAccountinfo());
      System.out.println(bank.getBalance());


      bank.deposit(5000);
      System.out.println(bank.getBalance());
   }
}
