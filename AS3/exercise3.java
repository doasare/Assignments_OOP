class exercise3
{
	//sort and find out middle number
	public static void main(String[] args)
	{
		double x = Double.parseDouble(args[0]);// collects and stores information 
		double y = Double.parseDouble(args[1]);// collects and stores information 
		double z = Double.parseDouble(args[2]);// collects and stores information

		double[] number = {x, y, z};// puts collected information in array

		sort (number);// sends to the method sort() to sort the array and returns 

		// middle number in parenthesis
		System.out.println(number[0] +" [" +number[1]+"] "+ number[2]);
	}
	public static double [] sort(double []number)		
	{

		java.util.Arrays.sort(number);// java imported code to sort the numbers
		

		return number;
	}
}
