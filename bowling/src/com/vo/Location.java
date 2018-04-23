package com.vo;

public class Location {
    private int center_seq; 
    private String center_name; 
    private double lat; 
    private double log;
    private double elat;
    private double slat;
    private double elog;
    private double slog;
	public int getCenter_seq() {
		return center_seq;
	}
	public void setCenter_seq(int center_seq) {
		this.center_seq = center_seq;
	}
	public String getCenter_name() {
		return center_name;
	}
	public void setCenter_name(String center_name) {
		this.center_name = center_name;
	}
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
		setSlat(lat-0.02);
		setElat(lat+0.02);
	}
	public double getLog() {
		return log;
	}
	public void setLog(double log) {
		this.log = log;
		setSlog(log-0.02);
		setElog(log+0.02);
	}
	public double getElat() {
		return elat;
	}
	public void setElat(double elat) {
		this.elat = elat;
	}
	public double getSlat() {
		return slat;
	}
	public void setSlat(double slat) {
		this.slat = slat;
	}
	public double getElog() {
		return elog;
	}
	public void setElog(double elog) {
		this.elog = elog;
	}
	public double getSlog() {
		return slog;
	}
	public void setSlog(double slog) {
		this.slog = slog;
	}
}
