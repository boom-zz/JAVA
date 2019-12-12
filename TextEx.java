import java.io.*;

public class  TextEx
{
	public static void main(String[] args) 
	{
		int[] arr = {1, 2, 3};
		System.out.println(arr[2]);
		try
		{
			System.out.println(2/0);
		}
		catch (ArithmeticException ax)
		{
			System.out.println("系统正在维护中");
			ax.printStackTrace();
		}
	}
}
