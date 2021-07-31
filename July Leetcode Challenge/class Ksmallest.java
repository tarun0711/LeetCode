import java.util.*;
class Ksmallest {
    public int kthSmallest(int[][] matrix, int k)
    {
        
        ArrayList<Integer> lst = new ArrayList<>();
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                lst.add(matrix[i][j]);
            }
        }
        Collections.sort(lst);
        return lst.get(k-1);
        
    }
}