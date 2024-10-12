package org.lld.Chess;

public class Queen extends Piece {

  Queen(PieceColor color) {
    this.color = color;
  }

  @Override
  public boolean canMove(Board board, Cell x, Cell y) {
    return false;
  }
}
