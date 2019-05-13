package sort;



import java.util.LinkedList;
import java.util.Queue;

public class RadixSort implements Solution {
    @Override
    public int[] sort(int[] num) {
        
        int max = num[0], count = 0;
        for (int i = 1; i < num.length; i++) {
            if (num[i] > max)
                max = num[i];
        }

        for (; max > 0; max /= 10)
            count++;

        radixSort(num, count);
        return num;
    }

    private void radixSort(int[] num, int count) 
}