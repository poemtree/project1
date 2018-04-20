package com.vo;

public class Score {
	private int score_seq;
	private String id;
	private String regdate;
	private int game_num;
	private int set1;
	private int set2;
	private int set3;
	private int set4;
	private int set5;
	private int set6;
	private int set7;
	private int set8;
	private int set9;
	private int set10;
	private int strike;
	private int spare;

	public int getScore_seq() {
		return score_seq;
	}

	public void setScore_seq(int score_seq) {
		this.score_seq = score_seq;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public int getGame_num() {
		return game_num;
	}

	public void setGame_num(int game_num) {
		this.game_num = game_num;
	}

	public int getSet1() {
		return set1;
	}

	public void setSet1(int set1) {
		this.set1 = set1;
	}

	public int getSet2() {
		return set2;
	}

	public void setSet2(int set2) {
		this.set2 = set2;
	}

	public int getSet3() {
		return set3;
	}

	public void setSet3(int set3) {
		this.set3 = set3;
	}

	public int getSet4() {
		return set4;
	}

	public void setSet4(int set4) {
		this.set4 = set4;
	}

	public int getSet5() {
		return set5;
	}

	public void setSet5(int set5) {
		this.set5 = set5;
	}

	public int getSet6() {
		return set6;
	}

	public void setSet6(int set6) {
		this.set6 = set6;
	}

	public int getSet7() {
		return set7;
	}

	public void setSet7(int set7) {
		this.set7 = set7;
	}

	public int getSet8() {
		return set8;
	}

	public void setSet8(int set8) {
		this.set8 = set8;
	}

	public int getSet9() {
		return set9;
	}

	public void setSet9(int set9) {
		this.set9 = set9;
	}

	public int getSet10() {
		return set10;
	}

	public void setSet10(int set10) {
		this.set10 = set10;
	}

	public int getStrike() {
		return strike;
	}

	public void setStrike(int strike) {
		this.strike = strike;
	}

	public int getSpare() {
		return spare;
	}

	public void setSpare(int spare) {
		this.spare = spare;
	}
	
	public String toString() {
		return getId() + getSet10() + getStrike() + getSpare();
	}
}
