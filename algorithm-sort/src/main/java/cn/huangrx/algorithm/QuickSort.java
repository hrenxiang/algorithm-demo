package cn.huangrx.algorithm;

import java.util.Arrays;

/**
 * 快速排序
 *
 * @author hrenxiang
 * @since 2022-11-20 17:00
 */
public class QuickSort {
    public static void main(String[] args) {
        Integer[] numbers = new Integer[]{3, 2, 1, 6, 5, 4};

        quickSort(numbers, 0, numbers.length - 1);

        System.out.println(Arrays.toString(numbers));
    }

    private static void quickSort(Integer[] numbers, int left, int right) {
        int f, t;
        int ltemp = left;
        int rtemp = right;

        f = numbers[(ltemp + rtemp) / 2];

        while (ltemp < rtemp) {
            while (numbers[ltemp] < f) {
                ++ltemp;
            }
            while (numbers[rtemp] > f) {
                --rtemp;
            }
            if (ltemp <= rtemp) {
                t = numbers[ltemp];
                numbers[ltemp] = numbers[rtemp];
                numbers[rtemp] = t;
                --rtemp;
                ++ltemp;
            }

            if (ltemp == rtemp) {
                ltemp++;
            }
            if (left < rtemp) {
                // 递归调用
                quickSort(numbers, left, ltemp - 1);
            }
            if (right > ltemp) {
                // 递归调用
                quickSort(numbers, rtemp + 1, right);
            }
        }
    }
}
