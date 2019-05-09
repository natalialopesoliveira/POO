import java.util.Date;

//https://docs.oracle.com/javase/6/docs/api/java/util/Date.html
public class Data extends Date {

	public void setMonth(String _mes) {
		super.setMonth(Data.stringMonth(_mes) - 1);
	}

	public int getMonth() {
		return (super.getMonth() + 1);
	}

	public static int stringMonth(String _mes) {
		switch (_mes.toLowerCase()) {
		case "janeiro":
			return 1;
		case "fevereiro":
			return 2;
		case "março":
			return 3;
		case "marco":
			return 3;
		case "abril":
			return 4;
		case "maio":
			return 5;
		case "junho":
			return 6;
		case "julho":
			return 7;
		case "agosto":
			return 8;
		case "setembro":
			return 9;
		case "outubro":
			return 10;
		case "novembro":
			return 11;
		case "dezembro":
			return 12;
		default:
			return 13;

		}
	}

	public int quantidadeDias(Data _data1) {
		long quantidade = 0;
		quantidade = (long) ((this.getTime() - _data1.getTime()) / (1000 * 60 * 24));
		if (quantidade < 0)
			quantidade = -quantidade;
		return (int) quantidade;

	}

	public void incrementa(long _milliseconds) {
		long quantidade;
		quantidade = this.getTime() + _milliseconds;
		this.setTime(quantidade);
	}

}
