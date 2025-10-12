package caseStudy.main;
import caseStudy.application.*;
public class MainFactory {
	public static void main(String[] args) {
		GSPrimeAcc gsprime = new GSPrimeAcc(1001,"uma",1953.3f,true);
		GSNormalAcc gsnormal = new GSNormalAcc(1002,"mahesh",2499.8f,45.9f);

		gsprime.bookProduct(990.0f);
		gsnormal.bookProduct(299.0f);
	}

}

