class NumMatrix {
    int [][] arr;
    public NumMatrix(int[][] matrix) {
        this.arr = matrix; 
    }
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int res =0;
        for(int i =row1; i<= row2;i++){
            for(int j =col1 ;j<=col2;j++){
                res+=arr[i][j];
            }
        }
        return res;
    }
}