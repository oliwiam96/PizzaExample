public class Slice {

    private int r1; // <r1, r2>
    private int c1; // <c1, c2>
    private int r2;
    private int c2;

    public Slice(int r1, int c1, int r2, int c2) {
        this.r1 = r1;
        this.c1 = c1;
        this.r2 = r2;
        this.c2 = c2;
    }

    public int getR1() {
        return r1;
    }

    public void setR1(int r1) {
        this.r1 = r1;
    }

    public int getC1() {
        return c1;
    }

    public void setC1(int c1) {
        this.c1 = c1;
    }

    public int getR2() {
        return r2;
    }

    public void setR2(int r2) {
        this.r2 = r2;
    }

    public int getC2() {
        return c2;
    }

    public void setC2(int c2) {
        this.c2 = c2;
    }

    private boolean hasNotTooMuch(int H){
        return ((c2-c1+1)*(r2-r1+1)) <= H;
    }
    private boolean hasEnough(Pizza pizza){
        int totalNumberOfMushrooms = 0;
        int totalNumberOfTomatoes = 0;
        for(int i = r1; i <= r2; i++){
            for(int j = c1; j <= c2; j++){
                if(pizza.getAdditions()[i][j] == 'M'){
                    totalNumberOfMushrooms++;
                }
                if(pizza.getAdditions()[i][j] == 'T'){ // else
                    totalNumberOfTomatoes++;
                }
            }
        }

        boolean hasEnoughMushroooms = totalNumberOfMushrooms >= pizza.getL();
        boolean hasEnoughTomatoes = totalNumberOfTomatoes >= pizza.getL();

        return hasEnoughMushroooms && hasEnoughTomatoes;
    }
    public boolean isValid(Pizza pizza){
        return hasNotTooMuch(pizza.getH()) && hasEnough(pizza);
    }
}
