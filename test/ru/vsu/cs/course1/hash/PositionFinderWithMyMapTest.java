package ru.vsu.cs.course1.hash;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class PositionFinderWithMyMapTest {

    @org.junit.jupiter.api.Test
    void positionFinderTest1() {
        Integer[] inputArr = {3, 2, 4, 1, 4, 5, 3, 2, 4, 2, 6, 1};
        Integer[] expectedArr = {2, 4, 8};

        List<Integer> inputList = new ArrayList<>();
        Collections.addAll(inputList, inputArr);

        List<Integer> expectedList = new ArrayList<>();
        Collections.addAll(expectedList, expectedArr);

        List<Integer> actualList = PositionFinderWithMyMap.findAllPositionsMaxOfOftenestValues(inputList);

        Assertions.assertEquals(expectedList, actualList);
    }

    @org.junit.jupiter.api.Test
    void positionFinderTest2() {
        Integer[] inputArr = {5, 1, 43, 11, 78, 34, 28, 54, 4, 11, 63, 93, 29};
        Integer[] expectedArr = {3, 9};

        List<Integer> inputList = new ArrayList<>();
        Collections.addAll(inputList, inputArr);

        List<Integer> expectedList = new ArrayList<>();
        Collections.addAll(expectedList, expectedArr);

        List<Integer> actualList = PositionFinderWithMyMap.findAllPositionsMaxOfOftenestValues(inputList);

        Assertions.assertEquals(expectedList, actualList);
    }

    @org.junit.jupiter.api.Test
    void positionFinderTest3() {
        Integer[] inputArr = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        Integer[] expectedArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        List<Integer> inputList = new ArrayList<>();
        Collections.addAll(inputList, inputArr);

        List<Integer> expectedList = new ArrayList<>();
        Collections.addAll(expectedList, expectedArr);

        List<Integer> actualList = PositionFinderWithMyMap.findAllPositionsMaxOfOftenestValues(inputList);

        Assertions.assertEquals(expectedList, actualList);
    }

    @org.junit.jupiter.api.Test
    void positionFinderTest4() {
        Integer[] inputArr = {10, 10, 10, 5, 5, 5};
        Integer[] expectedArr = {0, 1, 2};

        List<Integer> inputList = new ArrayList<>();
        Collections.addAll(inputList, inputArr);

        List<Integer> expectedList = new ArrayList<>();
        Collections.addAll(expectedList, expectedArr);

        List<Integer> actualList = PositionFinderWithMyMap.findAllPositionsMaxOfOftenestValues(inputList);

        Assertions.assertEquals(expectedList, actualList);
    }

    @org.junit.jupiter.api.Test
    void positionFinderTest5() {
        Integer[] inputArr = {1, 2, 1, 2, 1, 2, 1};
        Integer[] expectedArr = {0, 2, 4, 6};

        List<Integer> inputList = new ArrayList<>();
        Collections.addAll(inputList, inputArr);

        List<Integer> expectedList = new ArrayList<>();
        Collections.addAll(expectedList, expectedArr);

        List<Integer> actualList = PositionFinderWithMyMap.findAllPositionsMaxOfOftenestValues(inputList);

        Assertions.assertEquals(expectedList, actualList);
    }
}