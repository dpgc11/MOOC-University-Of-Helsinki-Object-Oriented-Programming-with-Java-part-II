package noticeboard;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

public class NoticeBoard implements Runnable {

    private JFrame frame;
    private JTextField textField;
    private JLabel label;
    private JButton copyButton;

    @Override
    public void run() {
        this.frame = new JFrame();
        this.frame.setPreferredSize(new Dimension(400, 200));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        createComponents(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3, 1);
        container.setLayout(layout);
        
        this.textField = new JTextField();
        this.copyButton = new JButton("Copy!");
        this.label = new JLabel();
        
        ActionEventListener listener = new ActionEventListener(textField, label);
        copyButton.addActionListener(listener);
        
        container.add(textField);
        container.add(copyButton);
        container.add(label);
    }
}
