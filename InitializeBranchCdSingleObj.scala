package org.inceptez.bankapp

object InitializeBranchCdSingleObj {
  val queueLength=Map(1->4,2->3,3->2)
  val ivrOption:Map[Int,String]=Map(1-> "Banking", 2 -> "Trading" , 3 ->"Others" )
}

class InitializeBranchCdSingleObj1 {
   val queueLength=Map(1->4,2->5,3->6)
  val ivrOption:Map[Int,String]=Map(1-> "Banking", 2 -> "Trading" , 3 ->"Others" )
}