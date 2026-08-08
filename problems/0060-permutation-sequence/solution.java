import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String getPermutation(int n, int k) {
        int fact = 1;
        List<Integer> numbers = new ArrayList<>();
        
        // Calculate (n-1)! and populate the list of numbers [1, 2, ..., n]
        for (int i = 1; i < n; i++) {
            fact *= i;
            numbers.add(i);
        }
        numbers.add(n); // Add the last number
        
        // Convert to 0-indexed for easier mathematical calculation
        k = k - 1;
        StringBuilder result = new StringBuilder();
        
        // Mathematically determine each digit
        while (true) {
            // Find the index of the current digit
            int index = k / fact;
            result.append(numbers.get(index));
            
            // Remove the used digit from the list
            numbers.remove(index);
            
            // If no numbers are left, the permutation is complete
            if (numbers.isEmpty()) {
                break;
            }
            
            // Update k and calculate the next factorial block size
            k = k % fact;
            fact = fact / numbers.size();
        }
        
        return result.toString();
    }
}

