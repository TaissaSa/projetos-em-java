package q2;
public class MMThread extends Thread{

    private int mat[][];
    private int col;

    public MMThread(int[][] mat, int col) {
        this.mat = mat;
        this.col = col;
    }

    @Override
    public void run() {
        for(int i = 0; i < mat.length/2; i++) {
            int aux = mat[i][col];
            mat[i][col] = mat[mat.length-i-1][col];
            mat[mat.length-i-1][col] = aux;
        }
    }
}