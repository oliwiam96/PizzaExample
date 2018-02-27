public class Output {
    private int numberOfSlices;
    private String linesDescribingSlices;

    public int getNumberOfSlices() {
        return numberOfSlices;
    }

    public void setNumberOfSlices(int numberOfSlices) {
        this.numberOfSlices = numberOfSlices;
    }

    public String getLineDescribingSlices() {
        return linesDescribingSlices;
    }

    public void setLineDescribingSlices(String linesDescribingSlices) {
        this.linesDescribingSlices = linesDescribingSlices;
    }

    public void parse(Pizza pizza){
        numberOfSlices = pizza.getListOfSlices().size();
        for(Slice slice : pizza.getListOfSlices()){
            linesDescribingSlices += slice.getR1() + " "
                    + slice.getC1() + " "
                    + slice.getR2() + " "
                    + slice.getC2() + "\n";
        }
    }
}
