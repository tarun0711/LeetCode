class LongInSubSeq
{
  public int lengthOfLIS(int[] nums)
  {
    TreeNode<Integer> bst = new TreeNode<>();
    for(int num : nums)
    {
      int highOrEqual = bst.ceiling(num);
      if(highOrEqual == null)
        bst.add(num);
      else
      {
        bst.remove(highOrEqual);
        bst.add(num);
      }
    }
    return bst;
  }
}
