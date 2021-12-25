package com.personal.test.DevMatching;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            getData(br);
            System.out.println(br);
        } catch (IOException e) {
            System.out.println("입출력 에러");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("길이가 5이상 10미만이 아님");
        }
    }

    private static void getData(BufferedReader br) throws IOException, StringIndexOutOfBoundsException {
        String data = br.readLine();
        data.substring(0,4);
        data.substring(9,1);
    }
}
