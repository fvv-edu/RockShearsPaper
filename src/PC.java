public class PC {
    private char point;

    //The generate random choice
    PC() {
        int random = (int) (Math.random() * 3);
        char randomVar[] = {'1', '2', '3'};
        point = randomVar[random];
    }

    // The relation between variant and ENUM
    private Variants playerChoice() {
        switch (point) {
            case '1':
                return Variants.ROCK;
            case '2':
                return Variants.SHEARS;
            case '3':
                return Variants.PAPER;
            default:
                System.out.println("Error");
                return null;
        }
    }

    public Variants getPlayerChoice() {
        return playerChoice();
    }
}

