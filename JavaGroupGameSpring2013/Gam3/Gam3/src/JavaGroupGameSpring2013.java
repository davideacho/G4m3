import javax.swing.JFrame;


public class JavaGroupGameSpring2013 {

	/**
	 This is the Git Hub Version of the Java Game
	 Started by Mr. Roche with Alex Dolce, David Eacho, Ethan Pailes, 
	 Paul Tempel and Alex Von Campe, Spring term 2013
	 */
	
	//Instance variables
	static JFrame f;
	static GamePlayerPanel p;
	static int fWidth = 1000, fHeight=700;
	public static void main(String[] args) {
		
		//Start of the game, build a frame
		f = new JFrame("Mamma said not to change the title of the game.");
		f.setSize(fWidth, fHeight);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p = new GamePlayerPanel(fWidth, fHeight, f);
		f.add(p);

		f.setVisible(true);
               //f.setResizable(false);  -- Please keep the game resizable...Mr. Roche.
				//Changed the window so game resizes with window... Mr. Roche.
		
		System.out.println("Hi made a change on the computer next to hopper");
		System.out.println("Hi, I made this change on the Hopper Computer..."); 
	}

}
