public class PC {
    private char point;

    //The generate random choice
    PC() {
        int random = (int) (Math.random() * 3);
        char randomVar[] = {'1', '2', '3'};
        point = randomVar[random];
    }

    // The relation between variant and ENUM
    private Variant playerChoice() {
        switch (point) {
            case '1':
                return Variant.ROCK;
            case '2':
                return Variant.SHEARS;
            case '3':
                return Variant.PAPER;
            default:
                System.out.println("Error");
                return null;
        }
    }

    public Variant getPlayerChoice() {
        return playerChoice();
    }
}

