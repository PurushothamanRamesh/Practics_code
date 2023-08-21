package tree;
public class Queue {
    private Node front;
    private Node rear;

    private class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Queue() {
        front = null;
        rear = null;
    }

    public void enqueue(int value) {
        Node newNode = new Node(value);

        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        System.out.println("Enqueued " + value + " to the queue.");
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow! Cannot dequeue element.");
            return -1;
        }

        int dequeuedValue = front.data;
        front = front.next;

        if (front == null) {
            rear = null;
        }

        System.out.println("Dequeued " + dequeuedValue + " from the queue.");
        return dequeuedValue;
    }

    public boolean isEmpty() {
        return (front == null);
    }

    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue(1);
        queue.dequeue();
        queue.enqueue(2);
        queue.enqueue(3);
        queue.dequeue();
        queue.enqueue(4);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(5);
    }
}
