package com.personal.test.DeliveryHero;

import java.util.Stack;

class Solution2 {

    boolean[][] arr;

    public int[] solution(String[] B) {
        // write your code in Java SE 8
        int[] answers = new int[3];

        // 1. B의 길이를 확인해서 2차원 배열 생성
        arr = new boolean[B.length][B[0].length()];

        // 2. B를 순회하면서 #가 있으면 배열값을 true로 초기화
        int y = -1;
        for (String str : B) {
            y += 1;
            for (int x = 0; x < str.length(); ++x) {
                if (str.charAt(x) == '#') {
                    arr[y][x] = true;
                    continue;
                }
                arr[y][x] = false;
            }
        }

        // 3. DFS나 BFS로 순회하면서 true가 있는지 확인하고 갯수 카운팅, 그리고 한번방문했으면 false로 변환
        int sum;
        for (int i = 0; i < arr.length; ++i) {
            sum = 0;
            for (int j =0; j < arr[0].length; ++j) {
                if(arr[i][j] == true) {
                    sum = DFS(i, j, 0);
                    if (sum == 1)
                        answers[0] += 1;
                    else if (sum == 2)
                        answers[1] += 1;
                    else
                        answers[2] += 1;
                }
            }
        }

        return answers;

    }

    private int DFS(int y, int x, int sum) {
        sum += 1;
        arr[y][x] = false;

        // 오른쪽
        if (x + 1 < arr[0].length && arr[y][x + 1] == true) {
            arr[y][x + 1] = false;
            sum = DFS(y,x+1, sum);
        }
        // 왼쪽
        if (x- 1 >= 0 && arr[y][x - 1] == true) {
            arr[y][x - 1] = false;
            sum = DFS(y,x-1,sum);
        }
        // 위쪽
        if (y - 1 >= 0 && arr[y-1][x] == true) {
            arr[y-1][x] = false;
            sum = DFS(y-1,x,sum);
        }
        // 아래쪽
        if (y + 1 < arr.length && arr[y+1][x] == true) {
            arr[y+1][x] = false;
            sum = DFS(y+1,x,sum);
        }

        return sum;
    }

    public static void main(String[] args) {

        Solution2 solution = new Solution2();
        String[] arr = new String[]{".##.#", "#.#..", "#...#", "#.##."};
        solution.solution(arr);
    }
}

