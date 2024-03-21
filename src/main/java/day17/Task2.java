package day17;

public class Task2 {
    public static void main(String[] args) {
        ChessPiece[][] chess = new ChessPiece[8][8];
ChessBoard ches = new ChessBoard(chess);
ChessPiece kingWhite = ChessPiece.KING_WHITE;
ChessPiece kingBlack = ChessPiece.KING_BLACK;

ChessPiece queenWhite = ChessPiece.QUEEN_WHITE;
ChessPiece queenBlack = ChessPiece.QUEEN_BLACK;

ChessPiece rookWhite = ChessPiece.ROOK_WHITE;
ChessPiece rookBlack = ChessPiece.ROOK_BLACK;

ChessPiece bishopWhite = ChessPiece.BISHOP_WHITE;
ChessPiece bishopBlack = ChessPiece.BISHOP_BLACK;

ChessPiece knightWhite = ChessPiece.KNIGHT_WHITE;
ChessPiece knightBlack = ChessPiece.KNIGHT_BLACK;

ChessPiece pawnWhite = ChessPiece.PAWN_WHITE;
ChessPiece pawnBlack = ChessPiece.PAWN_BLACK;

ChessPiece empty = ChessPiece.EMPTY;

chess[0][0] = rookBlack;
chess[0][1] = empty;
chess[0][2] = empty;
chess[0][3] = empty;
chess[0][4] = empty;
chess[0][5] = rookBlack;
chess[0][6] = kingBlack;
chess[0][7] = empty;

chess[1][0] = empty;
chess[1][1] = rookWhite;
chess[1][2] = empty;
chess[1][3] = empty;
chess[1][4] = pawnBlack;
chess[1][5] = pawnBlack;
chess[1][6] = empty;
chess[1][7] = pawnBlack;

chess[2][0] = pawnBlack;
chess[2][1] = empty;
chess[2][2] = knightBlack;
chess[2][3] = empty;
chess[2][4] = empty;
chess[2][5] = empty;
chess[2][6] = pawnBlack;
chess[2][7] = empty;

chess[3][0] = queenBlack;
chess[3][1] = empty;
chess[3][2] = empty;
chess[3][3] = bishopWhite;
chess[3][4] = empty;
chess[3][5] = empty;
chess[3][6] = empty;
chess[3][7] = empty;

chess[4][0] = empty;
chess[4][1] = empty;
chess[4][2] = empty;
chess[4][3] = bishopBlack;
chess[4][4] = pawnWhite;
chess[4][5] = empty;
chess[4][6] = empty;
chess[4][7] = empty;

chess[5][0] = empty;
chess[5][1] = empty;
chess[5][2] = empty;
chess[5][3] = empty;
chess[5][4] = bishopWhite;
chess[5][5] = pawnWhite;
chess[5][6] = empty;
chess[5][7] = empty;

chess[6][0] = pawnWhite;
chess[6][1] = empty;
chess[6][2] = empty;
chess[6][3] = queenWhite;
chess[6][4] = empty;
chess[6][5] = pawnWhite;
chess[6][6] = empty;
chess[6][7] = pawnWhite;

chess[7][0] = empty;
chess[7][1] = empty;
chess[7][2] = empty;
chess[7][3] = empty;
chess[7][4] = empty;
chess[7][5] = rookWhite;
chess[7][6] = kingWhite;
chess[7][7] = empty;

ches.print();
    }
}
