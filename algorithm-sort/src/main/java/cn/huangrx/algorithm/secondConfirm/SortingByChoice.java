package cn.huangrx.algorithm.secondConfirm;

import java.util.Arrays;
import java.util.jar.JarEntry;

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
        // 1、控制需要比较的次数；3开始找最小，2开始找最小，1开始找最小。。。共找了5次
        for (int i = 0; i < numbers.length - 1; i++) {
            // 2、假设最小值的索引是当前开始找最小值的起始索引
            int min = i;

            // 3、从起始索引开始与后续索引对应的值比较，找最小值
            for (int j = i + 1; j < numbers.length; j++) {
                // 4、如果当前索引对应的值大于后续索引对应的值
                if (numbers[min] > numbers[j]) {
                    // 5、更新最小值的索引，一圈下来会找到最小值的索引
                    min = j;
                }

            }

            // 6、如果i索引不等于最小值的索引，说明后续存在比i索引位置的值更小的值，进行交换
            if (i != min) {
                int temp = numbers[i];
                numbers[i] = numbers[min];
                numbers[min] = temp;
            }
        }
    }
}
