class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        ans=defaultdict(list)
        for i in strs:
            ss=''.join(sorted(i))
            ans[ss].append(i)
        return list(ans.values())