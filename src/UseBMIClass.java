
import javax.swing.JLabel;
import javax.swing.JFrame;
import java.awt.FlowLayout;

public class UseBMIClass extends JFrame {
	
	public UseBMIClass() {
		// Set FlowLayout, aligned left with horizontal gap 10
		// and vertical gap 20 between components
		setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));
		
		BMI bmi1 = new BMI("Kim Yang", 18, 145, 70);	//Construct an object with name, age, height and weight.
		add(new JLabel("The BMI for " + bmi1.getName() + " is " + bmi1.getBMI() + " " + bmi1.getStatus()));		//Add label
		
		BMI bmi2 = new BMI("Susan King", 215, 70);		//Construct an object with name, height and weight.
		add(new JLabel("The BMI for " + bmi2.getName() + " is " + bmi2.getBMI() + " " + bmi2.getStatus()));		//Add label
	}

	public static void main(String[] args) {
		
		UseBMIClass frame = new UseBMIClass();		//Construct an instance of UseBMIClass.
		
		frame.setTitle("BMI");		//Set frame title.
		frame.setSize(400, 200);	//Set frame size.
		frame.setLocationRelativeTo(null);		//Set frame location.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//Let frame can be close.
		frame.setVisible(true);		//Let frame can be seem.

	}

}
