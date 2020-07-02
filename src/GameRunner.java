
public class GameRunner {
    public static void main(String[] args)
        throws java.io.IOException {
        StandardGameLogic game = new StandardGameLogic();
        Field f = new Field();
       // game.showMenu();
        //game.getInput();
        //game.validateInput();
        //f.updateField(game.setFigure(game.getInput()));
       // game.output(f.updateField(game.setFigure(game.generatePCVariant())));
        System.out.println(f.updateField(game.setFigure(game.generatePCVariant())));
        System.out.println(f.updateField());






    }
}
