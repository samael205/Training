
// Compute the distance light travels using long variables.

public class Light
{
	public static void main(String args[])
	{
			int lightspeed;
			long days;
			long seconds;
			long distance;

			// Approximate speed of light in meters per second
			lightspeed = 300000000;

			// Specify the number of days here
			days = 100;

			// Calculating the number of seconds
			seconds = days * 24 * 60 * 60;

			// Calculate the distance
			distance = lightspeed * seconds;

			System.out.print("In " + days);
			System.out.print(" days light will travel about " + distance);
			System.out.println(" meters");
	}
}