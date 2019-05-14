import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;

public class FrameOne {

	private JFrame frame;
	private JTextField textFieldNum2;
	private JTextField textFieldNum1;
	private JButton btnNewButtonSubtract;
	private JButton btnNewButtonAdd;
	private JButton btnNewButtonMultiply;
	private JButton btnNewButton;
	private JTextField textFieldAnswer;
	private JLabel lblResultLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameOne window = new FrameOne();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FrameOne() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textFieldNum2 = new JTextField();
		textFieldNum2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldNum2.setBounds(233, 33, 169, 44);
		frame.getContentPane().add(textFieldNum2);
		textFieldNum2.setColumns(10);
		
		textFieldNum1 = new JTextField();
		textFieldNum1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldNum1.setBounds(36, 33, 169, 44);
		frame.getContentPane().add(textFieldNum1);
		textFieldNum1.setColumns(10);
		
		btnNewButtonSubtract = new JButton("SUBTRACT");
		btnNewButtonSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int Num1, Num2, answer;
				try {
					Num1 =Integer.parseInt(textFieldNum1.getText());
					Num2 =Integer.parseInt(textFieldNum2.getText());
					
					answer = Num1 - Num2;
					textFieldAnswer.setText(Integer.toString(answer));
				}
				catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Please enter a valid number");
				}
			}
		});
		btnNewButtonSubtract.setBounds(233, 88, 109, 23);
		frame.getContentPane().add(btnNewButtonSubtract);
		
		btnNewButtonAdd = new JButton("ADD");
		btnNewButtonAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int Num1, Num2, answer;
				try {
					Num1 =Integer.parseInt(textFieldNum1.getText());
					Num2 =Integer.parseInt(textFieldNum2.getText());
					
					answer = Num1 + Num2;
					textFieldAnswer.setText(Integer.toString(answer));
				}
				catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Please enter a valid number");
				}
			}
		});
		btnNewButtonAdd.setBounds(90, 88, 115, 23);
		frame.getContentPane().add(btnNewButtonAdd);
		
		btnNewButtonMultiply = new JButton("MULTIPLY");
		btnNewButtonMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int Num1, Num2, answer;
				try {
					Num1 =Integer.parseInt(textFieldNum1.getText());
					Num2 =Integer.parseInt(textFieldNum2.getText());
					
					answer = Num1 * Num2;
					textFieldAnswer.setText(Integer.toString(answer));
				}
				catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Please enter a valid number");
				}
			}
		});
		btnNewButtonMultiply.setBounds(90, 135, 115, 23);
		frame.getContentPane().add(btnNewButtonMultiply);
		
		btnNewButton = new JButton("DIVIDE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int Num1, Num2, answer;
				try {
					Num1 =Integer.parseInt(textFieldNum1.getText());
					Num2 =Integer.parseInt(textFieldNum2.getText());
					
					answer = Num1 / Num2;
					textFieldAnswer.setText(Integer.toString(answer));
				}
				catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Please enter a valid number");
				}
			}
		});
		btnNewButton.setBounds(233, 135, 109, 23);
		frame.getContentPane().add(btnNewButton);
		
		textFieldAnswer = new JTextField();
		textFieldAnswer.setFont(new Font("Tahoma", Font.BOLD, 20));
		textFieldAnswer.setBounds(233, 183, 169, 44);
		frame.getContentPane().add(textFieldAnswer);
		textFieldAnswer.setColumns(10);
		
		lblResultLabel = new JLabel("Answer:");
		lblResultLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblResultLabel.setBounds(125, 189, 89, 30);
		frame.getContentPane().add(lblResultLabel);
	}
}
