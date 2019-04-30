import org.scalatest.FunSuite

class SolutionTest extends FunSuite {
	test("Solution.arrayNesting"){
		assert(Solution.arrayNesting(Array(5, 4, 0, 3, 1, 6, 2)) === 4)
	}
}