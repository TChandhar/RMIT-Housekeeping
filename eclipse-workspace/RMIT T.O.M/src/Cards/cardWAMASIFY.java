package Cards;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import Logic.luTruncate;
import layout.TextPanel;

public class cardWAMASIFY extends JPanel {
	
	private TextPanel textPanel;
	private TextPanel output;
	private JButton btn;
	private JTextArea textArea;
	private JLabel cardLabel;

	
	public cardWAMASIFY()
	{
		super();
		textPanel = new TextPanel(5,20);
		textPanel.appendText("Input list of LU's here");
		output = new TextPanel(5,20);
		output.appendText("Output will appear here");
		btn = new JButton("Convert to WAMAS pastable");
		cardLabel = new JLabel("Converts a list of load units to a WAMAS pastable format");
		
		btn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				//textPanel.appendText("Nathan likes Buttz :P \n");
				ArrayList<String> test = luTruncate.truncate(textPanel.getTextArea());
				textPanel.clearText();
				output.clearText();
				//System.out.println(test.size());
				
				for(int i = 0 ; i < test.size(); i++)
				{
					
					output.appendText(test.get(i));
					//textPanel.appendText(test.get(i));
					//textPanel.appendText("\n");
					
					
				}
				
				
			}
			
		});
		
		
		
		//try put input and convert button in their own panel
		JPanel convertLine = new JPanel();
		
		//textArea = new JTextArea(5,10);
		
		setLayout(new BorderLayout(5,5));
		add(cardLabel,BorderLayout.NORTH);
		add(textPanel,BorderLayout.CENTER);
		add(btn,BorderLayout.LINE_END);
		add(output,BorderLayout.SOUTH);
		
		//setLayout(new FlowLayout());
		//add(textPanel);
		
		//below works
		/*
		JPanel textar = new JPanel();
		textar.add(textArea);
		textar.add(new JScrollPane(textArea));
		add(textar);*/
		//add(textArea);
		
		//add(textArea, BorderLayout.CENTER);
		
		
		
		
	}

}
