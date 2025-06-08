import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Array{

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> tracker = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            tracker.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            if(tracker.containsKey(target - nums[i]) && tracker.get(target - nums[i]) != i)
                return new int[] {i, tracker.get(target - nums[i])};
        }
        return new int[]{-1, -1};
    }

    public static void nextPermutation(int[] nums) {
        int pt = -1;
        for(int i = nums.length - 2; i >= 0; i--) {
            if(nums[i]  < nums[i + 1]) {
                pt = i;
                break;
            }
        }
        if(pt == -1) {
            reverseArray(nums, 0);
            return;
        }
        for(int i = nums.length - 1; i > pt; i--) {
            if(nums[i] > nums[pt]) {
                int temp = nums[i];
                nums[i] = nums[pt];
                nums[pt] = temp;
                break;
            }
        }
        reverseArray(nums, pt + 1);
    }

    public static void reverseArray(int[] arr, int start) {
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++) {
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            int l = i + 1;
            int r = nums.length - 1;
            while(l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if(sum > 0) r--;
                if(sum < 0) l++;
                if(sum == 0) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[l]);
                    temp.add(nums[r]);
                    ans.add(temp);
                    l++;
                    r--;
                    while (l < r && nums[l] == nums[l - 1]) {
                        l++; 
                    }
                }
            }
        }
        return ans;
    }

    public int buyAndSellStock(int[] prices) {
        int max = 0;
        int left = 0;
        int right = 0;
        while (right < prices.length) {
            if(prices[right] - prices[left] < 0) {
                left++;
                continue;
            }
            int profit = prices[right] - prices[left];
            if(profit > max) 
                max = profit;
            right++;
        }
        return max;
    }

    public static int kadanesAlgorithm(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if(sum > max) {
                max = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    public static boolean containsDuplicate(int[] nums) { 
        Set<Integer> tracker = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(tracker.contains(nums[i])) return true;
            tracker.add(nums[i]);
        }
        return false;
    }

    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> tracker = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(tracker.containsKey(nums[i])) {
                tracker.put(nums[i], tracker.get(nums[i]) + 1);
            } else {
                tracker.put(nums[i], 1);
            }
        }
        for(int num : nums) {
            if(tracker.get(num) > nums.length / 3 && !ans.contains(num)) {
                ans.add(num);
            }
        }
        return ans;
    }
}

