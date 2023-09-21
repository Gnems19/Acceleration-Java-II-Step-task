package subtasks;


// last problem solution 1 :
// time complexity: O(1)
// note: lower level of abstraction

public class MyHashSet {

    Bucket[] buckets;

    public MyHashSet(){
        int n_BUCKETS = 10000;
        buckets = new Bucket[n_BUCKETS];
    }

    public void add(int key){
        int index = Integer.hashCode(key) % buckets.length;
        if(buckets[index] == null){
            buckets[index] = new Bucket();
            buckets[index].add(key);
        }else{
            buckets[index].add(key);
        }
    }

    public void remove(int key){
        int index = Integer.hashCode(key) % buckets.length;
        if(buckets[index] != null){
            buckets[index].remove(key);
        }
    }

    public boolean contains(int key){
        int index = Integer.hashCode(key) % buckets.length;
        if(buckets[index] != null){
            return buckets[index].find(key) != null;
        }
        return false;
    }

    private class Bucket {
        Node head = null;
        public Bucket(){
            head = null;
        }
        public void add(int key){
            if(head == null){
                head = new Node(key);
                return;
            }
            Node currentNode = head;
            if(currentNode.key == key){
                return;
            }
            while(currentNode.next != null){
                if(currentNode.next.key == key){
                    return;
                }
                currentNode = currentNode.next;
            }
            currentNode.next = new Node(key);
        }
        public void remove(int key){
            if (head == null) return;
            Node currentNode = head;
            Node prevNode = null;
            if(currentNode.key == key){
                head = currentNode.next;
                return;
            }
            while(currentNode.next != null){
                prevNode = currentNode;
                currentNode = currentNode.next;
                if(currentNode.key == key){
                    prevNode.next = currentNode.next;
                    return;
                }
            }
        }
        public Node find(int key){
            Node currentNode = head;
            while(currentNode != null){
                if(currentNode.key == key){
                    return currentNode;
                }
                currentNode = currentNode.next;
            }
            return null;
        }
    }
    private class Node{
        private Integer key;
        private Node next;
        public Node(int key){this.key = key;}
    }
}
