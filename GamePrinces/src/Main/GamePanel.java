package Main;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {
    // Makes Game Window using GameWindow.java and takes mouse/keyboard Inputs
    // from KeyboardAndMouseInputs.java

    private Game game;

    public GamePanel(Game game) {
        this.game = game;
    }

    private void setPanelSize(){

    }

    public Game getGame() {
        return game;
    }

}
