package com.jimbae.effective.item3.publicfield;

import java.io.Serializable;

public class Elvis {

    public static final Elvis INSTANCE = new Elvis();

    private Elvis() {
    }

    public void leaveTheBuilding() {
        System.out.println("Elvis Leaved");
    }
}
