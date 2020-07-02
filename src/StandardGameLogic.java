import java.io.IOException;

public class StandardGameLogic implements GameLogic, Menu {
    private char point;
    private Variant[] playerChoice;

    // Create menu
    public void showMenu() {
            System.out.println("Game Rock-Shears-Paper\n");
            System.out.println("1. ROCK;");
            System.out.println("2. SHEARS;");
            System.out.println("3. PAPER;");
    }

    // Enter number-choice
    public char getInput() throws java.io.IOException {
        System.out.println("Enter needed point:");
        point = (char)System.in.read();
        return point;
    }

    // Check choice
    private char validateInput() throws IOException {
        while (point < '1' || point > '3') {
            System.out.println("\nError!");
            System.out.println("Game Rock-Shears-Paper");
            System.out.println("1. ROCK;");
            System.out.println("2. SHEARS;");
            System.out.println("3. PAPER;");
            point = getInput();
        }
        return point;
    }

    // Generate random number for Computer choosing
    private char generatePCVariant() {
        char randomVar[] = {'1', '2', '3'};
        return randomVar[(int) (Math.random() * 3)];

    }

    // The relation between getInput()/generatePCVariant() and Variant
    private Variant setFigure(char point) {
        this.point = point;
        switch (point) {
            case '1':
                System.out.println(Variant.ROCK);
                return Variant.ROCK;
            case '2':
                System.out.println(Variant.SHEARS);
                return Variant.SHEARS;
            case '3':
                System.out.println(Variant.PAPER);
                return Variant.PAPER;
            default:
                System.out.println(Variant.OTHER);
                return Variant.OTHER;
        }
    }

    // Logic to choosing a winner
    private String checkWinner(Variant[] playerChoice) {
        this.playerChoice = playerChoice;
        if (playerChoice[0].equals(playerChoice[1])) {
           return "Draw!";
        } else if ((playerChoice[0].equals(Variant.ROCK) && playerChoice[1].equals(Variant.SHEARS)) ||
                (playerChoice[0].equals(Variant.SHEARS) && playerChoice[1].equals(Variant.PAPER)) ||
                (playerChoice[0].equals(Variant.PAPER) && playerChoice[1].equals(Variant.ROCK))) {
            return "The Player wins!";
        } else {
            return "The Computer wins!";
        }
    }

    // Output text who is winner and loser
    public void output() {
        if (checkWinner(playerChoice).equals("Draw!")) {
            System.out.println("Player chooses " + playerChoice[0]);
            System.out.println("Computer chooses " + playerChoice[1]);
            System.out.println(checkWinner(playerChoice));
        } else if (checkWinner(playerChoice).equals("The Player wins!")) {
            System.out.println("Player chooses " + playerChoice[0]);
            System.out.println("Computer chooses " + playerChoice[1]);
            System.out.println(checkWinner(playerChoice));
        } else {
            System.out.println("Player chooses " + playerChoice[0]);
            System.out.println("Computer chooses " + playerChoice[1]);
            System.out.println(checkWinner(playerChoice));
        }
    }

    public char getValidateInput() throws IOException {
        return validateInput();
    }

    public char getGeneratePCVariant() {
        return generatePCVariant();
    }

    public Variant getSetFigure(char point) {
        this.point = point;
        return setFigure(point);
    }

    public String getCheckWinner(Variant[] playerChoice) {
        this.playerChoice = playerChoice;
        return checkWinner(playerChoice);
    }


    /*It is Player vs Computer game logic
    public void performing (char point) {
        Player p1 = new Player();
        PC p2 = new PC();
        p1.setPoint(point);
        Variants plCh1 = p1.getPlayerChoice();
        Variants plCh2 = p2.getPlayerChoice();

        if (plCh2.equals(plCh1)) {
            System.out.println("Computer chooses " + plCh2);
            System.out.println("Player chooses " + plCh1);
            System.out.println("Draw!");
        } else if ((plCh2.equals(Variants.ROCK) && plCh1.equals(Variants.SHEARS)) ||
                (plCh2.equals(Variants.SHEARS) && plCh1.equals(Variants.PAPER)) ||
                (plCh2.equals(Variants.PAPER) && plCh1.equals(Variants.ROCK))) {
            System.out.println("Computer chooses " + plCh2);
            System.out.println("Player chooses " + plCh1);
            System.out.println("The Computer wins!");
        } else {
            System.out.println("Computer chooses " + plCh2);
            System.out.println("Player chooses " + plCh1);
            System.out.println("The Player wins!");
        }
    }

    // It is Player vs Player game logic
    public void performing(char point1, char point2) {
        Player p1 = new Player();
        Player2 p2 = new Player2();
        p1.setPoint(point1);
        p2.setPoint(point2);
        Variants plCh1 = p1.getPlayerChoice();
        Variants plCh2 = p2.getPlayerChoice();

        if (plCh2.equals(plCh1)) {
            System.out.println("Computer chooses " + plCh2);
            System.out.println("Player chooses " + plCh1);
            System.out.println("Draw!");
        } else if ((plCh2.equals(Variants.ROCK) && plCh1.equals(Variants.SHEARS)) ||
                (plCh2.equals(Variants.SHEARS) && plCh1.equals(Variants.PAPER)) ||
                (plCh2.equals(Variants.PAPER) && plCh1.equals(Variants.ROCK))) {
            System.out.println("Computer chooses " + plCh2);
            System.out.println("Player chooses " + plCh1);
            System.out.println("The Computer wins!");
        } else {
            System.out.println("Computer chooses " + plCh2);
            System.out.println("Player chooses " + plCh1);
            System.out.println("The Player wins!");
        }
    }*/
}
