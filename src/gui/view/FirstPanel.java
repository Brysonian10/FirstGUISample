package gui.view;

import javax.swing.*;
import gui.controller.GUIController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

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
		myButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent mouseClick)
			{
				changeColor();
			}
		});
	}
	
	private void changeColor()
	{
		int red = (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);
		
		this.setBackground(new Color(red, green, blue));
	}
	
}
