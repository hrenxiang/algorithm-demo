package cn.huangrx.algorithm;

import java.util.Arrays;

/**
 * 选择排序
 *
 * @author hrenxiang
 * @since 2022-11-20 16:34
 */
public class SortingByChoice {

    public static void main(String[] args) {

        Integer[] numbers = new Integer[]{3, 2, 1, 6, 5, 4};

        choiceSort(numbers);

        System.out.println(Arrays.toString(numbers));
    }

    private static void choiceSort(Integer[] numbers) {

        for (int i = 0; i < numbers.length - 1; i++) {
            int min = i;

            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[min]) {
                    min = j;
                }
            }

            if (i != min) {
                Integer temp = numbers[i];
                numbers[i] = numbers[min];
                numbers[min] = temp;
            }
        }

    }
}
