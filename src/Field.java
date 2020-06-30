public class Field implements Menu{
    private char choice1;
    private char choice2;

    // Create the menu and choice variant.
    public void menu() throws java.io.IOException {
        do {
            System.out.println("Game Rock-Shears-Paper\n");
            System.out.println("1. ROCK;");
            System.out.println("2. SHEARS;");
            System.out.println("3. PAPER;");
            System.out.println("Player1 enter needed point:");
            choice1 = (char) System.in.read();
            System.out.println("Player2 enter needed point:");
            choice2 = (char) System.in.read();
        } while (choice1 < '1' || choice1 > '3');

        if (choice1 != '0' && choice2 == '0') {
            GameLogic game = new GameLogic();
            game.performing(choice1, choice2);
        } else {
            GameLogic game = new GameLogic();
            game.performing(choice1);
        }
    }

    public char getChoice1() {
        return choice1;
    }

    public char getChoice2() {
        return choice2;
    }
}
