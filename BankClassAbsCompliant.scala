package org.inceptez.bankapp

abstract class BankClassAbsOther(arg:Int) {
  
  val RewardPoints=0;
  
  def CardLost(cnumber:Long):Boolean;
  
  def CardLost(cnumber:Long,reason:String):Boolean={
    return true;    
  }
  def OverDraft(cnumber:Long,amt:Long):Double={
    if(amt>arg)
    {
      println("Eligible for OD") 
      amt+(amt*.5);
    }
    else
    {
     println("Not eligible for OD") 
     amt
    }
  }
  
  
}