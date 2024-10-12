package org.lld.Chess;

public abstract class Piece {

  PieceColor color;

  Boolean killed = Boolean.FALSE;

  abstract boolean canMove(Board board, Cell x, Cell y);

  public PieceColor getPieceColor() {
    return color;
  }

  void setKilled() {
    this.killed = Boolean.TRUE;
  }
}
