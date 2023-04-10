
public class TestStr {

	public static void main(String[] args) {
	String str="mym";
	boolean flag=true;
	for(char i:str.toCharArray()) {
		System.out.println("indexOf::"+str.indexOf(i));
		System.out.println("lastIndexOf::"+str.lastIndexOf(i));
		System.out.println("char::"+i);
		System.out.println();
		if(str.indexOf(i)==str.lastIndexOf(i)) {
		System.out.println("first non-repeting char is::"+i);
		flag=false;
		break;
		}
		

	}
	if(flag) {
		System.out.println("there are no non repeting chars");
	}
	}

}
