package businesslogic;
import java.util.regex.*;
import java.util.ArrayList;
public class RegistrationValidation{
	public boolean checkUserDetails(String email, String password, String confirmPassword){
		if(validPassword(password,confirmPassword)==true && validEmail(email)==true) {
				return true;
		}else {
			System.out.println("Hwll");
			return false;
		}
	}
	
	private boolean validPassword(String password, String confirmPassword) {
		boolean lowercase=!password.equals(password.toLowerCase());
		boolean uppercase=!password.equals(password.toUpperCase());
		ArrayList<String> number=new ArrayList<>();
		number.add("1");number.add("2");number.add("3");number.add("4");number.add("5");number.add("6");number.add("7");number.add("8");number.add("9");
		boolean a=true;
		if(password.length()==0){a=false;}
		if(password.equals(confirmPassword)==false){a=false;}
		if(password.length()<8 || password.length()>20) {a=false;}
		if(!lowercase) {a=false;}
		if(!uppercase) {a=false;}
		if(a==true ){boolean b=false;
			for(int i=0;i<password.length();i++){
				if(number.indexOf(password.substring(i,i+1))!=-1){b=true;}
			}
			a=b;
		}
		
		return a;
	}
	private boolean validEmail(String email) {
		String pattern="^[0-9A-Za-z@_.]+$";
		boolean result=false;
		if(email.length()==0){return false;}
		Pattern p=Pattern.compile(pattern);
		Matcher m=p.matcher(email);
		if(m.matches()==true) {
			//System.out.print("fine");
			result=true;
		}
		return result;
	}
}

