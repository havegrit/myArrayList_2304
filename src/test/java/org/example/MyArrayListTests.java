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

    @Test
    @DisplayName("요소 추가 및 가져오기, 실제 데이터 저장")
    void test02() {
        assertThat(list.add("Element1")).isTrue();
        assertThat(list.get(0)).isEqualTo("Element1");
    }

    @Test
    @DisplayName("데이터 저장 공간 부족 시, 공간 추가")
    void test03() {
        assertThat(list.add("Element1")).isTrue();
        assertThat(list.add("Element2")).isTrue();
        assertThat(list.add("Element3")).isTrue();
        assertThat(list.size()).isEqualTo(3);
        assertThat(list.get(2)).isEqualTo("Element3");
    }

    @Test
    @DisplayName("데이터 삭제")
    void test04() {
        assertThat(list.add("Element1")).isTrue();
        assertThat(list.add("Element2")).isTrue();
        assertThat(list.add("Element3")).isTrue();
        assertThat(list.remove(1)).isEqualTo("Element2");
        assertThat(list.size()).isEqualTo(2);
        assertThat(list.get(2)).isEqualTo(null);
        assertThat(list.get(1)).isEqualTo("Element3");
        assertThat(list.get(0)).isEqualTo("Element1");
    }

    @Test
    @DisplayName("데이터 포함 여부 확인")
    void testContains() {
        list.add("Element1");
        list.add("Element2");
        assertThat(list.contains("Element1")).isTrue();
        assertThat(list.contains("Element3")).isFalse();
    }

    @Test
    @DisplayName("인덱스 추출")
    void testIndexOf() {
        list.add("Element1");
        list.add("Element2");
        list.add("Element1");
        assertThat(list.indexOf("Element1")).isEqualTo(0);
        assertThat(list.indexOf("Element2")).isEqualTo(1);
        assertThat(list.indexOf("Element3")).isEqualTo(-1);
    }

    @Test
    @DisplayName("모든 데이터 지우기")
    void testClear() {
        list.add("Element1");
        list.add("Element2");
        list.add("Element3");
        list.clear();
        assertThat(list.size()).isEqualTo(0);
        assertThat(list.isEmpty()).isTrue();
    }
}