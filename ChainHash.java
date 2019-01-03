package algorithm;

public class ChainHash<K, V> {
	private int size;
	private Node<K, V>[] table;
	
	public ChainHash(int capacity) {
		try {
			table = new Node[capacity];
			this.size = capacity;
		}catch (OutOfMemoryError e) {
			this.size = 0;
		}
	}
	
	public int hashValue(Object key) {
		return key.hashCode() % size;
	}
	
	public V search(K key) {
		int hash = hashValue(key);
		Node<K, V> p = table[hash];
		
		while(p != null) {
			if (p.getKey().equals(key)) {
				return p.getValue();
			}
			p = p.next;
		}
		return null;
	}
	
	int add(K key, V value) {
		int hash = hashValue(key);
		Node<K, V> p = table[hash];
		
		while (p != null) {
			if (p.getKey().equals(key)) {
				return 1;
			}
			p = p.next;
		}
		Node<K, V> temp = new Node<K, V>(key, value, table[hash]);
		table[hash] = temp;
		return 0;
	}
	
	class Node<K, V> {
		private K key;
		private V value;
		private Node<K, V> next;
		
		Node(K key, V value, Node<K, V> next){
			this.key = key;
			this.value = value;
			this.next = next;
		}
		
		K getKey() {
			return key;
		}
		
		V getValue() {
			return value;
		}
		
		@Override
		public int hashCode() {
			return key.hashCode();
		}
	}
}
