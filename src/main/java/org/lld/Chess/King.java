package org.lld.Chess;

public class King extends Piece {

  King(PieceColor color) {
    this.color = color;
  }

  @Override
  public boolean canMove(Board board, Cell x, Cell y) {
    return false;
  }
}
