package com.personal.practice.programmers.level1;

import java.util.*;

/**
 *  위클리챌린지 - 복서 정렬하기
 */

class Player {
    int no;
    int weights;
    double rate;
    int overWeightWinNum;

    public void func(int myNum , int[] weights, String head2head) {
        this.no = myNum + 1;
        this.weights = weights[myNum];

        double winCnt = 0.0;
        double totalCnt = 0.0;
        for ( int i = 0; i < head2head.length(); ++i) {
            if ( head2head.charAt(i) != 'N' ) {
                totalCnt += 1;
                if ( head2head.charAt(i) == 'W') {
                    winCnt += 1;
                    if (weights[i] > weights[myNum]) {
                        overWeightWinNum += 1;
                    }
                }
            }
        }

        rate = winCnt / totalCnt;
        rate *= 100.0;
    }
}

class Solution_2 {
    public int[] solution(int[] weights, String[] head2head) {
        int[] answer = new int[weights.length];

        LinkedList<Player> list = new LinkedList<>();

        for ( int i = 0; i < weights.length; ++i ) {
            Player p = new Player();
            p.func(i, weights, head2head[i]);
            list.add(p);
        }

        Collections.sort(list, new Comparator<Player>() {
            @Override
            public int compare(Player o1, Player o2) {

                // 
                // 
                /**
                 * 오름차순은 다음을 리턴해야함.
                 * o1 > o2 양수 리턴
                 * o1 < o2 음수 리턴
                 * o1 == o2 0 리턴
                 * 
                 * 내림차순은 반대
                 */

                // 내림차순
                if (o1.rate > o2.rate) return -1;
                else if (o1.rate < o2.rate) return 1;
                else {
                    if (o1.overWeightWinNum > o2.overWeightWinNum) return -1;
                    else if (o1.overWeightWinNum < o2.overWeightWinNum) return 1;
                    else {
                        if (o1.weights > o2.weights) return -1;
                        else if (o1.weights < o2.weights) return 1;
                        else {
                            if (o1.no > o1.no) return 1;
                            else if (o1.no < o1.no) return -1;
                        }
                    }
                }
                return 0;
            }
        });

        for ( int i = 0; i < list.size(); ++i ) {
            answer[i] = list.get(i).no;
        }

        return answer;
    }
}

public class test2 {
    public static void main(String[] args) {
        Solution_2 solution = new Solution_2();
        //int[] weights = {50,82,75,129};
        //String[] head2head = {"NLWL","WNLL","LWNW","WWLN"};

        int[] weights = {60,70,60};
        String[] head2head = {"NNN","NNN","NNN"};
        solution.solution(weights, head2head);
    }


}
