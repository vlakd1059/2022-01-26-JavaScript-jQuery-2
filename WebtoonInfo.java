
public class WebtoonInfo {
	// 제목
	private String title;
	// 작가
	private String writer;
	// 연재일
	private String openDay;
	
	
	public WebtoonInfo(String title, String writer, String openDay) {
		this.title = title;
		this.writer = writer;
		this.openDay = openDay;
	}
	
	
	public String getTitle() {
		return title;
	}
	public String getWriter() {
		return writer;
	}
	public String getOpenDay() {
		return openDay;
	}
}
