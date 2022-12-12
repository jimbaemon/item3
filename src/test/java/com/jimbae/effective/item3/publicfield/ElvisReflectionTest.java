package com.jimbae.effective.item3.publicfield;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import org.junit.jupiter.api.Test;

public class ElvisReflectionTest {

    @Test
    void 리플렉션을_이용해_인스턴스_강제생성() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor<Elvis> declaredConstructor = Elvis.class.getDeclaredConstructor();
        declaredConstructor.setAccessible(true); //접근 가능하도록 임의 조작 !!
        Elvis elvis1 = declaredConstructor.newInstance();
        Elvis elvis2 = declaredConstructor.newInstance();
        Elvis elvis3 = Elvis.INSTANCE;

        System.out.println("elvis1 = " + elvis1);
        System.out.println("elvis2 = " + elvis2);
        System.out.println("elvis3 = " + elvis3);
    }

}
