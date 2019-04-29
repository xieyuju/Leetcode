object Solution {
    def partitionDisjoint(A: Array[Int]): Int = {
        def maxValue( index: Int, biggest: Int ): Int = 
        	if(A(index)>biggest) A(index) else biggest 
        
        def minValue( index: Int ): Int = {
        		var newSmallest: Int = A(index+1)
            for( i <- index+1 until A.length ) {
                if( A(i) < newSmallest ) newSmallest = A(i)
            }
            return newSmallest
        }
        
        def findIndex( index: Int, biggest: Int ): Int = {
            if( index == A.length-1 ) return index;
            else {
                if( maxValue( index, biggest ) > minValue( index ) ) findIndex(index+1, maxValue( index, biggest ))
                else return index+1
            }
        }
        
        findIndex( 0, A(0) )
    }
}