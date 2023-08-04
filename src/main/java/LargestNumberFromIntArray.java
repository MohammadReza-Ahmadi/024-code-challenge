import java.util.Arrays;
import java.util.Comparator;

/**179. Largest Number
 Medium
 7.1K
 572
 Companies
 Given a list of non-negative integers nums, arrange them such that they form the largest number and return it.

 Since the result may be very large, so you need to return a string instead of an integer.



 Example 1:

 Input: nums = [10,2]
 Output: "210"
 Example 2:

 Input: nums = [3,30,34,5,9]
 Output: "9534330"


 Constraints:

 1 <= nums.length <= 100
 0 <= nums[i] <= 109
*/

public class LargestNumberFromIntArray {
    public String largestNumber(int[] nums) {
        String[] sorted = new String[nums.length];

        for(int i=0; i < nums.length; i++){
            sorted[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(sorted,comparator);
        String n= "";
        for (int i=0; i < sorted.length; i++){
            n = n + sorted[i];
        }
        return n;
    }

    public Comparator<String> comparator = new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            String a = o1 + o2;
            String b = o2 + o1;
            return Integer.compare(Integer.parseInt(b),Integer.parseInt(a));
        }
    };


}
