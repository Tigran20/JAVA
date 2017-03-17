import javax.swing.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        Form form = new Form();
        Form2 form2 = new Form2();

        //создание формы по умолчанию
        frame.setContentPane(form.getRootPanel());
        frame.setTitle("FirstForm");
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);

        //создание события на кнопке
        form.getSwitchBtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (form.getTextField().getText().equals(""))
                {
                    JOptionPane.showMessageDialog(form.getRootPanel(), "Введите вашу фамилию!");
                }

                else if (form.getTextField1().getText().equals(""))
                {
                    JOptionPane.showMessageDialog(form.getRootPanel(), "Введите ваше имя!");
                }

                else if (form.getTextField2().getText().equals(""))
                {
                    int opt =  JOptionPane.showConfirmDialog(form.getRootPanel(), "Вы в том, что не хотите установить отчество ?");

                    if (opt == JOptionPane.YES_OPTION)
                    {
                        frame.setContentPane(form2.getRootPanel());
                        frame.setTitle("SecondForm");
                        frame.setSize(800, 599);
                        frame.setLocationRelativeTo(null);
                        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                        frame.setVisible(true);
                        form2.getTextField().setText(form.getTextField().getText()
                                + " " + form.getTextField1().getText() + " " + form.getTextField2().getText());
                    }

                    else if (opt == JOptionPane.NO_OPTION)
                    {
                        form.getTextField2().grabFocus();
                    }

                    else if (opt == JOptionPane.CANCEL_OPTION)
                    {
                        form.getTextField2().setText("Cancel");
                    }
                }

                //переключение на форму 2, если заполнены все поля
                else if (form.getTextField().getText() != null && form.getTextField1().getText() != null && form.getTextField2().getText() != null)
                {
                    frame.setContentPane(form2.getRootPanel());
                    frame.setTitle("SecondForm");
                    frame.setSize(800, 600);
                    frame.setLocationRelativeTo(null);
                    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                    frame.setVisible(true);
                    form2.getTextField().setText(form.getTextField().getText()
                            + " " + form.getTextField1().getText() + " " + form.getTextField2().getText());
                }
            }
        });

        //переключение со 2-й формы на 1-ю
        form2.getSwitchBtn2().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setContentPane(form.getRootPanel());
                frame.setTitle("FirstForm");
                frame.setSize(800, 600);
                frame.setLocationRelativeTo(null);
                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }

}