/**
 * La clase Fecha permite representar
 * @author oscardp96
 * @since 17-02-2017
 */
public class Fecha {
	
	private int dia, mes, anio;

	
	public Fecha(int dia, int mes, int anio) throws IllegalArgumentException {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
		if (!this.fechaValida())
			throw new IllegalArgumentException("Los parámetros introducidos no conforman una fecha válida.");
	}
	
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	public boolean esBisiesto () {
		if (anio % 400 == 0)
			return true;
		else if ((anio % 4 == 0) && (anio % 100 != 0))
			return true;
		else
			return false;
	}
	
	public boolean fechaValida() {
		if (((this.getDia() < 0) || (this.getMes() < 0)) || (this.getMes() > 12))
			return false;
		else if ((this.getDia() == 29) && (this.getMes() == 2) && (this.esBisiesto()))
			return true;
		else if ((this.getDia() > Fecha.diasDelMes(this.getMes())))
			return false;
		else 
			return true;
	}

	
	static public int diasDelMes(int mes) {
		if (mes == 2)
			return 28;
		else if (mes <= 7) {
			if (mes % 2 != 0)
				return 31;
			else
				return 30;
		}
		else {
			if (mes % 2 == 0)
				return 31;
			else
				return 30;
		}
	}
	
}










//END
