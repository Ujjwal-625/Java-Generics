package com.bridgelabz.smartWarehouseManagement;

public class Furniture extends WareHouseItem {
    public Furniture(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("Furniture: " + getName());
    }
}