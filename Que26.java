class Queue {
    private int[] queueArray;
    private int front, rear, maxSize;

    public Queue(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = rear = -1;
    }

    public void enqueue(int value) {
        if (rear == maxSize - 1) {
            System.out.println("Queue overflow");
        } else {
            queueArray[++rear] = value;
        }
    }

    public int dequeue() {
        if (front == rear) {
            System.out.println("Queue underflow");
            return -1;
        } else {
            return queueArray[++front];
        }
    }

    public void display() {
        if (front == rear) {
            System.out.println("Queue is empty");
        } else {
            for (int i = front + 1; i <= rear; i++) {
                System.out.print(queueArray[i] + " ");
            }
            System.out.println();
        }
    }
}

public class Que26 {
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.display();
        System.out.println("Dequeued: " + queue.dequeue());
        queue.display();
    }
}