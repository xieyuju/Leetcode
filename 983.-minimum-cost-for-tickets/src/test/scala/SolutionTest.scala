import org.scalatest.FunSuite

class SolutionTest extends FunSuite {
	test("Solution.mincostTickets") {
		assert(Solution.mincostTickets(Array(1,4,6,7,8,20), Array(2,7,15)) === 11);
		assert(Solution.mincostTickets(Array(1,2,3,4,5,6,7,8,9,10,30,31), Array(2,7,15)) === 17)
		assert(Solution.mincostTickets(Array(1,2,3,4,5,6,7,8,9), Array(1, 10, 70)) === 9 )
	}
}