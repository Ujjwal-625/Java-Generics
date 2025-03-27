package com.bridgelabz.smartWarehouseManagement;

public class Grocries extends WareHouseItem {
    public Grocries(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("Groceries: " + getName());
    }
}
