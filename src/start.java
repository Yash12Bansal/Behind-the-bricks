import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.BufferStrategy;
import java.io.Serializable;

public class start extends JFrame implements Runnable,Serializable,ActionListener,KeyListener
{
    private BufferStrategy bs;
    Thread gt;
    boolean running;
    Timer t1,t2,t3;
    JButton b1,b2,b3,b4;
      
    int x1=10;
    int x2=230;
      int x3=175;
      int x4=43;
      int x5=173;
      int x6=308;
      int x7=10;
              int x8=140;
              int x9=270;

              
                  public void keyTyped(KeyEvent e)
    {
        
    }
    public void keyReleased(KeyEvent e) {
    }


              public void keyPressed(KeyEvent e)
              {
                  if(e.getKeyCode()==KeyEvent.VK_P)
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
                  if(e.getKeyCode()==KeyEvent.VK_S)
                  {
              /*        this.dispose();
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
        */
                      this.dispose();
                  settings ob=new settings();
            
                      
                  }
                  if(e.getKeyCode()==KeyEvent.VK_Q)
                  {
                      
                   
                      System.exit(0);
                  }

                  
                  
              }
              
              

              public void actionPerformed(ActionEvent ae)
              {
                  if(ae.getSource()==b1)
                  {
                      
                      
                  }
                  if(ae.getSource()==b2)
                  {
                      
                  }
                  if(ae.getSource()==b3)
                  {
                      
                  }

                  
              
              }
              public start()
    {
        
    }
      public void createAndShowGUI()
    {
  
        
        Canvas cv=new Canvas();
        setVisible(true);
        setVisible(true);
          cv.setIgnoreRepaint(true);

          setLocation(450,150);
    
                 setResizable(false);

        setSize(400,400);
         Container c=getContentPane();
        
         
         b1=new JButton("Play");
         b2=new JButton("Settings");
         b3=new JButton("Quit");
         b4=new JButton("Play");
      
         b1.setBackground(Color.WHITE);
         b2.setBackground(Color.WHITE);
         b3.setBackground(Color.WHITE);

         
         t1=new Timer(150,new ActionListener()
         {
             public void actionPerformed(ActionEvent ae)
             {
                 x1=x1-10;
                 x2=x2-10;
                 x3=x3-10;
                 
                 if(x1==-350)
                 { x1=320;
                     x3=485;
                    x2=540;
                             
                 
                            }
                 
                 
                 
                 
                 
                 
                 
             }
             
         }
         
         );
         
         
         
        
               t1.start();
   
        //             c.add(b1);
        // c.add(b2);
        // c.add(b3);
         //c.add(b4);
   
               
               c.add(cv);

         
         
       
                cv.setBackground(Color.BLACK);
                cv.createBufferStrategy(2);
                bs=cv.getBufferStrategy();
        gt=new Thread(this);
        gt.start();

     //addActionListenr(this);
    b1.addActionListener(this);
    b2.addActionListener(this);
    
    b3.addActionListener(this);
    b4.addActionListener(this);

    addKeyListener(this);
    
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
                render((Graphics2D) g);
                
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
  
    
    
    
    
    
    
    
    
    
    
    public void render(Graphics2D g)
    {
        Font fw=new Font("CASTELLAR",Font.BOLD,33);
        //Font f=g.getFont();
        //Font ff=f.deriveFont(f.getSize()*5.0f);
        g.setFont(fw);
        g.setColor(Color.red);
        g.drawString("Behind", x1, 50);

        g.drawString("Bricks", x2,50);
        
        Font f=new Font("Forte",Font.BOLD,33);
         g.setFont(f);
         g.setColor(Color.WHITE);
         g.drawString("the",x3,50);

         
         g.setColor(Color.WHITE);
         g.fillOval(x4, 300, 20, 20);
         g.fillOval(x5, 300, 20, 20);
         g.fillOval(x6, 300, 20, 20);
        
         g.setColor(Color.red);
         g.fillRoundRect(x7,333, 90,17,10,10);

         g.fillRoundRect(x8, 333,90,17,10,10);
         g.fillRoundRect(x9, 333,90,17,10,10);
         
         
         
         
         Font fd=new Font("Arial",Font.BOLD,17);
         g.setFont(fd);
         g.setColor(Color.WHITE);
       
           b1.setBounds(130, 120, 110, 40);
         b2.setBounds(130, 180, 110, 40);
         b3.setBounds(130, 240, 110, 40);
       
         g.drawString("Press P to play ",110 , 120);
         g.drawString("Press S for settings ",110 , 180);
         g.drawString("Press Q to quit ",110 , 240);
         
        
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