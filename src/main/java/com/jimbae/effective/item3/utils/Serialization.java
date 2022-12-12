package com.jimbae.effective.item3.utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Serialization {

    public static <T> T serializeAndDeserialize(T o) {
        try(ObjectOutput out = new ObjectOutputStream(new FileOutputStream("test.obj"))){
            out.writeObject(o);
        }catch (IOException e){
            e.printStackTrace();
        }

        try(ObjectInput in = new ObjectInputStream(new FileInputStream("test.obj"))){
            return (T)in.readObject();
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
        throw new AssertionError();
    }
}
