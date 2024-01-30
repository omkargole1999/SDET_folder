package PAC2;

public class EX_const {
	private int mathematics;
	private int scimarks;
	private int engmarks;
	
	public EX_const(int mathematics, int scimarks, int engmarks) {
		super();
		this.mathematics = mathematics;
		this.scimarks = scimarks;
		this.engmarks = engmarks;
	}
	public void total()
	{
		int totalmarks;
		totalmarks = mathematics+scimarks+engmarks;
		System.out.println(totalmarks);
	}

}
