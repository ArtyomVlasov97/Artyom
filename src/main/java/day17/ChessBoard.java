package day17;

import java.util.Arrays;

public class ChessBoard {
    private ChessPiece[][] che;
    public ChessBoard(ChessPiece[][] chessPiece){
        this.che = chessPiece;
    }
    public void print(){
//       for(int i = 0; i<che.length; i++){
//           System.out.println(Arrays.toString(che[i]));
        for(int i = 0; i<che.length; i++){
            for (int j = 0; j<che[i].length; j++){
                System.out.print(che[i][j]);
            }
            System.out.println();
       }
    }
}
