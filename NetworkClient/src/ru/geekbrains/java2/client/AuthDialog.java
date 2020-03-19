package ru.geekbrains.java2.client;

import ru.geekbrains.java2.client.controller.ClientController;

import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;

public class AuthDialog extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField loginText;
    private JPasswordField passwordText;

    private ClientController controller;

    public AuthDialog(ClientController clientController) {
        this.controller = controller;
        setContentPane(contentPane);
        setSize(400,250);
        setLocationRelativeTo(null);
        getRootPane().setDefaultButton(buttonOK);

        buttonOK.addActionListener(e -> onOK());

        buttonCancel.addActionListener((e -> onCancel()));

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });
    }

    private void onOK() {
        String login = loginText.getText().trim();
        String pass = new String(passwordText.getPassword()).trim();
        try {
            controller.sendAuthMessage(login, pass);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Ошибка при попытки аутентификации");
        }
    }

    private void onCancel() {
        System.exit(0);
    }
}
