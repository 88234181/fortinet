// 2. Sum of multidimensional Array. require no extra space, no recursion. 
class MultiDimensionArray {
	// This is a provided function, Assume it works
	public static Long getValue(int... indexOfDimension) {
		//... 
		return value;
	}
	// lengthOfDeminsion: each dimension's length, assume it is valid: lengthOfDeminsion[i]>0.
	public static Long sum(MultiDimensionArray mArray, int[] lengthOfDeminsion) { 
		// Your resolution 
		int n = lengthOfDimension.Length; // get the number of dimension
		int[] tuple = new int[n]; // all zeroes, create an array to present the index of the multi-dimension array
		int at = n-2; // Pointer to modify the tuple
		Long sum = 0;
		while(at >= 0)
		{
			// Loop the iterate the lowest array
			for (tuple[n-1] = 0; tuple[n-1] < lengthOfDimension[n-1]; tuple[n-1]++) sum += getValue(tuple);
			
			// Loop to update the index of the array 
			while (at >= 0 && ++tuple[at] == lengthOfDimension[at]) tuple[at--] = 0;
			if (at >= 0) at = n-2; // Reset the pointer
		}
		return sum;
    }
}
// Time complexity: O(product of dimension length)
// Space complexity: O(n)