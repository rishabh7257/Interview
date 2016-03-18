
public class CompareVersion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String version1 = "1.1";
		String version2 = "1.2";
		int result = compareVersionNumber(version1, version2);
		System.out.println("The result of this program is " + result);
				
	}
	
	public static int compareVersionNumber(String version1, String version2) {
		
		String[] v1s = version1.split("\\.");
        String[] v2s = version2.split("\\.");
		
        System.out.println("v1s " + v1s.toString());
        int i = 0;
        while (i < v1s.length) {
        	
        	if(Integer.valueOf(v1s[i]) > Integer.valueOf(v2s[i])) {
        		
        		return 1;
        	} else if (Integer.valueOf(v1s[i]) < Integer.valueOf(v2s[i])) {
        		return -1;
        	} 
        }
		
		return 0;
		
	}

}
