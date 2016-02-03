package Rough;

import com.qtpselenium.util.Xls_Reader;

public class TestUtil {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String q="C:\\Users\\ADMIN\\Desktop\\Suite.xlsx";
		Xls_Reader xls=new Xls_Reader(q);
		isSuiteRunnable(xls, "SuiteA");
		isSuiteRunnable(xls, "SuiteB");
		isSuiteRunnable(xls, "SuiteC");

	}
     
	
	 public static Boolean isSuiteRunnable (Xls_Reader xls,String suitname){
		 Boolean excuteable=false;
		 int rows=xls.getRowCount("Sheet1");
		 int cols=xls.getColumnCount("");
		 
		 for (int i=2;i<rows;i++){
				 if(xls.getCellData("Sheet1", "SuiteName", i).equalsIgnoreCase(suitname)){
					 if(xls.getCellData("Sheet1", "Mode", i).equalsIgnoreCase("Y")){
						 excuteable= true ;
					 }else{
						 excuteable= false ;
					 }
				 }
			 }	 
		 return excuteable;
	 }
}
