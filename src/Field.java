public class Field {
    Variant[] playerChoice;
    int counter;

    Field() {
        playerChoice = new Variant [2];
        counter = -1;
    }

    public Variant[] updateField(Variant setFigure) {
        if (counter == playerChoice.length-1) {
           Variant temp[] = new Variant[playerChoice.length + 2];
           for (int i=0; i<playerChoice.length; i++) temp[i] = playerChoice[i];
           playerChoice = temp;
           playerChoice[++counter] = setFigure;
           return playerChoice;
        }
        else {
            playerChoice[++counter] = setFigure;
            return playerChoice;
        }
    }





    /*// Create the menu and choice variant.
    public void menu() throws java.io.IOException {
        do {
            System.out.println("Game Rock-Shears-Paper\n");
            System.out.println("1. ROCK;");
            System.out.println("2. SHEARS;");
            System.out.println("3. PAPER;");
            System.out.println("Player1 enter needed point:");
            firstPlayerChoice = (char) System.in.read();
            System.out.println("Player2 enter needed point:");
            secondPlayerChoice = (char) System.in.read();
        } while (firstPlayerChoice < '1' || firstPlayerChoice > '3');

        if (firstPlayerChoice != '0' && secondPlayerChoice == '0') {
            StandardGameLogic game = new StandardGameLogic();
            game.performing(firstPlayerChoice, secondPlayerChoice);
        } else {
            StandardGameLogic game = new StandardGameLogic();
            game.performing(firstPlayerChoice);
        }
    }

    public char getChoice1() {
        return firstPlayerChoice;
    }

    public char getChoice2() {
        return secondPlayerChoice;
    }*/
}
