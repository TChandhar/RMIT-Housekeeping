package layout;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import Cards.cardWAMASIFY;
 
public class RMIT_TOM implements ItemListener {
    JPanel cards; //a panel that uses CardLayout
    
    final static String BUTTONPANEL = "Card with JButtons";
    final static String TEXTPANEL = "Card with JTextField";
    final static String WAMASIFY = "WAMASIFY text string";
     
    public void addComponentToPane(Container pane) {
        //Put the JComboBox in a JPanel to get a nicer look.
        JPanel comboBoxPane = new JPanel(); //use FlowLayout
        String comboBoxItems[] = { BUTTONPANEL, TEXTPANEL, WAMASIFY};
        JComboBox cb = new JComboBox(comboBoxItems);
        cb.setEditable(false);
        cb.addItemListener(this);
        comboBoxPane.add(cb);
         
        //Create the "cards".
        //create base card class and extend to individual functions
        cardWAMASIFY card3 = new cardWAMASIFY();
        
        JPanel card1 = new JPanel();
        card1.add(new JButton("Button 1"));
        card1.add(new JButton("Button 2"));
        card1.add(new JButton("Button 3"));
        
         
        JPanel card2 = new JPanel();
        card2.add(new JTextField("TextField", 20));
         
        //Create the panel that contains the "cards".
        cards = new JPanel(new CardLayout());
        cards.add(card1, BUTTONPANEL);
        cards.add(card2, TEXTPANEL);
        cards.add(card3 ,WAMASIFY);
      
        ImageIcon logo = new ImageIcon(getClass().getResource("RMITom.png"));
        
        JLabel logoLabel = new JLabel(logo);
        
        JPanel title = new JPanel(); 
        title.setLayout(new BorderLayout());
        title.add(logoLabel,BorderLayout.WEST);
        title.add(comboBoxPane,BorderLayout.EAST);
   
        //pane.add(logoLabel, BorderLayout.LINE_START);
        //pane.add(comboBoxPane,BorderLayout.LINE_END);
        pane.add(title,BorderLayout.NORTH);
        pane.add(cards, BorderLayout.CENTER);
        //pane.setSize(500,500);
        
        
        //pane.add(logoLabel, BorderLayout.PAGE_START);
        //pane.add(comboBoxPane, BorderLayout.PAGE_END);
        //pane.add(cards, BorderLayout.CENTER);
    }
     
    public void itemStateChanged(ItemEvent evt) {
        CardLayout cl = (CardLayout)(cards.getLayout());
        cl.show(cards, (String)evt.getItem());
    }
     
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event dispatch thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("RMIT T.O.M");
        frame.setSize(640,480);
        //frame.setSize(500,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
        //Create and set up the content pane.
        RMIT_TOM demo = new RMIT_TOM();
        demo.addComponentToPane(frame.getContentPane());
         
        //Display the window.
        
        //frame.pack();
        frame.setVisible(true);
    }
     
    public static void main(String[] args) {
        /* Use an appropriate Look and Feel 
        try {
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        } catch (InstantiationException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }*/
        /* Turn off metal's use of bold fonts */
        //UIManager.put("swing.boldMetal", Boolean.FALSE);
         
        //Schedule a job for the event dispatch thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}