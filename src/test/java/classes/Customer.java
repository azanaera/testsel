package classes;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Customer {
	public String name;
	public String gender;
	public String  bday;
	public String addr;
	public String city;
	public String state;
	public int pin;
	public int telephoneno;
	public String email;
	
	public Customer(String _name,
					String _gender,
					String _bday,
					String _addr,
					String _city,
					String _state,
					int    _pin,
					int    _telephoneno,
					String _email) {
		name   = _name;
		gender = _gender;
		bday   = _bday;
		addr   = _addr;
		city   = _city;
		state  = _state;
		pin    = _pin;
		telephoneno = _telephoneno;
		email  = _email;
		
	}
	
	String getGender(String gen) {
		return "";
	}
}
