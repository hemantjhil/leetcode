/*Given an array of strings, group anagrams together.

Example:

Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
Output:
[
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]
*/



class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //List<List<String>> l=new List<List<>>();
        Map<String,List> h=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] c=strs[i].toCharArray();
            Arrays.sort(c);
            String s=new String(c);
            if(!h.containsKey(s)){
                h.put(s,new ArrayList());
            }
            h.get(s).add(strs[i]);
        }
        return new ArrayList(h.values());
    }
}
