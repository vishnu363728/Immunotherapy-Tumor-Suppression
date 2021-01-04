package sciencefair;

public class gene {
	private String antigen;
	private String genename;
	private String[][] thecelltumors= new String[33][109] ;
	public gene(String a, String b, String [] tumornumb ) {
	//Creates a new gene profile
	genename=a;
	//Stores the associated antigens
	antigen=b;
	
	}
public String getGene() {
	return genename;
}
public String getantigen() {
	return antigen;
}


}
























