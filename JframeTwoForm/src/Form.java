import javax.swing.*;



public class Form {
    private JPanel rootPanel;

    public JTextField getTextField() {
        return textField;
    }

    public JTextField getTextField1() {
        return textField1;
    }

    public JTextField getTextField2() {
        return textField2;
    }


    private JTextField textField;
    private JTextField textField1;
    private JTextField textField2;
    private JLabel lastName;
    private JLabel name;
    private JLabel name2;
    private JButton SwitchBtn;

    public Form() {

}

    public JPanel getRootPanel() {
        return rootPanel;
    }

    public JButton getSwitchBtn() {
        return SwitchBtn;
    }


}
