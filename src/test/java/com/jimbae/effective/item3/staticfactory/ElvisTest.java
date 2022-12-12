package com.jimbae.effective.item3.staticfactory;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ElvisTest {

    @Test
    void 동일한_인스턴스_여부_확인() {
        Elvis elvis = Elvis.getInstance();

        System.out.println("elvis = " + elvis);
        System.out.println("Elvis.getInstance() = " + Elvis.getInstance());
        assertThat(elvis == Elvis.getInstance()).isTrue();
        assertThat(elvis).isEqualTo(Elvis.getInstance());
    }

}
