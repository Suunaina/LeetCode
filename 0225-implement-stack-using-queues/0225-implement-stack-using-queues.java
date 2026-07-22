import java.util.*;

class MyStack {

    Queue<Integer> q;

    public MyStack() {
        q = new LinkedList<>();
    }

    public void push(int x) {

        q.offer(x);// Insert the new element at the rear of the queue

        //Rotate all the previous elements behind the new element. This brings the newly added element to the front 
        for (int i = 0; i < q.size() - 1; i++) { 
            q.offer(q.poll());//offer-add to read of q , poll-remove front of queue
        }
    }

    // Removes the element on top of the stack
    public int pop() {
        return q.poll();
    }

    // Get the top element
    public int top() {
        return q.peek();
    }

    // Returns whether the stack is empty
    public boolean empty() {
        return q.isEmpty();
    }
}