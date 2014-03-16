
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;

public class UseBMIClass extends JFrame {
	
	JTextField field0 = new JTextField(10);
	JTextField field = new JTextField(10);
	JTextField field2 = new JTextField(10);
	JButton btn = new JButton();
	JLabel label = new JLabel();
	
	public UseBMIClass() {
		// Set FlowLayout, aligned left with horizontal gap 10
		// and vertical gap 20 between components
		setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));
		btn.setText("Enter");
		
		
		BMI bmi1 = new BMI("Kim Yang", 18, 145, 70);	//Construct an object with name, age, height and weight.
		add(new JLabel("The BMI for " + bmi1.getName() + " is " + bmi1.getBMI() + " " + bmi1.getStatus()));		//Add label
		
		BMI bmi2 = new BMI("Susan King", 215, 70);		//Construct an object with name, height and weight.
		add(new JLabel("The BMI for " + bmi2.getName() + " is " + bmi2.getBMI() + " " + bmi2.getStatus()));		//Add label
		
		add(new JLabel("Enter the name "));
		add(field0);
		
		add(new JLabel("Enter the height "));
		add(field);
		
		add(new JLabel("Enter the weight "));
		add(field2);
		
		add(btn);
		
		label.setText("Click Enter to compute the BMI");
		add(label);
		
		ButtonListenerClass blc = new ButtonListenerClass();
		btn.addActionListener(blc);
	}

	public static void main(String[] args) {
		
		UseBMIClass frame = new UseBMIClass();		//Construct an instance of UseBMIClass.
		
		frame.setTitle("BMI");		//Set frame title.
		frame.setSize(300, 300);	//Set frame size.
		frame.setLocationRelativeTo(null);		//Set frame location.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//Let frame can be close.
		frame.setVisible(true);		//Let frame can be seem.

	}
	
	class ButtonListenerClass implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e)	{
			double height = Double.parseDouble(field.getText());
			double weight = Double.parseDouble(field2.getText());
			String name = field0.getText();
			
			BMI bmi3 = new BMI(name, height, weight);
			label.setText("The BMI for " + bmi3.getName() + " is " + bmi3.getBMI() + " " + bmi3.getStatus());
		}
	}

}

	
