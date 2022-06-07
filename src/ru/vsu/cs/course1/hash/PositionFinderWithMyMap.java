package ru.vsu.cs.course1.hash;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PositionFinderWithMyMap {
    public static List<Integer> findAllPositionsMaxOfOftenestValues(List<Integer> list) {
        MyHashMap<Integer, List<Integer>> map = new MyHashMap<>(list.size());
        int valueOfPositions = 0;
        Integer oftenestNumber = 0;

        for (int i = 0; i < list.size(); i++) {
            Integer value = list.get(i);
            List<Integer> newList;
            List<Integer> tempList = map.get(value);

            if (tempList != null){
                newList = new ArrayList<>(tempList);
                newList.add(i);
            } else {
                newList = Collections.singletonList(i);
            }
            map.put(value, newList);

            if (map.get(value).size() > valueOfPositions) {
                valueOfPositions = map.get(value).size();
                oftenestNumber = value;
            }
        }

        return map.get(oftenestNumber);
    }
}
