import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;


public class WindowExo3 extends JFrame implements ActionListener{
	JFrame frame= new JFrame();
	JButton button;
	JTextArea textarea;
	JTextArea textarea1;
	JScrollPane scroll;
	JPanel middlePanel ;
	JTextArea display ;
	String Words ;
	
	WindowExo3(){
		
		
		this.setLayout(new FlowLayout());
		
		frame.setPreferredSize(new Dimension(600,320));
		button = new JButton("Submit");
		button.addActionListener(this);
		
		textarea=new JTextArea();
		textarea.setText("Donnez Le Mot A Evaluer :");
		textarea.setPreferredSize(new Dimension(200,300));
		textarea.setEditable(false);
		textarea.setLocation(100,0);
		
		//////////////////////////////////
		 	middlePanel=new JPanel();
		    middlePanel.setBorder( new TitledBorder(new EtchedBorder(), "Display Area"));

		    // create the middle panel components
		    display = new JTextArea(16, 58);
		    display.setEditable(false); // set textArea non-editable
		    display.setLineWrap(true);
			display.setWrapStyleWord(true);
		    scroll = new JScrollPane(display);
		    scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		    
		   

		
		textarea1=new JTextArea();
		textarea1.setPreferredSize(new Dimension(300,300));
		textarea1.setForeground(new Color(0x123456));
	    textarea1.setBackground(new Color(0xb5838d));
	    textarea.setBackground(new Color(0xb5838d));
        display.setBackground(new Color(0xb5838d));
		textarea1.getDocument().putProperty("filterNewlines", Boolean.TRUE);
		
		
		
		/*scroll = new JScrollPane(textarea);
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);*/
		
		middlePanel.add(scroll);
		this.setResizable(false);
		this.add(textarea);
		this.add(textarea1);
		this.add(button);
		this.add(middlePanel);
		this.pack();
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			String s =textarea1.getText();
			String Words;
			    Exo3 exo3= new Exo3();
			    
			    if(exo3.analyseur(s)) {
			    	Words="Le mot \""+s+"\" Existe";
			    }
			    else{
			    	Words="Le mot \""+s+"\" n'Existe pas";
			    }
			    display.setText(Words);
	        }
			
			
		    
		}
		
	}

