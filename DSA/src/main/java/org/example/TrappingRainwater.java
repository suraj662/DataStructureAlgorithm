package org.example;

//Input : height = [0,1,0,2,1,0,1,3,2,1,2,1]
//Output : 6
//Explanation : Water is trapped in the dips between bars.
// The total trapped water units add up to 6 (1+1+2+1+1).
//
//Input : height = [4,2,0,3,2,5]
//Output : 9
//Explanation : The elevation map traps 9 units of water in total,
// as water fills the spaces between higher bars on both sides.

public class TrappingRainwater {

    //brute
    public static int trap(int[] height) {
        int n = height.length;

        int trapWater = 0;

        for (int i = 0; i < n; i++) {
            int maxLeft = 0;
            int maxRight = 0;

            //find maxleft
            for (int j = 0; j <= i; j++) {
                if (height[j] > maxLeft) {
                    maxLeft = height[j];
                }
            }
            //find maxRight
            for (int j = i; j < n; j++) {
                if (height[j] > maxRight) {
                    maxRight = height[j];
                }
            }
            //water trapped
            trapWater += Math.min(maxLeft ,maxRight) - height[i];
        }
        return trapWater;
    }

    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int result = trap(height);
        System.out.println(result);

        System.out.println("-------------------------");
        trap1 t = new trap1();
        int result1 = t.trap11(height);
        System.out.println(result1);
    }

}

//find trap water using Binary search
class trap1 {
    public int trap11(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n - 1;

        int maxLeft = 0;
        int maxRight = 0;
        int trapWater = 0;

        while (left < right) {
            if (height[left] <= height[right]) {
                if (height[left] >= maxLeft) {
                    maxLeft = height[left];
                } else {
                    trapWater += maxLeft - height[left];
                }
                left++;
            } else {
                if (height[right] >= maxRight) {
                    maxRight = height[right];
                } else {
                    trapWater += maxRight - height[right];
                }
                right--;
            }
        }
        return trapWater;
    }
}

//better approach
class trapWater2 {
    public static int trap(int[] height) {
        // Edge case: empty or single element array
        if (height == null || height.length == 0) {
            return 0;
        }

        int left = 0;                    // Left pointer
        int right = height.length - 1;   // Right pointer
        int leftMax = 0;                 // Max height seen from left
        int rightMax = 0;                // Max height seen from right
        int trapWater = 0;               // Total trapped water

        // Move pointers towards each other
        while (left < right) {

            // Update max heights from both sides
            leftMax = Math.max(leftMax, height[left]);
            rightMax = Math.max(rightMax, height[right]);

            // Process the side with smaller max height
            if (leftMax < rightMax) {
                // Water at left position is determined by leftMax
                trapWater += leftMax - height[left];
                left++;  // Move left pointer forward
            } else {
                // Water at right position is determined by rightMax
                trapWater += rightMax - height[right];
                right--; // Move right pointer backward
            }
        }

        return trapWater;
    }

    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int result = trap(height);
        System.out.println("Trapped Water: " + result);  // Output: 6

        // Test case 2
        int[] height2 = {4,2,0,3,2,5};
        int result2 = trap(height2);
        System.out.println("Trapped Water: " + result2); // Output: 9
    }
}
