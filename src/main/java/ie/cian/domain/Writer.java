package ie.cian.domain;

public class Writer{

	String writerName;
	int writerId;
	
	
	public Writer() {
	}
	
	public Writer(String writerName, int writerId) {
		super();
		this.writerName = writerName;
		this.writerId = writerId;
	}
	
	
	public String getWriterName() {
		return writerName;
	}
	public void setWriterName(String writerName) {
		this.writerName = writerName;
	}
	public int getWriterId() {
		return writerId;
	}
	public void setWriterId(int writerId) {
		this.writerId = writerId;
	}
	
	@Override
	public String toString() {
		return  writerName;
	}
}
