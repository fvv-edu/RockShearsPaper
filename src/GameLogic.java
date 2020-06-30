public class GameLogic {

    //It is Player vs Computer game logic
    public void performing (char point) {
        Player1 p1 = new Player1();
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
        Player1 p1 = new Player1();
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
    }
}
