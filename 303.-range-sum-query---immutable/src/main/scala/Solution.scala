class NumArray(_nums: Array[Int]) {

  def sumRange(i: Int, j: Int): Int = {
  	var sum = 0
  	var a = 0
  	for( a <- i to j ){
  		sum = sum + _nums(a)
  	}
  	sum
  }

}

/**
 * Your NumArray object will be instantiated and called as such:
 * var obj = new NumArray(nums)
 * var param_1 = obj.sumRange(i,j)
 */