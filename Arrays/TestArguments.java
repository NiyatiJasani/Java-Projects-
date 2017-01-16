package arrays;

public class TestArguments {
	public static void main(String[] args) {
		System.out.println(args.length);
		for(int iterator=0; iterator< args.length; iterator++){
			System.out.println("Hello " + args [iterator]);
		}
	}
}
