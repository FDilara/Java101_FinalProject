package mine_field_game;

import java.util.Scanner;

//Mine Field Game

public class MineField {
    public static void main(String[] args) {
        int m, n;

        Scanner input = new Scanner(System.in);
        System.out.println("row value: ");
        m = input.nextInt();
        System.out.println("column value: ");
        n = input.nextInt();

        MineFieldGame mf = new MineFieldGame(m,n);
        mf.game();
    }
}
