package com.tetris.window;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

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
		
			JLabel record = new JLabel("게임결과"); 
			record.setBounds(100,40,100,40);
			record.setFont(new Font("Monospaced", Font.BOLD, 13));
			record.setForeground(Color.BLACK);
			
			
			JLabel userId = new JLabel(TetrisMain.userId + " 님");
			userId.setBounds(100, 100, 100, 40);
			userId.setForeground(Color.black);
			
			
			JLabel score = new JLabel("★★★★새로운 점수★★★★");
			score.setBounds(100, 120, 200, 40);
			score.setFont(new Font("Monospaced", Font.BOLD, 11));
			score.setForeground(Color.BLACK);
			
			
			JLabel score_ = new JLabel(String.valueOf(gameScore));
			score_.setBounds(100, 140, 100, 40);
			score_.setForeground(Color.BLACK);
			score_.setFont(new Font("Monospaced", Font.BOLD, 20));
			
			
			JLabel raking = new JLabel("★★★★새로운 랭킹★★★★ ");
			raking.setBounds(100,180,200,40);
			raking.setFont(new Font("Monospaced", Font.BOLD, 11));
			raking.setForeground(Color.BLACK);
			
			
			JLabel raking_ = new JLabel(String.valueOf(ranking));
			raking_.setBounds(100,200,140,40);				
			raking_.setForeground(Color.BLACK);
			raking_.setFont(new Font("Monospaced", Font.BOLD, 20));
			
			
			
			
			frame.add(record);
			frame.add(userId);
			frame.add(score);
			frame.add(score_);
			frame.add(raking);
			frame.add(raking_);
			
			
		}else if (this.info.equalsIgnoreCase("high")) {
			JLabel record = new JLabel("게임결과"); 
			record.setBounds(100,40,100,40);
			record.setFont(new Font("Monospaced", Font.BOLD, 13));
			record.setForeground(Color.BLACK);
			JLabel userId = new JLabel(TetrisMain.userId + " 님");
			userId.setBounds(100, 100, 100, 40);
			userId.setForeground(Color.black);
			
			
			JLabel score = new JLabel("☆☆☆☆점수 갱신☆☆☆☆");
			score.setBounds(100, 120, 200, 40);
			score.setFont(new Font("Monospaced", Font.BOLD, 11));
			score.setForeground(Color.BLACK);
			
			
			JLabel score_ = new JLabel(String.valueOf(gameScore));
			score_.setBounds(100, 140, 100, 40);
			score_.setForeground(Color.BLACK);
			score_.setFont(new Font("Monospaced", Font.BOLD, 20));
			
			
			JLabel raking = new JLabel("랭킹");
			raking.setBounds(100,180,140,40);
			raking.setFont(new Font("Monospaced", Font.BOLD, 11));
			raking.setForeground(Color.BLACK);
			
			
			JLabel raking_ = new JLabel(String.valueOf(ranking));
			raking_.setBounds(100,200,140,40);		
			raking_.setForeground(Color.BLACK);
			raking_.setFont(new Font("Monospaced", Font.BOLD, 20));
			
			
			frame.add(record);
			frame.add(userId);
			frame.add(score);
			frame.add(score_);
			frame.add(raking);
			frame.add(raking_);
			
		}else if(this.info.equalsIgnoreCase("low")) {
			JLabel record = new JLabel("게임결과"); 
			record.setBounds(100,40,100,40);
			record.setFont(new Font("Monospaced", Font.BOLD, 13));
			record.setForeground(Color.BLACK);
			
			
			JLabel userId = new JLabel(TetrisMain.userId + " 님");
			userId.setBounds(100, 100, 100, 40);
			userId.setForeground(Color.black);
			
			
			JLabel score = new JLabel("점수");
			score.setBounds(100, 120, 200, 40);
			score.setFont(new Font("Monospaced", Font.BOLD, 11));
			score.setForeground(Color.BLACK);
			
			
			JLabel score_ = new JLabel(String.valueOf(gameScore));
			score_.setBounds(100, 140, 100, 40);
			score_.setForeground(Color.BLACK);
			score_.setFont(new Font("Monospaced", Font.BOLD, 20));
			
			
			JLabel raking = new JLabel("랭킹 ");
			raking.setBounds(100,180,200,40);
			raking.setFont(new Font("Monospaced", Font.BOLD, 11));
			raking.setForeground(Color.BLACK);
			
			
			JLabel raking_ = new JLabel(String.valueOf(ranking));
			raking_.setBounds(100,200,140,40);			
			raking_.setForeground(Color.BLACK);
			raking_.setFont(new Font("Monospaced", Font.BOLD, 20));
			
			
			frame.add(record);
			frame.add(userId);
			frame.add(score);
			frame.add(score_);
			frame.add(raking);
			frame.add(raking_);
		}
		
	}
	

}
