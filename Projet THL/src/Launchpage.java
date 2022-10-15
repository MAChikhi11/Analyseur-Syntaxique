import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Launchpage  implements ActionListener{
	JFrame frame= new JFrame();
	JButton button1= new JButton("Exo1");
	JButton button2= new JButton("Exo2");
	JButton button3= new JButton("Exo3");
	ImageIcon image= new ImageIcon("TP.png");
	Launchpage(){
		
		
		/////////Button1
		button1.setBounds(100,400,200,50);
		button1.setBackground(new Color(0xd4a373));
		button1.setFocusable(false);
		button1.addActionListener(this);
		/////////Button2
		button2.setBounds(350,400,200,50);
		button2.setBackground(new Color(0xd4a373));
		button2.setFocusable(true);
		button2.addActionListener(this);
		/////////Button3
		button3.setBounds(600,400,200,50);
		button3.setBackground(new Color(0xd4a373));
		button3.setFocusable(false); 
		button3.addActionListener(this);
		/////////Frame
	    frame.setTitle("TP THL");
		frame.getContentPane().setBackground(new Color(0xfaedcd));
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(900,900);
		frame.setLayout(null);
		frame.setVisible(true);

		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		
		
		
		
		
		 
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==button1) {
			new WindowExo1();	
			
		}
		
		if(e.getSource()==button2) {
			new WindowExo2();
		}

		if(e.getSource()==button3) {
			new WindowExo3();
			
		}
			
		
	}
}
