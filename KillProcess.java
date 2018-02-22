import java.util.*;

//class KillProcess {
//    public List<Integer> killProcess(List<Integer> pid, List<Integer> ppid, int kill) {
//        if(kill == 0)
//            return pid;
//        List<Integer> ans = new ArrayList<>();
//        ans.add(kill);
//        for (int i = 0; i < pid.size(); i++){
//            if(ppid.get(i) == kill)
//                ans.addAll(killProcess(pid,ppid,pid.get(i)));
//        }
//        return ans;
//    }
//}

class KillProcess {
    public List<Integer> killProcess(List<Integer> pid, List<Integer> ppid, int kill) {
        if (kill == 0)
            return pid;
        Map<Integer, Set<Integer>> map = new HashMap<>();
        for (int i = 0; i < ppid.size(); i++) {
            if (ppid.get(i) > 0) {
                Set<Integer> children = map.get(ppid.get(i));
                if (children == null)
                    children = new HashSet<>();
                children.add(pid.get(i));
                map.put(ppid.get(i), children);
            }
        }
        List<Integer> ans = new ArrayList<>();
        ans.add(kill);
        killUtility(map, kill, ans);
        return ans;
    }

    private void killUtility(Map<Integer, Set<Integer>> map, int kill, List<Integer> ans) {
        if (map.containsKey(kill)) {
            for (Integer child : map.get(kill)) {
                ans.add(child);
                killUtility(map, child, ans);
            }
        }
    }
}