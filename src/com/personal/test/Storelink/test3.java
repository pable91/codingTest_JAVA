package com.personal.test.Storelink;

import java.util.ArrayList;
import java.util.Collections;

class Coffee implements Comparable<Coffee>{
    public int idx, times;

    Coffee(int idx, int times) {
        this.idx = idx;
        this.times = times;
    }

    @Override
    public int compareTo(Coffee o){
        return this.times-o.times;
    }
}

public class test3 {

    public int[] solution(int N, int[] coffee_times) {
        int[] answer = {};

        int n = N;

        ArrayList<Coffee> arr = new ArrayList<>();
        for (int i = 0; i < coffee_times.length; ++i) {
            arr.add(new Coffee(i+1, coffee_times[i]));
        }

        Collections.sort(arr);

        return answer;
    }

    public static void main(String[] args) {
        test3 test3 = new test3();
        int [] arr = {4,2,2,5,3};
        test3.solution(3, arr);
    }
}
