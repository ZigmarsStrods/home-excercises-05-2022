package io.codelex.arrays.practice.exercise7;

import java.util.Scanner;

public class TicTacToe {

    private static char[][] board = new char[3][3];

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        char turn = 'X';
        char winner = ' ';
        int row = -1;
        int column = -1;
        int turnCount = 0;
        initBoard();
        while (winner == ' ') {
            displayBoard();
            if (turnCount == 9) {
                System.out.println("The game is a tie.");
                return;
            }
            System.out.print(turn + ", choose your location (row, column): ");
            while (true) {
                row = keyboard.nextInt();
                column = keyboard.nextInt();
                if (row < 0 || row > 2 || column < 0 || column > 2 || board[row][column] != ' ') {
                    System.out.print(turn + ", please enter valid location!");
                } else {
                    break;
                }
            }

            board[row][column] = turn;
            turnCount++;
            if (turn == 'X') {
                turn = 'O';
            } else {
                turn = 'X';
            }
            winner = getWinner();
        }
        displayBoard();
        System.out.println(winner + " is the winner!");
    }

    public static void initBoard() {
        // fills up the board with blanks
        for (int r = 0; r < 3; r++)
            for (int c = 0; c < 3; c++)
                board[r][c] = ' ';
    }

    public static void displayBoard() {
        System.out.println("\n  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("    --+-+--");
        System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("    --+-+--");
        System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
        System.out.println("     0 1 2 \n");
    }

    public static char getWinner() {
        if (board[0][0] != ' ' && board[0][0] == board[0][1] && board[0][1] == board[0][2]) {
            return board[0][0];
        }
        if (board[1][0] != ' ' && board[1][0] == board[1][1] && board[1][1] == board[1][2]) {
            return board[1][0];
        }
        if (board[2][0] != ' ' && board[2][0] == board[2][1] && board[2][1] == board[2][2]) {
            return board[2][0];

        }
        if (board[0][0] != ' ' && board[0][0] == board[1][0] && board[1][0] == board[2][0]) {
            return board[0][0];

        }
        if (board[0][1] != ' ' && board[0][1] == board[1][1] && board[1][1] == board[2][1]) {
            return board[0][1];
        }
        if (board[0][2] != ' ' && board[0][2] == board[1][2] && board[1][2] == board[2][2]) {
            return board[0][2];
        }
        if (board[0][0] != ' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            return board[0][0];
        }
        if (board[0][2] != ' ' && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            return board[0][2];
        }
        return ' ';
    }
}
