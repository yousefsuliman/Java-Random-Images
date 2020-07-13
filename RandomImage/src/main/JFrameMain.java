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

	private JPanel contentPane;
	private String []Images= {"1.jpg","2.jpg","4.jpg"};
	private JLabel lblImage;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 812, 559);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblImage = new JLabel("");
		lblImage.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblImage.setBounds(41, 12, 745, 505);
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
