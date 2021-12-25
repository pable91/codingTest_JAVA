package com.personal.test.NaverFinancial;

public class test4 {
    int DFS(int[][] board, int x, int y, int point) {
        if(x == board[0].length - 1 && y == board.length - 1)
            return point;

        if(board[y][x] == 0) {
            if (point < 0)
                point *= -1;
        }

        int n1 = 0;
        int n2 = 0;
        if(x < board[0].length - 1) {
            n1 = DFS(board, x + 1, y, point + board[y][x + 1]);
        }
        if(y < board.length - 1) {
            n2 = DFS(board, x, y + 1, point + board[y + 1][x]);
        }

        return Math.max(n1,n2);
    }

    public int solution(int[][] board) {
        int answer = 0;

        answer = DFS(board, 0,0, board[0][0]);

        return answer;
    }

    public static void main(String[] args) {
        test4 t = new test4();
        int [][] arr = {{1, -7, -2, 1, -1},{2, 3, 0, -1, -2},{1, -1, 6, -1, -2},{-1, 1, -2, 0, 4},{-10, 5, -3, -1, 1}};
        System.out.println(t.DFS(arr,0,0,arr[0][0]));
    }
}
