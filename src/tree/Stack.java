public class Stack {
    private int[] arr;
    private int top;
    private int capacity;

    public Stack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int value) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow! Cannot push element.");
            return;
        }
        arr[++top] = value;
        System.out.println("Pushed " + value + " to the stack.");
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow! Cannot pop element.");
            return -1;
        }
        int poppedValue = arr[top--];
        System.out.println("Popped " + poppedValue + " from the stack.");
        return poppedValue;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(1);
        stack.pop();
        stack.push(2);
        stack.push(3);
        stack.pop();
        stack.push(4);
        stack.pop();
        stack.pop();
        stack.push(5);
    }
}
