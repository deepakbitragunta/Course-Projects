
public class A4 {

	public static String [] selectionSort_String(String[] inList) {
		   String temp;     


		   for (int i=0; i<(inList.length-1); i++) {
			   for (int j=i+1; j<inList.length; j++) {
			       if (inList[i].compareTo(inList[j]) < 0) { // <--Changing the operator to LT
			           temp = inList[i];
			           inList[i] = inList[j];
			           inList[j] = temp;
			       }
			   }

		   }

		   // return the sorted Array
		   return inList;

}
}
