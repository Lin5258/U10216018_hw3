
import javax.swing.JLabel;
import javax.swing.JFrame;
import java.awt.FlowLayout;

public class UseBMIClass extends JFrame {
	
	public UseBMIClass() {
		// Set FlowLayout, aligned left with horizontal gap 10
		// and vertical gap 20 between components
		setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));
		
		BMI bmi1 = new BMI("Kim Yang", 18, 145, 70);
		add(new JLabel("The BMI for " + bmi1.getName() + " is " + bmi1.getBMI() + " " + bmi1.getStatus()));
		
		BMI bmi2 = new BMI("Susan King", 215, 70);
		add(new JLabel("The BMI for " + bmi2.getName() + " is " + bmi2.getBMI() + " " + bmi2.getStatus()));
	}

	public static void main(String[] args) {
		
		UseBMIClass frame = new UseBMIClass();
		
		frame.setTitle("BMI");
		frame.setSize(400, 200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}
