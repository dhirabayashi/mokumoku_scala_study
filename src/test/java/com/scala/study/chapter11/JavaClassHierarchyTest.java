package com.scala.study.chapter11;

import org.junit.Test;

import java.util.Objects;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

/**
 * Created by Daiki on 2016/01/20.
 */
public class JavaClassHierarchyTest {
    @Test
    public void test() {
        assertThat(1, is(1));

        int i = 10;
        Integer k = 10;

        int mx = Math.max(42, 43);
        assertThat(mx, is(43));

        int mn = Math.min(42, 43);
        assertThat(mn, is(42));
    }

    @Test
    public void testIsEqual() {
        assertThat(isEqual(421, 421), is(true));
        String x = "abcd".substring(0, 2);
        String y = "abcd".substring(0, 2);
        System.out.println(x);
        System.out.println(y);

        assertThat(isEqual(x, y), is(true));
    }

    public boolean isEqual(Integer x, Integer y) {
        return Objects.equals(x, y);
    }

    public boolean isEqual(String x, String y) {
        return Objects.equals(x, y);
    }
}
