package Algorithms;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
import java.awt.GraphicsConfiguration;
import java.awt.FlowLayout;
import javax.swing.*;


public class index
{
	static JTextField textfield1, textfield2;
	static GraphicsConfiguration gc;
	public static void main(String[] args)
	{
		Naive obj1 =new Naive();
		Rabin_karp obj2=new Rabin_karp();
		KMP obj3=new KMP();
		BMA obj4=new BMA();
		
		JFrame frame= new JFrame(gc);	
		frame.getContentPane().setLayout(new FlowLayout());
		frame.setTitle("PATTERN MATCHING");
		frame.setSize(1000, 1000);
		frame.setLocationRelativeTo(null);  //Setting the window to the centre of the screen
		frame.setVisible(true);
		frame.setBackground(Color.cyan);

		textfield1 = new JTextField("Enter the String",20);
	    textfield2 = new JTextField("Enter the Pattern",20);
	    //textfield3 = new JTextField("Text field 3",10);
	    frame.getContentPane().add(textfield1);
	    frame.getContentPane().add(textfield2);
	   // f.getContentPane().add(textfield3);
	   frame.pack();
	    
	    JButton n=new JButton("Naive");
	    n.setBounds(100,100,140, 40); 
	    JButton rk=new JButton("Rabin Karp"); 
	    rk.setBounds(100,100,140, 40); 
	    JButton kmp=new JButton("Knuth Morris Pratt");
	    kmp.setBounds(100,100,140, 40); 
	    JButton bma=new JButton("Boyer Moore"); 
	    bma.setBounds(100,100,140, 40); 
	    
	    frame.add(n);
	    frame.add(rk);
	    frame.add(kmp);
	    frame.add(bma);
	    
	    frame.validate();
  
	    Scanner sc=new Scanner(System.in);
		String givenstr= textfield1.getText();
        String pattern = textfield2.getText();
	
	n.addActionListener(new ActionListener() { 
	    public void actionPerformed(ActionEvent e) { 
	    	
	    	obj1.Naivesearch(pattern, givenstr);
	    } 
	});
}
}
