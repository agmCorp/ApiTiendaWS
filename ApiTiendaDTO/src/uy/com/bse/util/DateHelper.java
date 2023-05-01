package uy.com.bse.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class DateHelper {
	public static final String HYPHEN_YEAR_FIRST = "yyyy-MM-dd";
	public static final String HYPHEN_YEAR_LAST = "dd-MM-yyyy";
	public static final String SLASH_YEAR_FIRST = "yyyy/MM/dd";
	public static final String SLASH_YEAR_LAST = "dd/MM/yyyy";

	public static XMLGregorianCalendar dateToXMLGregorianCalendar(Date date) {
		XMLGregorianCalendar result = null;
		if (date != null) {
			GregorianCalendar dateGregorian = new GregorianCalendar();
			dateGregorian.setTime(date);
			try {
				result = DatatypeFactory.newInstance().newXMLGregorianCalendar(dateGregorian);
			} catch (DatatypeConfigurationException e) {
				// TODO ALVARO LOGUEAR LA EXCEPTION
				// LOG.error("Error en dateToXMLGregorianCalendar: " + e.getMessage());
			}
		}
		return result;
	}

	public static Date XMLGregorianCalendarToDate(XMLGregorianCalendar date) {
		Date result = null;
		if (date != null) {
			result = date.toGregorianCalendar().getTime();
		}
		return result;
	}

	public static Date stringToDate(String date, String pattern) {
		Date result = null;
		if (date != null && pattern != null && !date.isEmpty() && !pattern.isEmpty()) {
			SimpleDateFormat formatter = new SimpleDateFormat(pattern);				
			try {
				result = formatter.parse(date);
			} catch (ParseException e) {
				// TODO ALVARO LOGUEAR LA EXCEPTION
				// LOG.error("Error en dateToXMLGregorianCalendar: " + e.getMessage());
			}
		}
		return result;
	}

	public static String dateToString(Date date, String pattern) {
		String result = null;
		if (date != null && pattern != null && !pattern.isEmpty()) {
			SimpleDateFormat formatter = new SimpleDateFormat(pattern);
			result = formatter.format(date);
		}

		return result;
	}

	public static String xmlGregorianCalendarToString(XMLGregorianCalendar date, String pattern) {
		String result = null;
		if (date != null && pattern != null && !pattern.isEmpty()) {
			result = dateToString(XMLGregorianCalendarToDate(date), pattern);
		}

		return result;
	}
}
