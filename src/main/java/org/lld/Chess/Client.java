package org.lld.Chess;

public class Client {

    public static void main (String [] args){

        Player cristiano = new Player("Cristiano", PieceColor.BLACK);
        Player benzema = new Player("Benzema", PieceColor.WHITE);
        Game game = new Game(cristiano, benzema);

        game.makeMove(benzema, 0,1,2,3);
        game.makeMove(cristiano, 3,4,5,6);
    }
}
