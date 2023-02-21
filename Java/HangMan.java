/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

import javax.swing.*;
import java.util.ArrayList;


public class HangMan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String category[] = {"video Games", "Restuarnts", "Furniture", "Course", "Class Members"};
        String word[][] = new String[5][7];

        String stickman[] = {"\n", "\n ☺ ", " ☺ \n | ", " ☺ \n/| ", " ☺ \n/|\\", " ☺ \n/|\\\n / ", " ☺ "
            + "\n/|\\\n /\\", " ☺ \n/|\\\n /\\\n ► Game Over"};

        int number = 7;
        boolean win = false;
        boolean lose = false;
        for (int i = 0; i < 5; i++) {
            word[i][0] = category[i];
        }

        word[0][1] = "Destiny";
        word[0][2] = "Halo";
        word[0][3] = "Rocket League";
        word[0][4] = "Tetris";
        word[0][5] = "Minecraft";
        word[0][6] = "Snake";
        word[1][1] = "Pita Pit";
        word[1][2] = "Goos";
        word[1][3] = "Subway";
        word[1][4] = "Burger King";
        word[1][5] = "McDonalds";
        word[1][6] = "Fast Eddies";
        word[2][1] = "Chair";
        word[2][2] = "Bed";
        word[2][3] = "Table";
        word[2][4] = "Dresser";
        word[2][5] = "Couch";
        word[2][6] = "Shelf";
        word[3][1] = "Computer Science";
        word[3][2] = "Computer Engineering";
        word[3][3] = "Tech Design";
        word[3][4] = "Math";
        word[3][5] = "Art";
        word[3][6] = "Science";
        word[4][1] = "Chris G";
        word[4][2] = "Jaspreet G";
        word[4][3] = "Max G";
        word[4][4] = "Evan M";
        word[4][5] = "Matthew S";
        word[4][6] = "Connor M";

        int randomcategory = (int) (Math.random() * 5 + 0);
        int randomword = (int) (Math.random() * 6 + 1);
        System.out.println("Your Category is: " + word[randomcategory][0]);
        String letter = word[randomcategory][randomword];
        letter = letter.toLowerCase();
        char dashes[] = new char[letter.length()];
        int charsleft = letter.length();
        for (int i = 0; i < letter.length(); i++) {
            dashes[i] = ' ';
        }
        if (letter.indexOf(" ") > 0) {
            for (int i = 0; i < letter.indexOf(" "); i++) {
                dashes[i] = '-';
            }
            for (int i = letter.indexOf(" ") + 1; i < letter.length(); i++) {
                dashes[i] = '-';
            }
        } else {
            for (int i = 0; i < letter.length(); i++) {
                dashes[i] = '-';
            }
        }
        for (int i = 0; i < letter.length(); i++) {
            System.out.print(dashes[i]);
        }
        while (number > 0) {
            String input = JOptionPane.showInputDialog("You have " + number + " left \nPlease guess a letter:");
            char guess = input.charAt(0);
            System.out.println("\n");
            for (int i = 0; i < letter.length(); i++) {
                if (guess == letter.charAt(i)) {
                    dashes[i] = guess;
                    lose = true;
                }
            }
            if (lose == true) {
                lose = false;
            } else {
                number--;
            }
            System.out.println(stickman[7 - number]);
            for (int i = 0; i < letter.length(); i++) {
                System.out.print(dashes[i]);
            }
            for (int i = 0; i < letter.length(); i++) {
                if (dashes[i] != '-') {
                    charsleft--;
                }
            }
            if (charsleft == 0) {
                number = 0;
                number = 0;
                win = true;
            } else {
                charsleft = letter.length();
            }
        }
        if (win == true) {
            System.out.println("\n☺ You Win! ☺");
        } else {
            System.out.println("\nSorry you lost!");
        }
    }
}
