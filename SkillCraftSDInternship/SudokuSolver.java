package SkillCraftSDInternship;
import java.util.Scanner;
public class SudokuSolver {
    static final int SIZE = 9;
    static void printBoard(int[][] board) {
        System.out.println("\n-------------------------");
        for (int row = 0; row < SIZE; row++) {
            System.out.print("| ");
            for (int col = 0; col < SIZE; col++) {
                System.out.print(board[row][col] + " ");
                if ((col + 1) % 3 == 0) {
                    System.out.print("| ");
                }
            }
            System.out.println();
            if ((row + 1) % 3 == 0) {
                System.out.println("-------------------------");
            }
        }
    }
    static boolean isSafe(int[][] board, int row, int col, int number) {
        for (int i = 0; i < SIZE; i++) {
            if (board[row][i] == number) {
                return false;
            }
        }
        for (int i = 0; i < SIZE; i++) {
            if (board[i][col] == number) {
                return false;
            }
        }
        int startRow = row - row % 3;
        int startCol = col - col % 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[startRow + i][startCol + j] == number) {
                    return false;
                }
            }
        }
        return true;
    }
    static boolean solveSudoku(int[][] board) {
        int row = -1;
        int col = -1;
        boolean emptyFound = false;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] == 0) {
                    row = i;
                    col = j;
                    emptyFound = true;
                    break;
                }
            }
            if (emptyFound) {
                break;
            }
        }
        if (!emptyFound) {
            return true;
        }
        for (int number = 1; number <= 9; number++) {
            if (isSafe(board, row, col, number)) {
                board[row][col] = number;
                if (solveSudoku(board)) {
                    return true;
                }
                board[row][col] = 0;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] board = new int[9][9];
        System.out.println("===== SUDOKU SOLVER =====");
        System.out.println("Enter Sudoku values row by row.");
        System.out.println("Use 0 for empty cells.");
        for (int i = 0; i < 9; i++) {
            System.out.println("Enter row " + (i + 1) + ":");
            for (int j = 0; j < 9; j++) {
                board[i][j] = sc.nextInt();
                if (board[i][j] < 0 || board[i][j] > 9) {
                    System.out.println("Invalid value. Enter numbers 0-9.");
                    sc.close();
                    return;
                }
            }
        }
        System.out.println("\nOriginal Sudoku:");
        printBoard(board);
        if (solveSudoku(board)) {
            System.out.println("\nSolved Sudoku:");
            printBoard(board);
        } else {
            System.out.println("\nThis Sudoku puzzle has no solution.");
        }
        sc.close();
    }
}