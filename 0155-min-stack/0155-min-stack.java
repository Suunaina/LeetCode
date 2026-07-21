class Pair {
    int value;
    int min;

    Pair(int value, int min) {
        this.value = value;
        this.min = min;
    }
}

class MinStack {

    Stack<Pair> stack;

    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int value) {
        if (stack.isEmpty()) {
            stack.push(new Pair(value, value));
        } 
        
        else {
            int currentMin = Math.min(stack.peek().min, value);
            stack.push(new Pair(value, currentMin));
        }
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek().value;
    }

    public int getMin() {
        return stack.peek().min;
    }
}