package org.lld.Chess;

public class Board {

  Cell[][] cells;

  public Board() {
    this.cells = new Cell[8][8];
  }

  public void initializeBoard() {
    // initialization logic
    // putting 16 pieces in rows 0,1 and 6,7
    cells[0][0] = new Cell(new Rook(PieceColor.BLACK), 0, 0);
    cells[0][1] = new Cell(new Bishop(PieceColor.BLACK), 0, 0);
    cells[0][2] = new Cell(new Knight(PieceColor.BLACK), 0, 0);
    cells[0][3] = new Cell(new King(PieceColor.BLACK), 0, 0);
    cells[0][4] = new Cell(new Queen(PieceColor.BLACK), 0, 0);
    cells[0][5] = new Cell(new Knight(PieceColor.BLACK), 0, 0);
    cells[0][6] = new Cell(new Bishop(PieceColor.BLACK), 0, 0);
    cells[0][7] = new Cell(new Rook(PieceColor.BLACK), 0, 0);

    //similarly do for other pieces
  }
}
