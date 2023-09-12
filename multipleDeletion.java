import java.util.HashSet;
import java.util.Set;

public class multipleDeletion {
    class Solution {
    public int minDeletions(String s) {
        // Create an array to store character frequencies (one for each letter of the alphabet)
        int[] charFrequency = new int[26];
        
        // Create a set to keep track of existing frequencies in the new string
        Set<Integer> existingFrequencies = new HashSet<>();
        
        // Count character frequencies
        for (char c : s.toCharArray()) {
            charFrequency[c - 'a']++;
        }
        
        int deletions = 0 ;

        // Iterate through the sorted frequencies in reverse order
        for(int i = 0; i < charFrequency.length ; i ++){
            int curFreq = charFrequency[i] ;
            
            // Adjust frequency if it already exists in the new string
            while(curFreq > 0 && existingFrequencies.contains(curFreq)){
                deletions ++ ;
                curFreq -- ;
            }
            
            // Add the adjusted frequency to the set
            existingFrequencies.add(curFreq) ;
        }

        return deletions;
    }
}
}
