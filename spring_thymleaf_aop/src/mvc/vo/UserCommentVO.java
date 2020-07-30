package mvc.vo;
/*
create table usercomment(
u_num number constraint usercomment_u_num_pk primary key,
u_id varchar2(100),
u_pw varchar2(100),
u_content clob,
u_pluscom number default -1
);*/
public class UserCommentVO {

	private String u_id,u_pw,u_content;
	private int u_num,u_pluscom;
	public String getU_id() {
		return u_id;
	}
	public void setU_id(String u_id) {
		this.u_id = u_id;
	}
	public String getU_pw() {
		return u_pw;
	}
	public void setU_pw(String u_pw) {
		this.u_pw = u_pw;
	}
	public String getU_content() {
		return u_content;
	}
	public void setU_content(String u_content) {
		this.u_content = u_content;
	}
	public int getU_num() {
		return u_num;
	}
	public void setU_num(int u_num) {
		this.u_num = u_num;
	}
	public int getU_pluscom() {
		return u_pluscom;
	}
	public void setU_pluscom(int u_pluscom) {
		this.u_pluscom = u_pluscom;
	}
	
}
