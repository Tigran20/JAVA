import javax.swing.*;


public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();

        Form form = new Form();
        frame.setContentPane(form.getRootPanel());

        frame.setTitle("JavaGramTigran");
        frame.setSize(120, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
