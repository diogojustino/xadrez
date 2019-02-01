/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diogoleite.xadrez.chess;

import br.com.diogoleite.xadrez.boardgame.Board;
import br.com.diogoleite.xadrez.boardgame.Position;
import br.com.diogoleite.xadrez.chess.pieces.King;
import br.com.diogoleite.xadrez.chess.pieces.Rook;

/**
 *
 * @author Diogo Leite
 */
public class ChessMatch {
    private Board board;

    public ChessMatch() {
        board = new Board(8, 8);
        initialSetup();
    }  
    
    public ChessPiece[][] getPieces(){
        ChessPiece[][] chessPieces = new ChessPiece[board.getRows()][board.getColumns()];
        for(int row = 0; row < chessPieces.length; row++){
            for(int column = 0; column < chessPieces[row].length; column++){
                chessPieces[row][column] = (ChessPiece) board.piece(row, column);
            }
        }
        
        return chessPieces;
    }
    
    private void initialSetup(){
        board.placePiece(new King(Color.WHITE, board), new Position(0, 4));
        
        board.placePiece(new King(Color.WHITE, board), new Position(7, 4));
        
    }
}
