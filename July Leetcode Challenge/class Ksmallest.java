import java.util.*;
class Ksmallest {
    //O(n^2) approach
//     public int kthSmallest(int[][] matrix, int k)
//     {
        
//         ArrayList<Integer> lst = new ArrayList<>();
//         for(int i=0;i<matrix.length;i++)
//         {
//             for(int j=0;j<matrix[0].length;j++)
//             {
//                 lst.add(matrix[i][j]);
//             }
//         }
//         Collections.sort(lst);
//         return lst.get(k-1);
        
//    }
    //O(log(n)) approach
    
    public int kthSmallest(int[][] matrix, int k)
    {
        int low = matrix[0][0], high = matrix[matrix.length-1][matrix.length-1];
        
        while(low<high)
        {
            int mid = low+(high-low)/2;
            int rank = calRank(matrix,mid);
            if(rank<k)
                low= mid+1;
            else
              high=mid;
        }
        return low;
    }
    
    public int calRank(int [][]mat, int r)
    {
        int j=0,i=mat.length-1,count=0;
        
        while(i>=0 && j<mat.length)
        {
            if(mat[i][j]>r) i--;
            
            else
            {
                count= count+i+1;
                j++;
            }
        }
        return count;
    }
    
}
