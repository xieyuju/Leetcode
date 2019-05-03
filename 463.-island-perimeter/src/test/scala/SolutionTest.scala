import org.scalatest.FunSuite

class SolutionTest extends FunSuite {
	test("Solution.islandPerimeter") {
		var map = Array(Array(0,1,0,0),
										Array(1,1,1,0),
										Array(0,1,0,0),
										Array(1,1,0,0))
		assert( Solution.islandPerimeter(map) === 16 )
	}
}