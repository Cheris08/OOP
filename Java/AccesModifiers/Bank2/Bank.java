package bank;

public class Bank{
  private CheckingAccount accountOne;
  private CheckingAccount accountTwo;

  public Bank(){
    accountOne = new CheckingAccount("Zeus", 100, "1");
    accountTwo = new CheckingAccount("Hades", 200, "2");
  }

  public static void main(String[] args){
    Bank bankOfGods = new Bank();
    System.out.println(bankOfGods.accountOne.getBalance());
    bankOfGods.accountOne.setBalance(5000);
    System.out.println(bankOfGods.accountOne.getBalance());
    System.out.println(bankOfGods.accountOne.getMonthlyInterest());
    System.out.println("Consignacion 1:   " + bankOfGods.accountOne.getconsig1());
    System.out.println("Retiro 1:   " + bankOfGods.accountOne.getreti1());
    System.out.println("Consignacion 2:   " + bankOfGods.accountOne.getconsig2());
    System.out.println("Retiro 2:   " + bankOfGods.accountOne.getreti2());
    System.out.println("Consignacion 3:   " + bankOfGods.accountOne.getconsig3());
    System.out.println("Retiro 3:   " + bankOfGods.accountOne.getreti3());
    
    System.out.println("Consignacion de la cuenta 2 . 1:   " + bankOfGods.accountTwo.getconsignacion1());
    System.out.println("Retiro de la cuenta 2  .  1:   " + bankOfGods.accountTwo.getretiro1());
    System.out.println("Consignacion de la cuenta 2 . 2:   " + bankOfGods.accountTwo.getconsignacion2());
    System.out.println("Retiro de la cuenta 2  .  2:   " + bankOfGods.accountTwo.getretiro2());
    System.out.println("Consignacion de la cuenta 2 . 3:   " + bankOfGods.accountTwo.getconsignacion3());
    System.out.println("Retiro de la cuenta 2  .  3:   " + bankOfGods.accountTwo.getretiro3());
  }
}