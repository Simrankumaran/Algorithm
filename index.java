package Algorithms;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
import java.awt.GraphicsConfiguration;
import java.awt.FlowLayout;
import javax.swing.*;


public class index
{
	static JTextField txt1, txt2;
	static GraphicsConfiguration gc;
	public static void main(String[] args)
	{
		
		Naive obj1 =new Naive();
		Rabin_karp obj2=new Rabin_karp();
		KMP obj3=new KMP();
		BMA obj4=new BMA();
		JPanel top=new JPanel();
		top.setLayout(new GridBagLayout());
		
		GridBagConstraints c = new GridBagConstraints();

		JFrame frame= new JFrame(gc);	
		frame.getContentPane().setLayout(new FlowLayout());
		frame.setTitle("PATTERN MATCHING");
		frame.setSize(1000, 1000);
		frame.setLocationRelativeTo(null);  //Setting the window to the centre of the screen
		frame.setVisible(true);
		frame.setBackground(Color.cyan);
		
		
		
		
		txt1 = new JTextField("Enter the String",20);
	    txt2 = new JTextField("Enter the Pattern",20);
	    //textfield3 = new JTextField("Text field 3",10);
	    //frame.getContentPane().add(textfield1);
	   // frame.getContentPane().add(textfield2);
	   // f.getContentPane().add(textfield3);
	   
	    
	    JButton n=new JButton("Naive");
	    n.setBounds(100,100,140, 40); 
	    JButton rk=new JButton("Rabin Karp"); 
	    rk.setBounds(100,100,140, 40); 
	    JButton kmp=new JButton("Knuth Morris Pratt");
	    kmp.setBounds(100,100,140, 40); 
	    JButton bma=new JButton("Boyer Moore"); 
	    bma.setBounds(100,100,140, 40); 
	    JButton res=new JButton("Reset"); 
	    res.setBounds(100,100,140, 40); 
	    
	    
	    JLabel op1=new JLabel(" ");
	    JLabel op2=new JLabel(" ");
	    JLabel op3=new JLabel(" ");
	    JLabel op4=new JLabel(" ");
	    
	    c.gridx=1;//TEXT FIELDS
	    c.gridy=1;
	    top.add(txt1, c);
	    c.gridx=2;
	    c.gridy=1;
	    top.add(txt2, c);
	    
	    c.gridx=1; //BUTTONS
	    c.gridy=2;
	    c.fill=c.HORIZONTAL;
	    c.insets = new Insets(3,3,3,3);

	    top.add(n, c);
	    c.gridx=1;
	    c.gridy=3;
	    top.add(rk, c);
	    c.gridx=1;
	    c.gridy=4;
	    top.add(kmp, c);
	    c.gridx=1;
	    c.gridy=5;
	    top.add(bma, c);
	    c.gridx=1;
	    c.gridy=6;
	    c.fill=c.NONE;
	    c.gridy=GridBagConstraints.RELATIVE;
	    top.add(res, c);
	    
	    
	    c.gridx=2;//LABELS
	    c.gridy=2;
	    top.add(op1, c);
	    c.gridx=2;
	    c.gridy=3;
	    top.add(op2, c);
	    c.gridx=2;
	    c.gridy=4;
	    top.add(op3, c);
	    c.gridx=2;
	    c.gridy=5;
	    top.add(op4, c);
	    
	    
	    frame.add(top);
	    frame.validate();
  
	    Scanner sc=new Scanner(System.in);
		String givenstr= txt1.getText();
        String pattern = txt2.getText();
        
	n.addActionListener(new ActionListener() { 
	    public void actionPerformed(ActionEvent e) { 
	    	op1.setText(" ");
	    	String x=txt1.getText();
	    	String y=txt2.getText();
	    	boolean f =obj1.Naivesearch(y, x);
	    	if(f)
	    		op1.setText("Pattern found in the string");
	    	else
	    		op1.setText("Pattern not found in the string");
	    	
	    } 
	});
	res.addActionListener(new ActionListener() { 
	    public void actionPerformed(ActionEvent e) { 
	    	op1.setText(" ");
	    	op2.setText(" ");
	    	op3.setText(" ");
	    	op4.setText(" ");
	    	obj2.zx=" ";
	    	obj3.zx=" ";
	    	obj4.zx=" ";
	    } 
	});
	
	rk.addActionListener(new ActionListener() { 
	    public void actionPerformed(ActionEvent e) { 
	    	op2.setText(" ");
	    	String x=txt1.getText();
	    	String y=txt2.getText();
	    	String w=obj2.zx;
	    	int q=101;
	    	
	    	boolean f = obj2.RKsearch(y,x,q);
	    	if(f)
	    		op2.setText("Pattern found in the string at: "+ obj2.zx );
	    	else
	    		op2.setText("Pattern not found in the string");
	    	
	    } 
	});
	
	kmp.addActionListener(new ActionListener() { 
	    public void actionPerformed(ActionEvent e) { 
	    	op3.setText(" ");
	    	String x=txt1.getText();
	    	String y=txt2.getText();
	    	String w=obj3.zx;
	    	
	    	boolean f = obj3.KMPmatcher(x,y);
	    	if(f)
	    		op3.setText("Pattern found in the string at: " + obj3.zx);
	    	else
	    		op3.setText("Pattern not found in the string");
	    	
	    } 
	});
	
	bma.addActionListener(new ActionListener() { 
	    public void actionPerformed(ActionEvent e) { 
	    	op4.setText(" ");
	    	String x=txt1.getText();
	    	String y=txt2.getText();
	    	
	    	boolean f = obj4.BoyerMoore(x,y); 
	    	String w=obj4.zx;
	    	if(f)
	    		op4.setText("Pattern found in the string at: "+ obj4.zx);
	    	else
	    		op4.setText("Pattern not found in the string");
	    	
	    } 
	});
	frame.pack();
}
}
