package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {

    public static void main(String[] args) {
        int[] b = {1, 3, 7, 8};
        int[][] a = {{1481122000, 1481122020}, {1481122000, 1481122040},{1481122030,1481122035}};
        howManyAgentsToAdd(1, a);
    }

    static int kDifference(int[] a, int k) {
        Arrays.sort(a);
        int count = 0;
        int n = a.length;
        int l = 0;
        int r = 0;
        while (r < n) {
            if (a[r] - a[l] == k) {
                count++;
                l++;
                r++;
            } else if (a[r] - a[l] > k)
                l++;
            else
                r++;
        }
        return count;
    }

    static int[] mergeArrays(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {

            if (a[i] < b[j])
                result[k++] = a[i++];
            else
                result[k++] = b[j++];
        }

        while (i < a.length)
            result[k++] = a[i++];

        while (j < b.length)
            result[k++] = b[j++];

        return result;
    }

    static int[] counts(int[] nums, int[] maxes) {
        int[] tempResult = new int[nums[nums.length - 1]];
        int[] result = new int[maxes.length];
        Arrays.sort(nums);
        int count = 0;
        for (int i = 0; i < nums[nums.length - 1] + 1; i++) {
            tempResult[i] = count;
            count++;
        }
        for (int i = 0; i < maxes.length; i++) {
            if (maxes[i] < tempResult.length)
                result[i] = tempResult[maxes[i] - 1] + 1;
            else
                result[i] = tempResult[tempResult.length - 1] + 1;
        }
        return result;
    }

    static int[] csounts(int[] nums, int[] maxes) {
        Arrays.sort(nums);

        Arrays.sort(maxes);
        int count = 0;
        ArrayList<Integer> result = new ArrayList<>();
        int j = 0;
        for (int i = 0; i < maxes.length; i++) {
            int lastAppers = 0;
            for (; j < nums.length; j++) {
                if (nums[j] <= maxes[i]) {
                    count++;
                } else {
                    break;
                }
            }
            result.add(count);
        }
        int[] resultArray = convertIntegers(result);
        Arrays.sort(resultArray);
        return resultArray;
    }

    public static int[] convertIntegers(List<Integer> integers) {
        int[] ret = new int[integers.size()];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = integers.get(i).intValue();
        }
        return ret;
    }

    static int[] delta_encode(int[] array) {
        ArrayList<Integer> res = new ArrayList<>();

        res.add(array[0]);

        for (int i = 1; i < array.length; i++) {
            int diff = array[i] - array[i - 1];
            if (-127 >= diff) {
                res.add(-128);
            } else if (diff >= 127) {
                res.add(-128);
            }
            res.add(diff);
        }
        int[] resArray = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            resArray[i] = res.get(i);
        }
        return resArray;
    }

    static int howManyAgentsToAdd(int noOfCurrentAgents, int[][] callsTimes) {
        int numberOfOverLabs = 0;
        for (int i = 0; i < callsTimes.length; i++) {
            int curentStart = callsTimes[i][0];
            int curentEnd = callsTimes[i][1];
            for (int j = i + 1; j < callsTimes.length; j++) {
                int nextStart = callsTimes[j][0];
                int nextEnd = callsTimes[j][i];

                if(curentStart <= nextStart || curentEnd >= nextEnd ){
                    numberOfOverLabs++;
                }
            }
            System.out.println();
        }
        return numberOfOverLabs;
    }

}
