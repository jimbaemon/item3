package com.jimbae.effective.item3.enumtype;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import com.jimbae.effective.item3.utils.Serialization;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import org.junit.jupiter.api.Test;

class ElvisTest {

    @Test
    void 동일한_인스턴스_여부_확인(){
        Elvis elvis = Elvis.INSTANCE;

        System.out.println("elvis = " + elvis);
        System.out.println("Elvis.INSTANCE = " + Elvis.INSTANCE);
        assertThat(elvis == Elvis.INSTANCE).isTrue();
        assertThat(elvis).isEqualTo(Elvis.INSTANCE);
    }

    @Test
    void 리플렉션을_이용해_인스턴스_강제생성() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor<Elvis> declaredConstructor = Elvis.class.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        Elvis elvis1 = declaredConstructor.newInstance();

        System.out.println("elvis1 = " + elvis1);
    }

    @Test
    void 직렬화() {
        Elvis instance = Elvis.INSTANCE;
        Elvis elvis = Serialization.serializeAndDeserialize(instance);

        System.out.println(instance == elvis);
    }

}
