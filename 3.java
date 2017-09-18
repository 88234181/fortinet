//3. Given a list of numbers, see if you can separate them in to k groups such that each group has the same sum. 
public boolean separate(List<Integer> list, int k){
   // Your resolution 
   
   if(k == 1) return true;
   // Check if the list can be divided into k group
   if(list.size() < k) return false;
   int sum = 0;
   for(n : lsit) sum += n;
   if(sum % k != 0) return false;
   
   int subset = sum /k;
   int[] subsetSum = new int[k];
   boolean[] taken = new boolean[k];

   subsetSum[0] = list.get(list.size()-1);
   taken[list.size()-1] = true;
   if(subset < subsetSum[0]) return false;
   
   // Call recursive method to check K-subsetition condition
   return isSeperatePossible(list, subsetSum, taken, subset, k, list.size(), 0, list.size() - 1);
}

bool isSeperatePossible(List<Integer> list, int[] subsetSum, boolean[] taken, int subset, int k, int n, int curIndex, int limitIndex)
{
    if (subsetSum[curIndex] == subset)
    {
        if (curIndex == k - 2) return true;
 
        // Recursive call for next subsetition
        return isKPartitionPossibleRec(list, subsetSum, taken, subset, k, n, curIndex + 1, n-1);
    }
 
    //  start from limitIndex and include elements into current subsetition
    for (int i = limitIndex; i >= 0; i--)
    {
        // If already taken, continue
        if (taken[i]) continue;
        int tmp = subsetSum[curIndex] + arr[i];
 
        // If temp is less than subset then only include the element and call recursively
        if (tmp <= subset)
        {
            // Mark the element and include into current subsetition sum
            taken[i] = true;
            subsetSum[curIndex] += arr[i];
            boolean next = isSeperatePossible(list, subsetSum, taken, subset, k, n, curIndex, i - 1);
 
            // After recursive call unmark the element and remove from subsetition sum
            taken[i] = false;
            subsetSum[curIndex] -= arr[i];
            if (next)
                return true;
        }
    }
    return false;
}

// Time complexity: O(n^2)
// Space complexity: O(k)
// JUnit test cases 
/*
1. list = {}, k = 1 // false
2. list = {1,2,3} k = 1 // true
3. list = {1,2,3} k = 2 // true
4. list = {1,101} k = 2 // false
5. list = {1,2,4,5,6} k = 3 // true
6. list = {1,2,5,5,6} k = 3 //false
*/