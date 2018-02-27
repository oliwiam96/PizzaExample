import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private int R; // number of rows
    private int C; // number of columns
    private int L; // the minimum number of each ingredient cells in a slice
    private int H; // the maximum total number of cells of a slice
    private List<Slice> listOfTempSlices = new ArrayList<Slice>();
    private List<Slice> listOfSlices = new ArrayList<Slice>();
    private boolean isCellIncluded[][];
    private char[][] additions;

    public Pizza(int R, int C, int L, int H, char[][] additions) {
        this.R = R;
        this.C = C;
        this.L = L;
        this.H = H;
        this.isCellIncluded = new boolean[R][C];
        this.additions = additions;
    }

    public int getR() {
        return R;
    }

    public void setR(int r) {
        R = r;
    }

    public int getC() {
        return C;
    }

    public void setC(int c) {
        C = c;
    }

    public int getL() {
        return L;
    }

    public void setL(int l) {
        L = l;
    }

    public int getH() {
        return H;
    }

    public void setH(int h) {
        H = h;
    }

    public List<Slice> getListOfSlices() {
        return listOfSlices;
    }

    public void setListOfSlices(List<Slice> listOfSlices) {
        this.listOfSlices = listOfSlices;
    }

    public List<Slice> getListOfTempSlices() {
        return listOfTempSlices;
    }

    public void setListOfTempSlices(List<Slice> listOfTempSlices) {
        this.listOfTempSlices = listOfTempSlices;
    }

    public void addTempSlice(Slice slice){
        listOfTempSlices.add(slice);
    }


    public char[][] getAdditions() {
        return additions;
    }

    public void setAdditions(char[][] additions) {
        this.additions = additions;
    }

    private void setCellsIncludedForSlice(Slice slice){
        for(int i = slice.getR1(); i <= slice.getR2(); i++){
            for(int j = slice.getC1(); j <= slice.getC2(); j++){
                isCellIncluded[i][j] = true;
            }
        }
    }

    public void addSlice(Slice slice){
        listOfSlices.add(slice);
        setCellsIncludedForSlice(slice);
    }
}
