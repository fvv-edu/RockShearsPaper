import java.io.IOException;

public class StandardGameLogic implements GameLogic, Menu{
    private char point;
    Variant[] playerChoice;

    // Create menu
    public void showMenu() throws java.io.IOException {
            System.out.println("Game Rock-Shears-Paper\n");
            System.out.println("1. ROCK;");
            System.out.println("2. SHEARS;");
            System.out.println("3. PAPER;");
    }

    // Enter number-choice
    public char getInput() throws java.io.IOException {
        System.out.println("Enter needed point:");
        return (char)System.in.read();
    }

    // Check choice
    public void validateInput() throws IOException {
        //while (getInput() < 1 || getInput() > 3) {
            System.out.println("\nError!");
            System.out.println("Game Rock-Shears-Paper");
            System.out.println("1. ROCK;");
            System.out.println("2. SHEARS;");
            System.out.println("3. PAPER;");
            //getInput();
        //}
    }

    public char generatePCVariant() {
        char randomVar[] = {'1', '2', '3'};
        return randomVar[(int) (Math.random() * 3)];
    }

    // The relation between getInput()/generatePCVariant() and Variant
    public Variant setFigure(char point) {
        this.point = point;
        switch (point) {
            case '1':
                return Variant.ROCK;
            case '2':
                return Variant.SHEARS;
            case '3':
                return Variant.PAPER;
            default:
                return Variant.OTHER;
        }
    }

    public String checkWinner(Variant[] playerChoice) {
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

    public void output(Variant[] playerChoice) {
        this.playerChoice = playerChoice;
        if (checkWinner(playerChoice).equals("Draw!")) {
            System.out.println("Player chooses " + playerChoice[0]);
            System.out.println("Computer chooses " + playerChoice[1]);
            System.out.println(checkWinner(playerChoice));
        } else if (checkWinner(playerChoice).equals("The Player wins!")) {
            System.out.println("Player chooses " + playerChoice[0]);
            System.out.println("Computer chooses" + playerChoice[1]);
            System.out.println(checkWinner(playerChoice));
        } else {
            System.out.println("Player chooses " + playerChoice[0]);
            System.out.println("Computer chooses " + playerChoice[1]);
            System.out.println(checkWinner(playerChoice));
        }
    }

    public Variant getSetFigure() throws IOException {
        return setFigure(point);
    }

    public void setSetFigure(char point) {
        this.point = point;
    }

    public char getGeneratePCVariant() {
        return generatePCVariant();
    }

    public void setOutput(Variant[] playerChoice) {
        this.playerChoice = playerChoice;
    }





    /*//It is Player vs Computer game logic
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
