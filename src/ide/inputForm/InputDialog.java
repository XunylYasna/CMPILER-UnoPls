package ide.inputForm;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InputDialog extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JTextField textField1;
    private JLabel messageLbl;
    private String result;

    public InputDialog() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });
    }

    private void onOK() {
        // add your code here
        result = textField1.getText();
        dispose();
    }

    public void setTextField(String message){
        messageLbl.setText(message);
    }

    public String getResult() {
        return result;
    }
}
