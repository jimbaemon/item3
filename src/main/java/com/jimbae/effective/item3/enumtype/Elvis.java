package com.jimbae.effective.item3.enumtype;

public enum Elvis {
    INSTANCE;

    Elvis() {
    }

    public void leaveTheBuilding() {
        System.out.println("Elvis Leaved");
    }
}
