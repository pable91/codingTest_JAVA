package com.personal.test.socar;//package com.personal.test.socar;
//
//
//public class test1 {
//
//    boolean flag = true;
//    int swapCnt = -1;
//    int answer = 0;
//
//
//    public int func(int[] arr, int depth, int n, int k) {
//        if (depth == n) {
//            flag = true;
//            for (int j = 0; j < arr.length - 1; ++j) {
//                if (Math.abs(arr[j] - arr[j+1]) > k ) {
//                    flag = false;
//                    break;
//                }
//            }
//
//            swapCnt += 1;
//
//            if (flag == true) {
//                answer = swapCnt;
//                return -1;
//            }
//        }
//
//        for (int i = depth; i < n; ++i ) {
//            s(arr, depth, i);
//            func(arr,depth + 1, n,k);
//            s(arr, depth, i);
//        }
//
//        return -1;
//    }
//
//    public void s(int[] arr, int depth, int i ) {
//        int tmp = arr[depth];
//        arr[depth] = arr[i];
//        arr[i] = tmp;
//    }
//
//    public int solution(int[] numbers, int k ) {
//        //int answer = 0;
//        int n = numbers.length;
//
//        func(numbers, 0, n,k);
//        return answer;
//    }
//
//    public static void main(String[] args) {
//
//        test1 t = new test1();
//        //int[] num ={3,7,2,8,6,4,5,1};
//        int[] num = {10,40,30,20};
//        int k = 20;
//        System.out.println(t.solution(num, k));
//    }
//}

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Number {
    int[] numbers;
    int cnt;

    Number(int[] numbers, int cnt) {
        this.numbers = numbers;
        this.cnt = cnt;
    }

    public int[] getNumbers() {
        return numbers;
    }

}

public class test1 {

    public static void main(String[] args) {

//        int[] numbers = {10, 40, 30, 20};
//        int k = 20;
        int result = 0;

        int[] numbers = {3, 7, 2, 8, 6, 4, 5, 1};
        int k = 3;

//        int[] numbers = {50, 10, 80, 5, 60, 70};
//        int k = 30;
        System.out.println(solution(numbers, k));
    }

    public static boolean f(int[] numbers, int k) {
        int[] newNumbers = new int[numbers.length];

        for (int t = 0; t < newNumbers.length; t++) {
            newNumbers[t] = numbers[t];
        }

        Arrays.sort(numbers);

        for (int i = 0; i < numbers.length-1; ++i) {
            if (k < Math.abs(numbers[i] - numbers[i + 1])) {
                    return true;
            }
        }

        return false;
    }

    public static int solution(int[] numbers, int k) {
        if (f(numbers,k)) {
            return -1;
        }

        Queue<Number> q = new LinkedList<>();
        q.add(new Number(numbers, 0));

        while (!q.isEmpty()) {
            Number nowNum = q.poll();
            boolean flag = true;

            for (int i = 0; i < numbers.length - 1; i++) {
                if (k < Math.abs(nowNum.getNumbers()[i] - nowNum.getNumbers()[i + 1])) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                return nowNum.cnt;
            }

            for (int i = 0; i < numbers.length - 1; i++) {
                //for (int j = 1; j < numbers.length-1; j++) {
                    Number newNumber = new Number(func(nowNum.numbers, i, i+1), nowNum.cnt + 1);
                    q.offer(newNumber);
                //}
            }
        }

        return -1;
    }

    public static int[] func(int[] numbers, int i, int j) {
        int[] newNumbers = new int[numbers.length];

        for (int k = 0; k < newNumbers.length; k++) {
            newNumbers[k] = numbers[k];
        }

        int tmp = newNumbers[i];
        newNumbers[i] = newNumbers[j];
        newNumbers[j] = tmp;

        return newNumbers;
    }
}



