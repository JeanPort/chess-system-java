package application;

import boardgame.Position;
import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {

		Position position = new Position(5, 10);
		
		ChessMatch chessMatch = new ChessMatch();
		
		UI.printBoard(chessMatch.getPieces());

	}

}
