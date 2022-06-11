package com.company.collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionsDemo {
    public static void show(){
        Collection<String> collection = new ArrayList<>();
        collection.add("A");
        collection.add("b");
        collection.add("c");
Collection<String> other = new ArrayList<>();
        other.add("A");
        other.add("b");
        other.add("c");

        System.out.println(collection == other);
        System.out.println(collection.equals(other));
    }
}
