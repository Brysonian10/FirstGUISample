package gui.view;

import javax.swing.*;
import gui.controller.GUIController;

public class FirstPanel extends JPanel
{
	private GUIController appController;
	private JButton myButton;
	private JLabel myLabel;
	private SpringLayout appLayout;
	
	
	public FirstPanel(GUIController appController)
	{
		super();
		this.appController = appController;
		
		myButton  = new JButton("Click!");
		myLabel = new JLabel("words on a line");
		appLayout = new SpringLayout();
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(appLayout);
		this.add(myButton);
		this.add(myLabel);
	}
	
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.NORTH,  myLabel, 74,  SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.EAST,  myLabel, -86,  SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.NORTH,  myButton, 174,  SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.EAST,  myLabel, -135,  SpringLayout.NORTH, this);
	}
	
	private void setupListeners()
	{
		
	}
	
}
