class Solution {
    public boolean isAnagram(String s, String t) {
        int[] arr = new int[26];
        if(s.length()!=t.length()){
            return false;
        }
        else{
            for(int i = 0; i<s.toCharArray().length; i++){
                char m = s.toCharArray()[i];
                arr[m-'a']++;
            }
            for(int i = 0; i<t.toCharArray().length; i++){
                char m = t.toCharArray()[i];
                arr[m-'a']--;
            } 
            return Arrays.equals(arr, new int[26]);
        }
       
        
        
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
