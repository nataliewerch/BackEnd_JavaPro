package homework16.level1.task9;

import java.util.HashMap;
import java.util.Map;

public class Database<K extends Number, V> {
    Map<K, V> database;

    public Database() {
        this.database = new HashMap<>();
    }

    public void put (K key, V value) {
        database.put(key, value);
    }

    public V get(K key) {
        return database.get(key);
    }

    public void remove(K key){
        database.remove(key);
    }

    public boolean containsKey(K key) {
        return database.containsKey(key);
    }

    public void clear(){
        database.clear();
    }

    public int size(){
     return database.size();
    }
    public boolean isEmpty(){
        return database.isEmpty();
    }
}
