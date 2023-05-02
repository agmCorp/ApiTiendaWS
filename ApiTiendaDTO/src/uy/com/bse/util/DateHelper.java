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

	public static XMLGregorianCalendar dateToXmlGregorianCalendar(Date date) throws DatatypeConfigurationException {
		XMLGregorianCalendar result = null;
		if (date != null) {
			GregorianCalendar dateGregorian = new GregorianCalendar();
			dateGregorian.setTime(date);
			result = DatatypeFactory.newInstance().newXMLGregorianCalendar(dateGregorian);
		}
		return result;
	}

	public static Date xmlGregorianCalendarToDate(XMLGregorianCalendar date) {
		Date result = null;
		if (date != null) {
			result = date.toGregorianCalendar().getTime();
		}
		return result;
	}

	public static Date stringToDate(String date, String pattern) throws ParseException {
		Date result = null;
		if (date != null && pattern != null && !date.isEmpty() && !pattern.isEmpty()) {
			SimpleDateFormat formatter = new SimpleDateFormat(pattern);
			result = formatter.parse(date);
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
			result = dateToString(xmlGregorianCalendarToDate(date), pattern);
		}

		return result;
	}
}
