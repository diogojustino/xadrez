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
public class Position {
    private int row;
    private int column;
    
    public Position(){
    }
    
    public Position(int row, int column){
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }
    
    @Override
    public String toString(){
        return String.format("(L: %d, C: %d)", row, column);
    }
    
}
