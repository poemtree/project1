package com.vo;

public class Game {

    private int game_num; 
    private String regdate; 
    private String title;
    private String game_master;
    
	public String getGame_master() {
		return game_master;
	}
	public void setGame_master(String game_master) {
		this.game_master = game_master;
	}
	public int getGame_num() {
		return game_num;
	}
	public void setGame_num(int game_num) {
		this.game_num = game_num;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
    
	public String toString() {
		return "/" + this.game_num + "/" + this.title + "/" + this.game_master + "/" + this.regdate+"/";
	}
}
