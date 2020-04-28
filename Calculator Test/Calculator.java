import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Test {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test window = new Test();
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
	double num,ans;
	int calculation;
	
	public Test() {
		initialize();
	}
	public void operation() {
		switch(calculation) {
		case 1:
			ans = num + Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ans));
			break;
		case 2:
			ans = num - Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ans));
			break;
		case 3:
			ans = num * Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ans));
			break;
		case 4:
			if((Double.parseDouble(textField.getText())) == 0) {
				textField.setText("Syntax Error");
				break;
			}
			ans = num / Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ans));
			break;
		case 5:
			ans = num % Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ans));
			break;
		}
			
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Calculator");
		frame.setBounds(100, 100, 269, 406);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(22, 22, 215, 41);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("7");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + '7');
			}
		});
		btnNewButton.setBounds(22, 155, 46, 41);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("8");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + '8');
			}
		});
		btnNewButton_1.setBounds(79, 155, 46, 41);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("9");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + '9');
			}
		});
		btnNewButton_2.setBounds(135, 155, 46, 41);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("4");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + '4');
			}
		});
		btnNewButton_3.setBounds(22, 207, 46, 41);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("5");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + '5');
			}
		});
		btnNewButton_4.setBounds(79, 207, 46, 41);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("6");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + '6');
			}
		});
		btnNewButton_5.setBounds(135, 207, 46, 41);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("1");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + '1');
			}
		});
		btnNewButton_6.setBounds(22, 259, 46, 41);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("2");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + '2');
			}
		});
		btnNewButton_7.setBounds(79, 259, 46, 41);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("3");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + '3');
			}
		});
		btnNewButton_8.setBounds(135, 259, 46, 41);
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_6_1 = new JButton("0");
		btnNewButton_6_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(textField.getText() + '0');
			}
		});
		btnNewButton_6_1.setBounds(22, 311, 46, 41);
		frame.getContentPane().add(btnNewButton_6_1);
		
		JButton btnNewButton_6_1_1 = new JButton("=");
		btnNewButton_6_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operation();
			}
		});
		btnNewButton_6_1_1.setBounds(135, 311, 102, 41);
		frame.getContentPane().add(btnNewButton_6_1_1);
		
		JButton btnNewButton_2_2_1 = new JButton("+");
		btnNewButton_2_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(textField.getText());
				calculation = 1;
				textField.setText("");
				
			}
		});
		btnNewButton_2_2_1.setBounds(191, 259, 46, 41);
		frame.getContentPane().add(btnNewButton_2_2_1);
		
		JButton btnNewButton_2_2_1_1 = new JButton("-");
		btnNewButton_2_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(textField.getText());
				calculation = 2;
				textField.setText("");
			}
		});
		btnNewButton_2_2_1_1.setBounds(191, 207, 46, 41);
		frame.getContentPane().add(btnNewButton_2_2_1_1);
		
		JButton btnNewButton_2_2_1_2 = new JButton("X");
		btnNewButton_2_2_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(textField.getText());
				calculation = 3;
				textField.setText("");
			}
		});
		btnNewButton_2_2_1_2.setBounds(191, 155, 46, 41);
		frame.getContentPane().add(btnNewButton_2_2_1_2);
		
		JButton btnNewButton_2_2_1_3 = new JButton(".");
		btnNewButton_2_2_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StringBuilder dot = new StringBuilder(textField.getText());
				String extra = dot.toString();
				int len = textField.getText().length();
				if((len > 0) && (extra.charAt(len-1))!='.') {
					textField.setText(textField.getText() + '.');
				}
			}
		});
		btnNewButton_2_2_1_3.setBounds(79, 311, 46, 41);
		frame.getContentPane().add(btnNewButton_2_2_1_3);
		
		JButton btnNewButton_9 = new JButton("%");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(textField.getText());
				calculation = 5;
				textField.setText("");
			}
		});
		btnNewButton_9.setBounds(22, 103, 46, 41);
		frame.getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_9_1 = new JButton("C");
		btnNewButton_9_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		btnNewButton_9_1.setBounds(79, 103, 46, 41);
		frame.getContentPane().add(btnNewButton_9_1);
		
		JButton btnNewButton_9_2 = new JButton("<-");
		btnNewButton_9_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int length = textField.getText().length();
				int number = textField.getText().length() -1;
				String store;
				
				if(length > 0) {
					StringBuilder back = new StringBuilder(textField.getText());
					back.deleteCharAt(number);
					store = back.toString();
					textField.setText(store);
				}
			}
		});
		btnNewButton_9_2.setBounds(135, 103, 46, 41);
		frame.getContentPane().add(btnNewButton_9_2);
		
		JButton btnNewButton_9_3 = new JButton("/");
		btnNewButton_9_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(textField.getText());
				calculation = 4;
				textField.setText("");
			}
		});
		btnNewButton_9_3.setBounds(191, 103, 46, 41);
		frame.getContentPane().add(btnNewButton_9_3);
	}
}
