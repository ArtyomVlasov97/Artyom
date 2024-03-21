package day17;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
ChessPiece shape1 = ChessPiece.PAWN_WHITE;
ChessPiece shape2 = ChessPiece.ROOK_BLACK;
String[] strings = new String[8];
for(int i = 0; i<8; i++){
    strings[i] = shape1.getStringValue();
    if(i>=4){
        strings[i] = shape2.getStringValue();
    }
}
        for(String str:strings){
            System.out.print(str + " ");
        }

    }
}