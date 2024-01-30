package PAC_Day3;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Account_main {

	public static void main(String[] args) {
		current_account_class c1 = new  current_account_class("3312365253",50000,"Omkar");
		Saving_Account_real c2 = new Saving_Account_real("4626226362" , 70000 , "Ajay");
		System.out.println("balance before"+c1.getBalance());
		System.out.println("balance before"+c2.getBalance());
		
		c1.withdraw(46000);
		c2.withdraw(12000);
		System.out.println("balance after"+c1.getBalance());
		System.out.println("balance after"+c2.getBalance());
		

	}

}
