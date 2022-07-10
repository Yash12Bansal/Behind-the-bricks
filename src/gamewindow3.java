//package org.lwjgl.util.vector;

//import java.io.Serializable;
//import java.nio.FloatBuffer;

//import java.org.lwjgl.util.vector.Vector2f;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
//import java.util.*;
import java.io.*;
import java.nio.*;
import java.text.*;
import java.util.concurrent.TimeUnit;
//import java.lang.Math;
//

public class gamewindow3 extends JFrame implements Runnable,KeyListener,Serializable,ActionListener
{
    private BufferStrategy bs;
    Thread gt;
    boolean running;
    JLabel l;
    

    javax.swing.Timer tim;
    javax.swing.Timer tim2;
    javax.swing.Timer tim3;
    javax.swing.Timer tim4;
    javax.swing.Timer tim5;
    javax.swing.Timer tim6;
    javax.swing.Timer tim7;

//    long starttime;
    
          int ran1=(int)(Math.random()*((3-0)+1)+0);
                   int ran2=(int)(Math.random()*((3-0)+1)+0);

          int ran3=(int)(Math.random()*((6-4)+1)+4);
                   int ran4=(int)(Math.random()*((6-0)+1)+0);
                   
          int ran5=(int)(Math.random()*((8-7)+1)+7);
                   int ran6=(int)(Math.random()*((8-0)+1)+0);
          int ran7=(int)(Math.random()*((10-9)+1)+9);
            int ran8=(int)(Math.random()*((10-0)+1)+0);
                 
           
                   
  //  long elapsedtime;

    boolean bodf=false;
    int nofbullets=24;
    int ix1=200;
    int iy1=30;
    int ix2=800;
    int iy2=350;
    int delay=12;
    int co=10;
    int ro=10;
    boolean startgame=false;
   
    
    boolean left=false;
    
    
    int res=0;
    int sliderlen=110;
    int ress=0;
    int bw;
    int bh;
    //Vector2f q;
    int bxd=-3;
    int byd=-4;
  
    int interfirst=0;
    int sx=400;
    int sy=668;
        int bx=(int)(Math.random()*((350-200)+1)+200);;

    int by=500;
    int le=1;
    int r=2;
    int u=3;
    int d=4;
    int check=0;
    int tb=100;

    
    int bulx1=sx-13;
    int bulx2=sx+79;
      int buly1=sy-49;
    int buly2=sy-49;
    
    int rr1x;
    int rr1y;
    int rr2x;
    int rr2y;
    int m[][]=new int [ro][co];

    int blockx=5;
    int blocky=4;
    //Vector2f jj;
    //Vector2f kk;

    boolean doblast1=false;
    boolean doblast2=false;

    int hitnoofbullets=0;
    boolean inter1=false;
        boolean inter2=false;
                   boolean oo=false;


                   int dc1;
                   int dc2;
                   int dc3;
                   int dc4;
                   int noofbulletsshoot=0;
    public void actionPerformed(ActionEvent ae)


        
        
//        tim.start();
{
    
           //     tim=new Timer(5,this);

        tim.start();
       /* if(startgame==true)
        {
                    if(new Rectangle(bx,by,22,22).intersects(new Rectangle(sx,sy,110,20)))
        {byd=-byd;}
                    
                   ou:   for(int i=0;i<m.length;i++)
                    {
                        for(int j=0;j<m[0].length;j++)
                        {
                            if(m[i][j]>0)
                            {
                            int brx=j*bw+10;
                            int bry= i*bh+10;
                            int brw=bw;
                            int brh=bh;
                            
                            Rectangle r=new Rectangle(brx,bry,brw,brh);
                            Rectangle re=new Rectangle(bx,by,22,22);
                            Rectangle rec=r;
                            if(re.intersects(rec))
                            {
                                ro=i;
                                co=j;
                                m[ro][co]=0;
                                tb--;
                                if(bx+20<=rec.x || bx+1>=rec.x+rec.width)
                                {
                                    bxd=-bxd;
                                }
                                else
                                    byd=-byd;
                                
                                break ou;
                                
                                
                               
                            }
                        }}
                    }
                    
                    
                    
                    
                    
        bx+=bxd;
        by+=byd;

        if(bx<5)
        {
            bxd=-bxd;
        }
                if(by<30)
        {
            byd=-byd;
        }
        if(bx>825)
        {
            bxd=-bxd;
        }

        
        
        }
        */
        
        
    }
    @Override
    
