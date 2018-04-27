package mytest;

public final class PhoneNumber implements Comparable<PhoneNumber>{
	private final short areaCode;
	private final short prefix;
	private final short lineNumber;
	private volatile int hashCode;
	public PhoneNumber(int areaCode, int prefix, int lineNumber) {
		rangeCheck(areaCode,999,"area code");
		rangeCheck(prefix,999,"prefix");
		rangeCheck(lineNumber,999,"lineNumber");
		this.areaCode = (short)areaCode;
		this.prefix =(short) prefix;
		this.lineNumber = (short)lineNumber;
	}
	
	private void rangeCheck(int arg, int max, String name) {
	if(arg < 0 || arg > max)
		throw new IllegalArgumentException(name + ":" + arg);
	}
	@Override
	public int hashCode() {
		int result = hashCode;
		if(result == 0) {
			result = 17;
			result = 31*result + areaCode;
		}
		return result;
		
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PhoneNumber other = (PhoneNumber) obj;
		if (areaCode != other.areaCode)
			return false;
		if (lineNumber != other.lineNumber)
			return false;
		if (prefix != other.prefix)
			return false;
		return true;
	}

	public int compareTo(PhoneNumber o) {
		return String.CASE_INSENSITIVE_ORDER.compare(o, o);
		return 0;
	}



	
}
