object Solution {
  def islandPerimeter(grid: Array[Array[Int]]): Int = {
  	val row = grid.length;
  	val col = grid(0).length;
  	var i = 0;
  	var j = 0;
  	var perimeter = 0;
  	def count(r: Int, c: Int) = {
  		var acc = 0;
  		if( r-1<0 || grid(r-1)(c) == 0 ) acc += 1;
  		if( c-1<0 || grid(r)(c-1) == 0 ) acc += 1;
  		if( c+1 == col || grid(r)(c+1) == 0 ) acc += 1;
  		if( r+1 == row || grid(r+1)(c) == 0 ) acc += 1;
  		acc
  	}

  	for( i <- 0 to row-1 ){
  		for( j <- 0 to col-1 ){
  			if( grid(i)(j) == 1 ) {
  				perimeter += count(i , j)
  				// println(i + " " + j + " :" + count(i, j));
  			}
  		}
  	}
  	perimeter;
  }
}