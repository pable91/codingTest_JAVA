package com.personal.practice.inflearn.Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Time implements Comparable<Time>{
    public int time;
    public char state;

    Time(int time, char state) {
        this.time = time;
        this.state = state;
    }

    @Override
    public int compareTo(Time o){
        if (this.time == o.time) {
            return this.state - o.state;
        }
        return this.time - o.time;
        //return this.e-o.e;
    }
}

public class Greedy2 {

    static ArrayList<Time> arrayList = new ArrayList<>();

    static int func() {
        Collections.sort(arrayList);

        int cnt = 0;
        int max = 0;
        for (Time t : arrayList) {
            if (t.state == 'e') {
                cnt -= 1;
            }
            else { cnt += 1; }

            if (cnt > max)
                max = cnt;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; ++i) {
            int time = scanner.nextInt();
            arrayList.add(new Time(time,'s'));
            time = scanner.nextInt();
            arrayList.add(new Time(time,'e'));
        }

        System.out.println(func());
    }
}
