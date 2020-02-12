package dto;

import java.time.LocalDateTime;

public class BoardDTO {

	private int no;
	private String title;
	private String content;
	private int count;
	private String writer;
	private LocalDateTime reg_date;
	private LocalDateTime edit_date;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public LocalDateTime getReg_date() {
		return reg_date;
	}
	public void setReg_date(LocalDateTime reg_date) {
		this.reg_date = reg_date;
	}
	public LocalDateTime getEdit_date() {
		return edit_date;
	}
	public void setEdit_date(LocalDateTime edit_date) {
		this.edit_date = edit_date;
	}
	
	
}
