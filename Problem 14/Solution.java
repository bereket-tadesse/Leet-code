class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        // after sorting we only need to compare first and last for common prefix since in asecinding.

        Arrays.sort(strs);

        StringBuilder common = new StringBuilder();

        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length-1].toCharArray(); 


        for (int i = 0 ; i < first.length ; i++ ) {
            if (first[i] != last [i]){
                break;
            }
            common.append(first[i]);
        }

        return common.toString();

    }
}