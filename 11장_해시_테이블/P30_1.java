class MyHashMap {
    static class Node{
        int key, val;
        Node next;

        Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    final Node[] nodes = new Node[100000];

    public MyHashMap() {

    }

    public void put(int key, int value) {
        int idx = key % nodes.length;
        Node node = nodes[idx];

        if (node == null) {
            nodes[idx] = new Node(key, value);
            return;
        }

        while (node != null) {
            if (node.key == key) {
                node.val = value;
                return;
            }

            if (node.next == null) {
                node.next = new Node(key, value);
                return;
            }

            node = node.next;
        }
    }

    public int get(int key) {
        int idx = key % nodes.length;
        Node node = nodes[idx];

        while (node != null) {
            if (node.key == key) {
                return node.val;
            }
            node = node.next;
        }

        return -1;
    }

    public void remove(int key) {
        int idx = key % nodes.length;
        Node node = nodes[idx];

        if (node == null) {
            return;
        }

        if (node.key == key) {
            nodes[idx] = node.next;
            return;
        }

        Node prev = node;
        node = node.next;
        while (node != null) {
            if (node.key == key) {
                prev.next = node.next;
                return;
            }
            prev = node;
            node = node.next;
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */