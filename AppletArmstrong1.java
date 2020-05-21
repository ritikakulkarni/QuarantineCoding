import java.applet.*;

import java.awt.event.*;

import java.awt.*;

/*<applet code="Arm" width=500 height=500> </applet> */

public class AppletArmstrong1 extends Applet implements ActionListener
{

	  Label l1,l2;

	  TextField t1,t2;

	  Button b1,b2;

	  Font f1;

	  String s1;

	  public void init()
	  {

	      l1=new Label("Enter a number: ");


	
	      l2=new Label("Result ");

	      t1=new TextField(10);

	     // t2=new TextField(40);

	      f1= new Font("Times New Roman",Font.PLAIN,25);


	      b1=new Button("Calculate");

	      b2=new Button("Clear");

	      add(l1);

	      add(t1);

	     
 add(l2);

	     // add(t2);

	      add(b1);

	      add(b2);


	     
b1.addActionListener(this);

	      b2.addActionListener(this);


	 
	  }



	  public void actionPerformed(ActionEvent ae)
	  {

	        int c=0,a,temp;

	          int n=Integer.parseInt(t1.getText());

	   
	      if(ae.getSource()==b1)

	      {

	                   temp=n;

	                while(n>0)

	            {

	               a=n%10;

	              n=n/10;

	             c=c+(a*a*a);

	}

	if(temp==c)

	s1="armstrong number";

	else

	s1="number is not armstrong";


	   

	             // t2.setText(String.valueOf(s1));
	
             

	      }

	      else if(ae.getSource()==b2)

	      {

	          t1.setText("");

	          t2.setText("");

	       
	      }

	      repaint();

	     
	  }


	public void paint(Graphics g)


	{


	          g.setFont(f1);


	       g.setColor(Color.red);


	         g.drawString(s1,50,50);



	}


	}