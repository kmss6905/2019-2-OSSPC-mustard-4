package com.tetris.main;

public class GameResultRepo {
	String score;
	String ranking;
	
	
	
	public String getScore() {
		return score;
	}



	public void setScore(String score) {
		this.score = score;
	}



	public String getRanking() {
		return ranking;
	}



	public void setRanking(String ranking) {
		this.ranking = ranking;
	}



	@Override
	public String toString() {
		return "GameResultRepo [ranking=" + ranking + ", score=" + score + "]";
	}
	
	
}
