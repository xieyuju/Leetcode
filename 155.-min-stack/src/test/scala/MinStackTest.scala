import org.scalatest.FunSuite

class MinStackTest extends FunSuite {
	val minStack = new MinStack()
	minStack.push(-2)
	minStack.push(0)
	minStack.push(-3)

	test("MinStack.push"){
		assert(minStack.push(1) === 1)
	}

	test("Minstack.pop"){
		assert(minStack.pop() === 1)
	}

	test("Minstack.top"){
		assert(minStack.top() == -3)
	}

	test("Minstack.getMin"){
		assert(minStack.getMin() == -3)
	}
}