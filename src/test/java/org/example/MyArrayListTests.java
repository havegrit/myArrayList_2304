package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MyArrayListTests {
    private MyArrayList<String> list;

    @BeforeEach
    void setUp() {
        list = new MyArrayList<>();
    }

    @Test
    @DisplayName("요소 한 개 추가, 단순 증가")
    void test01() {
        assertTrue(list.add("Element1"));
        assertThat(list.size()).isEqualTo(1);
    }
}