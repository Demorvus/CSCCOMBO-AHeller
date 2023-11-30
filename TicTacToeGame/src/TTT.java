
/**
 * Copyright 2023 All rights reserved. Don't Copy my code without permission!
 * TicTacToe
 *This is an implementation of the the traditional game of X's and O's 
 *
 *@author Abian Heller
 *@date 11/15/23
 */

import java.util.Scanner;

public class TTT {
	/**
	 * Main
	 * 
	 * @param args
	 */

	private char[][] board;
	private char currentPlayer;

	public TTT() {
		board = new char[3][3];
		currentPlayer = 'X';
		initializeBoard();
	}

	private void initializeBoard() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = '_';
			}
		}
	}

	private void displayBoard() {
		System.out.println("Current Board:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	private void takePlayerInput() {
		Scanner scanner = new Scanner(System.in);
		int row, col;

		do {
			System.out.println("Player " + currentPlayer + ", enter your move (row and column, separated by space):");
			row = scanner.nextInt();
			col = scanner.nextInt();
		} while (!isValidMove(row, col));

		board[row][col] = currentPlayer;
	}

	private boolean isValidMove(int row, int col) {
		if (row < 0 || row >= 3 || col < 0 || col >= 3 || board[row][col] != '_') {
			System.out.println("Invalid move. Try again.");
			return false;
		}
		return true;
	}

	private boolean checkForWinner() {
		for (int i = 0; i < 3; i++) {
			if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
				return true;
			}
			if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer) {
				return true;
			}
		}

		if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) {
			return true;
		}
		if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) {
			return true;
		}

		return false;
	}

	private void switchPlayer() {
		currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
	}

	public void playGame() {
		displayBoard();

		for (int turn = 0; turn < 9; turn++) {
			takePlayerInput();
			displayBoard();

			if (checkForWinner()) {
				System.out.println("Player " + currentPlayer + " wins!");
				return;
			}

			switchPlayer();
		}

		System.out.println("It's a draw!");
	}

	public static void main(String[] args) {
		TTT game = new TTT();
		game.playGame();
	}
}
