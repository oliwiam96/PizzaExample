import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class PizzaCutter {

    private Pizza pizza;
    private Output output;

    public void readInputData(){
        // TODO
        try {
            Scanner in = new Scanner(new FileReader("example.in"));
            int R = in.nextInt();
            int C = in.nextInt();
            int L = in.nextInt();
            int H = in.nextInt();
            char[][] additions = new char[R][C];
            System.out.println("R:" + R + " C:" + C + " L:" + L + " H:" + H );
            in.nextLine();
            for (int i = 0; i < R; i++) {
                String line = in.nextLine();
                System.out.println(line);
                for (int j = 0; j < C; j++) {
                    additions[i][j] = line.charAt(j);
                }
            }
            pizza = new Pizza(R, C, L, H, additions);
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }

    private void cutPizzaIn1x1Slices(){
        for(int i = 0; i < pizza.getR(); i++){
            for(int j = 0; j < pizza.getC(); j++){
                Slice slice = new Slice(i, j, i, j);
                pizza.addTempSlice(slice);
            }
        }
    }

    private void extendSlices(){
        for(Slice slice : pizza.getListOfTempSlices()) {
            // TODO
        }

    }

    private void writeOutputData(){
        output = new Output();
        output.parse(pizza);
        // TODO

    }

    public void solveProblem(){
        readInputData();
        cutPizzaIn1x1Slices();
        extendSlices();
        writeOutputData();
    }


}
