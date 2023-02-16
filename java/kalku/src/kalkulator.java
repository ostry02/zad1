import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class kalkulator extends JFrame {

    private JPanel mainPanel;
    private JButton sumaButton;
    private JButton a7Button;
    private JButton a9Button;
    private JButton a4Button;
    private JButton a1Button1;
    private JButton a6Button;
    private JButton a3Button1;
    private JButton a8Button;
    private JButton a5Button;
    private JButton a2Button1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton a0Button;
    private JButton aCButton;
    private JTextField textField;

    double a,b, wynik;
    String operacja;
    public kalkulator(String title)
    {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();


        aCButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + a0Button.getText());
            }
        });
        a1Button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + a1Button1.getText());
            }
        });
        a2Button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + a2Button1.getText());
            }
        });
        a3Button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + a3Button1.getText());
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + a4Button.getText());
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + a5Button.getText());
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + a6Button.getText());
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + a7Button.getText());
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + a8Button.getText());
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + a9Button.getText());
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(textField.getText());
                operacja = "+";
                textField.setText("");
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(textField.getText());
                operacja = "-";
                textField.setText("");
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(textField.getText());
                operacja = "*";
                textField.setText("");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(textField.getText());
                operacja = "/";
                textField.setText("");
            }
        });
        sumaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b =Double.parseDouble(textField.getText());

                if (operacja == "+"){
                    wynik = a + b;
                    textField.setText(String.valueOf(wynik));
                } else if (operacja == "-") {
                    wynik = a - b;
                    textField.setText(String.valueOf(wynik));
                } else if (operacja == "*") {
                    wynik = a * b;
                    textField.setText(String.valueOf(wynik));
                } else if (operacja == "/") {
                    wynik = a / b;
                    textField.setText(String.valueOf(wynik));
                }
            }
        });
    }
    public static void main(String[] args)
    {
        JFrame frame=new kalkulator("kalkulator");
        frame.setVisible(true);

    }
}

