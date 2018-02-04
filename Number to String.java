import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Number2String extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//variable to keep index of the string number from user input
	public int num = 0;
	//Initial string of user input
	public String number = "";
	private JPanel contentPane;
	private final JPanel panel = new JPanel();
	//Button for storing the user input number
	private final JButton btnNewButton = new JButton("Enter the number");
	//Display for the questions
	private final JTextField textField = new JTextField();
	//Display for the answers
	private final JTextField textField_1 = new JTextField();
	
	private final JLabel lblNewLabel = new JLabel("Answer me");
	private final JLabel label = new JLabel("");
	//Questionnaire
	private final JButton btnNewButton_1 = new JButton("Press for question");
	String [] arr = {"What do you want to buy with $", "What college course is ", "Who is most likely to live in the street ",
			"Who is likely to have last digit of phone number as ","What cost $","Who would you pay $","Who lives in room #","Who do you think has a license plate number including ",
			"Who is most likely to have this many children"};
	//index for the questions
	public int index = 0;
  

	
	
	
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Number2String frame = new Number2String();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Number2String() {
		textField_1.setColumns(10);
		textField.setColumns(20);
		initGUI();
	}
	private void initGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		contentPane.add(panel, BorderLayout.CENTER);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = textField.getText();
			}
		});
		
		panel.add(textField);
		
		panel.add(btnNewButton);
		
		panel.add(lblNewLabel);
		
		panel.add(textField_1);
		//Adding the new question on to the view side, and getting the user input answer and storing it in the label.
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (num+3 <= number.length()) {
				lblNewLabel.setText(arr[index] + number.substring(num, num+3));
				num = num + 3;
				index = index + 1;
				label.setText(label.getText() + " " + textField_1.getText());
				} else {
					lblNewLabel.setText(arr[index] + number.substring(num));
					label.setText(label.getText() + " " + textField_1.getText());
				}
			}
		});
		
		panel.add(btnNewButton_1);
		
		contentPane.add(label, BorderLayout.SOUTH);
	}

}
