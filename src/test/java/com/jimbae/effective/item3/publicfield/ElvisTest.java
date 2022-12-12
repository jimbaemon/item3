package com.jimbae.effective.item3.publicfield;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
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

}
