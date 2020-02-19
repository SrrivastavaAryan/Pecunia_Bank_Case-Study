package GlaMathura.GlaMathura;



import org.junit.Test;


import junit.framework.Assert;

public class EmployeeTest {

	
		@Test
		public void setmonth(){
				Employee e1=new Employee();
				BussEmp be=new BussEmp();
				e1.setId(100);
				e1.setDesg("programmer");
				e1.setMonsal(3000);
				int be1=e1.getMonsal();
				//System.out.println(be1);
				Assert.assertEquals(3000,be1);
			}

		
		public static void main(String[] args) throws Exception {
			// TODO Auto-generated method stub

	EmployeeTest dd=new EmployeeTest();
	dd.setmonth();
	}
		
	}		

