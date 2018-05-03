
import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class MapViewer extends Canvas{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6818686894060817625L;

	public MapViewer(int width, int height, String title, Map game) 
	{
		JFrame frame = new JFrame(title);
		frame.setPreferredSize(new Dimension(width, height));
		frame.setMaximumSize(new Dimension(width, height));
		frame.setMinimumSize(new Dimension(width, height));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.add(game);
		frame.setVisible(true);
		game.start();
	}

}