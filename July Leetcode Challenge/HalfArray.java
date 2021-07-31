import java.util.*;
class HalfArray {
    public int minSetSize(int[] arr) 
    {
        
        Map<Integer, Integer> map = new HashMap<>();
        for(int i =0;i<arr.length;i++)
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        
        List<Integer> lst= new ArrayList<>(map.values());
        Collections.sort(lst,Collections.reverseOrder());
        
        int i=0,c=0,total=0;
        
        while(total<arr.length/2)
        {
            total+=lst.get(i);
            i++;
            c++;
        }
        
        return c;
    }
}
