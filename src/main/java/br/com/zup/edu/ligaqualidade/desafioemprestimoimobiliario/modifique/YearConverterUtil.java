package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique;

public class YearConverterUtil {

	private static final int MONTH_NUMBERS_OF_YEAR = 12;

	public static int convertYearToMonth(int year) {
		return year * MONTH_NUMBERS_OF_YEAR;
	}

}
