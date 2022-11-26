package cn.huangrx.algorithm.secondConfirm;

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

    private static void quickSort(Integer[] numbers, int low, int high) {
        if (low >= high) {
            return;
        }
        int first = low;
        int last = high;
        int key = numbers[first];

        while (first < last) {
            // 将比第一个小的移动到前面
            while (first < last && numbers[last] >= key) {
                last--;
            }
            if (first < last) {
                numbers[first++] = numbers[last];
            }

            // 将比第一个大的移动到后面
            while (first < last && numbers[first] <= key) {
                first++;
            }
            if (first < last) {
                numbers[last--] = numbers[first];
            }
        }

        numbers[first] = key;
        System.out.println(Arrays.toString(numbers));

        // 递归真是一个好东西【。。。归着归着，人就迷了】
        quickSort(numbers, low, first - 1);
        quickSort(numbers, first + 1, high);
    }
}
