package com.jimbae.effective.item3.publicfield;

import static org.junit.jupiter.api.Assertions.*;

import com.jimbae.effective.item3.publicfield.Elvis;
import com.jimbae.effective.item3.utils.Serialization;
import org.junit.jupiter.api.Test;

class SerializationTest {

    @Test
    void 직렬화(){
        Elvis instance = Elvis.INSTANCE;
        Elvis elvis = Serialization.serializeAndDeserialize(instance);

        System.out.println(instance == elvis);
    }

}
