import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class BmiCalculator {
        public static void main(String[] args) {
            System.out.println("jframe is used to build gui in java application");
            JFrame jframe = new JFrame("BMI calculator");
            // to get the input from user JTextField
            //to display any message we use Jlabel
            //to perform any acion by click on the button JButton
            JLabel userWeightLabel= new JLabel("enter your weight in kg");
            userWeightLabel.setBounds(40, 40 , 200, 40);
            JTextField userWeighttextField = new JTextField();
            userWeighttextField.setBounds(250, 40, 40, 40);
            JLabel userHeightLabel= new JLabel("enter your height in meter");
            userHeightLabel.setBounds(40, 100 , 200, 40);
            JTextField userHeighttextField = new JTextField();
            userHeighttextField.setBounds(250, 100, 60, 40);
            JButton calculate = new JButton("calculate BMI");
            calculate.setBounds(100, 250, 150, 50);
            //to show the result create a label
            JLabel j1 = new JLabel();
            j1.setBounds(40,150,200,40);


            // by click on the button
            calculate.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    //add validation in height and weight
                    if (userWeighttextField.getText().isEmpty() || userHeighttextField.getText().isEmpty() ){
                        j1.setText("please enter height and weight");
                    } else{
                        float weight = Float.parseFloat(userWeighttextField.getText());
                        float height = Float.parseFloat(userHeighttextField.getText());
                        float value = weight/(height*height);
                        //for the text color change
                        j1.setForeground(Color.MAGENTA);
                        j1.setText(String.valueOf(value));
                    }
                }
            });
            //add these objects with frame
            jframe.add(userWeightLabel);
            jframe.add(userWeighttextField);
            jframe.add(userHeightLabel);
            jframe.add(userHeighttextField);
            jframe.add(calculate);
            jframe.add(j1);

            // to use the default layout
            jframe.setLayout(null);
            //to add the size in frame
            jframe.setSize(400, 400);
            //set visible the frame
            jframe.setVisible(true);
        }
}