import javax.swing.*;
import java.awt.*;

public class Form {
    private JPanel rootPanel;
    private JTextField textField;
    private JTextField textField1;
    private JTextField textField2;
    private JLabel lastName;
    private JLabel name;
    private JLabel name2;
    private JButton SwitchBtn;
    private JPanel secondPanel;

    public Form (){
        secondPanel.setLayout(new BoxLayout(secondPanel, BoxLayout.X_AXIS));

        secondPanel.add((Box.createRigidArea(new Dimension(40, 0))));
        secondPanel.add(lastName);
        secondPanel.add((Box.createRigidArea(new Dimension(6, 0))));
        secondPanel.add(textField);
        secondPanel.add((Box.createRigidArea(new Dimension(15, 0))));
        secondPanel.add(name);
        secondPanel.add((Box.createRigidArea(new Dimension(6, 0))));
        secondPanel.add(textField1);
        secondPanel.add((Box.createRigidArea(new Dimension(15, 0))));
        secondPanel.add(name2);
        secondPanel.add((Box.createRigidArea(new Dimension(6, 0))));
        secondPanel.add(textField2);
        secondPanel.add((Box.createRigidArea(new Dimension(15, 0))));
        secondPanel.add(getSwitchBtn());
    }



    public JPanel getRootPanel() {
        return rootPanel;
    }

    public JTextField getTextField() {
        return textField;
    }

    public JTextField getTextField1() {
        return textField1;
    }

    public JTextField getTextField2() {
        return textField2;
    }

    public JButton getSwitchBtn() {
        return SwitchBtn;
    }

}
