class plane{
     void fly(){
         System.out.println("plane is flying");
     }
     void takeOff(){
         System.out.println("plane is ready to takeoff");
     }
}
class CargoPlane extends plane{
    void fly(){
        System.out.println("Cargoplane is flying");
   }
    void takeOff(){
        System.out.println("Cargoplane is ready to takeoff");
   }
}
class passangerPlane extends plane{
    void fly(){
        System.out.println("passangerplane is flying");
   }
    void takeOff(){
        System.out.println("passangerplane is ready to takeoff");
   }
}
class Main {
    public static void main(String[] args) {
        //give parent as reference type for both
        plane cp = new CargoPlane();
        plane pp = new passangerPlane();
        cp.takeOff();
        cp.fly();
        pp.takeOff();
        pp.fly();
        
    }
}
/* 
class  BankAccount{
     static double savings_rate = 6.5;
     static double salary_account_rate = 2.4;
     static double fixed_account_rate = 4;
      void calculateInterest(int balance){
         System.out.println("Total Balance:"+balance);
      }
}
class SavingsAccount extends BankAccount{
     void calculateInterest(int balance){
         System.out.println("Savings Account Interest:"+balance*savings_rate);
      }    
}
class SalaryAccount extends BankAccount{
     void calculateInterest(int balance){
         System.out.println("Salary Account Interest:"+balance*salary_account_rate);
      }    
}
class FixedDepositAccount extends BankAccount{
     void calculateInterest(int balance){
         System.out.println("Fixed Deposit Account Interest:"+balance*fixed_account_rate);
      }    
}
class Main {
    public static void main(String[] args) {
       SavingsAccount s = new SavingsAccount();
       SalaryAccount sa = new SalaryAccount();
       FixedDepositAccount fd = new FixedDepositAccount();
        
      //parent class reference 
       BankAccount b; 
       b = s;
       b.calculateInterest(100000);
       b = sa;
       b.calculateInterest(100000);
       b = fd;
       b.calculateInterest(100000);
        
    }
}
    */