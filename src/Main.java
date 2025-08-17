import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import java.awt.*;


public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CalculatorUI(); // создаём интерфейс
        });
    }
}





//
////TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
//// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//public class Main {
//    public static void main(String[] args) {
//        JFrame frame = new JFrame();
//        JPanel textPanel = new JPanel();
//        JTextField operationTextField = new JTextField();
//
//        JPanel numPanel = new JPanel();
//
////        JPanel historyPanel = new JPanel();
//        /// ------- ///
//        frame.setSize(new Dimension(400,700));
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setLayout(new BorderLayout());
//        frame.setResizable(false);
//        //
//        textPanel.setLayout(new BorderLayout());
//        textPanel.add(operationTextField, BorderLayout.CENTER);
//        textPanel.setPreferredSize(new Dimension(400,75));
//        Border line = BorderFactory.createLineBorder(Color.black,1);
//        Border padding = new EmptyBorder(10,10,10,10);
//        operationTextField.setBorder(new CompoundBorder(padding,line));
//        operationTextField.setHorizontalAlignment(JTextField.RIGHT);
//        operationTextField.setFont(new Font("Arial",Font.BOLD, 32));
//        numPanel.setBackground(new Color(0,200,200));
//        numPanel.setPreferredSize(new Dimension(400,50));
//        numPanel.setLayout(new GridLayout(7,5));
//
//        String[] numPanelButtons=
//                {
//                        "MS","MR","MC","M+","M-",
//                        "2nd","Pi","e","","",
//                        "x²","(",")","n!","/",
//                        "","7","8","9","*",
//                        "10²","4","5","6","-",
//                        "log","1","2","3","+",
//                        "ln","+/-","0","C","="
//                };
//        for (String label : numPanelButtons) {
//            JButton btn = new JButton(label);
//            btn.setFont(new Font("Arial", Font.BOLD, 20));
//            if (label.isEmpty()) {
//                btn.setEnabled(false);
//            }
//            btn.addActionListener(e -> {
//                String current = operationTextField.getText();
//                switch (label) {
//                    case "C":
//                        operationTextField.setText("");
//                        break;
//                    default:
//                        if (!label.isEmpty()) {
//                            operationTextField.setText(current + label);
//                        }
//                }
//            });
//
//            numPanel.add(btn);
//        }
//
//
//        frame.add(textPanel, BorderLayout.NORTH);
//        frame.add(numPanel, BorderLayout.CENTER);
//        frame.setVisible(true);
//    }
//}