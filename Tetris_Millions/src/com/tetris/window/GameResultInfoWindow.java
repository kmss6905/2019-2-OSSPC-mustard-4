package com.tetris.window;

import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;

import com.tetris.main.TetrisMain;

import retrofit2.*;
import retrofit2.Response;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @author minshik
 *
 */
public class GameResultInfoWindow{
	
	
	private static final long serialVersionUID = 1L;
	JFrame frame = new JFrame();
	private int gameScore;
	private int gameMode;
	private String info;
	private int ranking;

	
	

	public GameResultInfoWindow(int gamescore, int gamemode, int ranking, String info) {
		this.gameScore = gamescore;	
		this.gameMode = gamemode;
		this.info = info;
		this.ranking = ranking;
	
		
		
		
		WindowSetting();
		Component();
	}	
	
	
	/**
	 *  JFrame 세팅
	 */
	public void WindowSetting() {
	
		if(gameMode == 1) {
			frame.setTitle("일반모드 결과");
		}else if(gameMode == 2) {
			frame.setTitle("타임모드 결과");
		}else if(gameMode == 3) {
			frame.setTitle("맵모드 결과");
		}
		frame.setSize(300, 400);
		frame.setLayout(null); 
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
	}
	
	/**
	* 컴포넌트 만들기
	*/
	public void Component() {
		
		
		if(this.info.equalsIgnoreCase("new")) {
		
			JLabel record = new JLabel("record"); 
			record.setBounds(100,40,100,40);
			JLabel userId = new JLabel(TetrisMain.userId + " 님");
			userId.setBounds(100, 100, 100, 40);
			JLabel score = new JLabel("[NEW] 점수 : " + String.valueOf(gameScore));
			score.setBounds(100, 140, 100, 40);
			JLabel raking = new JLabel("[NEW] 랭킹 : " + String.valueOf(ranking) + " 위");
			raking.setBounds(100,160,100,40);
			
			
			frame.add(record);
			frame.add(userId);
			frame.add(score);
			frame.add(raking);
		}else if (this.info.equalsIgnoreCase("high")) {
			JLabel record = new JLabel("record"); 
			record.setBounds(100,40,100,40);
			JLabel userId = new JLabel(TetrisMain.userId + " 님");
			userId.setBounds(100, 100, 100, 40);
			JLabel score = new JLabel("[UP] 점수 : " + String.valueOf(gameScore));
			score.setBounds(100, 140, 100, 40);
			JLabel raking = new JLabel("랭킹 : " + String.valueOf(ranking) + " 위 ");
			raking.setBounds(100,160,100,40);
			
			
			frame.add(record);
			frame.add(userId);
			frame.add(score);
			frame.add(raking);
		}else if(this.info.equalsIgnoreCase("low")) {
			JLabel record = new JLabel("record"); 
			record.setBounds(100,40,100,40);
			JLabel userId = new JLabel(TetrisMain.userId + " 님");
			userId.setBounds(100, 100, 100, 40);
			JLabel score = new JLabel("[DOWN] 점수 : " + String.valueOf(gameScore));
			score.setBounds(100, 140, 100, 40);
			JLabel raking = new JLabel("랭킹 : " + String.valueOf(ranking) + " 위");
			raking.setBounds(100,160,100,40);
			
			
			frame.add(record);
			frame.add(userId);
			frame.add(score);
			frame.add(raking);
		}
		
	}
	

		
}
