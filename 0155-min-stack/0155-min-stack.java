import java.util.Stack;

class MinStack {

    Stack<Integer> stack;
    Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {

        stack.push(val);

        // If minStack is empty or val is smaller than current minimum
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    public void pop() {

        // If the removed value is the minimum, remove it from minStack too
        if (stack.peek().equals(minStack.peek())) {
            minStack.pop();
        }

        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}