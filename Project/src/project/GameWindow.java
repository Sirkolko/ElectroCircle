package project;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class GameWindow extends JFrame {
    private static  GameWindow game_window;
    private static Image BakGround;

    public static void main(String[] args) throws IOException {
        BakGround =  ImageIO.read(GameWindow.class.getResourceAsStream("Bakground.JPG"));
        game_window = new GameWindow();
        game_window.setSize(1024,768);
        game_window.setResizable(false);
        game_window.setTitle("Food chain");
        game_window.setDefaultCloseOperation(EXIT_ON_CLOSE);
        game_window.setLocation(200,150);
        GameField game_field = new GameField();
        game_window.add(game_field);
        game_window.setVisible(true);
    }
    public static void onRepaint (Graphics g){
        g.drawImage(BakGround,0,0,null);

    }
    private static class GameField extends JPanel{
        @Override
        protected void paintComponent (Graphics g){
            super.paintComponent(g);
            onRepaint(g);
            repaint();
        }
    }
}
