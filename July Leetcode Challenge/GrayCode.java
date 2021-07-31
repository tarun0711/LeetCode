import java.util.List;
import java.util.*;
class GrayCode
{
    public List<Integer> grayCode(int n)
    {
        List<Integer> lst = new ArrayList<>();
        lst.add(0);
        lst.add(1);//Since 0 is not a valid input

        int curr = 1;
        for(int i=2;i<=n;i++)
        {
            curr*=2;
            for(int j=lst.size()-1;j>=0;j--)
                lst.add(lst.get(j)+curr);
        }
        return lst;
    }
}