import org.scalatest.FunSuite

class SolutionTest extends FunSuite {
	test("Solution.numMovesStones"){
		assert(Solution.numMovesStones(1,2,5).head === 1 &&
					 Solution.numMovesStones(1,2,5).last === 2 )
		assert(Solution.numMovesStones(4,3,2).head === 0 &&
					 Solution.numMovesStones(4,3,2).last === 0 )
		assert(Solution.numMovesStones(3,5,1).head === 1 &&
					 Solution.numMovesStones(3,5,1).last === 2 )

	}
}