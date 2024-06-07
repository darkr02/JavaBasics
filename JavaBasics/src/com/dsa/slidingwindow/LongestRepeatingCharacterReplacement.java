package com.dsa.slidingwindow;

public class LongestRepeatingCharacterReplacement {

	public static void main(String[] args) {
		
		String s = "AABABBAB";
		int k=2;
		System.out.println(characterReplacement(s,k));

	}

	//Time complexity: O(n) because it is a sliding window problem 
	//and we must go through the array only once.

	//Space complexity: O(1) because we used a constant space by working 
	//with an array of 26 spaces which is fixed and independent of the input string ‘s’.
	
	public static int characterReplacement(String s, int k) {
        // Initializing an empty array to store the count of the 
        // characters in the given string s
        int[] arr = new int[26];
        int res = 0;
        int max = 0;

        // The left pointer for the sliding window is l AND r is the 
        // right pointer
        int l = 0;
        for (int r = 0; r < s.length(); r++) {
            // Counting the number of each character in the string s
            arr[s.charAt(r) - 'A']++;

            // Checking the character with max number of occurrence
            max = Math.max(max, arr[s.charAt(r) - 'A']);

            // Now we check if our current window is valid or not
            if (r - l + 1 - max > k) { 
            // this means the no. of replacements is more than
            // allowed (k)
                // Decrementing the count of the character which was 
                // at l because it is no longer in the window
                arr[s.charAt(l) - 'A']--;
                l++;
            }

            // The max our window can be
            res = Math.max(res, r - l + 1);
        }

        return res;
    }
}

