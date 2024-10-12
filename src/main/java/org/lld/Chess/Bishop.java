package org.lld.Chess;

public class Bishop implements Piece {

  PieceColor color;

  Boolean killed = Boolean.FALSE;

  Bishop(PieceColor color) {
    this.color = color;
  }

  @Override
  public boolean canMove(int x, int y) {
    return false;
  }

  @Override
  public PieceColor getPieceColor(){
    return color;
  }

  public void setKilled(){
    this.killed = Boolean.TRUE;
  }
}
