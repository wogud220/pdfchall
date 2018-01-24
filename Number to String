import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;
public class Digit2Alpha extends JFrame {
	
	private JPanel contentPane;
	private final JPanel panel = new JPanel();
	private final JPanel panel_1 = new JPanel();
	//Text field for number inputs
	private final JTextField textField = new JTextField();
	//Button to create alphabet version
	private final JButton btnNewButton = new JButton("Change to alphabet");
	//Displayer for the alphabets
	private final JLabel lblNewLabel = new JLabel("ALPHABET");
	
	
	//Takes in an integer, and gives back corresponding alphabet
	private String getCharForNumber(int i) {
	    return i > -1 && i < 26 ? String.valueOf((char)(i + 65)) : null;
	}


	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Digit2Alpha frame = new Digit2Alpha();
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
	public Digit2Alpha() {
		textField.setColumns(10);
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
		
		panel.add(lblNewLabel);
		
		contentPane.add(panel_1, BorderLayout.NORTH);
		
		panel_1.add(textField);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String digit = textField.getText();
				ArrayList<Integer> lst = new ArrayList<Integer>();
				for (String field : digit.split(""))
				    lst.add(Integer.parseInt(field));
				String res = "";
				for (int x:lst) 
					res = res + getCharForNumber(x);
					

				lblNewLabel.setText(res);
			}
		});
		
		panel_1.add(btnNewButton);
	}

}

