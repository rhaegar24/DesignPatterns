package org.lld.Chess;

public class Bishop extends Piece {

  PieceColor color;

  Bishop(PieceColor color) {
    this.color = color;
  }

  @Override
  public boolean canMove(Board board, Cell x, Cell y) {
    return false;
  }
}
