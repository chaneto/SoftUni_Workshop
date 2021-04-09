package C2_Abstraction_Ex.C5_Jedi_Galaxy;

public class Jedi {
   private int row;
   private int col;
   private int[][] matrixJedi;

    public Jedi(int row, int col) {
        this.row = row;
        this.col = col;
        this.matrixJedi = new  int[row][col];
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public void setMatrixJedi(int[][] matrixJedi) {
        this.matrixJedi = matrixJedi;
    }

    public int[][] getMatrixJedi() {
        return matrixJedi;
    }
}
