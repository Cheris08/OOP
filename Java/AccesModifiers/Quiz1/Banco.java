package banco;

public class Banco{
  private CheckingAccount accountOne;
  private CheckingAccount accountTwo;

  public Banco(){
    accountOne = new CheckingAccount("Zeus", 0, "1");
    accountTwo = new CheckingAccount("Hades", 0, "2");
  }

  public static void main(String[] args){
    Banco bankOfGods = new Banco();
    System.out.println(bankOfGods.accountOne.getBalance());
    
    System.out.println ("Primera Consignacion de la cuenta 1");
    
    bankOfGods.accountOne.setBalance(1000);
    System.out.println(bankOfGods.accountOne.getBalance());
    //System.out.println(bankOfGods.accountOne.getMonthlyInterest());
    
    System.out.println (" Consignación Cuenta 1");
    
    bankOfGods.accountOne.consignar(2000);
    System.out.println(bankOfGods.accountOne.getBalance());
    
    bankOfGods.accountOne.consignar(3000);
    System.out.println(bankOfGods.accountOne.getBalance());
    
    bankOfGods.accountOne.consignar(4000);
    System.out.println(bankOfGods.accountOne.getBalance());
    
    bankOfGods.accountOne.consignar(5000);
    System.out.println(bankOfGods.accountOne.getBalance());
    
    bankOfGods.accountOne.consignar(6000);
    System.out.println(bankOfGods.accountOne.getBalance());
    
    System.out.println (" Retiros Primera Cuenta");
    
    bankOfGods.accountOne.retirar(6000);
    System.out.println(bankOfGods.accountOne.getBalance());
    
    bankOfGods.accountOne.retirar(5000);
    System.out.println(bankOfGods.accountOne.getBalance());
    
    bankOfGods.accountOne.retirar(4000);
    System.out.println(bankOfGods.accountOne.getBalance());
    
    bankOfGods.accountOne.retirar(3000);
    System.out.println(bankOfGods.accountOne.getBalance());
    
    System.out.println (" Saldo Final despues de las Transacciones Realizadas ");
    
    bankOfGods.accountOne.retirar(2000);
    System.out.println(bankOfGods.accountOne.getBalance());
    
    
    System.out.println ("///////////////////////////////////////////////////////////////////");
    
    System.out.println ("Primera Consignacion de la cuenta 2");
    
    bankOfGods.accountTwo.setBalance(10000);
    System.out.println(bankOfGods.accountTwo.getBalance());
    
    System.out.println (" Consignaciones Cuenta 2");
    
    bankOfGods.accountTwo.consignar(20000);
    System.out.println(bankOfGods.accountTwo.getBalance());
    
    bankOfGods.accountTwo.consignar(30000);
    System.out.println(bankOfGods.accountTwo.getBalance());
    
    bankOfGods.accountTwo.consignar(40000);
    System.out.println(bankOfGods.accountTwo.getBalance());
    
    bankOfGods.accountTwo.consignar(50000);
    System.out.println(bankOfGods.accountTwo.getBalance());
    
    bankOfGods.accountTwo.consignar(60000);
    System.out.println(bankOfGods.accountTwo.getBalance());
   

    System.out.println (" Retiros Segunda Cuenta");
    
    bankOfGods.accountTwo.retirar(60000);
    System.out.println(bankOfGods.accountTwo.getBalance());
    
    bankOfGods.accountTwo.retirar(50000);
    System.out.println(bankOfGods.accountTwo.getBalance());
    
    bankOfGods.accountTwo.retirar(40000);
    System.out.println(bankOfGods.accountTwo.getBalance());
    
    bankOfGods.accountTwo.retirar(30000);
    System.out.println(bankOfGods.accountTwo.getBalance());
    
    System.out.println (" Saldo Final despues de las Transacciones Realizadas ");
    
    bankOfGods.accountTwo.retirar(20000);
    System.out.println(bankOfGods.accountTwo.getBalance());

    
  }
}