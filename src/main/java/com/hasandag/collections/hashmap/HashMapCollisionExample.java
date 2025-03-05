package com.hasandag.collections.hashmap;

import java.util.HashMap;
import java.util.Objects;

class CustomKey {
    private final int id;
    private final String name;

    public CustomKey(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int hashCode() {
        // Force a collision by returning a constant hash code
        return 42;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        CustomKey that = (CustomKey) obj;
        return id == that.id && Objects.equals(name, that.name);
    }

    @Override
    public String toString() {
        return "CustomKey{id=" + id + ", name='" + name + "'}";
    }
}

public class HashMapCollisionExample {
    public static void main(String[] args) {
        HashMap<CustomKey, String> customKeyStringMap = new HashMap<>();
        HashMap<String, CustomKey> stringCustomKeyMap = new HashMap<>();

        CustomKey key1 = new CustomKey(1, "Alice");
        CustomKey key2 = new CustomKey(2, "Bob"); // Different key, but same hashCode
        CustomKey key3 = new CustomKey(2, "Bob"); // Different key, but same hashCode

        customKeyStringMap.put(key1, "Value for Alice");
        customKeyStringMap.put(key2, "Value for Bob");
        customKeyStringMap.put(key3, "Value for Bob2"); // This will not be added to the customKeyStringMap

        System.out.println("customKeyStringMap contents:");
        for (var entry : customKeyStringMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        /*
        customKeyStringMap contents:
        CustomKey{id=1, name='Alice'} -> Value for Alice
        CustomKey{id=2, name='Bob'} -> Value for Bob2
         */


        stringCustomKeyMap.put("Alice", key1);
        stringCustomKeyMap.put("Bob", key2);
        stringCustomKeyMap.put("Bob2", key3);  //This will be added to the stringCustomKeyMap

        System.out.println("\nstringCustomKeyMap contents:");
        for (var entry : stringCustomKeyMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        /*
        stringCustomKeyMap contents:
        Bob2 -> CustomKey{id=2, name='Bob'}
        Bob -> CustomKey{id=2, name='Bob'}
        Alice -> CustomKey{id=1, name='Alice'}
         */

    }
}

