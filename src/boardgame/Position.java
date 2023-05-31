package boardgame;

public class Position {

	private Integer row;
	private Integer colum;
	
	public Position() {
	}
	
	public Position(Integer raw, Integer colum) {
		this.row = raw;
		this.colum = colum;
	}
	
	public Integer getRaw() {
		return row;
	}
	
	public void setRaw(Integer raw) {
		this.row = raw;
	}
	
	public Integer getColum() {
		return colum;
	}
	
	public void setColum(Integer colum) {
		this.colum = colum;
	}

	@Override
	public String toString() {
		return row + ", " + colum;
	}
	
	
}
