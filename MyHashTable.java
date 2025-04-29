
import java.util.*;

public class MyHashTable<K, V> {
    private class Entry<K, V> {
        K key;
        V value;
        Entry<K, V> next;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private final int INITIAL_CAPACITY = 16;
    private Entry<K, V>[] buckets;
    private int size = 0;

    public MyHashTable() {
        buckets = new Entry[INITIAL_CAPACITY];
    }

    private int getBucketIndex(K key) {
        return Math.abs(key.hashCode()) % buckets.length;
    }

    public void put(K key, V value) {
        int index = getBucketIndex(key);
        Entry<K, V> head = buckets[index];
        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }
        Entry<K, V> newEntry = new Entry<>(key, value);
        newEntry.next = buckets[index];
        buckets[index] = newEntry;
        size++;
    }

    public V get(K key) {
        int index = getBucketIndex(key);
        Entry<K, V> head = buckets[index];
        while (head != null) {
            if (head.key.equals(key)) {
                return head.value;
            }
            head = head.next;
        }
        return null;
    }

    public int size() {
        return size;
    }

    public int[] getBucketSizes() {
        int[] counts = new int[buckets.length];
        for (int i = 0; i < buckets.length; i++) {
            int count = 0;
            Entry<K, V> head = buckets[i];
            while (head != null) {
                count++;
                head = head.next;
            }
            counts[i] = count;
        }
        return counts;
    }
}
