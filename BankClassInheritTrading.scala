package org.inceptez.bankapp

class BankClassInheritOther extends ForexTrait with TradeTrait {
  def exchangeValue(currency:String):Int=
    currency  match {
    case "USD" => 70
    case "UKP" => 100
    case "AUD" => 55
    case "SGD" => 54
    case _     => 0
    }
}

//single inheritance, abstraction, implementation of un implemented methods.
class BankClassSingleInheritCompliant extends BankClassAbsOther(10000) {
  def CardLost(cnumber:Long):Boolean={
    true;
  };
  override val RewardPoints=10;
}