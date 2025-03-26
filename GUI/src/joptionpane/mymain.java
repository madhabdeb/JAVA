package joptionpane;

import javax.swing.JOptionPane;

public class mymain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JOptionPane.showMessageDialog( null, "hellow madhab deb" );
		
		String name =JOptionPane.showInputDialog( "What is your name?" );
		
		String message=String.format("hello %s",name);
		
		JOptionPane.showMessageDialog(null,message);

	}

}
