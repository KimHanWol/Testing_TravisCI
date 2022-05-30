package calculator;

public class CalcPerform {
	int x, y;
	Calculator cal;
	
	public void setCal(Calculator cal) {
		this.cal = cal;
	}
	
	public int calResult(int op, int x, int y) {
		this.x = x;
		this.y = y;
		if(op == 1) {
			return cal.add(x, y);
		}
		else if(op == 2) {
			return cal.sub(x, y);
		}
		else {
			return cal.mul(x, y);		
		}
	}
}
