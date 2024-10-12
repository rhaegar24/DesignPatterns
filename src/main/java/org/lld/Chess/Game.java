package org.lld.Chess;

public class Game {

  Board board;
  Player player1, player2;

  Game(Player player1, Player player2) {
    board = new Board();
    board.initializeBoard();

    this.player1 = player1;
    this.player2 = player2;
  }

  void makeMove(Player player, int x1, int y1, int x2, int y2){
      //keep validations here like coordinates are out of bound or not

      Cell x = board.cells[x1][y1];
      Cell y = board.cells[x2][y2];

      Piece piece = x.piece;

      if(piece.getPieceColor().equals(player.color)){
          if(piece.canMove(board, x, y)){
              x.piece = null;
              if (y.piece!=null){
                  y.piece.setKilled();
              }
              y.piece = piece;
          }
      }
  }
}
