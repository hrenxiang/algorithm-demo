package cn.huangrx.algorithm;

import java.util.Arrays;

/**
 * 冒泡排序
 * <p>
 * 两两连续进行比较，大的放到右边，直至最大的在最右边，排除最后一个，再两两比较，依然让最大的再最后一个，循环往复，直至全部拍完序
 * <p>
 * n个数字自需要比较 n-1 次，第m次需要比较n-m次
 *
 * @author hrenxiang
 * @since 2022-11-20 16:03
 */
public class SortOfBubble {

    public static void main(String[] args) {
        Integer[] numbers = new Integer[]{2, 5, 1, 4, 3, 6};

        bubbleSort(numbers);

        System.out.println(Arrays.toString(numbers));
    }

    private static void bubbleSort(Integer[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    Integer temp;
                    temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
    }
}
