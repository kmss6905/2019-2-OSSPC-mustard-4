package com.tetris.main;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import com.tetris.window.Button;
import com.tetris.window.Tetris;

public class TetrisOpening extends JFrame {
   
   private Image screenImage;
   private Graphics screenGraphic;
   private ImageIcon exitButtonEnteredImage = new ImageIcon(TetrisMain.class.getResource("../../../Images/exitButtonEntered.png"));
   private ImageIcon exitButtonBasicImage = new ImageIcon(TetrisMain.class.getResource("../../../Images/exitButtonBasic.png"));
   private ImageIcon startButtonEnteredImage = new ImageIcon(TetrisMain.class.getResource("../../../Images/startButtonEntered.png"));
   private ImageIcon startButtonBasicImage = new ImageIcon(TetrisMain.class.getResource("../../../Images/startButtonBasic.png"));
   private ImageIcon quitButtonEnteredImage = new ImageIcon(TetrisMain.class.getResource("../../../Images/quitButtonEntered.png"));
   private ImageIcon quitButtonBasicImage = new ImageIcon(TetrisMain.class.getResource("../../../Images/quitBtnBasic.png"));
   
   
   /** 
    *  占쌩곤옙占쏙옙 占쏙옙튼占쏙옙
    *  占싸깍옙占쏙옙 , 占쏙옙占쏙옙, 占싹울옙占쏙옙占시뤄옙占쏙옙
    */
   private ImageIcon loginButtonImage = new ImageIcon(TetrisMain.class.getResource("../../../Images/loginBtnBasic.png")); // 占싸깍옙占싸뱄옙튼
   private ImageIcon settingButtonImage = new ImageIcon(TetrisMain.class.getResource("../../../Images/settingBtnBasic.png")); // 占쏙옙占쏙옙占쏙옙튼
   private ImageIcon howToPlayButtonImage = new ImageIcon(TetrisMain.class.getResource("../../../Images/howToPlayBtnBasic.png")); // howtoPlay 占쏙옙튼
   
   
   
   
   
   
   
   
   private Image background = new ImageIcon(TetrisMain.class.getResource("../../../Images/IntroBackground.jpg")).getImage();
   private JLabel menuBar = new JLabel(new ImageIcon(TetrisMain.class.getResource("../../../Images/menuBar.png")));
   
   private JButton exitButton = new JButton(exitButtonBasicImage);
   private JButton startButton = new JButton(startButtonBasicImage);
   private JButton quitButton = new JButton(quitButtonBasicImage);
   
 
   private JButton loginButton = new JButton(loginButtonImage);
   private JButton settingButton = new JButton(settingButtonImage);
   private JButton howToPlayButton = new JButton(howToPlayButtonImage);
   
   
   private int mouseX, mouseY;
   private boolean isMainScreen = false;

   public TetrisOpening() {
	   
      setUndecorated(true);
      setTitle("Tetris");
      setSize(TetrisMain.SCREEN_WIDTH, TetrisMain.SCREEN_HEIGHT);
      setResizable(false);
      setLocationRelativeTo(null);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true);
      setBackground(new Color(0, 0, 0, 0));
      setLayout(null);
      
      
      
      
      // 占쏙옙占쏙옙占싹깍옙 占쏙옙튼占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙
      exitButton.setBounds(880, 0, 30, 30);
      exitButton.setBounds(890, 0, 30, 30);
      exitButton.setBorderPainted(false);
      exitButton.setContentAreaFilled(false);
      exitButton.setFocusPainted(false);
      exitButton.addMouseListener(new MouseAdapter() {
    	  
         @Override
         public void mouseEntered(MouseEvent e) {
            exitButton.setIcon(exitButtonEnteredImage);
            exitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
            
         }
         @Override
         public void mouseExited(MouseEvent e) {
            exitButton.setIcon(exitButtonBasicImage);
            exitButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
         }
         @Override
         public void mousePressed(MouseEvent e) { // 占쏙옙占쎌스 占쏙옙占시쏙옙
        	 
            try { 
               Thread.sleep(1000); // 1占십곤옙 占쏙옙占쌩곤옙
            } catch(InterruptedException ex) {
               ex.printStackTrace();
            } 
            System.exit(0); // 占시쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙
         }
      });
      
      add(exitButton); // 占쏙옙占쏙옙 占쏙옙튼 占쌩곤옙
      
      
      // 占쏙옙占쏙옙占싹깍옙 占쏙옙튼 占쏙옙占쏙옙
      startButton.setBounds(260, 200, 400, 50); //占쏙옙튼 占쏙옙占쏙옙(크占쏙옙)
      startButton.setBorderPainted(false); // 占쏙옙 占쌓댐옙占� 占쏙옙튼 setBorder
      startButton.setContentAreaFilled(false);
      startButton.setFocusPainted(false); // 占쏙옙커占쏙옙占쏙옙 占쏙옙占쏙옙트 占쏙옙
      startButton.addMouseListener(new MouseAdapter() { // 占쏙옙占쎌스 占쏙옙占쏙옙占쏙옙
         @Override
         public void mouseEntered(MouseEvent e) { // 占쏙옙占쏙옙占� 占쏙옙
        	// 占쌤쇽옙占쏙옙 占쏙옙占쎌스 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙 占싱뱄옙占쏙옙占쏙옙 占쌕꾸억옙 占쏙옙占쏙옙占쏙옙 占싹댐옙 占쏙옙占쏙옙 占쏙옙
            startButton.setIcon(startButtonEnteredImage);
            startButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
            
         }
         @Override
         public void mouseExited(MouseEvent e) { // 占쏙옙占쏙옙占쏙옙 占쏙옙
            startButton.setIcon(startButtonBasicImage);
            startButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
         }
         
         @Override
         public void mousePressed(MouseEvent e) { //占쏙옙占쎌스 占쏙옙占쌩억옙占쏙옙 占쏙옙
            startButton.setVisible(false);
            quitButton.setVisible(false);
            //background 占쏙옙占쌩깍옙
            isMainScreen = true;
            
            
            
            

            
            new ModeSelectionWindow(); // 占쏙옙占쏙옙 占쏙옙占� 占쏙옙占쏙옙
            
         }
      });
      
      
      add(startButton); 
      
      
      

