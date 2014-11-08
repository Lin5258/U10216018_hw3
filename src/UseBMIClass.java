
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UseBMIClass extends JFrame {
	
	JTextField field0 = new JTextField(10);		//Create a TextField
	JTextField field = new JTextField(10);		//Create a TextField
	JTextField field2 = new JTextField(10);		//Create a TextField
	JButton btn = new JButton();				//Create a Button
	JLabel label = new JLabel();				//Create a Label
	
	/**Constructs the user interface.*/
	public UseBMIClass() {
		// Set FlowLayout, aligned left with horizontal gap 10
		// and vertical gap 20 between components
		setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));
		
				
		BMI bmi1 = new BMI("Kim Yang", 18, 145, 70);	//Construct an object with name, age, height and weight.
		add(new JLabel("The BMI for " + bmi1.getName() + " is " + bmi1.getBMI() + " " + bmi1.getStatus()));		//Add label
		
		BMI bmi2 = new BMI("Susan King", 215, 70);		//Construct an object with name, height and weight.
		add(new JLabel("The BMI for " + bmi2.getName() + " is " + bmi2.getBMI() + " " + bmi2.getStatus()));		//Add label
		
		add(new JLabel("Enter the name "));		//Add a label
		add(field0);							//Add a TextField
		
		add(new JLabel("Enter the height "));	//Add a label
		add(field);								//Add a TextField
		
		add(new JLabel("Enter the weight "));	//Add a label
		add(field2);							//Add a TextField
		
		btn.setText("Enter");
		add(btn);								//Add a button
		
		label.setText("Click Enter to compute the BMI");		//Set TextField
		add(label);								//Add a TextFeild
		
		ButtonListenerClass blc = new ButtonListenerClass();		//Create a listener
		btn.addActionListener(blc);									//Register listener with button
	}
	
	/**Creates an instance of the main class and then displays the frames.*/
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
			double height = Double.parseDouble(field.getText());	//Get the height that user input and change it from string to double type.
			double weight = Double.parseDouble(field2.getText());	//Get the weight that user input and change it from string to double type.
			String name = field0.getText();							//Get the name that user input.
			
			BMI bmi3 = new BMI(name, height, weight);				//Construct an object with the information that user inputed.
			label.setText("The BMI for " + bmi3.getName() + " is " + bmi3.getBMI() + " " + bmi3.getStatus());	//Display the result.
			
		}
	}

}

	
