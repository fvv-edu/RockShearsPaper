
public class GameRunner {
    public static void main(String[] args)
        throws java.io.IOException {

        StandardGameLogic game = new StandardGameLogic();
        Field f = new Field();

        // Create menu
        game.showMenu();

        // Enter number-choice
        game.getInput();

        // Conversion from number in Variants
        Variant firstPlayerChoice = game.getSetFigure(game.getValidateInput());
        Variant secondPlayerChoice = game.getSetFigure(game.getGeneratePCVariant());

        //Save choice in Field
        Variant savePlayerChoice[] = f.updateField(firstPlayerChoice);
        savePlayerChoice = f.updateField(secondPlayerChoice);

        // Choosing a winner
        game.getCheckWinner(savePlayerChoice);

        // Output text who is winner and loser
        game.output();
    }
}
