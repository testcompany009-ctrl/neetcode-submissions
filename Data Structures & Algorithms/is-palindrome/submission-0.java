class Solution {
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;
       while(l < r){
    // skip non-alphanumeric from left
    while(l < r && !Character.isLetterOrDigit(s.charAt(l))){
        l++;
    }
    // skip non-alphanumeric from right
    while(l < r && !Character.isLetterOrDigit(s.charAt(r))){
        r--;
    }
    // now compare
    if(Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))){
        return false;
    }
    l++;
    r--;
}
return true;
    }
}
