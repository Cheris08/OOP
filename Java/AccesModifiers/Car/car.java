public class car {
    
   int modelYear;
   String ModelName;
   int prize;
   
 //Constructor Method 
   public car(int year, String name,int initialPrize){
   
       modelYear = year;
       ModelName = name;   
       prize = initialPrize;
   }
   
   public int prizeIncrement(int increment){
   
   prize = prize + increment;
        return prize;
   
   }

    public static void main(String[] args) {
car myCar = new car(1969,  "Mustang", 2000);
System.out.println(myCar.ModelName + " " + myCar.modelYear + " " + myCar.prize);
myCar.prizeIncrement(500);
System.out.println(myCar.ModelName + " " + myCar.modelYear + " " + myCar.prize);
myCar.prizeIncrement(800);
System.out.println(myCar.ModelName + " " + myCar.modelYear + " " + myCar.prize);
myCar.prizeIncrement(300);
System.out.println(myCar.ModelName + " " + myCar.modelYear + " " + myCar.prize);
    }
    
}