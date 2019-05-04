object Solution {
    def numMovesStones(a: Int, b: Int, c: Int): Array[Int] = {
        var large = Math.max(a, b)
        var small = Math.min(a, b)
        var mid = 0
        var minMove = 0;
        var maxMove = 0;
        if(large<c) {
            mid = large
            large = c
        }else if(c>small) {
            mid = c
        }else{
            mid = small
            small = c
        } 
        
        if(large - small == 2) return Array(0, 0)
        if(large - mid < 3 || mid - small < 3) minMove = 1
        else minMove = 2
        
        maxMove = large - small - 2
        
        Array(minMove, maxMove)
    }
}