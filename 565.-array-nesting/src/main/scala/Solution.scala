import scala.collection.mutable.Set

object Solution {
  def arrayNesting(nums: Array[Int]): Int = {
  	// add visited number's index into elements set
  	val elements = Set[Int]();
  	// store the longest number
  	var longest: Int = 0;
  	// store current loop's length
  	var acc: Int = 0

  	// for loop to traverse the array but skipping the visited number
  	var i = 0
  	for( i <- 0 to nums.length-1 ) {
  		if(!elements(nums(i))) {
  			// if the number is not visited, store the value as index
  			// use a while loop to find a nesting array
  			var index = nums(i)
  			while(!elements(nums(index))){
  				elements += nums(index)
  				index = nums(index)
  				acc += 1
  			}	
  			if(longest < acc) longest = acc
  			acc = 0
  		}
  	}

  	longest
  }
}