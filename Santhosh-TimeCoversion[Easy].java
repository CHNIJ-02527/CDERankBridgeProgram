package com.cts.bridgeprogram.ds;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class TimeCoversion {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String time =  scanner.nextLine();
		DateFormat normalTime = new SimpleDateFormat("hh:mm:ssaa");
		DateFormat railwayTime = new SimpleDateFormat("HH:mm:ss");
		Date givenTime = null;
		givenTime = normalTime.parse(time);
		if(givenTime!=null) {
			String requiredTime =  railwayTime.format(givenTime);
			System.out.println(requiredTime);
		}
		scanner.close();
	}

}
