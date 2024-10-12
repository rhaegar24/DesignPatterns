package org.lld.Chess;

public interface Piece {

  boolean canMove(int x, int y);

  PieceColor getPieceColor();

  void setKilled();
}
