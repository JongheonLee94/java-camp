package study2;

public class TalkRoomVO 
{
	private Integer roomNo = null;
	private String apple = null;
	private String banana = null;
	private String orange = null;
	
	public Integer getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(Integer roomNo) {
		this.roomNo = roomNo;
	}
	public String getApple() {
		return apple;
	}
	public void setApple(String apple) {
		this.apple = apple;
	}
	public String getBanana() {
		return banana;
	}
	public void setBanana(String banana) {
		this.banana = banana;
	}
	public String getOrange() {
		return orange;
	}
	public void setOrange(String orange) {
		this.orange = orange;
	}
}

/*
create table talk_room_t (
room_no number(5) ,
apple  char(4) , 
banana char(4) ,
orange char(4) 
);
*/