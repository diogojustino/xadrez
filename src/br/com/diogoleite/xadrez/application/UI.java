/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diogoleite.xadrez.application;

import br.com.diogoleite.xadrez.chess.ChessPiece;

/**
 *
 * @author Diogo Leite
 */
public class UI {
    
    public static void printBoard(ChessPiece[][] pieces) {
        for(int row = 0; row < pieces.length; row++){
            System.out.print( (8 - row) + " ");
            for(int column = 0; column < pieces[row].length; column++){
                printPiece(pieces[row][column]);
            }
            System.out.println();
        }
        System.out.println("  a b c d e f g h");
    }
    
    private static void printPiece(ChessPiece piece){
        if(piece == null){
            System.out.print("-");
        }else{
            System.out.printf("%s", piece);
        }
        System.out.print(" ");
    }
    
}
