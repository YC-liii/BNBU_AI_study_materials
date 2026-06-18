

public class PA {

	/**
	 *
	 * 
	 * @param nums - Pointer of an integer type array
	 * @param numsSize - Size of the Array 
	 * @return - return the starting index and end index of the MCS
	 */

    public static int[] maxSubArray(int[] nums, int numsSize) {
		
        /*YOUR CODE HERE.*/
        int maxSum = nums[0];
        int currentSum = nums[0];
        int globalStart = 0;
        int globalEnd = 0;
        int tempStart = 0;

        for (int i = 1; i < numsSize; i++) {
            // Decide whether to activate the new subarray
            if (currentSum + nums[i] > nums[i]) {
                currentSum += nums[i];
            } else {
                currentSum = nums[i];
                tempStart = i;
            }

            // Ensure to select the first solution among multiple solutions.
            if (currentSum > maxSum) {
                maxSum = currentSum;
                globalStart = tempStart;
                globalEnd = i;
            }
        }

        // Reduce the boundary to ensure that the first and last elements are not zero.
        while (globalStart < globalEnd && nums[globalStart] == 0) {
            globalStart++;
        }
        while (globalEnd > globalStart && nums[globalEnd] == 0) {
            globalEnd--;
        }

        return new int[]{globalStart, globalEnd};
    }


    

    public static void main(String[] args) {
		System.out.println("The file name is \"" + args[0] + "\".");
		
		/*YOUR CODE HERE.*/

        try {
            java.io.BufferedReader br = new java.io.BufferedReader(new java.io.FileReader(args[0]));
            String line = br.readLine();
            br.close();
            String[] parts = line.trim().split("\\s+");
            int[] nums = new int[parts.length];
            for (int i = 0; i < parts.length; i++) {
                nums[i] = Integer.parseInt(parts[i]);
            }

            // Apply algorithm
            int[] result = maxSubArray(nums, nums.length);

            java.io.BufferedWriter bw = new java.io.BufferedWriter(new java.io.FileWriter(args[0] + "_out"));
            bw.write(result[0] + " " + result[1]);
            bw.close();
            System.out.println("The calculation is complete. The result is: Starting index =" + result[0] + ", Ending index =" + result[1]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}