package lab9_Task2;

public class Chaper {
   private String tittle;
   private String numberPage;
public Chaper(String tittle, String numberPage) {
	
	this.tittle = tittle;
	this.numberPage = numberPage;
}
public String getTittle() {
	return tittle;
}
public String getNumberPage() {
	return numberPage;
}
@Override
public String toString() {
	return "tittle:" + tittle + ", numberPage:" + numberPage ;
}


   
}
