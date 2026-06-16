class Solution {
    public boolean isAnagram(String s, String t) {
        int[] count = new int[26];
        if(s.length()!=t.length()){
            return false;
        }
        else{
            for(int i = 0; i<s.toCharArray().length; i++){
                char c = s.toCharArray()[i];
                count[c - 'a']++;
            }
             for(int i = 0; i<t.toCharArray().length; i++){
                char c = t.toCharArray()[i];
                count[c - 'a']--;
            }
           
        }
         return Arrays.equals(count, new int[26]);
        
        
        // char[] arr1 = s.toCharArray();
        // char[] arr2 = t.toCharArray();
        // Arrays.sort(arr1);
        // Arrays.sort(arr2);
        // if(Arrays.equals(arr1,arr2)){
        //     return true;
        // }
        // else{
        //     return false;}
    }
}
