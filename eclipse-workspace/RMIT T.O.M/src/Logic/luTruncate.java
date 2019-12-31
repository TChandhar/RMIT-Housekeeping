package Logic;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JTextArea;

public class luTruncate 
{
	public luTruncate()
	{
		
	}
	
	public static ArrayList<String> truncate(JTextArea textArea)
	{
		String s[] = textArea.getText().split("\\r?\\n");
		ArrayList<String>arrList = new ArrayList<>(Arrays.asList(s));
		
		for( int i=0 ; i<arrList.size(); i++)
		{
			arrList.set(i,arrList.get(i)+";");
		}
		
		//System.out.println(arrList);
		return arrList;	
	}
	
}
