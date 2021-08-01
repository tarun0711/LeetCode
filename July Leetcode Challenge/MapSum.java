import java.util.*;
public class MapSum 
{
    Map<String,Integer> map = new HashMap<>();

    public MapSum()
    {
        map = new HashMap<>();
    }
    
    public void insert(String key, int val)
    {
        map.put(key,val);
    }

    public int sum(String prefix) 
    {
        int total =0;
        for(Map.Entry<String,Integer> entry : map.entrySet())
        {
            if(entry.getKey().startsWith(prefix))
                total+=entry.getValue();
        }

        return total;
    }
}
