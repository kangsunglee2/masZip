package com.example.food.entity;

import java.time.LocalDateTime;

public class NReply {
	private int nid;
	private String comment;
	private LocalDateTime regTime;
	private String uid;
	private int bid;
	private int rid;
	private int isMine;
	private int isDeleted;
	private String uname;
	
	public NReply(int nid, String comment) {
		this.nid = nid;
		this.comment = comment;
	}
	public NReply(String comment, String uid, int bid, int rid, int isMine) {
		this.comment = comment;
		this.uid = uid;
		this.bid = bid;
		this.rid = rid;
		this.isMine = isMine;
	}
	public NReply() { }
	public NReply(int nid, String comment, LocalDateTime regTime, String uid, int bid, int rid, int isMine,
			int isDeleted, String uname) {
		this.nid = nid;
		this.comment = comment;
		this.regTime = regTime;
		this.uid = uid;
		this.bid = bid;
		this.rid = rid;
		this.isMine = isMine;
		this.isDeleted = isDeleted;
		this.uname = uname;
	}
	
	@Override
	public String toString() {
		return "NReply [nid=" + nid + ", comment=" + comment + ", regTime=" + regTime + ", uid=" + uid + ", bid=" + bid
				+ ", rid=" + rid + ", isMine=" + isMine + ", isDeleted=" + isDeleted + ", uname=" + uname + "]";
	}
	
	public int getNid() {
		return nid;
	}
	public void setNid(int nid) {
		this.nid = nid;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public LocalDateTime getRegTime() {
		return regTime;
	}
	public void setRegTime(LocalDateTime regTime) {
		this.regTime = regTime;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public int getIsMine() {
		return isMine;
	}
	public void setIsMine(int isMine) {
		this.isMine = isMine;
	}
	public int getIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(int isDeleted) {
		this.isDeleted = isDeleted;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
}