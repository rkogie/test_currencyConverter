import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class test_CurrencyConverterV01 {

	private JFrame frame;
	private JTextField textFielduserEnterAmount;
	private JTextField textFieldresult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test_CurrencyConverterV01 window = new test_CurrencyConverterV01();
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
	public test_CurrencyConverterV01() {
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
		
		JComboBox comboBox_To = new JComboBox();
		comboBox_To.setModel(new DefaultComboBoxModel(new String[] {"None", "United States Dollar - USD", "Great British Pound - GBP"}));
		comboBox_To.setBounds(233, 58, 163, 20);
		frame.getContentPane().add(comboBox_To);
		
		JLabel lblconvertFrom = new JLabel("Convert From");
		lblconvertFrom.setBounds(27, 33, 106, 14);
		frame.getContentPane().add(lblconvertFrom);
		
		JComboBox comboBox_From = new JComboBox();
		comboBox_From.setModel(new DefaultComboBoxModel(new String[] {"None", "United States Dollar - USD", "Great British Pounds - GBP"}));
		comboBox_From.setBounds(27, 58, 163, 20);
		frame.getContentPane().add(comboBox_From);
		
		JLabel lblConvertTo = new JLabel("Convert To");
		lblConvertTo.setBounds(237, 33, 106, 14);
		frame.getContentPane().add(lblConvertTo);
		
		textFielduserEnterAmount = new JTextField();
		textFielduserEnterAmount.setBounds(27, 123, 163, 20);
		frame.getContentPane().add(textFielduserEnterAmount);
		textFielduserEnterAmount.setColumns(10);
		
		textFieldresult = new JTextField();
		textFieldresult.setBounds(233, 123, 167, 20);
		frame.getContentPane().add(textFieldresult);
		textFieldresult.setColumns(10);
		
		JButton btnconvertExecute = new JButton("Convert");
		btnconvertExecute.setBounds(167, 168, 89, 23);
		frame.getContentPane().add(btnconvertExecute);
		
		JButton btnresetProgram = new JButton("Reset");
		btnresetProgram.setBounds(167, 216, 89, 23);
		frame.getContentPane().add(btnresetProgram);
		
		JLabel lblEnterAmount = new JLabel("Enter Amount");
		lblEnterAmount.setBounds(27, 98, 120, 20);
		frame.getContentPane().add(lblEnterAmount);
		
		JLabel lblResult = new JLabel("Result");
		lblResult.setBounds(233, 101, 46, 14);
		frame.getContentPane().add(lblResult);
	}
}
