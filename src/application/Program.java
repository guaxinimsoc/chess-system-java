package application;

import boardgame.Board;
import chess.ChessMatch;
import chess.Color;
import chess.pieces.King;

public class Program {

	public static void main(String[] args) {
		
		
		ChessMatch chessMatch = new ChessMatch();
		
		UI.printBoard(chessMatch.getPieces());
		
		
		
	}
 
}
