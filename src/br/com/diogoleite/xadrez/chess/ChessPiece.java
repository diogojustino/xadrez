/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diogoleite.xadrez.chess;

import br.com.diogoleite.xadrez.boardgame.Board;
import br.com.diogoleite.xadrez.boardgame.Piece;

/**
 *
 * @author Diogo Leite
 */
public class ChessPiece extends Piece {
    private Color color;

    public ChessPiece(Color color, Board border) {
        super(border);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
    
}
