package org.inceptez.bankapp

class bankclassobjcompanion {
  ///  Companion Object, Encapsulation
   
  private val BankAmountBalance=15000000; //encapsulation
  
      private def calculatebalance(withdraw:Long):Long=  // encapsulation
      {
        
        return BankAmountBalance-withdraw
      }
      
      def calculateinterest(withdraw:Long):(Double,Boolean)=
      {
        if (withdraw+(withdraw*.02)<BankAmountBalance)
        return (withdraw+(withdraw*.02),true)
        else 
        return (withdraw+(withdraw*.02),false)
      }
}

//Companion object has same name of the class, which can access private variable
object bankclassobjcompanion
    {      
def main(args:Array[String]){
  val objbankclassobj=new bankclassobjcompanion;     
      println(objbankclassobj.BankAmountBalance);
        val acctTypeAmt= Map(15221100 -> ("CU",2000000),15221101 -> ("SB",52000),16331311 -> ("CU",25000),
        15221102 -> ("SB",20000),17221103 -> ("CC",500000));

      println("Balance in Bank after withdrawal (Only for Teller purpose) " );
      val custacctamt=acctTypeAmt.values.toArray;
      val custamt=custacctamt.map(x=>x._2)
      var totalbankamt:Long=objbankclassobj.BankAmountBalance;
      println("I am a private method calculatebalance, only code inline or my companion can access me");
      for (i <- custamt.indices)    
      {
        println(" Account balance in the bank after customer withdraw " + custamt(i) + " is " + 
            objbankclassobj.calculatebalance(custamt(i)));
        totalbankamt -= custamt(i);
      //println(" Total balance in Bank ")
      }
       println(" Total balance in Bank " + totalbankamt)
    }
}














