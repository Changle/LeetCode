import java.util.ArrayList;
import java.util.List;


public class Combinations {
	
    public static ArrayList<ArrayList<Integer>> combine(int n, int k) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> temp = new ArrayList<Integer>();
        int current = 0;
        compute(n, k, current, temp, res, 0);
        return res;
    }
    
    public static ArrayList<ArrayList<Integer>> combine(List<Integer> list, int k) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> temp = new ArrayList<Integer>();
        int current = 0;
        compute(list, k, current, temp, res, 0);
        return res;
    }
    
    public static void compute(int n, int k, int current,
            ArrayList<Integer> temp, ArrayList<ArrayList<Integer>> res, int index) {
        if (current > k)
            return;

        if (current == k) {
            ArrayList<Integer> list = new ArrayList<Integer>(temp);
            res.add(list);
            return;
        }

        for (int i = index; i < n; i++) {
            temp.add(i+1);
            compute(n, k, current+1, temp, res, i+1);
            temp.remove(temp.size() - 1);
        }
    }
    
    public static void compute(List<Integer> pool, int k, int current,
            ArrayList<Integer> temp, ArrayList<ArrayList<Integer>> res, int index) {
        if (current > k)
            return;

        if (current == k) {
            ArrayList<Integer> list = new ArrayList<Integer>(temp);
            res.add(list);
            return;
        }

        for (int i = index; i < pool.size(); i++) {
            temp.add(pool.get(i));
            compute(pool, k, current+1, temp, res, i+1);
            temp.remove(temp.size() - 1);
        }
    }
    
    public static void main(String args[])
    {
    	List<Integer> list = new ArrayList<Integer>();
    	list.add(1);
    	list.add(2);
    	list.add(3);
    	list.add(4);
    	//list.add(5);
    	System.out.println(Combinations.combine(list,3));
    }

}
