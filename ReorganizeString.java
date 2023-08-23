import java.util.PriorityQueue;

public class ReorganizeString {
    class Solution {
    public String reorganizeString(String s) {
        int chrs[] = new int[26];
        for(var chr : s.toCharArray()){
            chrs[chr- 'a']++;
        }
        PriorityQueue<Pair<Integer, Character>> maxFreq = new PriorityQueue<>((a, b)->(b.getKey() - a.getKey()));
        for(int indx = 0; indx < 26; indx++){
            if(chrs[indx] != 0){
               maxFreq.offer(new Pair<Integer, Character>(chrs[indx], (char)(indx + 'a')));
            }
        }
        StringBuilder res  = new StringBuilder();
        while(maxFreq.size() >= 2){
            var freqPr1 = maxFreq.poll();
            var freqPr2 = maxFreq.poll();
            int freq1 = freqPr1.getKey(), 
            freq2 = freqPr2.getKey();
            res.append(freqPr1.getValue());
            res.append(freqPr2.getValue());
            if(freq1-1 > 0){
               maxFreq.offer(new Pair<Integer, Character>(freq1-1, freqPr1.getValue()));
            }
            if(freq2 - 1 > 0){
                maxFreq.offer(new Pair<Integer, Character>(freq2 - 1, freqPr2.getValue()));
            }

        }
        if(maxFreq.size() > 0){
            var freqPr = maxFreq.poll();
            if(freqPr.getKey() > 1){
                return "";
            }
            res.append(freqPr.getValue());
        }
        return res.toString();
    }
}
}
