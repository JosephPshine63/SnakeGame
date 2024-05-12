import javax.swing.*;

public class MainApplication {
    public static void main(String[] args) throws Exception {
        int boardWidth = 600;
        int boardHeight = boardWidth;

        JFrame frame = new JFrame("Snake");

        frame.setVisible(true);
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        SnakeGameComponent snakeGameComponent = new SnakeGameComponent(boardWidth, boardHeight);
        frame.add(snakeGameComponent);
        frame.pack();

        snakeGameComponent.requestFocus();
    }
}
