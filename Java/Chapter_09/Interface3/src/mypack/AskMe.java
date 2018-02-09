
package mypack;

class AskMe implements SharedConstants
{
	static void answer(int result)
	{
		switch(result)
		{
			case NO :
						System.out.println("NO");
						break;

			case YES :
						System.out.println("YES");
						break;

			case MAYBE :
						System.out.println("MAYBE");
						break;

			case LATER :
						System.out.println("LATER");
						break;

			case SOON :
						System.out.println("SOON");
						break;

			case NEVER :
						System.out.println("NEVER");
						break;
		}
	}

	public static void main(String args[])
	{
		Question question = new Question();

		answer(question.ask());
		answer(question.ask());
		answer(question.ask());
		answer(question.ask());
	}
}