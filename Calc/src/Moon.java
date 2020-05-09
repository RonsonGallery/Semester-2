import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class Moon {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Moon window = new Moon();
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
	public Moon() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 268, 469);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel show_image = new JLabel("New label");
		show_image.setBounds(10, 147, 158, 258);
		
		JComboBox comboBox = new JComboBox();
		
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent event) {
				if(event.getSource() == comboBox) {
					if(comboBox.getSelectedItem().equals("New")) {
						show_image.setIcon(new ImageIcon(Moon.class.getResource("/1.jpg")));
						frame.getContentPane().add(show_image);
					}
					else
						if(comboBox.getSelectedItem().equals("Waxing Crescent")){
							show_image.setIcon(new ImageIcon(Moon.class.getResource("/2.jpg")));
							frame.getContentPane().add(show_image);
						}
						else
							if(comboBox.getSelectedItem().equals("First Quarter")){
								show_image.setIcon(new ImageIcon(Moon.class.getResource("/3.jpg")));
								frame.getContentPane().add(show_image);
							}
							else
								if(comboBox.getSelectedItem().equals("Waxing Gibbous")){
									show_image.setIcon(new ImageIcon(Moon.class.getResource("/4.jpg")));
									frame.getContentPane().add(show_image);
								}
								else
									if(comboBox.getSelectedItem().equals("Full")){
										show_image.setIcon(new ImageIcon(Moon.class.getResource("/5.jpg")));
										frame.getContentPane().add(show_image);
									}
									else
										if(comboBox.getSelectedItem().equals("Waxing Gibbous")){
											show_image.setIcon(new ImageIcon(Moon.class.getResource("/6.jpg")));
											frame.getContentPane().add(show_image);
										}
										else
											if(comboBox.getSelectedItem().equals("Third Quarter")){
												show_image.setIcon(new ImageIcon(Moon.class.getResource("/7.jpg")));
												frame.getContentPane().add(show_image);
											}
											else
												if(comboBox.getSelectedItem().equals("Waning Crescent")){
													show_image.setIcon(new ImageIcon(Moon.class.getResource("/8.jpg")));
													frame.getContentPane().add(show_image);
												}
					}
				}
		});

		comboBox.addItem("New");
		comboBox.addItem("Waxing Crescent");
		comboBox.addItem("First Quarter");
		comboBox.addItem("Waxing Gibbous");
		comboBox.addItem("Full");
		comboBox.addItem("Waning Gibbous");
		comboBox.addItem("Third Quarter");
		comboBox.addItem("Waning Crescent");
		comboBox.setBounds(10, 11, 232, 57);
		frame.getContentPane().add(comboBox);
		
		
	}
}
