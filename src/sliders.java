
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.BufferStrategy;
import java.io.Serializable;

public class sliders extends JFrame implements Runnable,Serializable,ActionListener
{
    
      private BufferStrategy bs;
    Thread gt;
    boolean running;
  
    JButton b1,b2,b3,b4;
    static int se=1;
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1 && se!=1)
        {
            se=se-1;
        }
    
       
        if(ae.getSource()==b2 && se!=5)
        {
            se=se+1;
        }
        if(ae.getSource()==b3)
        {
            this.dispose();
                    gamewindow a=new gamewindow();
        a.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                a.onWindowClosing();
            }
        });
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                a.createAndShowGUI();
            }
        });

        }   
        
        if(ae.getSource()==b4)
        {
            this.dispose();
               start a=new start();
        a.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                a.onWindowClosing();
            }
        });
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                a.createAndShowGUI();
            }
        });
     
            
            
        }
    }
    
    
    public sliders()
    {
   
        
       // this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
       // show();
        
        
    }
    
    
    
      public void createAndShowGUI()
    {
  
        Canvas cv=new Canvas();
        setVisible(true);
        setVisible(true);
          cv.setIgnoreRepaint(true);

          
        
          setSize(400,350);
          setResizable(false);
      
          setLocation(450,150);
        
        
        b1=new JButton("<");
        b2=new JButton(">");
        b3=new JButton("Select");
        b4=new JButton("Back");
        
        
        b1.setBackground(Color.WHITE);
        b2.setBackground(Color.WHITE);
        b3.setBackground(Color.WHITE);
        b4.setBackground(Color.WHITE);

        b2.setBounds(257,120,50, 40);

        b1.setBounds(50,120,50, 40);
        b3.setBounds(77,285,100, 25);
        b4.setBounds(190,285,100, 25);

        
        Container c=getContentPane();
        
        c.add(b2);

        
        c.add(b1);
     
        c.add(b3);
       c.add(b4);
        
        
                c.add(cv);

                cv.setBackground(Color.BLACK);
        cv.createBufferStrategy(2);
        bs=cv.getBufferStrategy();
        
        
        gt=new Thread(this);
        gt.start();

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

    
    }
    
    public void run()
    {
        running =true;
        while(running)
        {
            gameLoop();
        }
        
    }
    
    public void gameLoop()
    {    
                
        do{
            do{
                Graphics g=null;
                try{
                    g=bs.getDrawGraphics();
                    g.clearRect(0,0, getWidth(), getHeight());
                render(g);
                
                }
                
                finally{
                    
                    if(g!=null)
                    {
                        g.dispose();
                }}
                
                
            }
        
            while(bs.contentsRestored());
            bs.show();
        
            
            
            }
        
        
while(bs.contentsLost());
        
        
    }
  
    
    
    
    
    
    
    
    
    
    
    public void render(Graphics g)
    {
       g.setColor(Color.WHITE);
        g.drawRect(105, 90, 147,145);
        if(se==1)
        {
            int r=149;
            int gr=0;
            int b=22;
            Color cl=new Color(r,gr,b);
                       g.setColor(cl);
        
        g.fillRect(125,185, 110,20);
        

        }

        if(se==2)
        {  int r=249;
            int gr=122;
            int b=255;
            Color cl=new Color(r,gr,b);
                       g.setColor(cl);
        
                        g.fillRoundRect(125,185, 110,20,20,20);

                        
                        g.setColor(Color.BLACK);
                        g.drawLine(140, 185,131,204 );
                        g.drawLine(155, 185,146,205 );
                        g.drawLine(170, 185,161,205 );
                        g.drawLine(185, 185,176,205 );
                        g.drawLine(200, 185,191,205 );
                        g.drawLine(215, 185,206,205 );
                        g.drawLine(230, 185,221,205 );

        }
        
        if(se==3)
        {
                               g.setColor(Color.red);
           
                    g.fillRect(125, 185, 110, 20);
              g.setColor(Color.PINK);
            g.fillOval(125+4, 185+2,14 ,14);
            g.fillOval(125+34,185+2,14, 14);
            g.fillOval(125+64,185+2, 14, 14);
              g.fillOval(125+94,185+2, 14, 14);
      
         
                   
   
        }
     
           if(se==4)
        {  int r=249;
            int gr=249;
            int b=50;
            Color cl=new Color(r,gr,b);
                       g.setColor(cl);
        
                    g.fillRect(125, 185, 110, 20);
              g.setColor(Color.RED);
            g.fillOval(125+4, 185+2,14 ,14);
            g.fillOval(125+34,185+2,14, 14);
            g.fillOval(125+64,185+2, 14, 14);
              g.fillOval(125+94,185+2, 14, 14);
      
                      g.setColor(Color.red);
         
                   
                   g.fillArc(125-13, 185-43, 40, 45, -110, 50);
               g.fillArc(125+79, 185-43, 40, 45, -110, 50);

        }
     
      if(se==5)
      {   
            int r=0;
            int gr=94;
            int b=0;
            Color cl=new Color(r,gr,b);
                       g.setColor(cl);
        
          g.fillRoundRect(125,185, 110,20,20,20);

               g.fillArc(125-40, 185-14, 40, 45, 330, 50);
               g.fillArc(125+110, 185-14, 40, 45, 160, 50);

                  
          
      }
        
        
        
    }
    
    
  public void onWindowClosing()
    {
        try
        {
            running =false;
            gt.join();

        }
        catch(Exception e)
        {
            
        }
    
    System.exit(0);
    
    }
   
    public static void main(String args[])
    {
        sliders a=new sliders();
        a.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                a.onWindowClosing();
            }
        });
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                a.createAndShowGUI();
            }
        });
        
    }    
    
    
}