      quitButton.setBounds(260, 250, 400, 50);
      quitButton.setBorderPainted(false);
      quitButton.setContentAreaFilled(false);
      quitButton.setFocusPainted(false);
      quitButton.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseEntered(MouseEvent e) {
            quitButton.setIcon(quitButtonEnteredImage);
            quitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
            
         }
         @Override
         public void mouseExited(MouseEvent e) {
            quitButton.setIcon(quitButtonBasicImage);
            quitButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
         }
         @Override
         public void mousePressed(MouseEvent e) {
            try {
               Thread.sleep(1000);
            } catch (InterruptedException ex) {
               ex.printStackTrace();
            }
            System.exit(0);
            
         }
      });
      
      add(quitButton); // 占쏙옙占쏙옙占싣� 占쌩곤옙
      
      
      
      
      
      // 로그인 버튼
      loginButton.setBounds(260, 300, 400, 50);
      loginButton.setBorderPainted(false);
      loginButton.setContentAreaFilled(false);
      loginButton.setFocusPainted(false);
      loginButton.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseEntered(MouseEvent e) {
        	 loginButton.setIcon(loginButtonImage);
        	 loginButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
            
         }
         @Override
         public void mouseExited(MouseEvent e) {
        	 loginButton.setIcon(loginButtonImage);
        	 loginButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
         }
         @Override
         public void mousePressed(MouseEvent e) {
//        	 startButton.setVisible(false);
//             quitButton.setVisible(false);
             //background 占쏙옙占쌩깍옙
//             isMainScreen = true;
             
        	
        	 Login login_frame = new Login();
        	 login_frame.setVisible(true);
            
         }
      });
      
  
      add(loginButton); 
      
      
      
      
    
      howToPlayButton.setBounds(260, 350, 400, 50);
      howToPlayButton.setBorderPainted(false);
      howToPlayButton.setContentAreaFilled(false);
      howToPlayButton.setFocusPainted(false);
      howToPlayButton.addMouseListener(new MouseListener() {
		
		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mousePressed(MouseEvent e) { 
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseExited(MouseEvent e) { 
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseEntered(MouseEvent e) { 
			howToPlayButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		}
		
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	});
      add(howToPlayButton);
      
      
      // 占쏙옙占쏙옙占쏙옙튼
      settingButton.setBounds(260, 400, 400, 50);
      settingButton.setBorderPainted(false);
      settingButton.setContentAreaFilled(false);
      settingButton.setFocusPainted(false);
      settingButton.addMouseListener(new MouseListener() {
		
		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mousePressed(MouseEvent e) { // 占쏙옙占쏙옙키 占쏙옙
			Button start = new Button();
			start.FrameShow();			
		}
		
		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseEntered(MouseEvent e) {
			settingButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		}
		
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	});
      add(settingButton);
      
      
      
      
      
      
      
   
    
      
      
      
      
      
      menuBar.setBounds(0, 0, 1280, 30); // 占쌨댐옙占쏙옙 占쌕울옙占쏙옙占�
      menuBar.addMouseListener(new MouseAdapter() {
         @Override
         public void mousePressed(MouseEvent e) { //占쏙옙占쎌스 클占쏙옙占쏙옙 
            mouseX = e.getX();
            mouseY = e.getY();
         }
         
      });
      
      menuBar.addMouseMotionListener(new MouseMotionAdapter() { // 창占쏙옙 占신깍옙 占쏙옙 占쌍듸옙占쏙옙 占쏙옙
         @Override
         public void mouseDragged(MouseEvent e) {
            int x = e.getXOnScreen();
            int y = e.getYOnScreen();
            setLocation(x - mouseX, y - mouseY); //占쏙옙치 占쌕꾸깍옙 , 占신깍옙占�
         }
      });
      add(menuBar);
      
   
   }
   
   public void paint(Graphics g) {
      screenImage = createImage(TetrisMain.SCREEN_WIDTH, TetrisMain.SCREEN_HEIGHT);
      screenGraphic = screenImage.getGraphics();
      screenDraw(screenGraphic);
      g.drawImage(screenImage, 0, 0, null);
   }
   
   public void screenDraw(Graphics g) {
      g.drawImage(background, 0, 0, null);
      if(isMainScreen) {
         this.setVisible(false);
      }
      printComponents(g);
      this.repaint();
   }

}
 