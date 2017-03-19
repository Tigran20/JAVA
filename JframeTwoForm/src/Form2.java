import javax.swing.*;
import java.awt.*;


public class Form2 {
    private JPanel rootPanel;
    private JTextField textField;
    private JButton switchBtn2;
    private JLabel userData;
    private JPanel secondPanel;

    public Form2 (){
        secondPanel.setLayout(new BoxLayout(secondPanel, BoxLayout.X_AXIS));
        secondPanel.add((Box.createRigidArea(new Dimension(100, 0))));
        secondPanel.add(userData);
        secondPanel.add((Box.createRigidArea(new Dimension(6, 0))));
        secondPanel.add(textField);
        secondPanel.add((Box.createRigidArea(new Dimension(15, 0))));
        secondPanel.add(switchBtn2);
        secondPanel.add((Box.createRigidArea(new Dimension(15, 0))));
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }

    public JTextField getTextField() {
        return textField;
    }

    public JButton getSwitchBtn2() {
        return switchBtn2;
    }
}
