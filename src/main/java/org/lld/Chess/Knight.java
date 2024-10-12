package org.lld.Chess;

public class Knight extends Piece {

  Knight(PieceColor color) {
    this.color = color;
  }

  @Override
  public boolean canMove(Board board, Cell x, Cell y) {
    if (x.piece.getPieceColor().equals(y.piece.getPieceColor())) return false;

    int x1 = Math.abs(x.x - y.x);
    int y1 = Math.abs(x.y - y.y);
    return x1 * y1 == 2;
  }
}