    public void keyTyped(KeyEvent e)
    {
        
    }

    @Override
    public void keyPressed(KeyEvent e)
    {
        if(e.getKeyCode()==KeyEvent.VK_ENTER)
        {
            startgame=true;
        }
   
        
        if(e.getKeyCode()==KeyEvent.VK_LEFT)
        {
            
            System.out.print(startgame);
            if(startgame==true)
            {
                if(sx<=3)
                sx=3;
            
                else
                msl();
            
            
            }
            
            
        }
        

                
        if(e.getKeyCode()==KeyEvent.VK_RIGHT)
        {
            if(startgame==true)
            {
                if(sx>=820)
                sx=820;
            
                else
                msr();
            }
            
        }
        if(e.getKeyCode()==KeyEvent.VK_DOWN)
        {           
                
        }
        if(e.getKeyCode()==KeyEvent.VK_UP)
        {
          
        }
        
        
        if(e.getKeyCode()==KeyEvent.VK_F)
        {      
            noofbulletsshoot=0;

            
            noofbulletsshoot+=2;   
   
               if(inter1==true)
                hitnoofbullets=hitnoofbullets+(noofbulletsshoot-1);

                   
                   if(inter2==true)
                   hitnoofbullets=hitnoofbullets+(noofbulletsshoot-1);
               
               
            bodf=true;
            if(tb<=0)
            {
                if(nofbullets>0)
               {
                   inter1=false;
                   inter2=false;

                   buly1=sy-49;
                   buly2=sy-49;
                   tim3.start();
                   nofbullets-=2;
                   //bodf=false;
               }
//              }
                
            }
            
        }

        
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    
    
       /* public void sbv(int v,int ro,int co)
    {
        m[ro][co]=v;
    }
*/
    
    public gamewindow3()
    {
    }
/*    public void mg(int ro,int co)
    {    
        m=new int [ro][co];

                       for(int z=0;z<m.length;z++)
       {
           for(int o=0;o<m[0].length;o++)
           {
               m[z][o]=1;
           }
           
       }
        
       bw=920/10;
       bh=350/10;

        
        
    }*/
    public void createAndShowGUI()
    {
        setSize(950,730);
        setResizable(false);
        
        Canvas cv=new Canvas();

        setLocation(170,0);
//cv.setSize(20,20);
          ImageIcon i2=new ImageIcon("101.jpg");
         l=new JLabel("qqw");
        l.setBounds(20, 20, 50, 50);
  //      
    //      Image im2=i2.getImage();
      //  Image im3=im2.getScaledInstance(50, 50,Image.SCALE_SMOOTH);
        //ImageIcon imic1 = new ImageIcon(im3);
        //l.setIcon(imic1);

        
           cv.setBackground(Color.RED);
        cv.setIgnoreRepaint(true);
     

//        qw=new Vector(2,4);
        
        
                       for(int z=0;z<m.length;z++)
       {
           for(int o=0;o<m[0].length;o++)
           {
               m[z][o]=1;
           }
           
       }
        
       bw=920/10;
       bh=350/10;
        
        
       //cv.setFocusable(true);
       //cv.setFocusTraversalKeysEnabled(false);

       
       
       
       
       /*              tim=new Timer(delay,this);

        tim.start();
   *////////////////////////////////////////////////////////////////////////////////////////
       
      

       
       
                                     long starttime=System.currentTimeMillis();

       
                          tim6 = new javax.swing.Timer(400,new ActionListener() {
 
                   //@SuppressWarnings("empty-statement")
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                       public void actionPerformed(ActionEvent ae)
                   {
                       
                       
             dc1=(int)(Math.random()*((600-50)+1)+50);
           dc2=(int)(Math.random()*((150-10)+1)+10); 
           dc3=(int)(Math.random()*((300-20)+1)+20); 
           dc4=(int)(Math.random()*((300-20)+1)+20); 
          

                       long elapsedtime=10000-(System.currentTimeMillis()-starttime);
                        //System.out.println(starttime);
                        //System.out.println(elapsedtime);
                         //xs++;
                        
                        long m=TimeUnit.MILLISECONDS.toMinutes(elapsedtime)%60;
         //long h=TimeUnit.MILLISECONDS.toHours(elapsedtime)%24;
        
                        long s=TimeUnit.MILLISECONDS.toSeconds(elapsedtime)%60;
         //String hh=""+h;
                        
                        
        String mm=""+m;
         String ss=""+s;
        
         //if(Integer.parseInt(ss)%2==0)
         //{
 
         
                      if(mm.equals("0") && ss.equals("0"))
            {
                tim6.stop();
            }
      
                      else
                      {
                          oo=true;
           
                          
                 
                         }
         

                   }       

                   
                   }
                           
                         );

       
       
       
       
       
       
       
       
       
       
       
       
       

       System.out.print("it is the tewqwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww"+tb);
       //      if(tb<=20)
           //{  System.out.println("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");

             //  tim.stop();
               
       tim3 =new javax.swing.Timer(10,new ActionListener(){
           
           
           public void actionPerformed(ActionEvent ae)
           {
               buly1-=10;
               buly2-=10;
                System.out.println("sssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss");              
              Rectangle rr1= new Rectangle(sx+4,buly1, 4, 25);
           Rectangle rr2= new Rectangle(sx+98,buly1, 4, 25);
              if(rr1.intersects(new Rectangle(ix1, 30, ix2-ix1,350-30))) 
              {
                  rr1x=rr1.x;
   
                  rr1y=rr1.y;
                   System.out.println("ddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd");              

                   inter1=true;
                              
                   
                                      
               //    hitnoofbullets=hitnoofbullets+(noofbulletsshoot-1);

                           
                   long starttime=System.currentTimeMillis();
      //z
                           
       
                   
                   
                   tim4 = new javax.swing.Timer(1000,new ActionListener() {
 
                   //@SuppressWarnings("empty-statement")
                   
                       
                       public void actionPerformed(ActionEvent ae)
                   {
                       long elapsedtime=1000-(System.currentTimeMillis()-starttime);
                        //System.out.println(starttime);
                        //System.out.println(elapsedtime);
                         //xs++;
                        
                        long m=TimeUnit.MILLISECONDS.toMinutes(elapsedtime)%60;
         //long h=TimeUnit.MILLISECONDS.toHours(elapsedtime)%24;
        
                        long s=TimeUnit.MILLISECONDS.toSeconds(elapsedtime)%60;
         //String hh=""+h;
         //String mm=""+m;
         String ss=""+s;
        
         //if(Integer.parseInt(ss)%2==0)
         //{
 
         
                      if(ss.equals("0"))
            {
               // JOptionPane.showMessageDialog(rootPane,"Time up.Game Over");             
         
                doblast1=false;
                tim4.stop();
            }
      
                      else
                      {
            
                          
                                doblast1=true;
                                                    
                 
                 
                         }
         
         
                   }              }
                         );
                         
         
                         tim4.start();

                   
               
                                      
                                      
                                      
                                      System.out.println(hitnoofbullets);
                  //rr1.resize(0, 0);
                   
               //s
               }
               
               if(rr2.intersects(new Rectangle(ix1, 30, ix2-ix1,350-30))) 
               
               {
                   rr2x=rr2.x;
                   rr2y=rr2.y;
                   inter2=true;
                   //rr2.resize(0, 0);
               
               //    hitnoofbullets=hitnoofbullets+(noofbulletsshoot-1);
                
                   
                                         long  starttime=System.currentTimeMillis();
        
        
                         tim5 = new javax.swing.Timer(1000,new ActionListener() {
 
                   //@SuppressWarnings("empty-statement")
                   public void actionPerformed(ActionEvent ae)
                   {
                      long elapsedtime=1000-(System.currentTimeMillis()-starttime);
                        //System.out.println(starttime);
                        //System.out.println(elapsedtime);
                         //xs++;
                        
                        long m=TimeUnit.MILLISECONDS.toMinutes(elapsedtime)%60;
         //long h=TimeUnit.MILLISECONDS.toHours(elapsedtime)%24;
        
                        long s=TimeUnit.MILLISECONDS.toSeconds(elapsedtime)%60;
         //String hh=""+h;
         //String mm=""+m;
         String ss=""+s;
        
         //if(Integer.parseInt(ss)%2==0)
         //{
 
         
                      if(ss.equals("0"))
            {
               // JOptionPane.showMessageDialog(rootPane,"Time up.Game Over");             
         
                doblast2=false;
                tim5.stop();
            }
      
                      else
                      {
            
                          
                                doblast2=true;
                                                    
                 
                 
                         }
         
         
                   }              }
                         );
                         
                          tim5.start();
         

                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                                                     System.out.println(hitnoofbullets);

                                                     
               }
               
               
           }
       }
       
       
       
       );
       
       tim2=new javax.swing.Timer(20,new ActionListener()
               {
                   public void actionPerformed(ActionEvent ae)
                   {
      
                                                       if(startgame==true)
                                                       {
                       
                       System.out.println("qwqwqwqwqwqwqwqwqwqwqwqwqwqqwqwqwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwqwqwqwqw");
       
                                              iy2=iy2+18;
                       if(iy2>693)
                           iy2=350;
                       if(new Rectangle(ix1+200,iy2,5,30).intersects(sx, sy, 110, 20))
                       {
                           JOptionPane.showMessageDialog(rootPane, "Game Over");
                           System.exit(0);
                       }

                       
                       
                       if(ix2>=1200)
                       {
                           left=true;
                             ix1=ix1-10;
                         
                          ix2=ix2-10;
                           

                           
                       }
                      
                      if(ix1<=30)
                      {
                          left=false;
                          
                          
                       ix1=ix1+10;
                         
                        ix2=ix2+10;
                      }

                      if(ix2<1200 && ix1>30)
                      {
                          
                          if(left==false)
                          { 
                              
                              ix1=ix1+10;
                         
                          ix2=ix2+10;
                          }
                          else
                          {
                             ix1=ix1-10;
                         
                          ix2=ix2-10;
                              
                          }
                          
                      }
                                   
                                   
                       
                   }
               }
               
               
               }               
       
               );
               
         //      tim2.start();
           
           //}
       
       
       
       //if(tb>20)
       //{
           System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
       
                   tim= new javax.swing.Timer(delay,new ActionListener() {

                    public void actionPerformed(ActionEvent ae)

                    {
                        
                                if(startgame==true)
        {
                    if(new Rectangle(bx,by,22,22).intersects(new Rectangle(sx,sy,sliderlen,20)))
        {byd=(-byd);}
                    
                   ou:   for(int i=0;i<m.length;i++)
                    {
                        for(int j=0;j<m[0].length;j++)
                        {
                            if(m[i][j]>0)
                            {
                            int brx=j*bw+10;
                            int bry= i*bh+10;
                            int brw=bw;
                            int brh=bh;
                            
                            Rectangle r=new Rectangle(brx,bry,brw,brh);
                            Rectangle re=new Rectangle(bx,by,22,22);
                            Rectangle rec=r;
                            if(re.intersects(rec))
                            {
                                ro=i;
                                co=j;
                                
                                    if(ro==ran1 && co==ran2)
                                {
                                    sliderlen=sliderlen+30;
                                    
                                }
                                    else
                                 if(ro==ran3 && co==ran4)
                                {
                                    bxd=-4;
                                    byd=-5;
                                    
                                }
                                    else
                              if(ro==ran5 && co==ran6)
                                {
                                    sliderlen=sliderlen-80;
                                    
                                }
                                    else
                                 if(ro==ran7 && co==ran8)
                                {
                                    sliderlen=sliderlen+30;
                                    
                                }

                                    
                            
                                m[ro][co]=0;
                                tb--;
                                
                                if(tb==0)
                                {
                                    
                                }
                                if(bx+20<=rec.x || bx+1>=rec.x+rec.width)
                                {
                                    bxd=(-bxd);
                                }
                                else
                                    byd=(-byd);
                                
                                break ou;
                                
                                
                               
                            }
                        }}
                    }
                    
                    
                    
                    
               
                   
       bx=(bx+bxd);
        by=(by+byd);

        if(bx<2)
        {
            bxd=(-bxd);
        }
                if(by<10)
        {
            byd=(-byd);
        }
        if(bx>913)
        {
            bxd=(-bxd);
        }

        
                if(by>668+25)
        {
                           JOptionPane.showMessageDialog(rootPane,"Game Over");             

                           System.exit(0);
            
        }

        
        
        
        
        }
                        
                        
                        
                        
                        

                    }});
       
       
       
       
       //tim.start();
       //}
       
       //else

       
       
       
        cv.setBackground(Color.WHITE);
        cv.setIgnoreRepaint(true);
        Container c=getContentPane();
        //c.setBackground(Color.WHITE);
        
        
        
        //c.add();

       
        c.add(cv);
        setVisible(true);
        cv.createBufferStrategy(4);
        bs=cv.getBufferStrategy();
        
        
        
        
        
        
        
        
        gt=new Thread(this);
    
        gt.start();
        
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
    
    public void wq()
    {
     
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
        
        
        
        
       if(tb>0)
        {
                        tim.start();

                        
                        
                        
                        
                        
                if(sliders.se==1)
        {
               int r=149;
            int gr=0;
            int b=22;
            Color cl=new Color(r,gr,b);
                       g.setColor(cl);
        
        g.fillRect(sx,sy, sliderlen,20);
        

        }

        if(sliders.se==2)
        {
                        int r=249;
            int gr=122;
            int b=255;
            Color cl=new Color(r,gr,b);
                       g.setColor(cl);
                       g.fillRoundRect(sx,sy, sliderlen,20,20,20);

                        
                        g.setColor(Color.BLACK);
                        g.drawLine(sx+15, sy,sx+15-9,sy+20 );
                        g.drawLine(sx+30, sy,sx+30-9,sy+20 );
                        g.drawLine(sx+45, sy,sx+45-9,sy+20 );
                        g.drawLine(sx+60, sy,sx+60-9,sy+20 );
                        g.drawLine(sx+75, sy,sx+75-9,sy+20 );
                        g.drawLine(sx+90, sy,sx+90-9,sy+20 );
                        g.drawLine(sx+105, sy+1,sx+105-9,sy+20 );

        }
        
        if(sliders.se==3)
        {
                               g.setColor(Color.red);
           
                    g.fillRect(sx, sy, sliderlen, 20);
              g.setColor(Color.PINK);
            g.fillOval(sx+4, sy+2,14 ,14);
            g.fillOval(sx+34,sy+2,14, 14);
            g.fillOval(sx+64,sy+2, 14, 14);
              g.fillOval(sx+94,sy+2, 14, 14);
      
         
                   
   
        }
     
           if(sliders.se==4)
        {
                         int r=249;
            int gr=249;
            int b=50;
            Color cl=new Color(r,gr,b);
                       g.setColor(cl);
         
                    g.fillRect(sx, sy, 110, 20);
              g.setColor(Color.RED);
            g.fillOval(sx+4, sy+2,14 ,14);
            g.fillOval(sx+34,sy+2,14, 14);
            g.fillOval(sx+64,sy+2, 14, 14);
              g.fillOval(sx+94,sy+2, 14, 14);
      
                      g.setColor(Color.red);
         
                   
                   g.fillArc(sx-13, sy-43, 40, 45, -110, 50);
               g.fillArc(sx+79, sy-43, 40, 45, -110, 50);

        }
     
      if(sliders.se==5)
      {   
                 int r=0;
            int gr=94;
            int b=0;
            Color cl=new Color(r,gr,b);
                       g.setColor(cl);
          g.fillRoundRect(sx,sy, 110,20,20,20);

               g.fillArc(sx-40, sy-14, 40, 45, 330, 50);
               g.fillArc(sx+110, sy-14, 40, 45, 160, 50);

                  
          
      }         
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        

                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
           // g.setColor(Color.GREEN);
        
       /// g.fillRect(sx,sy, 110,20);
     g.setColor(Color.red);
        g.fillOval(bx, by, 22,22);
    
                
        for(int i=0;i<m.length;i++)
        {   
            for(int j=0;j<m[0].length;j++)
            {
                if(m[i][j]>0 )
                {
                    if(i%2==0)
                    
                    
                g.setColor(new Color(0,111,128));
                    else
                        g.setColor(new Color(128,188,253));
                g.fill3DRect(j*bw+10,i*bh+10,bw, bh,true);
  //              blockx=blockx+87;
   
                
                System.out.println("under"+blockx+"     "+i );
        g.setColor(Color.BLACK);

        
    
        
        g.draw3DRect(j*bw+10, i*bh+10, bw, bh,true);
         
            wq();

        
        
                }}}
        }
        /*     g.setColor(Color.GREEN);
        g.fillRect(200,200, 110,20);

                g.setColor(Color.GREEN);
        g.fillRect(350,200, 110,20);
                g.setColor(Color.GREEN);
        g.fillRect(350,300, 110,20);

                 *  g.setColor(Color.GREEN);
        g.fillRect(0,300, 110,20);
           g.setColor(Color.GREEN);
        g.fillRect(0,100, 110,20);
           g.setColor(Color.GREEN);
        g.fillRect(0,40, 110,20);

        
        
*/

        
  //              g.setColor(Color.DARK_GRAY);
        //g.fillRect(0,40, 110,20);



        
    //            g.fillRect(blockx,blocky,81, 45);
      //  int a[]={1,2};        int b[]={1,2,3,4,5,6,7,8,9,10};
//int i=1;
        //for(int u:a)
       // {
         //   g.drawLine(u, 400, 100, 100);
        //}
            //for(int  i:7)
      //for(int i:a)
       // //{
       // //int i  
        
           
       
       
        else
        if(tb<=0 && hitnoofbullets<4)
        {
            tim2.start();
       tim.stop();
           
                   g.setColor(Color.red);
           g.fillRect(ix1+200,iy2, 5, 30);

       System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
                 ImageIcon i2=new ImageIcon("monster7.jpg");
        
                 Image im2=i2.getImage();
                   // g.drawImage(im2, ix1,30,ix2, 1250, 10, 10,750,1100,Color.BLACK,this);

                    g.drawImage(im2, ix1,30,ix2, 350, 10, 3,550,200,Color.BLACK,this);
//pics of cartoon graphical monsters

                    g.setColor(Color.red);
           
                    g.fillRect(sx, sy, 110, 20);
              g.setColor(Color.PINK);
            g.fillOval(sx+4, sy+2,14 ,14);
            g.fillOval(sx+34, sy+2,14, 14);
            g.fillOval(sx+64,sy+2, 14, 14);
              g.fillOval(sx+94,sy+2, 14, 14);
      
                      g.setColor(Color.red);
         
                   
                   g.fillArc(sx-13, sy-43, 40, 45, -110, 50);
               g.fillArc(sx+79, sy-43, 40, 45, -110, 50);

               
               
               
               
        
        }
       
       if(hitnoofbullets>=4)
       {
                            ImageIcon i2=new ImageIcon("blast3.jpg");
        
                 Image im2=i2.getImage();
        
      //z
                           
       
                   
                   
                                                 
                 if(oo==true)
                 {
    
                     g.drawImage(im2, dc1, dc2, dc3,dc4,this);    

                 }
         
                   
                         tim6.start();
  }
            
       if(bodf==true && nofbullets>0)
       {
                         Rectangle rr1= new Rectangle(sx+4,buly1, 4, 25);
           Rectangle rr2= new Rectangle(sx+98,buly1, 4, 25);

            if(!(rr1.intersects(ix1, 30, ix2-ix1,350-30)))
            {  
                if(inter1==true)
                {}
            
            else
                g.fillRect(sx+4,buly1, 4, 25);
       
            }
           if(!(rr2.intersects(ix1, 30, ix2-ix1,350-30)))
           {
               if(inter2==true)
                
               {}
            
            else
               g.fillRect(sx+98,buly2, 4, 25);
              //  s
      
           }         
       
       }
          //  s
           

           
           
                   
       
       
            
            
    //        blocky=blocky+46;
      //      blockx=5;
        //    System.out.println(blockx+"    "+blocky );
        
  /*      for(int nm=0;nm<m.length;nm++)
        {
            for(int za=0;za<m[0].length;za++)
            {
                System.out.println(m[nm][za]);
            }
        }

*/      
      
     /*for(int u=0;u<m.length;u++)
      *{
          for(int zx=0;zx<m[0].length;zx++)
          {
              if(m[u][zx]>0)
              {    g.setColor(Color.lightGray);
               
              g.fillRect(zx*bw+50, u*bh+30, bw, bh);
    
                 g.setStroke(new BasicStroke(3));
                 g.setColor(Color.BLACK);
                   g.drawRect(zx*bw+50, u*bh+30, bw, bh);
              }
                 
          
          }
      }*/
     
       
       if(doblast1==true)
       {
           tim4.start();
                            ImageIcon i2=new ImageIcon("blast2.jpg");
        
                 Image im2=i2.getImage();
        
                if(inter1==true)
                {
                
                  //               g.drawImage(im2, rr1x,rr1y, 50,40, this);

                }
 

          // g.drawi
           //g.drawImage(im2, 100,30,200, 70, 10, 3,550,170,Color.BLACK, this);     //g.drawImage(null, ix1, iy1, ix2, iy2, ix1, iy1, ix2, iy2, rootPane)
       }
        
       
       if(doblast2==true)
       {
                      tim5.start();

                            ImageIcon i2=new ImageIcon("blast2.jpg");
        
                 Image im2=i2.getImage();
        if(inter2==true)
                {
                // g.drawImage(im2, rr2x,rr2y, 50,40, this);
                
                }
            
                 
 

          // g.drawi
           //g.drawImage(im2, 100,30,200, 70, 10, 3,550,170,Color.BLACK, this);

           //g.drawImage(null, ix1, iy1, ix2, iy2, ix1, iy1, ix2, iy2, rootPane)
       }
         
       
       
    
    }
     public void msr()
     {
         sx=sx+20;
         
     }
     public void msl()
     {
         sx=sx-20;
         
     }
    
     public void dragonbe()
     {
         
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
        gamewindow3 a=new gamewindow3();
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