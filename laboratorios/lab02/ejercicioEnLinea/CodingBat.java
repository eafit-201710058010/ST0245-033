
/**
 * Write a description of class CodingBat here.
 * 
 * @Gonzalo Garcia Hernandez
 * @Sebastián Henao Zapata
 * @version (a version number or a date)
 */
public class CodingBat
{
    public int countEvens(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] % 2 == 0){
                count++;
            }
        }
        return count;
    }
    
    public int sum13(int[] nums) {
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 13){ 
                total += nums[i];
            }
            else if (i <= nums.length - 1) i++;
        }
        return total;
    }

    public int[] evenOdd(int[] nums) {
      int[] res = new int[nums.length];
      int evenPos = 0;
      int oddPos  = res.length - 1;
      for (int i = 0; i < nums.length; i++){
          if (nums[i] % 2 == 0){
              res[evenPos++] = nums[i];
          }
          else
          res[oddPos--]  = nums[i];
      }
      return res;
    }

    public int[] notAlone(int[] nums, int val) {
      for (int i = 1; i < nums.length - 1; i++){
          if (nums[i] == val && nums[i - 1] != val && nums[i + 1] != val){
              nums[i] = Math.max(nums[i - 1], nums[i + 1]);
            }
      }
      return nums;
    }

    public int matchUp(int[] nums1, int[] nums2) {
        int count = 0;
        for (int i = 0; i < nums1.length; i++){
            if (nums1[i] != nums2[i] && Math.abs(nums1[i] - nums2[i]) <= 2){
                count++;
            }
        }
        return count;
    }
    
    public int[] fix34(int[] nums) {
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 3) {
                int temp = nums[i + 1];
                nums[i + 1] = 4;
                for (int j = i + 2; j < nums.length; j++){
                    if (nums[j] == 4){
                        nums[j] = temp;
                    }
                }
            }
        }
        return nums;
    }

    public int maxSpan(int[] nums) {
        int span = 0;
        int tmp = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    tmp = j-i+1;
                    span = Math.max(tmp,span);
                }
            }
        }
        return span;
    }

    public int[] seriesUp(int n) {
        int[] result = new int[n * (n + 1) / 2];
        int i = 0;
        for (int j = 1; j <= n; ++j){
            for (int k = 1; k <= j; ++k){
                result[i++] = k;
            }
        }
        return result;
    }

    public boolean canBalance(int[] nums) {
        int lSum = 0;
        for (int i = 0; i < nums.length; i++) {
            lSum += nums[i];
            int rSum = 0;
            for (int j = nums.length-1; j > i; j--) {
                rSum += nums[j];
            }
            if (rSum == lSum){
                return true;
            }
        }
        return false;
    }

    public int countClumps(int[] nums) {
        boolean match = false;
        int count = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == nums[i+1] && !match) {
                match = true;
                count++;
            }
            else if (nums[i] != nums[i+1]) {
                match = false;
            }
        }
        return count;
    }

}
