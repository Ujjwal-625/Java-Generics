package com.bridgelabz.smartWarehouseManagement;

import java.util.List;

abstract public class WareHouseItem {
    private String name;

    public WareHouseItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void display();
}

class WarehouseUtils {
    public static void displayItems(List<? extends WareHouseItem> items) {
        for (WareHouseItem item : items) {
            item.display();
        }
    }
}
