package com.splavs.elapsed;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.*;

/**
 * Few tests to test performance of sorts.
 *
 * @author Vyacheslav Silchenko
 */
@SuppressWarnings({"MismatchedReadAndWriteOfArray", "UnusedAssignment"})
@Elapsed
public class SortTest {

    private static final int N = 10000000;
    private static int[] TEST_DATA = new int[N];

    @BeforeClass
    public static void setUp() throws Exception {
        prepareData();
    }

    public static void prepareData() {
        Random rnd = new Random();
        for (int i = 0; i < N; i++) {
            TEST_DATA[i] = rnd.nextInt();
        }
    }

    @Test
    @Elapsed
    @SuppressWarnings("ManualArrayCopy")
    public void testShould_SortInts() {
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = TEST_DATA[i];
        }

        Arrays.sort(a);
    }

    @Test
    @Elapsed
    public void should_SortIntegers() {
        Integer[] a = new Integer[N];
        for (int i = 0; i < N; i++) {
            a[i] = TEST_DATA[i];
        }

        Arrays.sort(a);
    }

    @Test
    @Elapsed
    public void should_SortArrayList() {
        Integer[] a = new Integer[N];
        for (int i = 0; i < N; i++) {
            a[i] = TEST_DATA[i];
        }


        List<Integer> al;
        al = new ArrayList<Integer>(Arrays.asList(a));

        Collections.sort(al);
    }


}
