package hash.hashmap;

public class HashMap<K, V> {

    private int defaultCapacity = 10;
    private float defaultLoadFactor = 0.75f;

    private int maxCapacity;
    private float loadFactor;

    private Node<K, V>[] table;
    private int size;


    public HashMap() {
        maxCapacity = defaultCapacity;
        loadFactor = defaultLoadFactor;
    }

    private void inflateTable() {
        table = new Node[maxCapacity];
    }

    public V put(K key, V value) {
        if (table == null) {
            inflateTable();
        }
        if (key == null) {
            return putForNullKey(value);
        }

        int hash = key.hashCode();
        int index = (hash % maxCapacity);

        putForNotNull(key, value, hash, index);
        return null;
    }

    private V putForNullKey(V value) {
        for (Node<K, V> current = table[0]; current != null; current = current.next) {
            if (null == current.key) {
                V oldValue = current.value;
                current.value = value;
                return oldValue;
            }
        }
        size++;
        table[0] = new Node<>(null, value, 0, table[0]);
        return null;
    }

    private V putForNotNull(K key, V value, int hash, int index) {
        for (Node<K, V> current = table[index]; current != null; current = current.next) {
            if ((current.hash == hash) && ((current.key == key) || (current.key != null && current.key.equals(key)))) {
                V oldValue = current.value;
                current.value = value;
                System.out.println("Updated " + oldValue + "  >  " + value + "  Where key = " + key + " & hash = " + hash + "  & index = " + index);
                return oldValue;
            }
        }

        //Insert New Node
        size++;
        table[index] = new Node<>(key, value, hash, table[index]);
        System.out.println("Inserted > " + value + "  Where key = " + key + " & hash = " + hash + "  & index = " + index);
        return null;
    }

    //For both Null and ot Null
    private void put(K key, V value, int hash, int index) {
        Node<K, V> head = table[index];
        if (head != null) {
            System.out.println("Next is Not Null");
            for (Node<K, V> current = head; current != null; current = current.next) {
                if ((current.hash == hash) && ((current.key == key) || (current.key != null && current.key.equals(key)))) {
                    V oldValue = current.value;
                    current.value = value;
                    System.out.println("Updated " + oldValue + "  >  " + value + "  Where key = " + key + " & hash = " + hash + "  & index = " + index);
                    break;
                }
                if (current.next == null) {
                    current.next = new Node<>(key, value, hash, null);
                    System.out.println("Inserted at end > " + value + "  Where key = " + key + " & hash = " + hash + "  & index = " + index);
                    size++;
                    break;
                }
            }
            System.out.println("End Of Loop");
        } else {
            size++;
            System.out.println("Next is Null");
            table[index] = new Node<>(key, value, hash, null);
            System.out.println("Inserted at first > " + value + "  Where key = " + key + " & hash = " + hash + "  & index = " + index);
        }
    }

    public void display() {
        System.out.println("Size: " + size);
        if (table != null) {
            int i = 0;
            for (Node<K, V> node : table) {
                System.out.print(i + " >>  ");
                Node<K, V> current = node;
                while (current != null) {
                    System.out.print(current.toString() + "  ,  ");
                    current = current.next;
                }
                System.out.println();
                i++;
            }
        }
    }

    public V get(K key) {
        return null;
    }

    class Node<K, V> {
        K key;
        V value;
        int hash;
        Node<K, V> next;

        public Node(K key, V value, int hash, Node<K, V> next) {
            this.key = key;
            this.value = value;
            this.hash = hash;
            this.next = next;
        }

        @Override
        public String toString() {
            return key + " : " + value;
        }
    }
}
