/**
 * Copyright 2023 All rights reserved. Don't Copy my code without permission!
 * TicTacToe
 *This is an implementation of the the traditional game of X's and O's 
 *
 *@author Abian Heller
 *@date 11/15/23
 */
public class TTT {
/**
 * Main
 * @param args
 */
	public static void main(String[] args) {
        char[][] boxes = {{'1','2','3'},{'4','5','6'},{'7','8','9'}};
        boxes[2][0] = 'X';
        drawBoard(boxes);

    }

    public static void drawBoard(char[][] boxes) {
        System.out.println("***********");
        System.out.println("* " + boxes[0][0] + " * " + boxes[0][1] + " * " + boxes[0][2] + " * ");
        System.out.println("* " + boxes[1][0] + " * " + boxes[1][1] + " * " + boxes[1][2] + " * ");
        System.out.println("* " + boxes[2][0] + " * " + boxes[2][1] + " * " + boxes[2][2] + " * ");
    }
}
