public class combinations {
    class Solution {
    public void helper(List<List<Integer>> ans,List<Integer> list,int n,int k,int start){
        if(list.size()==k){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=start;i<=n;i++){
            list.add(i);
            helper(ans,list,n,k,i+1);
            //Backtrack
            list.remove(list.size()-1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans=new ArrayList<>();
        helper(ans,new ArrayList<>(),n,k,1);
        return ans;
    }
}
    
}
