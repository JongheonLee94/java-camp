package study2;

public class TalkVO 
{
	private Integer talkNo = null;
	private Integer roomNo = null;
	private String content = null;
	
	public Integer getTalkNo() {
		return talkNo;
	}
	public void setTalkNo(Integer talkNo) {
		this.talkNo = talkNo;
	}
	public Integer getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(Integer roomNo) {
		this.roomNo = roomNo;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
}

/*
create table talk_t (
	talk_no number(6) ,
	room_no number(5) ,
	content varchar2(128)
);
*/ 
