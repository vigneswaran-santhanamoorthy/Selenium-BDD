package utilities;

public class commonMethods {
	
	public String createRandomString(int n) {
		String Alpha="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		StringBuilder sb = new StringBuilder(n);
		for(int i=0;i<n;i++) {
			int index=(int)(Alpha.length() * Math.random());
			sb.append(Alpha.charAt(index));
		}
		return sb.toString();
	}
	
	public String createRandomNumber(int n) {
		String Num="1234567890";
		StringBuilder sb = new StringBuilder(n);
		for(int i=0;i<n;i++) {
			int index=(int)(Num.length() * Math.random());
			sb.append(Num.charAt(index));
		}
		return sb.toString();
	}

}
