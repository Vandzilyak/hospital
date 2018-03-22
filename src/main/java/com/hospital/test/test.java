package com.hospital.test;

import java.util.*;

public class test {


//    public static void main(String[] args) {
//        int i[] = new int[10];
//        Random random = new Random();
//        for (int j = 0; j < i.length; j++) {
//            i[j] = random.nextInt(100)+1;
//        }
//        Arrays.sort(i);
//        System.out.println(Arrays.toString(i));
//    }


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(23);
        list.add(3);
        list.add(133);
        list.add(1);
        list.add(13);
        list.add(14);
//        Collections.sort(list);
        for (Integer item: list){
            System.out.println(item);
        }
    }
}
