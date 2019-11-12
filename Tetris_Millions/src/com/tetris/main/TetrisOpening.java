package com.tetris.main;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Image;
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
    *  추가된 버튼들
    *  로그인 , 설정, 하우투플레이
    */
   private ImageIcon loginButtonImage = new ImageIcon(TetrisMain.class.getResource("../../../Images/loginBtnbasic.png")); // 로그인버튼
   private ImageIcon settingButtonImage = new ImageIcon(TetrisMain.class.getResource("../../../Images/settingBtnBasic.png")); // 설정버튼
   private ImageIcon howToPlayButtonImage = new ImageIcon(TetrisMain.class.getResource("../../../Images/howToPlayBtnBasic.png")); // howtoPlay 버튼
   
   
   
   
   
   
   
   
   private Image background = new ImageIcon(TetrisMain.class.getResource("../../../Images/Introbackground.jpg")).getImage();
   private JLabel menuBar = new JLabel(new ImageIcon(TetrisMain.class.getResource("../../../Images/menuBar.png")));
   
   private JButton exitButton = new JButton(exitButtonBasicImage);
   private JButton startButton = new JButton(startButtonBasicImage);
   private JButton quitButton = new JButton(quitButtonBasicImage);
   
   /**
    *  로그인버튼, 설정버튼, howToPlay버튼
    */
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
      
      
      
      
      // 종료하기 버튼에 대한 내용
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
         public void mousePressed(MouseEvent e) { // 마우스 선택시
        	 
            try { 
               Thread.sleep(1000); // 1초간 멈추고
            } catch(InterruptedException ex) {
               ex.printStackTrace();
            } 
            System.exit(0); // 시스템 종료함
         }
      });
      
      add(exitButton); // 종료 버튼 추가
      
      
      // 시작하기 버튼 내용
      startButton.setBounds(260, 200, 400, 50); //버튼 범위(크기)
      startButton.setBorderPainted(false); // 말 그대로 버튼 setBorder
      startButton.setContentAreaFilled(false);
      startButton.setFocusPainted(false); // 포커스시 페인트 노
      startButton.addMouseListener(new MouseAdapter() { // 마우스 리스너
         @Override
         public void mouseEntered(MouseEvent e) { // 대었을 시
        	// 단순히 마우스 가져다 대었을 때 이미지가 바꾸어 지도록 하는 것일 뿐
            startButton.setIcon(startButtonEnteredImage);
            startButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
            
         }
         @Override
         public void mouseExited(MouseEvent e) { // 나갔을 시
            startButton.setIcon(startButtonBasicImage);
            startButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
         }
         
         @Override
         public void mousePressed(MouseEvent e) { //마우스 멈추었을 시
            startButton.setVisible(false);
            quitButton.setVisible(false);
            //background 감추기
            isMainScreen = true;
            
            
            
            

            
            new ModeSelectionWindow(); // 게임 모드 선택
            
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
      
      add(quitButton); // 종료버튼 추가
      
      
      
      
      
      // 로그인 버튼 세팅하기
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
             //background 감추기
//             isMainScreen = true;
             
        	 
//        	 TetrisLogin frame = new TetrisLogin();
        	 Login login_frame = new Login();
        	 login_frame.setVisible(true);
            
         }
      });
      
   // 로그인 버튼 추가
      add(loginButton); 
      
      
      
      
     /**
      *  how to play 버튼 과 설정버튼 추가
      */
      
      //how to play 버튼
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
		public void mousePressed(MouseEvent e) { // 마우스 눌렀을 때
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseExited(MouseEvent e) { // 해당 버튼에서 마우스를 띄었을 떄
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseEntered(MouseEvent e) { // 마우스 버튼에 갖다 대었을 떄
			howToPlayButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		}
		
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	});
      add(howToPlayButton);
      
      
      // 설정버튼
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
		public void mousePressed(MouseEvent e) { // 설정키 나
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
      
      
      
      
      
      
      
   
    
      
      
      
      
      
      menuBar.setBounds(0, 0, 1280, 30); // 메뉴바 바운더리
      menuBar.addMouseListener(new MouseAdapter() {
         @Override
         public void mousePressed(MouseEvent e) { //마우스 클릭시 
            mouseX = e.getX();
            mouseY = e.getY();
         }
         
      });
      
      menuBar.addMouseMotionListener(new MouseMotionAdapter() { // 창을 옮길 수 있도록 함
         @Override
         public void mouseDragged(MouseEvent e) {
            int x = e.getXOnScreen();
            int y = e.getYOnScreen();
            setLocation(x - mouseX, y - mouseY); //위치 바꾸기 , 옮기기
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
 