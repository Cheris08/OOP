package bank;

public class CheckingAccount{  //Cuenta1
  private String name;
  private int balance;
  private String id;
  private double interestRate;
  private int consig1;
  private int reti1;
  private int consig2;
  private int reti2;
  private int consig3;
  private int reti3;
  private int consignacion1;
  private int retiro1;
  private int consignacion2;
  private int retiro2;
  private int consignacion3;
  private int retiro3;

  public CheckingAccount(String inputName, int inputBalance, String inputId){
    this.name = inputName;
    this.balance = inputBalance;
    this.id = inputId;
    this.interestRate = 0.02;
  }

  public int getBalance(){
    return this.balance;
  }
  
  public void setBalance(int newBalance){
    this.balance = newBalance;
  }

  public double getMonthlyInterest(){
    return this.interestRate * this.balance;
  }
  
  public double getconsig1 (){
      consig1 = 2000;
      return this.consig1 = balance + consig1;
  }
  
  public double getreti1 (){
      int retiro1 = 500;
      return this.reti1 = consig1 - retiro1;
      
  }
  
  public double getconsig2 (){
      consig2 = 3000;
      return this.consig2 = balance + consig2;
  }
  
  public double getreti2 (){
      int retiro2 = 1000;
      return this.reti2 = consig2 - retiro2;
      
  }
  
  public double getconsig3 (){
      consig3 = 3000;
      return this.consig3 = balance + consig3;
  }
  
  public double getreti3 (){
      int retiro3 = 1500;
      return this.reti3 = consig3 - retiro3;
  }
  
   public double getconsignacion1 (){
      consignacion1 = 3000;
      return this.consignacion1 = balance + consignacion1;
  }
  
  public double getretiro1 (){
      int retiroo1 = 2000;
      return this.retiro1 = consignacion1 - retiroo1;
  }
  
  public double getconsignacion2 (){
      consignacion2 = 5000;
      return this.consignacion2 = balance + consignacion2;
  }
  
  public double getretiro2 (){
      int retiroo2 = 4000;
      return this.retiro2 = consignacion2 - retiroo2;
  }
  
  public double getconsignacion3 (){
      consignacion3 = 7000;
      return this.consignacion3 = balance + consignacion3;
  }
  
  public double getretiro3 (){
      int retiroo3 = 5000;
      return this.retiro3 = consignacion3 - retiroo3;
  }
  
  
  }



