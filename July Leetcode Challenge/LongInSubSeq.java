import java.util.*;
class LongInSubSeq
{
  public int lengthOfLIS(int[] nums)
  {
    TreeSet<Integer> bst = new TreeSet<>();
    for(int num : nums)
    {
      Integer highOrEqual = bst.ceiling(num);
      if( highOrEqual == null )
        bst.add(num);
      else
      {
        bst.remove(highOrEqual);
        bst.add(num);
      }
    }
    return bst.size();
  }
}