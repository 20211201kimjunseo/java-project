package sec04.exam01;

public class Car {
   int gas;
   int minGas; //한바퀴 돌 떄 필요한 gas
   String teamName;
   String color;
   
   Car(int gas, int minGas,
         String teamName, String color) {
      this.gas = gas;
      this. minGas = minGas;
      this.teamName = teamName;
      this.color = color;
     
      
   }
   
   boolean IsLeftGas() {
      if(gas<minGas) {
         System.out.println("need fuel")
         return false;
      }
      
      System.out.println("can run one more");
      return true;
   }
      
   void AddGas( int gas) {
      System.out.println("full tank");
      this.gas = gas;
     }
   void RunOneRound()
   {
      System.out.println("one round done");
      this.gas  -= minGas;
   }
   
   double Plus(double a, int b) {
      return a+b ;
   } 
   
   double Plus(double a, int b) {
	      return a+b ;
	   } 
 
      //int plus(int a, int b) {
      //   return a+b ;
  // }
   hyundai.Plus(1,2;)
   hyundai.Plus(1.0,2;)
   hyundai.Plus(1,2;
   hyundai.Plus(1,2;
   }
   

