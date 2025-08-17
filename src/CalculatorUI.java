import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class CalculatorUI {
    private JTextField display;

    public CalculatorUI() {
        JFrame frame = new JFrame("Scientific Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 600);
        frame.setLayout(new BorderLayout());

        display = new JTextField();
        display.setFont(new Font("Arial", Font.BOLD, 36));
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setPreferredSize(new Dimension(400,75));
        frame.add(display, BorderLayout.NORTH);

        // кнопки
        JPanel numPanel = new JPanel(new GridLayout(7, 5, 2, 2));
        String[] buttons = {
                "MS" ,"MR" ,"MC","M+","M-",
                "2nd","Pi" ,"e" ,""  ,""  ,
                "x²" ,"("  ,")" ,"n!","/" ,
                ""   ,"7"  ,"8" ,"9" ,"*" ,
                "10²","4"  ,"5" ,"6" ,"-" ,
                "log","1"  ,"2" ,"3" ,"+" ,
                "ln" ,"+/-","0" ,"C" ,"=" ,
        };

        Map<String, Runnable> actions = new HashMap<>();

        // действия для особых кнопок
        actions.put("C", () -> display.setText(""));
        actions.put("=", () -> {
//            try {
//                double result = ExpressionEvaluator.evaluate(display.getText());
//                display.setText(String.valueOf(result));
//            } catch (Exception ex) {
//                display.setText("Error");
//            }
        });

        // генерация кнопок
        for (String label : buttons) {
            JButton btn = new JButton(label);
            btn.setFont(new Font("Arial", Font.BOLD, 22));
            btn.addActionListener(e -> {
                Runnable action = actions.get(label);
                if (action != null) {
                    action.run();
                } else {
                    display.setText(display.getText() + label);
                }
            });
            numPanel.add(btn);
        }

        frame.add(numPanel, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
