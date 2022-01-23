package org.inceptez.bankapp
// Scala basics (important)
// collections (important)
// functions/methods (important)
/* OOPS
 * SPARK DEPENDENT which must be known for Spark Develpment 
 * PACKAGE - important
 * CLASS - important
 * SCALA OBJECT - singleton obj/class, (important) 
 * main or custom METHODs/FUNCTIONs (important)
 * OBJECT with new keyword which will instantiate the class, (important) 
 * CASE CLASS (important)
 * HIGHER ORDER METHOD/FUNC (important)
 * CLOSURE (important)
 * CONSTRUCTOR (primary/auxilary)
 * 
 * OOPS Concepts made simple with Scala program implementation:
 * 
 * All these are Classes -> 
 * Class, singleton object (instantiated class),case class, 
 * abstract class, traits
 * 
 * Polymorphism - Polymorphism means that a function type comes 
 * "in many forms". 
 * the type can have instances of many types.
 * Example - Method with different type of arguments
 * 
 * Overloading - Scala Method overloading is when one class has more than one method with the 
 * same name but different signature. 
 * This means that they may differ in the number of parameters, data types, or both. 
 * Example : Method with different number of arguments
 * 
 * Abstraction - Abstraction is the process to hide the internal details 
 * and showing only the functionality. 
 * abstraction is achieved by using an abstract class.
 * Example : Abstract class and Traits
 * 
 * Inheritance -
 * Inheritance is the process of inheriting the feature of the parent class
 * Multiple Inheritance: In Multiple inheritance ,one class can have more than one superclass and inherit features from all parent classes.
 * Scala does not support multiple inheritance with classes, but it can be achieved by traits. 
 * Example - Abstract Class and Traits
 * 
 * Overriding - Scala overriding method provides your own implementation of it. When a class inherits 
 * from another, it may want to modify the definition for a method of the superclass or 
 * provide a new version of it. 
 * This is the concept of Scala method overriding and we use the 'override' modifier to implement this. 
 * Example : Method or vals override with different implementations
 * 
 * Encapsulation - Specify access specified/modifier for providing access control to the objects or 
 * values 
 * Example : private var a=100;
 *  
 *  Companion Object - It is again a singleton object called as companion if we 
 *  create the object in the same name of the instantiating class
 *  using companion object we can able to access the encapsulated members of the class.
*/

  /*
  Class - 
 		A class is a user defined blueprint or prototype from which objects are created.  
 		It represents the set of properties or methods  
  * */
//Primary Constructor
/*
  Singleton object is an object which is declared by using object keyword instead by class. 
  No object is required to call methods declared inside singleton object. 
  So scala creates a singleton object to provide entry point for your program execution with the main method 
  with out instantiating it again and again. 
  It can't take arguments like class * */
  
/*object singletonbankobj{  
     val branchtellers=Map("B100"-> 20, "B101" -> 25 , "B102" ->10, "B103" -> 15 ) 
       }*/
