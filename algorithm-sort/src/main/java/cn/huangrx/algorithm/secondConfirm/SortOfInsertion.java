package cn.huangrx.algorithm.secondConfirm;

import java.util.Arrays;

/**
 * 插入排序
 *
 * @author hrenxiang
 * @since 2022-11-20 16:51
 */
public class SortOfInsertion {

    public static void main(String[] args) {
        // 插入排序调用
        int[] insertNums = new int[]{7, 1, 3, 12, 8, 4, 9, 10};
        System.out.println("排序前的顺序是：" + Arrays.toString(insertNums));
        insertSort(insertNums);
        System.out.println("排序后的顺序是：" + Arrays.toString(insertNums));
    }

    /**
     * 插入排序
     */
    private static void insertSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                int temp = nums[i];
                // 先进行交换，交换后i 和 i+1处的值是一样的，这样方便后续给j+1第一次赋值【第一次j+1赋值，值相等不变化，再j--循环】
                nums[i] = nums[i - 1];

                // 只能减1，因为i是从1开始的，如果多减，会造成索引越界
                int j = i - 1;

                // 判断temp是否小于 j索引处的值，第一次起始还是相当于比较的 i与i-1【准确的说是temp 与 i-1】
                while (j >= 0 && temp < nums[j]) {
                    // 第一次交换是没有变化的，后续拿临时存储需要移动的值接着与前面的值比较，如果小于，就用前面的值替换后面的
                    nums[j + 1] = nums[j];
                    j--;
                }

                // 总是会先进行一次 -- 操作（j = i -1 -1），如果只比较了一次加一代表 i-1处的值，如果多次则表示目标处
                nums[j + 1] = temp;
            }

        }
    }
}
