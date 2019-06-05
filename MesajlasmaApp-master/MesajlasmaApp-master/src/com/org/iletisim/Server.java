package com.org.iletisim;

public class Server {
	private String serverId;
	private String message;
	private String sending_id;
	
	public void sending_client(String sending_id,String message){
		this.sending_id=sending_id;
		this.message=message;
		Client c2=null;
		c2.setId(sending_id);
		
	}
	public String getSending_id() {
		return sending_id;
	}

	public void setSending_id(String sending_id) {
		this.sending_id = sending_id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Server(String serverId){
		this.serverId=serverId;
	}
	
	public String getserverId(){
		return serverId;
	}
	public void setserverId(String serverId){
		this.serverId=serverId;
	}
	

}
