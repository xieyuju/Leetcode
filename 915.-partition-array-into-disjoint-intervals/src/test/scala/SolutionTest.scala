import org.scalatest.FunSuite

class SolutionTest extends FunSuite {
	test("Solution.partitionDisjoint") {
		assert(Solution.partitionDisjoint(Array(5, 0, 3, 8, 6)) === 3);
	}
}