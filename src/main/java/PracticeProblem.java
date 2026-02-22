public class PracticeProblem {

    public static int[] createIntArray() {

        int[] arr = new int[5];   

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;   
        }

        return arr;    
    }
	public static String[] createArray(String a, String b, String c, String d){
		String[] arr = new String[4];
		arr[0] = a;
		arr[1] = b;
		arr[2] = c;
		arr[3] = d;
		return arr;

	}
	public static int findValue(int a, int[] arr){
		for (int i = 0; i<arr.length; i++){
			if (arr[i] == a){
				return i;
			}
		}
		return -1;
	}
	public static int findThirdValue(String a, String[] arr){
		int count = 0;
		for (int i = 0; i<arr.length; i++){
			if (arr[i].equals(a)){
				count ++;
				if (count ==3){
					return i;
				}

			}
		}
		return -1;
	}

}