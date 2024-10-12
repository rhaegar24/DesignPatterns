package org.lld.Chess;

public class Rook extends Piece {

  Rook(PieceColor color) {
    this.color = color;
  }

  @Override
  public boolean canMove(Board board, Cell x, Cell y) {
    return false;
  }
}
