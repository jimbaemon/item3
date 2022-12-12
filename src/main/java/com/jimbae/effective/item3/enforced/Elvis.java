package com.jimbae.effective.item3.enforced;

import java.io.Serial;
import java.io.Serializable;

public class Elvis implements Serializable {
    public static final Elvis INSTANCE = new Elvis();
    public static boolean created;

    private Elvis() {
        if(created) {
            throw new AssertionError();
        }
        created = true;
    }

    public void leaveTheBuilding() {
        System.out.println("Elvis Leaved");
    }

    @Serial
    private Object readResolve(){
        return INSTANCE;
    }
}
