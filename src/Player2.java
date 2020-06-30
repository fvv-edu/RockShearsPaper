public class Player2 {
    private char point;

    // The relation between variant and ENUM
    private Variants playerChoice(char point) {
        this.point = point;
        switch (point) {
            case '1':
                return Variants.ROCK;
            case '2':
                return Variants.SHEARS;
            case '3':
                return Variants.PAPER;
            default:
                System.out.println("Error!");
                return null;
        }
    }

    public void setPoint(char point) {
        this.point = point;
    }

    public Variants getPlayerChoice() {
        return playerChoice(point);
    }
}
