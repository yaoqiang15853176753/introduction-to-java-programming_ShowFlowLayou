import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class ShowFlowLayout extends JFrame {
	
		 public  ShowFlowLayout(){
			 setLayout(new FlowLayout( FlowLayout.LEFT,10,20));
			 add (new JLabel("File Name"));
			 add (new JButton("OK"));
			 add(new JTextField(8));
			 }
		 public static void main (String [] args){
   
			 ShowFlowLayout frame = new ShowFlowLayout();
			 frame.setTitle("showfilwlayou");
			 frame.setVisible(true);
			 frame.setSize(600, 200);
			 frame.setLocationRelativeTo(null);
			 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			 

		 }
}		 