import org.inceptez.bankapp._;
object BankMainObj 
{
  //case class custrecord(id:Int,name:String,amt:Long);
  def main(args:Array[String])
  {
    try { //exception handling
    //encapsulation - accessing private member (BankAmountBalance) through public member (calculateinterest)
    val obj1=new bankclassobjcompanion; // object, pkg, class, instance of class
    val result=obj1.calculateinterest(15000010);
    println("you can withdraw with interest the amt of  "+ result._1 + " can be dispatched ? " + result._2)
   
   
    println("""Enter the Option code you want to choose \n 1 for Banking or \n 
             2 for Trading or \n 
             3 for Others \n""" );
    var inputCustOpt:Byte=scala.io.StdIn.readByte()

    println("""Following Singleton Object InitializeBranchCdSingleObj is not required to instantiate, 
               hence directly calling the ivrOption value directly""" );
  
    val optionChosen=InitializeBranchCdSingleObj.ivrOption(inputCustOpt); 
    //singleton object members can be invoked directly without instantiation

    //or
    
    println("""Following class InitializeBranchCdSingleObj is required to instantiate, 
               hence instantiating by creating a constructor using new keyword then calling ivrOption""" );
    //class members can be accessed through instantiation by creating objects seperately
     val opt=new InitializeBranchCdSingleObj1;
  val optionChosen1=opt.ivrOption(inputCustOpt);
  
  println("Option chosen by the customer is " + optionChosen);
  println("Option chosen by the customer is " + optionChosen1);
  
 //conditional structure
  if(optionChosen=="Banking")
  {
    println("Hello Customer, please Enter the customer Number" );
    var inputCustAcct=scala.io.StdIn.readInt();
    val acctTypeAmt= Map(15221100 -> ("CU",2000000),15221101 -> ("SB",52000),16331311 -> ("CU",25000),
        15221102 -> ("SB",9000),17221103 -> ("CC",500000));
  // collection types of map and tuple
  //val bankclassobjinstance3= new BankClass;
  //println("Customer assigned to a queue of " + bankclassobjinstance3.queueassigned + " with the queue length of " + InitializeBranchCdSingleObj.queueLength(bankclassobjinstance3.queueassigned))

    // Access the collection types of map and tuple  
  println("Identifying the Account type and Balance passing acct number to Map type")
  val custAcctType=acctTypeAmt(inputCustAcct)._1;
  val custAmountBalance=acctTypeAmt(inputCustAcct)._2;
  
  println(custAcctType)
  println(custAmountBalance)
  
  if (custAcctType == "SB")
    {
println("Instantiating BankClass Class - Primary Constructor with all args");
// primary and auxilary constructors
  val bankclassobjinstance1= new BankClass("SB",1);
  println("Customer assigned to a queue of " + bankclassobjinstance1.queueassigned + " with the queue length of " + InitializeBranchCdSingleObj.queueLength(bankclassobjinstance1.queueassigned))
      println("Calling the custwithdrawamt method for SB Account for the consumer Id " +inputCustAcct + " for acct type " + custAcctType)
  	  println("You can withdraw upto " + bankclassobjinstance1.custwithdrawamt(inputCustAcct,custAmountBalance) + " out of " + custAmountBalance);
  	  println(" We are offering promo if you make 3 transactions this month , u will get promo points of " + bankclassobjinstance1.custPromo(true))
    }
    else if (custAcctType == "CU")
    {
      //Auxilary constructor will be initialized
      println("Instantiating BankClass Class - Auxilary Constructor with one arg and no arg ");
      val bankclassobjinstance2= new BankClass("CU");
      println("Customer assigned to a queue of " + bankclassobjinstance2.queueassigned + " with the queue length of " + InitializeBranchCdSingleObj.queueLength(bankclassobjinstance2.queueassigned))
  	  println("Calling the custwithdrawamt method for Current Account for the consumer Id " +inputCustAcct + " acct type " + custAcctType)
  	  println("You can withdraw upto " + bankclassobjinstance2.custwithdrawamt(inputCustAcct,custAmountBalance) + " out of " + custAmountBalance);
  
    }

  }
  else if(optionChosen=="Trading")
  {
	  println("Instantiating the Class BankClassInheritOther extended with Traits (ForexTrait, TradeTrait) Multiple Inheritance");
// Inheritance (multiple inheritance and abstraction with un implemented methods)
	  val bankInheritTraitOtherObj=new BankClassInheritOther;
	  println(" Do you want to perform Forex or Trade activity, \n Choose 1 for Forex \n Choose 2 for Trade \n" );
	  var inputOtherCustOpt:Byte=scala.io.StdIn.readByte()

			  if(inputOtherCustOpt==1)
			  {
				  println(" Enter the currency type USD/UKP/AUD/SGD to convert to INR \n")
				  println(" Exchange value in INR is " + bankInheritTraitOtherObj.exchangeValue(scala.io.StdIn.readLine().toUpperCase()))
			  }
			  else 
			  {
				  println(" Enter the Stock exchange company type RETAIL/PHARMA/BANK that you want to know the Blue chips we deal \n")
				  bankInheritTraitOtherObj.stockExchange(scala.io.StdIn.readLine().toUpperCase()).foreach(println);
			  }
  }
  else if(optionChosen=="Others")
  {
    // 
	  println("Hello Customer, please Enter the customer Number " );
	  var inputCustAcct=scala.io.StdIn.readInt();
	  val acctTypeAmt= Map(15221100 -> ("CU",2000000),15221101 -> ("SB",52000),16331311 -> ("CU",25000),
			                   15221102 -> ("SB",9000),17221103 -> ("CC",500000));
	  val custAmountBalance=acctTypeAmt(inputCustAcct)._2;
	  println(" Instantiating the Class BankClassSingleInheritCompliant extended with Abstract class BankClassAbsCompliant ");

	  val bankInheritAbstractCompliantObj=new BankClassSingleInheritCompliant;
	  println(" Let us know your query, we will help \n Choose 1 for card lost \n Choose 2 for OD \n Choose 3 to talk to CC Executive \n" );
	  
	  var inputOtherCustOpt:Byte=scala.io.StdIn.readByte()
		val custAmountBalance1=acctTypeAmt(inputCustAcct)._2;
	  if (inputOtherCustOpt==1)
	  {
	    println(" Enter the reason for losing the card for logging purpose")
	    var inputReason:String=scala.io.StdIn.readLine()
		    // abstraction, overloading
	       if(!inputReason.isEmpty())
	         println(" Your card is deactivated with reason of " + inputReason + " and the status of " + bankInheritAbstractCompliantObj.CardLost(inputOtherCustOpt,inputReason))
	       else
	         println(" Your card is deactivated with unknown reason and the status of " + bankInheritAbstractCompliantObj.CardLost(inputOtherCustOpt));
	  }
	  else if (inputOtherCustOpt==2)
	  {
		  println(" OD Facility for your account available upto the amount " + bankInheritAbstractCompliantObj.OverDraft(inputOtherCustOpt, custAmountBalance1));  
	    println(" If you avail OD you will get reward points  " + bankInheritAbstractCompliantObj.RewardPoints);
	  }
	  else

		  println("Connecting you to the Customer Care Executive, Please Wait ....")  

  }
   }
  
   catch
    {
        case a:java.lang.NumberFormatException => 
        {
            println("Dear Customer please choose the right Number option, Thank you for calling ")
        }
        case b:java.lang.Exception => 
        {
            println("Some other error occured in our system, pls try back later" )
        }
    }
  }  
}
