package gliabraies.cordinte;

import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel extends JPanel{
	
	public void paintComponent( Graphics g )
	{
		super.paintComponent( g );
		int width = getWidth(); 
		int height = getHeight(); 
		for(int a=0;a<500;a+=25){   ///ift has done for loop
//		width=width-a;
		g.drawLine( 0, 0, width-a, height );
		g.drawLine( 0, height, width-a, 0 );

		}
	}
	

}
