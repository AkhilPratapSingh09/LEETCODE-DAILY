public class GrpPeople {
    class Solution {
        public List<List<Integer>> groupThePeople(int[] groupSizes) {
              Map<Integer, List<Integer>> grps = new HashMap<>();
              int sz = groupSizes.length;
              List<List<Integer>> res = new ArrayList<>();
              for(int id = 0; id<sz; id++){
                  int grpSz = groupSizes[id];
                  grps.putIfAbsent(grpSz, new ArrayList<>());
                  if(grps.containsKey(grpSz) && grps.get(grpSz).size() == grpSz){
                      res.add(grps.get(grpSz));
                      grps.put(grpSz, new ArrayList<>());
                  }
                  grps.get(grpSz).add(id);
              }
              for(var pr : grps.entrySet()){
                  if(pr.getValue().size() > 0){
                      res.add(pr.getValue());
                  }
              }
              return res;
        }
    }
    
}
