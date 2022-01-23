package org.inceptez.bankapp

trait TradeTrait {
  def stockExchange(comptype:String):Array[String]=
  comptype match {
    case "RETAIL" => Array("ITC","RIL","HUL")
    case "PHARMA" => Array("CIPLA","SUN PHARMA","RANBAXY")
    case "BANK" => Array("ICICI","REPCO","SBI")
    case _ => Array("") 
    
  }
}