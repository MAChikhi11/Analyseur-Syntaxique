import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;


public class WindowExo2 extends JFrame implements ActionListener{
	JFrame frame= new JFrame();
	JButton button;
	JTextArea textarea;
	JTextArea textarea1;
	JScrollPane scroll;
	JPanel middlePanel ;
	JTextArea display ;
	String Words ;
	
	WindowExo2(){
		
		
		this.setLayout(new FlowLayout());
		
		frame.setPreferredSize(new Dimension(600,320));
		button = new JButton("Submit");
		button.addActionListener(this);
		
		textarea=new JTextArea();
		textarea.setText("Donnez n la taille des mots:");
		textarea.setPreferredSize(new Dimension(200,300));
		textarea.setEditable(false);
		textarea.setLocation(100,0);
		textarea.setLineWrap(true);
		textarea.setWrapStyleWord(true);
		
		//////////////////////////////////
		 	middlePanel=new JPanel();
		    middlePanel.setBorder( new TitledBorder(new EtchedBorder(), "Display Area"));
		    

		    // create the middle panel components
		    display = new JTextArea(16,58);
		    display.setEditable(false); // set textArea non-editable
		    display.setLineWrap(true);
			display.setWrapStyleWord(true);
		    scroll = new JScrollPane(display);
		    scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		    
		   

		
		textarea1=new JTextArea();
		textarea1.setPreferredSize(new Dimension(300,300));
		textarea1.getDocument().putProperty("filterNewlines", Boolean.TRUE);
		
		
		
		Font font = new Font("Segoe Script", Font.BOLD, 40);
        textarea1.setFont(font);
        textarea.setFont(font);
        textarea1.setForeground(new Color(0x123456));
        textarea1.setBackground(new Color(0xb5838d));
        textarea.setBackground(new Color(0xb5838d));
        display.setBackground(new Color(0xb5838d));
		/*scroll = new JScrollPane(textarea);
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);*/
		
		getContentPane().setBackground(new Color(0xe5989b));
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
			try{
	            int number = Integer.parseInt(s);
			    Exo2 exo2= new Exo2(number);
			    Words=exo2.getWords(number);
			    Words=Words+"\n"+exo2.getsize()+" mots";
			    
	        }
	        catch (NumberFormatException ex){
	            ex.printStackTrace();
	        }
			
		    display.setText(Words);
		}
		
	}
}
