/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diogoleite.xadrez.chess.pieces;

import br.com.diogoleite.xadrez.boardgame.Board;
import br.com.diogoleite.xadrez.chess.ChessPiece;
import br.com.diogoleite.xadrez.chess.Color;

/**
 *
 * @author Diogo Leite
 */
public class Rook extends ChessPiece{
    
    public Rook(Color color, Board border) {
        super(color, border);
    }
    
    @Override
    public String toString(){
        return "R";
    }
    
    
}
