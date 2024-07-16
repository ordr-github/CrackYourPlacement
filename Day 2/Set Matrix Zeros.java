class Solution {
    public void setZeroes(int[][] matrix) {
        int col0 = 1;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    matrix[i][0] = 0;
                    if(j!=0) matrix[0][j] = 0;
                    else col0 = 0;
                }
            }
        }

        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[0].length;j++){
                if(matrix[i][0]==0||matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        }
        if(matrix[0][0]==0){
            for(int k=1;k<matrix[0].length;k++){
                matrix[0][k] = 0;
            }
        }
        if(col0==0){
            for(int l=0;l<matrix.length;l++){
                matrix[l][0] = 0;
            }
        }
        
        
    }
}