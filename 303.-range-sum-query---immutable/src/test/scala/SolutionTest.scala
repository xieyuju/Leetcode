import org.scalatest.FunSuite

class SolutionTest extends FunSuite {
	test("NumArray.sumRange") {
		var obj = new NumArray(Array(-2, 0, 3, -5, 2, -1))
		assert(obj.sumRange(0,2) === 1);
		assert(obj.sumRange(2,5) === -1);
		assert(obj.sumRange(0,5) === -3);
	}
}