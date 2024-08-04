import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewCurrencyConverter {
        public static void main(String args[]) {
            JFrame f = new JFrame("Currency CONVERTER");

            JLabel l1 = new JLabel("Rupees:");
            l1.setBounds(20, 40, 60, 30);
            JLabel l2 = new JLabel("Dollars:");
            l2.setBounds(170, 40, 60, 30);
            JLabel result = new JLabel();
            result.setBounds(70, 100, 200, 30);

            JTextField t1 = new JTextField();
            t1.setBounds(80, 40, 70, 30);
            JTextField t2 = new JTextField();
            t2.setBounds(240, 40, 70, 30);
            JButton b1 = new JButton("convert");
            b1.setBounds(50, 80, 130, 15);

            b1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String rupees, dollar;
                    rupees = t1.getText();
                    dollar = t2.getText();
                    if (t1.getText().isEmpty() && t2.getText().isEmpty() ) {
                        result.setText("please enter value");
                    } else if (dollar.isEmpty()) {
                        convertToUSD(rupees);
                    } else if (t1.getText().isEmpty()) {
                        convertToRupees(dollar);

                    } else if(!t1.getText().isEmpty() && !t2.getText().isEmpty()){
                        result.setText(String.valueOf("dollar = " + convertToUSD(rupees)+ " rupees =" + convertToRupees(dollar)));
                    }
                }
            });

            f.add(l1);
            f.add(t1);
            f.add(l2);
            f.add(t2);
            f.add(b1);
            f.add(result);

            f.setLayout(null);
            f.setSize(400, 300);
            f.setVisible(true);
        }

    private static float convertToRupees(String dollar) {
        float d = Float.parseFloat(dollar);
        return (float) (d * 83.7);
    }

    private static float convertToUSD(String rupees) {
        float d2 = Float.parseFloat(rupees);
        return (float) (d2 / 83.7);
    }
}
