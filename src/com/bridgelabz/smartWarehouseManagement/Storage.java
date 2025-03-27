package com.bridgelabz.smartWarehouseManagement;

import java.util.*;

public class Storage<T extends WareHouseItem> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }
}

