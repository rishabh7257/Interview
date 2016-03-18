package removeDuplicate;

public class duplicateSwate {

	// Remove duplicate

	public static void remdup(String s) {

		char[] arr = s.toCharArray();
		int len = arr.length;
		if (len == 0) {
			System.out.println("Empty String");
		} else if (arr.length < 2) {
			System.out.println("Length is not enuff to contain duplicates");
		} else {
			for (int i = 0; i < len; i++) {
				for (int j = i + 1; j < len; j++) {
					// if(j>arr.length-1) {
					// break;
					// }
					if (arr[i] == arr[j]) {
						int k =0;
						for (k = j; k < len - 1; k++) {
							arr[k] = arr[k + 1];
						// arr = deleteAtChar(arr,j);
						//	j--;
						}
						j--;
						arr[k] = '\0';
						len--;
					}
				}
			}
		}
		for (char c : arr) {
			System.out.println(c);
		}
	}

	public static char[] deleteAtChar(char[] arr, int index) {
		char[] result = new char[arr.length - 1];
		int k = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i == index) {
				i++;
			}
			if (i > arr.length - 1) {
				break;
			}
			result[k] = arr[i];
			k++;
		}
		return (result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "aaabcdddeef";
		remdup(str);

	}

}
