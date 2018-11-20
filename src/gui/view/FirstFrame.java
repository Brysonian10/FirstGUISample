package gui.view;

import javax.swing.JFrame;
import gui.controller.GUIController;

public class FirstFrame extends JFrame
{
	private FirstPanel appPanel;
	private GUIController appController;
	
	public FirstFrame(GUIController appController)
	{
		super();
		this.appController = appController;
		this.appPanel = new FirstPanel(appController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setSize(800, 800);
		this.setTitle("My GUI");
		this.setResizable(true);
		this.setVisible(true);
	}
}