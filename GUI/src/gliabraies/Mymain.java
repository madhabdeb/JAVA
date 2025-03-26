package gliabraies;

import javax.swing.JOptionPane;

public class Mymain {

	public static void main(String[] args) {
		
		
		JOptionPane.showMessageDialog( null, "hellow madhab deb" );
		
		String name =JOptionPane.showInputDialog( "What is your name?" );
		
		String message=String.format("hello %s",name);
		message+="hi"+5;
		
		JOptionPane.showMessageDialog(null,message);
		
	}// end main

}// end class
