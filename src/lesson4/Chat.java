package lesson4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Chat extends JFrame {
    JPanel jpN = new JPanel(new GridLayout());
    JPanel jpS = new JPanel(new GridLayout());
    JButton jb = new JButton("Отправить");
    JTextArea jta = new JTextArea();
    JScrollPane jsp = new JScrollPane(jta);
    JTextField jtf = new JTextField();

    public Chat() {
        super("Чат");
        setSize(300, 400);
        setMinimumSize(new Dimension(300, 400));
        jta.setLineWrap(true);
        jta.setEditable(false);
        jpN.add(jsp);
        jpS.add(jtf);
        jpS.add(jb);
        add(jpN);
        add("South", jpS);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        jb.addActionListener(e -> Message());
        jtf.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) Message();
            }
        });
    }

    void Message(){
        String out = jtf.getText();
        jta.append(out + "\n");
        jtf.setText("");
        jtf.grabFocus();
    }
}
