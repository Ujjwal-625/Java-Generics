package com.bridgelabz.smartWarehouseManagement;

public class Electronics extends WareHouseItem {
    public Electronics(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("Electronics: " + getName());
    }
}
