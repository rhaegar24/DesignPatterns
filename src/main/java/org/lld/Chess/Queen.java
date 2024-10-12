package org.lld.Chess;

public class Queen implements Piece {

  PieceColor color;

  public Boolean killed = Boolean.FALSE;

  Queen(PieceColor color) {
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
