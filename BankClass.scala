package org.inceptez.bankapp

class BankClass (actype:String,queueid:Int) { //primary constructor
  
  //Auxilary Constructor
  def this(actype:String)
  {
       this(actype,2);
  }
  
  def this()
  {
       this("NA",3);
  }
  
  val queueassigned=queueid;
  
  private val closureSBAmount=50000;
  private val closureCUAmount=100000;
  
  def custwithdrawamt(custid:Int,amt:Long):Long=
  actype match{
    case "SB" => { if ( closureSBAmount > amt) amt else closureSBAmount }
    case "CU" => { if ( closureCUAmount > amt) amt else closureCUAmount }                     
  }
  
  
  def custPromo(applypromo:Boolean):Int= {if (applypromo) 10 else 0} 
  
}
