package topic18.abstraction;
abstract class RBIBank{
	abstract double LoanInterest();
	final void loan() {
		System.out.println("As per RBI loan interest");
	}
}

class SBI extends RBIBank{
	double LoanInterest() {
		return 7.9;
	}
}
 class PNB extends RBIBank{
	 double LoanInterest() {
		 return 8.9;
	 }
 }
public class Program5 {

	public static void main(String[] args) {
    PNB ref= new PNB();
    System.out.println("PNB rate of interest : "+ ref.LoanInterest()+ "%");
    ref.loan();
    SBI ref1 = new SBI();
    System.out.println("SBI rate of interest : " + ref1.LoanInterest() + "%");
    ref.loan();
    RBIBank ref2 = new SBI();
    System.out.println("RBI bank rate of interest : "+ ref2.LoanInterest() + "%");
    ref.loan();
    RBIBank ref3 = new PNB();
    System.out.println("PNB bank rate of interest : "+ ref3.LoanInterest() + "%");
    ref.loan();
	}
}
