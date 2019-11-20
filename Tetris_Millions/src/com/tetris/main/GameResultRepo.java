package com.tetris.main;

public class GameResultRepo {
	String mode;
	String ranking;
	String info;
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public String getRanking() {
		return ranking;
	}
	public void setRanking(String ranking) {
		this.ranking = ranking;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	@Override
	public String toString() {
		return "GameResultRepo [mode=" + mode + ", ranking=" + ranking + ", info=" + info + "]";
	}
	
	
}
