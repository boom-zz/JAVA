public class text3
{
	public static void main(String [] argu) {
		long result = 0;
		long f = 1;
		for (int i = 1; i <= 10; i++){
			f = f * i;
			result += f;
		}
		System.out.println("result=" + result);
	}
}

