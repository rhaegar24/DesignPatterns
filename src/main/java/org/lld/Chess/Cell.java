package org.lld.Chess;

public class Cell {

    Piece piece;
    int x;
    int y;

    public Cell(Piece piece, int x, int y) {
        this.piece = piece;
        this.x = x;
        this.y = y;
    }
}
