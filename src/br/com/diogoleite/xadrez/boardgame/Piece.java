/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diogoleite.xadrez.boardgame;

/**
 *
 * @author Diogo Leite
 */
public class Piece {
    protected Position position;
    private Board border;
    
    public Piece(Board border){
        this.border = border;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    protected Board getBorder() {
        return border;
    }
    
}
