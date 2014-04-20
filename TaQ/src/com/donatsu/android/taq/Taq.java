package com.donatsu.android.taq;

import java.util.UUID;

public class Taq {
	private UUID mId;
	private String mMessage;
	private String mEventName;
	private int mReputation;

	public Taq(String msg, String event) {
		mMessage = msg;
		mEventName =  event;
		mReputation = 0;
		mId = UUID.randomUUID();
	}
	
	public Taq() {
		mMessage = "";
		mEventName =  "";
		mReputation = 0;
	}
	
	public String getMessage() {
		return mMessage;
	}
	
	public String getEventName() {
		return mEventName;
	}
	
	public int getReputation() {
		return mReputation;
	}
	
	public void setReputation(int rep) {
		mReputation = rep;
	}
	
	public void setEventName(String event) {
		mEventName = event;
	}
	
	public void setMessage(String msg) {
		mMessage = msg;
	}
	
	public UUID getId() {
		return mId;
	}
}
