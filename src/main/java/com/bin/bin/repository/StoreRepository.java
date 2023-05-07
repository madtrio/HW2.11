package com.bin.bin.repository;

import com.bin.bin.model.Item;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.awt.*;
import java.util.*;

@Repository
public class StoreRepository {

    private int idCounter = 1;
    private final Map<Integer, Item> store = new HashMap<>();
    @PostConstruct
    public void init(){
        store.put(idCounter, new Item(idCounter++, "Ноутбук"));
        store.put(idCounter, new Item(idCounter++, "Компьютер"));
        store.put(idCounter, new Item(idCounter++, "Телефон"));
    }

    public void add (Item item) {
        store.put(item.getId(), item);
    }
    public Item get(int id){
        return store.get(id);
    }
    public Set<Item> getAll(){
        return (Set<Item>) new ArrayList<>(store.values());
    }
    public void update (int id, Item item) {
        if (store.containsKey(id)) {
            store.replace(id,item);
        }
    }
    public Item delete (int id) {
        return store.remove(id);
    }
}
