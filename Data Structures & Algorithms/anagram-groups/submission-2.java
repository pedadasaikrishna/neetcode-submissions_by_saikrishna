class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs) {

            char[] arr = str.toCharArray();
            Arrays.sort(arr);

            String base = new String(arr);

            if (map.containsKey(base)) {
                map.get(base).add(str);
            } else {
                map.put(base, new ArrayList<>());
                map.get(base).add(str);
            }
        }

        return new ArrayList<>(map.values());
    }
}