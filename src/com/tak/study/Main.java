package com.tak.study;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //값을 담을 배열
        int[] arr = new int[5];

        //입력한 값의 총 합
        int sum = 0;

        //5번 반복
        for (int i = 0; i < 5; i++) {

            //값 입력
            int num = sc.nextInt();

            //배열에 입력한 값 넣기
            arr[i] += num;

            //합계
            sum += num;

        }

        //합계를 5로 나눠서 평균값 산출
        System.out.println(sum/5);

        //오름차순 정렬
        Arrays.sort(arr);

        System.out.println(arr[2]);

        //누수방지
        sc.close();

    }

}
