import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class simple_calculator extends JApplet implements ActionListener
{
    double d1,d2,result;
    String s,s1="0",symbol;
    JButton plus;
    JButton minus;
    JButton multiply;
    JButton divide;
    JButton zero;
    JButton one;
    JButton two;
    JButton three;
    JButton four;
    JButton five;
    JButton six;
    JButton seven;
    JButton eight;
    JButton nine;
    JButton equalto;
    JButton c;
    JButton dot;
    JLabel rslt;
    JLabel empty1,empty2,empty3;
    public void init()
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run(){
            makegui();}
        });
    }
    public void makegui()
    {
        //setLayout(new FlowLayout());
        setLayout(new GridLayout(5,4));
        plus=new JButton("+");
        minus=new JButton("-");
        multiply=new JButton("*");
        divide=new JButton("/");
        zero=new JButton("0");
        one=new JButton("1");
        two=new JButton("2");
        three=new JButton("3");
        four=new JButton("4");
        five=new JButton("5");
        six=new JButton("6");
        seven=new JButton("7");
        eight=new JButton("8");
        nine=new JButton("9");
        equalto=new JButton("=");
        c=new JButton("C");
        dot=new JButton(".");
        rslt=new JLabel("0");
        //rslt.setSize(0,0);
        add(rslt);
        empty1=new JLabel();
        add(empty1);
        empty2=new JLabel();
        add(empty2);
        //empty2=new JLabel();
        //add(empty2);
        add(c);
        add(nine);
        add(eight);
        add(seven);
        add(divide);
        add(six);
        add(five);
        add(four);
        add(multiply);
        add(three);
        add(two);
        add(one);
        add(minus);
        
        add(zero);
        add(dot);
        add(equalto);
        add(plus);
        
        nine.addActionListener(this);
        eight.addActionListener(this);
        seven.addActionListener(this);
        six.addActionListener(this);
        five.addActionListener(this);
        four.addActionListener(this);
        three.addActionListener(this);
        two.addActionListener(this);
        one.addActionListener(this);
        zero.addActionListener(this);
        plus.addActionListener(this);
        minus.addActionListener(this);
        multiply.addActionListener(this);
        divide.addActionListener(this);
        equalto.addActionListener(this);
        c.addActionListener(this);
        dot.addActionListener(this);
    }
        public void actionPerformed(ActionEvent ae)
        {
            rslt.setVisible(true);
            s=ae.getActionCommand();
            if(s.equals("+"))
            {
              d1=Double.parseDouble(s1);
              symbol="+";
              s1="0";
              rslt.setVisible(false);
            }
            else if(s.equals("-"))
            {
              d1=Double.parseDouble(s1);
              symbol="-";
              s1="0";
              rslt.setVisible(false);
            }
            else if(s.equals("*"))
            {
              d1=Double.parseDouble(s1);
              symbol="*";
              s1="0";
              rslt.setVisible(false);
            }
            else if(s.equals("/"))
            {
              d1=Double.parseDouble(s1);
              symbol="/";
              s1="0";
              rslt.setVisible(false);
            }
            else if(s.equals("="))
            {
              d2=Double.parseDouble(s1);
              if(d2==0&&symbol.equals("/"))
              {
                  rslt.setText("Math Error");
              }
              else{
              result=compute(d1,d2,symbol);
              rslt.setText(Double.toString(result));
              s1="0";
              }
            }
            else if(s.equals("C"))
            {
                s1="0";
                rslt.setText(s1);
            }
            else
            {
                //char s2[10];int j=0;
                s1=s1+s;
                //for(int i=1;i<=s1.length();i++)
                //{
                  //  s2[j++]=s1[i];
                  rslt.setText(s1);
                //}
            }
            
        }
        public double compute(double n1,double n2,String s)
        {
           
           if(s.equals("+"))
               return(n1+n2);
           if(s.equals("-"))
               return(n1-n2);
           if(s.equals("*"))
               return(n1*n2);
           if(s.equals("/"))
               return(n1/n2);
           return 0;
        }
    }
