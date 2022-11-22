package game;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        char[][] mappingTable = {
                {'7', '8', '9'},
                {'4', '5', '6'},
                {'1', '2', '3'}
        };
        char[][] gameTable = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };
        char userIcon = 'X';
        char computerIcon = '0';
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nHello, my dear!\nIt's game TicTacToe!");

        System.out.println("\nUse the following mapping table to specify a cell using numbers from 1 to 9.");
        printTableMapping(mappingTable);
        System.out.println("\nEnter \"1\", if you want play, or \"2\" for exit from the program:");
        while (true) {
            String enter = scanner.nextLine();
            if (Objects.equals(enter, "1")) {
                System.out.println("Game has been started!");
                break;
            } else if (Objects.equals(enter, "2")) {
                System.out.println("Okay ;(\nWe'll play next time surely!");
                System.exit(0);
            } else {
                System.out.println("Please! Enter only \"1\" or \"2\"!");
            }

        }
        System.out.println("\nGood luck!");

        if (new Random().nextBoolean()) {
            System.out.println("Computer make move first!");
            makeComputerMove(gameTable);
            printGameTable(gameTable);
        }
        while (true) {
            makeUserMove(gameTable, mappingTable);
            printGameTable(gameTable);
            if (isUserWin(gameTable, userIcon)) {
                System.out.println("\nYOU WIN!");
                break;
            }
            if (isDraw(gameTable)) {
                System.out.println("\nSorry, DRAW!");
                break;
            }
            makeComputerMove(gameTable);
            printGameTable(gameTable);
            if (isComputerWin(gameTable, computerIcon)) {
                System.out.println("\nCOMPUTER WIN!");
                break;
            }
            if (isDraw(gameTable)) {
                System.out.println("\nSorry, DRAW!");
                break;
            }

        }
        System.out.println("GAME OVER!");

    }

    private static boolean isComputerWin(char[][] gameTable, char computerIcon) {
        if (checkWinInLine(gameTable, computerIcon)) {
            return true;
        } else if (isCheckWinInColumn(gameTable, computerIcon)) {
            return true;
        } else if (isCheckWinInDiagonal(gameTable, computerIcon)) {
            return true;
        }

        return false;
    }

    private static boolean isCheckWinInDiagonal(char[][] gameTable, char computerIcon) {
        int countColumn = 0;
        int count = 0;
        for (int i = 0; i < 3; i++) {
            if (gameTable[countColumn++][i] == computerIcon) {
                count++;
                if (count == 3) {
                    return true;
                }
            }
        }

        count = 0;
        countColumn = 2;
        for (int i = 2; i >= 0; i--) {
            if (gameTable[countColumn--][i] == computerIcon) {
                count++;
                if (count == 3) {
                    return true;
                }
            }
        }

        return false;
    }

    private static boolean isCheckWinInColumn(char[][] gameTable, char computerIcon) {
        for (int i = 0; i < 3; i++) {
            int count = 0;
            for (int j = 0; j < 3; j++) {
                if (gameTable[j][i] == computerIcon) {
                    count++;
                    if (count == 3) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static boolean checkWinInLine(char[][] gameTable, char computerIcon) {

        for (int i = 0; i < gameTable.length; i++) {
            int count = 0;
            for (int j = 0; j < gameTable.length; j++) {
                if (gameTable[i][j] == computerIcon) {
                    count++;
                    if (count == 3) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static boolean isUserWin(char[][] gameTable, char userIcon) {
        if (checkWinInLine(gameTable, userIcon)) {
            return true;
        } else if (isCheckWinInColumn(gameTable, userIcon)) {
            return true;
        } else if (isCheckWinInDiagonal(gameTable, userIcon)) {
            return true;
        }

        return false;
    }


    private static void printGameTable(char[][] gameTable) {

        for (int i = 0; i < gameTable.length; i++) {
            System.out.println();
            System.out.println("-------------");
            for (int j = 0; j < gameTable.length; j++) {
                System.out.print("| " + gameTable[i][j] + " ");
            }
            System.out.print("|");
        }
        System.out.print("\n-------------");
    }

    private static void printTableMapping(char[][] mappingTable) {


        printGameTable(mappingTable);
    }


    private static boolean isDraw(char[][] gameTable) {
        for (int i = 0; i < gameTable.length; i++) {
            for (int j = 0; j < gameTable.length; j++) {
                if (gameTable[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }


    private static void makeUserMove(char[][] gameTable, char[][] mappingTable) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nYour move! Enter 1-9, but choose free cell!\nYour number... :");
            String userMove = scanner.nextLine();
            if (userMove.length() == 1) {
                char numberOfCell = userMove.charAt(0);
                if (numberOfCell >= '1' && numberOfCell <= '9') {
                    boolean moveIsComplete = makeMove(gameTable, mappingTable, numberOfCell);
                    if (moveIsComplete) {
                        break;
                    } else {
                        System.out.println("Please choose free cell");
                    }
                }
            }
        }
    }

    private static boolean makeMove(char[][] gameTable, char[][] mappingTable, char numberOfCell) {
        boolean moveIsComplete = false;

        for (int i = 0; i < mappingTable.length; i++) {
            if (moveIsComplete) {
                break;
            }
            for (int j = 0; j < mappingTable.length; j++) {
                if (mappingTable[i][j] == numberOfCell) {
                    if (gameTable[i][j] == ' ') {
                        gameTable[i][j] = 'X';
                        moveIsComplete = true;
                        break;
                    } else {
                        System.out.println("Cell is occupied. Try again");
                    }
                }
            }
        }
        return moveIsComplete;
    }


    private static void makeComputerMove(char[][] gameTable) {
        System.out.println("\nComputer made a move!");
        Random random = new Random();
        while (true) {
            int row = random.nextInt(3);
            int col = random.nextInt(3);
            if (gameTable[row][col] == ' ') {
                gameTable[row][col] = '0';
                return;
            }
        }


    }


}
