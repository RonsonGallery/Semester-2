import java.awt.EventQueue;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

public class BoxVolume {

	private JFrame frame;
	private JTextField width;
	private JTextField Height;
	private JTextField Length;
	private JButton btnNewButton;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private final JLabel label = new JLabel("Box Volume & Area");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BoxVolume window = new BoxVolume();
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
	public BoxVolume() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Box Volume & Area");
		frame.setBounds(100, 100, 451, 302);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		width = new JTextField();
		width.setText("Width");
		width.setBounds(108, 35, 145, 20);
		frame.getContentPane().add(width);
		width.setColumns(10);
		
		Height = new JTextField();
		Height.setText("Height");
		Height.setColumns(10);
		Height.setBounds(108, 66, 145, 20);
		frame.getContentPane().add(Height);
		
		Length = new JTextField();
		Length.setText("Length");
		Length.setColumns(10);
		Length.setBounds(108, 97, 145, 20);
		frame.getContentPane().add(Length);
		
		btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
					int Width,height,length,area,volume;
					Width = Integer.parseInt(width.getText());
					height = Integer.parseInt(Height.getText());
					length = Integer.parseInt(Length.getText());
					volume = Width*height*length;
					area = Width*height*2+Width*length*2+length*height*2;
					lblNewLabel_1.setText(Integer.toString(volume));
					lblNewLabel_2.setText(Integer.toString(area));
			}
		});
		btnNewButton.setBounds(10, 229, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Width:");
		lblNewLabel.setBounds(10, 41, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblHeight = new JLabel("Height:");
		lblHeight.setBounds(10, 69, 46, 14);
		frame.getContentPane().add(lblHeight);
		
		JLabel lblLength = new JLabel("Length:");
		lblLength.setBounds(10, 100, 46, 14);
		frame.getContentPane().add(lblLength);
		
		JLabel lblVolume = new JLabel("Volume:");
		lblVolume.setBounds(135, 233, 46, 14);
		frame.getContentPane().add(lblVolume);
		
		JLabel lblArea = new JLabel("Area:");
		lblArea.setBounds(246, 233, 46, 14);
		frame.getContentPane().add(lblArea);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(185, 233, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(277, 233, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JPanel panel = new JPanel();
		panel.setBounds(263, 35, 162, 183);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon(BoxVolume.class.getResource("/square.png")));
		lblNewLabel_3.setBounds(0, 0, 162, 183);
		panel.add(lblNewLabel_3);
		label.setBounds(25, -30, 98, 31);
		frame.getContentPane().add(label);
		
//		JLabel lblNewLabel_4 = new JLabel("Entering non integer values will crash the program");
//		lblNewLabel_4.setBounds(10, 174, 243, 44);
//		frame.getContentPane().add(lblNewLabel_4);
//		
//		JLabel lblNewLabel_4_1 = new JLabel("Disclaimer!!!!");
//		lblNewLabel_4_1.setBounds(10, 143, 75, 44);
//		frame.getContentPane().add(lblNewLabel_4_1);
	}
}
