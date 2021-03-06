package movingfigure;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;
    private Figure figure;
    private DrawingBoard board;

    public UserInterface(Figure f) {
        figure = f;
    }
    
    @Override
    public void run() {
        frame = new JFrame();
        frame.setPreferredSize(new Dimension(400, 400));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());
        addListeners();

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        this.board = new DrawingBoard(figure);
        container.add(this.board);
        this.frame.addKeyListener(new KeyboardListener(container, figure));
    }

    private void addListeners() {
//        this.frame.addKeyListener(new KeyboardListener(this.container, figure));
    }

    public JFrame getFrame() {
        return frame;
    }
}
