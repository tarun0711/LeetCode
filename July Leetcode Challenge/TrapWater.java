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
    //Stack Approach
//     Stack<Integer> stack = new Stack<Integer>();
        
//         int water =0,i=0;
//         while(i<height.length)
//         {
//             if(stack.isEmpty() || height[i] <= height[stack.peek()])
//                 stack.push(i++);//push curent value of height and increment i 
//             else
//             {
//                 int curr = stack.pop();
//                 if(!stack.empty())
//                 {
//                     int min = Math.min(height[i],height[stack.peek()]);
//                     water = water + (min-height[curr])*(i-stack.peek()-1);
//                 }
//             }
//         }
//         return water;
  }
}
