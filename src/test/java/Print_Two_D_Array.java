public class Print_Two_D_Array {

    public static void main(String[] args) {
        int mat[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 } };
        print2d(mat);


    }

    public static void print2d(int mat[][]){
        for (int i=0;i<mat.length;i++){
for(int j=0;j<mat[i].length;j++){

    System.out.print(mat[i][j]+" ");



}
        }




    }





}
