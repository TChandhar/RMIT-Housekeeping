package layout;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TextPanel extends JPanel {
	
	private JTextArea textArea;
	
	public TextPanel(int x, int y)
	{
		
		super();
		textArea = new JTextArea(x,y);
		setLayout(new BorderLayout());
		add(textArea, BorderLayout.CENTER);
		add(new JScrollPane(textArea), BorderLayout.CENTER);
		
	
		
		
	
	}
	
	public void appendText(String text)
	{
		textArea.append(text);
	}
	
	public void clearText() {
		textArea.setText(null);
	}
	
	public JTextArea getTextArea()
	{
		return textArea;
	}

}
