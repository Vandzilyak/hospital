package com.hospital.test;

import java.util.ArrayList;
import java.util.List;

public class fibonaci {

    public void calck() {


        int[] a = {1,6,6,6,6,6,6,6,6,6,6};
        int max = 0;
        int count = 1;

        for (int i = 1; i < a.length; i++) {
            if (max<a[i]){
                max=a[i];
            }else if (max==a[i]){
                count++;
            }
        }
        System.out.println(count);
        System.out.println(max);
    }

    public static void main(String[] args) {
        new fibonaci().calck();
    }
}




