object Solution {
  def mincostTickets(days: Array[Int], costs: Array[Int]): Int = {
  	
  	val flag = new Array[Boolean](days.last+1)
  	val money = new Array[Int](days.last+1)
  	var i=0
  	for( i <- 0 to days.length-1 ){
  		flag(days(i)) = true
  	}

  	for( i <- 1 to days.last ) {
  		if( flag(i) ) {
  			money(i) = Math.min(Math.min(money(i-1)+costs(0), money(Math.max(0, i-7))+costs(1)), money(Math.max(0, i-30))+costs(2))
  		}else money(i) = money(i-1)
  		// println("the "+ i +"th day money should be: " + money(i))
  	}

  	money.last
  }
}