package Demo;

import java.util.Properties;

import com.qa.trcrm.base.BasePage;
import com.qa.trcrm.base.BasePage2;

public class Test {

	public static void main(String[] args) {
		
		BasePage2 bp=new BasePage2();
		Properties prop=bp.init_prop();
		
		BasePage bp2=new BasePage();
		bp2.init_driver(prop);
			System.out.println();

		
	}

}
