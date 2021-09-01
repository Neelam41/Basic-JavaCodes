package Systm;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//import java.sql;

public class SkyLark extends JFrame implements ActionListener{
	JLabel l1,l2,l3;
	JTextField tf1;
	JPasswordField pf2;
	JButton b1,b2,b3;
	
	SkyLark(){
//		 move the text to the center
		
		setFont(new Font("System",Font.BOLD, 22));
		Font f=getFont();
		FontMetrics fm = getFontMetrics(f);
		int x= fm.stringWidth("Automated Teller Machine");
		int y= fm.stringWidth(" ");
		int z= getWidth()-x;
		int w= z/y;
		String pad ="";
//		for (int i=0;i!=w;i++) pad +=" "
pad =String.format("%"+w+"s",pad);
setTitle(pad+"AUTOMATED TELLET MACHINE");

		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
	
	




