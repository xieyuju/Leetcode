class MinStack() {
	var stack = List[Int]()

	def push(x: Int): Int = {
		stack ::= x
		stack.head
	}

	def pop(): Int = {
		var head = stack.head
		stack = stack.tail
		head
	}

	def top(): Int = stack.head

	def getMin(): Int = {
		stack.reduce(Math.min(_, _))
	}
}