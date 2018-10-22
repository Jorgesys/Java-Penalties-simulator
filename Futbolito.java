/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futbolito;

import java.util.Scanner;

public class Futbolito {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        String team1;
        String team2;
        int pateo = 0;
        int team1Goals = 0;
        int team2Goals = 0;
        int shots = 0;
        int MAX_ALLOWED_SHOTS = 10;
        System.out.println("Welcome to \"Penalties simulator v 1.0.1\""
                + "\n    .-~\\@/~-.\n"
                + "   /   _|_   \\\n"
                + "  @\\__/a@a\\__/a\n"
                + "  a/  \\_@_/  \\@\n"
                + "   \\__/   \\__/\n"
                + "    `a\\___/a' by Jorgesys   ");
        System.out.println("Enter name of Team 1º:");
        team1 = entrada.nextLine();
        System.out.println("Enter name of Team 2º");
        team2 = entrada.nextLine();

        //Se realizarán penalties hasta que se cumplan las condiciones:
        //1)La cantidad de tiros totales:  tiros <= MAXIMA_CANT_TIROS
        //2)El marcador NO se encuentre empatado: goles1 == goles2        
        while (shots <= MAX_ALLOWED_SHOTS || team1Goals == team2Goals ) {
            System.out.println("Score: " + team1 + " " + team1Goals + " - " + team2 + " " + team2Goals);
            System.out.println("Kicking: " + team1);
            System.out.println("Choose your shot: 1-Left 2-Center 3-Right");
            pateo = entrada.nextInt();
            int direccion = (int) (Math.random() * 3) + 1;
            if (direccion == pateo) {
                shots = shots + 1;
                switch (pateo) {
                    case 1:

                        System.out.println("The Goalkeeper block the shot!!!");
                        System.out.println("┌———————————————————————————┐");
                        System.out.println("|                                           |");
                        System.out.println("|                                           |");
                        System.out.println("|                                           |");
                        System.out.println("|                                           |");
                        System.out.println("|                                           |");
                        System.out.println("|     (͡°͜ʖ͡°)                              |");
                        System.out.println("|       -()-                                |");
                        System.out.println("|        ||                                 |");
                        System.out.println("         O");
                        break;
                    case 2:
                        System.out.println("The Goalkeeper block the shot!!!");
                        System.out.println("┌———————————————————————————┐");
                        System.out.println("|                                           |");
                        System.out.println("|                                           |");
                        System.out.println("|                                           |");
                        System.out.println("|                                           |");
                        System.out.println("|                                           |");
                        System.out.println("|                  (͡~͜ʖ͡°)                 |");
                        System.out.println("|                    -()-                   |");
                        System.out.println("|                     ||                    |");
                        System.out.println("                      O");
                        break;
                    case 3:
                        System.out.println("The Goalkeeper block the shot!!!");
                        System.out.println("┌———————————————————————————┐");
                        System.out.println("|                                           |");
                        System.out.println("|                                           |");
                        System.out.println("|                                           |");
                        System.out.println("|                                           |");
                        System.out.println("|                                           |");
                        System.out.println("|                                (͡°͜ʖ͡°)  |");
                        System.out.println("|                                  -()-     |");
                        System.out.println("|                                   ||      |");
                        System.out.println("                                    O");
                        break;
                }

            } else if (direccion != pateo) {
                shots = shots + 1;
                team1Goals = team1Goals + 1;

                switch (pateo) {

                    case 1:
                        System.out.println("GOOOAAAL!!!");
                        System.out.println("┌———————————————————————————┐");
                        System.out.println("|                                           |");
                        System.out.println("|     O                                     |");
                        System.out.println("|                                           |");
                        System.out.println("|                                           |");
                        System.out.println("|                                           |");
                        System.out.println("|                                (͠°͟ʖ͡°)   |");
                        System.out.println("|                                  -()-     |");
                        System.out.println("|                                   ||      |");
                        break;
                    case 2:
                        System.out.println("GOOOAAAL!!!");
                        System.out.println("┌———————————————————————————┐");
                        System.out.println("|                                           |");
                        System.out.println("|                                           |");
                        System.out.println("|                                           |");
                        System.out.println("|                                           |");
                        System.out.println("|                     O                     |");
                        System.out.println("|                                (͠°͟ʖ͡°)   |");
                        System.out.println("|                                  -()-     |");
                        System.out.println("|                                   ||      |");
                        break;
                    case 3:
                        System.out.println("GOOOAAAL!!!");
                        System.out.println("┌———————————————————————————┐");
                        System.out.println("|                                           |");
                        System.out.println("|                                     O     |");
                        System.out.println("|                                           |");
                        System.out.println("|                                           |");
                        System.out.println("|                                           |");
                        System.out.println("|     (͠°͟ʖ͡°)                              |");
                        System.out.println("|       -()-                                |");
                        System.out.println("|        ||                                 |");
                        break;
                }
            }
            System.out.println("Score: " + team1 + " " + team1Goals + " goles - " + team2 + " " + team2Goals);
            System.out.println("Kicking: " + team2);
            System.out.println("Choose your shot: 1-Left 2-Center 3-Right");
            pateo = entrada.nextInt();
            int direccion1 = (int) (Math.random() * 3) + 1;
            if (direccion1 == pateo) {
                shots = shots + 1;
                switch (pateo) {
                    case 1:
                        System.out.println("The Goalkeeper block the shot!!!");
                        System.out.println("┌——————————————————————————┐");
                        System.out.println("|                                           |");
                        System.out.println("|                                           |");
                        System.out.println("|                                           |");
                        System.out.println("|                                           |");
                        System.out.println("|                                           |");
                        System.out.println("|     (͡☉͜ʖ͡☉)                             |");
                        System.out.println("|       -()-                                |");
                        System.out.println("|        ||                                 |");
                        System.out.println("         O");
                        break;
                    case 2:
                        System.out.println("The Goalkeeper block the shot!!!");
                        System.out.println("┌———————————————————————————┐");
                        System.out.println("|                                           |");
                        System.out.println("|                                           |");
                        System.out.println("|                                           |");
                        System.out.println("|                                           |");
                        System.out.println("|                                           |");
                        System.out.println("|                 (͡☉͜ʖ͡☉)                 |");
                        System.out.println("|                    -()-                   |");
                        System.out.println("|                     ||                    |");
                        System.out.println("                      O");
                        break;
                    case 3:
                        System.out.println("The Goalkeeper block the shot!!!");
                        System.out.println("┌———————————————————————————┐");
                        System.out.println("|                                           |");
                        System.out.println("|                                           |");
                        System.out.println("|                                           |");
                        System.out.println("|                                           |");
                        System.out.println("|                                           |");
                        System.out.println("|                                (͡☉͜ʖ͡☉)  |");
                        System.out.println("|                                  -()-     |");
                        System.out.println("|                                   ||      |");
                        System.out.println("                                    O");
                        break;
                }

            } else if (direccion1 != pateo) {
                shots = shots + 1;
                team2Goals = team2Goals + 1;
                switch (pateo) {
                    case 1:
                        System.out.println("GOOOAAAL!!!");
                        System.out.println("┌———————————————————————————┐");
                        System.out.println("|                                           |");
                        System.out.println("|     O                                     |");
                        System.out.println("|                                           |");
                        System.out.println("|                                           |");
                        System.out.println("|                                           |");
                        System.out.println("|                               (͡☉͟ʖ͡☉)   |");
                        System.out.println("|                                  -()-     |");
                        System.out.println("|                                   ||      |");
                        break;
                    case 2:
                        System.out.println("GOOOAAAL!!!");
                        System.out.println("┌———————————————————————————┐");
                        System.out.println("|                                           |");
                        System.out.println("|                                           |");
                        System.out.println("|                                           |");
                        System.out.println("|                                           |");
                        System.out.println("|                     O                     |");
                        System.out.println("|                                (͡☉͟ʖ͡☉)  |");
                        System.out.println("|                                  -()-     |");
                        System.out.println("|                                   ||      |");
                        break;
                    case 3:
                        System.out.println("GOOOAAAL!!!");
                        System.out.println("┌———————————————————————————┐");
                        System.out.println("|                                           |");
                        System.out.println("|                                     O     |");
                        System.out.println("|                                           |");
                        System.out.println("|                                           |");
                        System.out.println("|                                           |");
                        System.out.println("|     (͡☉͟ʖ͡☉)                             |");
                        System.out.println("|       -()-                                |");
                        System.out.println("|        ||                                 |");
                        break;
                }

            }
        }
        System.out.println("=———————————————————————————=");
        System.out.println("Final score:\n " + team1 + " ————— " + team2 + "\n"
                + "  ___________________________\n"
                + " |             |             |\n"
                + " |___          |          ___|\n"
                + " |_  |         |         |  _|\n"
                + ".| | |.       ,|.       .| | |.\n"
                + "|| | | )     ( | )     ( | | ||\n"
                + "'|_| |'       `|'       `| |_|'\n"
                + " |___|         |         |___|\n"
                + " | " + team1Goals + " goals     |   " + team2Goals + " goals   |\n"
                + " |_____________|_____________|");

    }
}
