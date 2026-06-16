class Solution {
    public List<List<String>> groupAnagrams(String[] words) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(int i = 0; i<words.length; i++){
            char[] a = words[i].toCharArray();
            Arrays.sort(a);
            String key = new String(a);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(words[i]);
        }
        return new ArrayList<>(map.values());
    }
}
