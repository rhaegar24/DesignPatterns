package org.lld.Chess;

public class Pawn extends Piece {

  Pawn(PieceColor color) {
    this.color = color;
  }

  @Override
  public boolean canMove(Board board, Cell x, Cell y) {
    return false;
  }
}
