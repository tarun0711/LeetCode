class ReShape {
    public int[][] matrixReshape(int[][] mat, int r, int c) 
    {
        if( mat.length * mat[0].length != r*c)
            return mat;
        
        int A[][] = new int [r][c];
        int Rr = 0, Cc=0;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                if(Cc == c)
                {
                    Cc=0;
                    Rr++;
                }
                
                A[Rr][Cc]= mat[i][j];
                Cc++;
            }
        }
        return A;
    }
}