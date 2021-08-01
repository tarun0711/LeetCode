class TrapWater
{
  public int trap(int [] height)
  {
    if(height.length<=0) return 0;
    
    int ans=0;
    int []A = new int [height.length];
    A[0]= height[0];
    for(int i =1;i<height.length;i++)
    {
      if(A[i-1]<height[i])
        A[i]= height[i];
      else
        A[i]=A[i-1];
    }
    
    int []B = new int [height.length];
    B[height.length-1]= height[height.length-1];
    for(int i =height.length-2;i>=0;i--)
    {
      if(B[i+1]<height[i])
        B[i]= height[i];
      else
        B[i]=B[i+1];
    }
    
    for(int i =0;i<height.length;i++)
    {
      int min = Math.min(A[i],B[i]);
      if(min==0)
        continue;
      else
        ans = ans+(min-height[i]);
    }
    
    return ans;
  }
}
