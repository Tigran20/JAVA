import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main {
    public static void main(String[] args) {

        final JFrame frame = new JFrame();

        Form form = new Form();
        Form2 form2 = new Form2();

        frame.setContentPane(form.getRootPanel());

        frame.setTitle("FirstForm");
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);

        form.getSwitchBtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setContentPane(form2.getRootPanel());
                frame.setTitle("SecondForm");
                frame.setSize(800, 600);
                frame.setLocationRelativeTo(null);
                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                frame.setVisible(true);

                form2.getTextField().setText(form.getTextField().getText() + " " + form.getTextField1().getText() + " " + form.getTextField2().getText());


            }
        });

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