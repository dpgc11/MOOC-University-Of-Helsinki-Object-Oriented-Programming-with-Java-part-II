/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noticeboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Yogesh
 */
public class ActionEventListener implements ActionListener{

    private JLabel label;
    private JTextField textArea;

    public ActionEventListener(JTextField textArea, JLabel label) {
        this.label = label;
        this.textArea = textArea;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        label.setText(textArea.getText());
        textArea.setText("");
    }
    
}
