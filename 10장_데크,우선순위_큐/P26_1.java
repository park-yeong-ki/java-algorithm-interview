class MyCircularDeque {
    int len, k;
    DoublyLinkedList head, tail;

    public MyCircularDeque(int k) {
        this.head = new DoublyLinkedList(0);
        this.tail = new DoublyLinkedList(0);
        head.next = tail;
        tail.prev = head;

        this.len = 0;
        this.k = k;
    }

    public boolean insertFront(int value) {
        if (isFull())
            return false;

        DoublyLinkedList node = new DoublyLinkedList(value);
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;

        len++;
        return true;
    }

    public boolean insertLast(int value) {
        if (isFull())
            return false;

        DoublyLinkedList node = new DoublyLinkedList(value);
        node.next = tail;
        node.prev = tail.prev;
        tail.prev.next = node;
        tail.prev = node;

        len++;
        return true;
    }

    public boolean deleteFront() {
        if (isEmpty())
            return false;

        head.next.next.prev = head;
        head.next = head.next.next;

        len--;
        return true;
    }

    public boolean deleteLast() {
        if (isEmpty())
            return false;

        tail.prev.prev.next = tail;
        tail.prev = tail.prev.prev;

        len--;
        return true;
    }

    public int getFront() {
        return isEmpty() ? -1 : head.next.val;
    }

    public int getRear() {
        return isEmpty() ? -1 : tail.prev.val;
    }

    public boolean isEmpty() {
        return len == 0;
    }

    public boolean isFull() {
        return len == k;
    }

    static class DoublyLinkedList {
        DoublyLinkedList prev, next;
        int val;

        DoublyLinkedList(int val) {
            this.val = val;
        }
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */