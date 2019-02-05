package D_Array;

public class Main {
    public static void main(String[] args) {
        /*String [] players = new String[4];                        //Первый вариант массива
        players[0] = "David";
        players[1] = "Daniel";
        players[2] = "Anna";
        players[3] = "Gregory";*/

        String players[] = {"David", "Daniel", "Anna", "Gregory"};  //Второй вариант массива

        int totalPlayers = players.length;
        //System.out.println(totalPlayers);

        String theWinner = players[1];
        //System.out.println("Поздравляем " + theWinner + "!");

        int counter = 0;

        /*for (counter = 0; counter < totalPlayers; counter++){       //Цикл с заранее известным повтором
            String thePlayer = players[counter];
            System.out.println("Поздравляем " + thePlayer + "!");
        }*/

        /*while (counter < totalPlayers){                             //Цикл с заранее неизвестным повтором
            String thePlayer = players[counter];
            System.out.println("Поздравляем " + thePlayer + "!");
            counter++;
        }*/

        /*while (counter < totalPlayers){                             //Цикл с применением break
            if (counter == 3){
                break; //Выпрыгиваем из цикла
            }
            String thePlayer = players[counter];
            System.out.println("Congratulations, " + thePlayer + "!");
            counter++;
        }*/

        while (counter < totalPlayers){                             //Цикл с применением continue
            counter++;
            String thePlayer = players[counter];

            if (thePlayer.equals("David")){
                continue;
            }

            System.out.println("Congratulations, " + thePlayer + "!");
            //counter++;
        }
    }
}
