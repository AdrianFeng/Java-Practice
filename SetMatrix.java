 class Solution {
    static void setZeroes(int[][] matrix) {
        int l1 = matrix.length;
        if (l1==0){
            return;
        }
        int l2= matrix[0].length;
        boolean FirstRow=false;
        boolean FirstColumn=false;
        for (int i=0;i<l1;i++){
            if (matrix[i][0] ==0){
                FirstColumn=true;
                break;
            }
        }
        for (int i=0;i<l2;i++){
            if (matrix[0][i] ==0){
                FirstRow=true;
                break;
            }
        }
        for (int i =1 ; i<l1;i++){
            for (int j=1; j<l2;j++){
                if (matrix[i][0]==0 &&  matrix[0][j] == 0){
                    continue;
                }
                else if (matrix[i][j] ==0 ){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
                else {
                    continue;
                }
            }
        }
        for (int i =1 ; i<l1;i++){
            if (matrix[i][0]==0){
                for (int j=1;j<l2;j++){
                    matrix[i][j]=0;
                }
            }
        }
        for (int i =1 ; i<l2;i++){
            if (matrix[0][i]==0){
                for (int j=1;j<l1;j++){
                    matrix[j][i]=0;
                }
            }
        }
        if (FirstRow){
            for (int i=0;i<l2;i++){
                matrix[0][i]=0;
            }
        }
        if (FirstColumn){
            for (int i=0;i<l1;i++){
                matrix[i][0]=0;
            }
        }
        return;
    }
}
class SetMatrix{
    public static void main(String[] args){
	//int[][] newone ={{0,1,1},{1,2,3},{1,2,0}};
	int[][] newone={{1,2,3,4,5,6,7,8,9,0},{1,2,3,4,5,6,7,8,9,0},{1,2,3,4,5,6,7,8,9,10}};
	Solution.setZeroes(newone);
	for (int i=0;i<newone.length;i++){
	    for (int j=0;j<newone[0].length;j++)
		System.out.print(newone[i][j]+" ");
	    System.out.println();
	}
	
    }
}