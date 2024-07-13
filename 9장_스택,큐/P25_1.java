class MyCircularQueue {
    int[] queue;
    int front = 0;
    int rear = -1;
    int len = 0;

    public MyCircularQueue(int k) {
        queue = new int[k];
    }

    public boolean enQueue(int value) {
        if (!isFull()) {
            this.rear = (this.rear + 1) % this.queue.length;
            queue[rear] = value;
            len++;
            return true;
        }
        return false;
    }

    public boolean deQueue() {
        if (!isEmpty()) {
            this.front = (this.front + 1) % this.queue.length;
            this.len--;
            return true;
        }
        return false;
    }

    public int Front() {
        return this.isEmpty() ? -1 : queue[front];
    }

    public int Rear() {
        return this.isEmpty() ? -1 : queue[rear];
    }

    public boolean isEmpty() {
        return this.len == 0;
    }

    public boolean isFull() {
        return this.queue.length == this.len;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */