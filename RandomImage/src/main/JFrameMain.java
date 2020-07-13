package main;

import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class JFrameMain extends JFrame {
	private String []Images= {"1.jpg","2.jpg","4.jpg"};
	private JLabel lblImage;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameMain frame = new JFrameMain();
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
	public JFrameMain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Terminate the program when press the "x" button 
		setBounds(250, 250, 850, 650);  //set frame/container bounds  x coordinate on the screen 250 and y 250 width 850 and height 650 
		contentPane = new JPanel(); // construct the panel 
		contentPane.setBorder(new LineBorder(Color.black,5)); //border panel with black color and 5dp width line 
		setContentPane(contentPane); //add the panel to the frame 
		contentPane.setLayout(null); //set layout null 
		lblImage = new JLabel(""); //construct the label image where i created it in the design with id lblImage
		lblImage.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblImage.setBounds(120, 120, 822, 551);
		contentPane.add(lblImage);
		Timer timer=new Timer(1000, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int num= (int)(Math.floor(Math.random()*3));
				String image = Images[num];
				lblImage.setIcon(new ImageIcon("src//images//"+image));
			}
		});
		timer.start();
	}
}
