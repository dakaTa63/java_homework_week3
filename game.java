import java.util.Scanner;

public class game{

    public static void main(String[] args) {

        int rows = 6;
        int columns = 6;

        String[][] board = new String[rows][columns];
        int counter = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                board[i][j] = String.valueOf(counter) + " -x-";
                counter++;
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if(board[i][j].equals("1 -x-")){
                    System.out.print("Wdw");
                }else System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

}