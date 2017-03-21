import javax.swing.*;
import java.awt.*;


public class Form2 {
    private JPanel rootPanel;
    private JTextField textField;
    private JButton switchBtn2;
    private JLabel userData;
    private JPanel secondPanel;
    private JProgressBar progressBar;

    public Form2 (){
        secondPanel.setLayout(new BoxLayout(secondPanel, BoxLayout.X_AXIS));
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
