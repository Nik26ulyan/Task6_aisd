package ru.vsu.cs.course1.hash;

import java.util.ArrayList;
import java.util.List;


public class Program {

    public static void main(String[] args) throws Exception {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        List<Integer> positions = PositionFinder.findAllPositionsMaxOfOftenestValues(list);
        List<Integer> positions2 = PositionFinderWithMyMap.findAllPositionsMaxOfOftenestValues(list);
        for (int i = 0; i < positions.size(); i++) {
            System.out.println(positions2.get(i));
        }
    }
}
