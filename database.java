package sciencefair;
import java.util.*;
public class database {
	public String [] listofgenes = {"CT37/FMR1NB","Cyclin-A1","GnTV","KM-HN-1","LAGE-1","LAGE-1","LAGE-1","LAGE-1","LAGE-1","LAGE-1","LAGE-1","LAGE-1","LAGE-1","LY6K","LY6K","LY6K","MAGE-A1","MAGE-A1","MAGE-A1","MAGE-A1","MAGE-A1","MAGE-A1","MAGE-A1","MAGE-A1","MAGE-A1","MAGE-A1","MAGE-A1","MAGE-A1","MAGE-A1","MAGE-A1","MAGE-A1","MAGE-A1","MAGE-A1","MAGE-A1","MAGE-A1","MAGE-A10","MAGE-A10","MAGE-A12 m","MAGE-A12 m","MAGE-A12 m","MAGE-A12 m","MAGE-A2","MAGE-A2","MAGE-A2","MAGE-A2","MAGE-A2","MAGE-A3","MAGE-A3","MAGE-A3","MAGE-A3","MAGE-A3","MAGE-A3","MAGE-A3","MAGE-A3","MAGE-A3","MAGE-A3","MAGE-A3","MAGE-A3","MAGE-A3","MAGE-A3","MAGE-A3","MAGE-A3","MAGE-A3","MAGE-A4","MAGE-A4","MAGE-A4","MAGE-A4","MAGE-A6","MAGE-A6","MAGE-A6","MAGE-A6","MAGE-A6","MAGE-A6","MAGE-C1","MAGE-C1","MAGE-C1","MAGE-C1","MAGE-C2","MAGE-C2","MAGE-C2","NY-ESO-1/LAGE-2","NY-ESO-1/LAGE-2","NY-ESO-1/LAGE-2","NY-ESO-1/LAGE-2","NY-ESO-1/LAGE-2","NY-ESO-1/LAGE-2","NY-ESO-1/LAGE-2","NY-ESO-1/LAGE-2","NY-ESO-1/LAGE-2","NY-ESO-1/LAGE-2","NY-ESO-1/LAGE-2","NY-ESO-1/LAGE-2","NY-ESO-1/LAGE-2","NY-ESO-1/LAGE-2","NY-ESO-1/LAGE-2","NY-ESO-1/LAGE-2","NY-ESO-1/LAGE-2","NY-ESO-1/LAGE-2","NY-ESO-1/LAGE-2","NY-ESO-1/LAGE-2","NY-ESO-1/LAGE-2","SAGE","Sp17","SSX-2","SSX-2","SSX-2","SSX-2","SSX-2","TRP2-INT2"};
	public String [] listofantigens = {"A2","A2","A2","A24","A2","A31","B7","DR3","DR12","DR13","DR11","DR15","DR4","A24","DR15","DP5","A1","A2","A31","A2","A68","B7","B35","B37","B44","B53","B57","Cw2","Cw3","Cw7","DP4","Cw16","DR13","DP4","DR15","A2","B53","A2","Cw7","DP4","DR13","A2","A24","Cw7","DR13","B37","A2","A1","A24","B18","B35","B37","B44","B40","B52","DP4","Cw7","DR1","DQ6","DR4","DR7","DR11","DR13","A2","A1","A24","B37","B35","Cw7","DR13","Cw16","A34","B37","A2","DQ6","A2","DR15","A2","DQ6","DR15","A2","A24","A31","B7","B35","B49","B52","Cw3","DP4","DR1","DR2","DR3","Cw6","C12","B51","DR4","DR52b","DR7","DR8","DR9","DR15","A24","A1","A2","DP1","DR3","DR4","DR11","A68"};
	private ArrayList<gene> geneobjects = new ArrayList<gene>();
	private String acutemyeloidleukemia = "09_0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000";
	private String adrenocorticalcarcinoma = "0020000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000000";
	private String BladderUrothelialCarcinoma = "0030000000000777000000000000000000011000011111222222222222222222222111111000000011111111111111111111102000000";
	private String BrainLowerGradeGlioma= "0050000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000000";
	private String BreastInvasiveCarcinoma= "0041000000000111000000000000000000000000000000000000000000000000000000000000000000000000000000000000005000000";
	private String Cervicalsquamouscellcarcinomaandendocervicaladenocarcinoma= "0020000000000888000000000000000000000000000000000000000000000000000000000000000000000000000000000000004000000";
	private String Cholangiocarcinoma= "0030000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000004000000";
	private String Colonadenocarcinoma= "0080000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000004000000";
	private String Esophagalcarcinoma= "0160000000000444000000000000000000000000011111111111111111111112222111111000000000000000000000000000003000000";
	private String GlioblastomaMultiforme= "0120000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000005000000";
	private String HeadandNeckSquamouscellcarcinoma= "0340000000000$$$000000000000000000000000000000111111111111111111111111111000000000000000000000000000003000000";
	private String KidneyChromophobe= "0042000000000222000000000000000000000000000000000000000000000000000000000000000000000000000000000000003000000";
	private String Kidneyrenalclearcellcarcinoma= "0062000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000002000000";
	private String Kidneyrenalpapillarycellcarcinoma= "0032000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000005000000";
	private String Liverhepatocellularcarcinoma= "0011111111111000111111111111111111100000000000111111111111111110000111111111100000000000000000000000003001000";
	private String Lungadenocarcinoma= "0051000000000111000000000000000000000000000000000000000000000000000000000000000000000000000000000000005000000";
	private String Lungsquamouscellcarcinoma= "0060000000000333111111111111111111111000011111222222222222222224444222222000000011111111111111111111113000000";
	private String LymphoidNeoplasmDiffuseLangeBcellLymphoma= "0020000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000002000000";
	private String Mesothelioma= "0021000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000002000000";
	private String Ovarianserouscystadenocarcinoma= "0%61000000000111000000000000000000000000000000000000000000000001111000000000000000000000000000000000007000000";
	private String Pancreaticadenocarcinoma= "0050000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000002000000";
	private String Pheochromocytomaandparaganglioma= "0550000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000003000000";
	private String Prostateadenocarcinoma= "0032000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000003000000";
	private String Rectumadenocarcinoma= "0080000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000002000000";
	private String Sarcoma= "0030000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000002000000";
	private String SkinCutaneousMelanoma= "008022222222200011111111111111111111199995555599999999999999999000099999911110004444444444444444444440100000^";
	private String Stomachadenocarcinoma= "0080000000000000000000000000000000000000000000222222222222222220000111111000000000000000000000000000004000000";
	private String TesticularGermCellTumors= "0130111111111000000000000000000000000000000000000000000000000000000000000222200022222222222222222222202222220";
	private String Thymoma = "0020000000000444000000000000000000000000000000000000000000000000000000000000000000000000000000000000005000000";
	private String Thyroidcarcinoma= "0131000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000008011010";
	private String UterineCarcinosaroma= "0020000000000111000000000000000000000000000000000000000000000001111000000000000000000000000000000000014000000";
	private String UterineCorpusEndometrialCarcinoma= "0920000000000111000000000000000000000000000000000000000000000000000000000000000000000000000000000000009000000";
	private String UvealMelanoma= "0070000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000002000000";
	private String [] alltumors = {acutemyeloidleukemia, adrenocorticalcarcinoma, BladderUrothelialCarcinoma, BrainLowerGradeGlioma, BreastInvasiveCarcinoma, Cervicalsquamouscellcarcinomaandendocervicaladenocarcinoma, Cholangiocarcinoma, Colonadenocarcinoma, Esophagalcarcinoma,GlioblastomaMultiforme,  HeadandNeckSquamouscellcarcinoma, KidneyChromophobe,Kidneyrenalclearcellcarcinoma, Kidneyrenalpapillarycellcarcinoma, Liverhepatocellularcarcinoma,Lungadenocarcinoma, Lungsquamouscellcarcinoma,LymphoidNeoplasmDiffuseLangeBcellLymphoma, Mesothelioma,Ovarianserouscystadenocarcinoma,Pancreaticadenocarcinoma,Pheochromocytomaandparaganglioma,Prostateadenocarcinoma, Rectumadenocarcinoma, Sarcoma,  SkinCutaneousMelanoma,Stomachadenocarcinoma,TesticularGermCellTumors,Thymoma,Thyroidcarcinoma, UterineCarcinosaroma, UterineCorpusEndometrialCarcinoma, UvealMelanoma          };
	public database() {
		for(int i=0;i<geneobjects.size();i++) {
			geneobjects.add(new gene(listofgenes[i],listofantigens[i],alltumors));
		}
	}

public String [] getlistofgenes() {
	return listofgenes;
}
public String [] getlistofalltumors() {
	return alltumors;
}
public String[] getlistofantigens() {
	return listofantigens;
}
public ArrayList<gene> getgeneobjectlist(){
	return geneobjects;
}
	public static void main(String[] args) {
		Scanner anObj = new Scanner(System.in);
		System.out.println("Press 1 to enter research/customizable antigen entry mode. Press 2 to enter scan analysis/immunotherapy informatics mode. ");
		String uinput = anObj.nextLine();
		if(Integer.valueOf(uinput)==1) {
			Scanner anotherone = new Scanner(System.in);
			Scanner genedos = new Scanner(System.in);
			Scanner antidos= new Scanner(System.in);
			Scanner retrival = new Scanner(System.in);
			Scanner thecorrectmethod = new Scanner(System.in);
			System.out.println("Enter the tumor for which CAR-T cells need to be engineered");
			String en = anObj.nextLine();
			Scanner anotherobject = new Scanner(System.in);
			Scanner doubleob=new Scanner(System.in);
			System.out.println("Enter the first gene name:");
			String geneinput = anotherobject.nextLine();
			System.out.println("Enter the tumor-specific antigen associated with the first gene");
			String antinput = doubleob.nextLine();
			System.out.println("Enter the second gene name:");
			String secondg = genedos.nextLine();
			System.out.println("Enter the tumor-specific antigen associated with the second gene");
			String seconda = antidos.nextLine();
			System.out.println("Enter a number 1-3 corresponding to a gene editing method to engineer the CAR-T cells from the list: 1 for CRISPR/Cas9 systems, 2 for Transcription activator-like effector nucleases, or 3 for Zinc finger nucleases.");
			String theirwish = thecorrectmethod.nextLine();
			System.out.println("Enter a number 1 or 2 corresponding to the T-cell retrival method: 1 for autologous from the patients blood or 2 for allogenic from a healthy donor.");
			String blmet = retrival.nextLine();
			int y = Integer.valueOf(blmet);
			String select="";
			if(y==1) {
				select="autologous";
			}
			if(y==2) {
				select="allogenic";
			}
			if(y<1 || y>2) {
				System.out.println("Invalid input");
				return;
			}
			String themethod ="";
			String editplan="";
			int x = Integer.valueOf(theirwish);
			if(x!=1 && x!=2 && x!=3) {
				System.out.println("Invalid input");
				return;
			}
			else if(x==1) {
				themethod="CRISPR/Cas 9 base editing";
				editplan="The use of CRISPR and Cas9 base editing to engineer CAR-T cells is efficient to multiplex the processing of T-cells. \r\n The anchor site is 23nt, the off-target chances are relatively high, but the efficiency is also extremely high.";
			}
			else if(x==2) {
				themethod="Transcription activator-like effector nucleases";
				editplan="Transcription activator-like effector nucleases, or TALENs, are restriction enzymes that fuse TAL effectors to cleavage domain within the DNA."+"\r\n The anchor site is 30-36 nt, the off-target chances are low, and complications are relatively likely.";
			}
			else if(x==3){
				themethod="Zinc finger nucleases";
				editplan="The ZFN, zinc finger nucleases, is an endonuclease that cleaves a certain genomic sequence, which then induces repair processes. \r\n The anchor site is 18-36nt, the off target chances are low, but the complications are high.";
			}
			System.out.println("You chose to use "+themethod+" to engineer CAR-T cells using "+select+" treatment to supress "+en+" using the genes "+geneinput+" and "+secondg+" which are associated with the "+antinput+" and "+seconda+" antigens.");
			System.out.println("Your immunology system is now being designed...");
			System.out.println("The first steps in designing the CAR-T cells to be introduced into the patient include recieving T-cells for genetic modification using "+select+" treatment.");
			System.out.println("Leukocytes then undergo leukocyte apheresis, and T-cells proliferate.");
			System.out.println("The CAR, chimeric antigen receptor, gene is then integrated into the genome using "+themethod+" for the "+antinput+" and "+seconda+" antigens.");
			System.out.println(editplan);
			System.out.println("After undergoing lymphodepletion chemotherapy, the CAR-T cells can be injected at the sitge of the tumor.");
		}
		else if(Integer.valueOf(uinput)!=1 && Integer.valueOf(uinput)!=2) {
			System.out.println("invalid input");
			return;
		}
		else {
		database mydata = new database();
		Scanner myObj = new Scanner(System.in);
		String [] aarrayoftumors = {"Acutemyeloidleukemia", "Adrenocorticalcarcinoma", "BladderUrothelialCarcinoma", "BrainLowerGradeGlioma", "BreastInvasiveCarcinoma", "Cervicalsquamouscellcarcinomaandendocervicaladenocarcinoma", "Cholangiocarcinoma", "Colonadenocarcinoma", "Esophagalcarcinoma","GlioblastomaMultiforme",  "HeadandNeckSquamouscellcarcinoma", "KidneyChromophobe","Kidneyrenalclearcellcarcinoma", "Kidneyrenalpapillarycellcarcinoma", "Liverhepatocellularcarcinoma","Lungadenocarcinoma", "Lungsquamouscellcarcinoma","LymphoidNeoplasmDiffuseLangeBcellLymphoma", "Mesothelioma","Ovarianserouscystadenocarcinoma","Pancreaticadenocarcinoma","Pheochromocytomaandparaganglioma","Prostateadenocarcinoma", "Rectumadenocarcinoma", "Sarcoma",  "SkinCutaneousMelanoma","Stomachadenocarcinoma","TesticularGermCellTumors","Thymoma","Thyroidcarcinoma", "UterineCarcinosaroma", "UterineCorpusEndometrialCarcinoma", "UvealMelanoma"          };
	    System.out.println("Enter the number between 1 and 33 corresponding to a cancer from the list: 1 for Acutemyeloidleukemia, 2 for Adrenocorticalcarcinoma, 3 for BladderUrothelialCarcinoma, 4 for BrainLowerGradeGlioma, 5 for BreastInvasiveCarcinoma, 6 for Cervicalsquamouscellcarcinomaandendocervicaladenocarcinoma, 7 for Cholangiocarcinoma, 8 for Colonadenocarcinoma, 9 for Esophagalcarcinoma, 10 for GlioblastomaMultiforme, 11 for HeadandNeckSquamouscellcarcinoma, 12 for KidneyChromophobe, 13 for Kidneyrenalclearcellcarcinoma, 14 for Kidneyrenalpapillarycellcarcinoma, 15 for Liverhepatocellularcarcinoma, 16 for Lungadenocarcinoma, 17 for Lungsquamouscellcarcinoma, 18 for LymphoidNeoplasmDiffuseLangeBcellLymphoma, 19 for Mesothelioma, 20 for Ovarianserouscystadenocarcinoma, 21 for Pancreaticadenocarcinoma, 22 for Pheochromocytomaandparaganglioma, 23 for Prostateadenocarcinoma, 24 for Rectumadenocarcinoma, 25 for Sarcoma, 26 for SkinCutaneousMelanoma, 27 for Stomachadenocarcinoma, 28 for TesticularGermCellTumors, 29 for Thymoma, 30 for Thyroidcarcinoma, 31 for UterineCarcinosaroma, 32 for UterineCorpusEndometrialCarcinoma, 33 for UvealMelanoma" );
	    String userName = myObj.nextLine();  // Read user input
	    if(Integer.valueOf(userName)<0 || Integer.valueOf(userName)>33) {
	    	System.out.println("Invalid Number");
	    	return;
	    }
	    System.out.println("You selected" + " "+ aarrayoftumors[Integer.valueOf(userName)-1]);  // Output user input
	    int theindex = Integer.valueOf(userName)-1;
	    String tumordat = mydata.getlistofalltumors()[theindex];
	    int testfactor=0;
	    int [] thechampion  = {Integer.valueOf(tumordat.substring(0,1)),0,Integer.valueOf(tumordat.substring(1,2)),1};
	    for(int i=2;i<109;i++) {
	    	if(tumordat.substring(i,i+1).equals("%")) {
	    		 testfactor=12;
	    		//BREAK
	 	    	if(testfactor>thechampion[0] && thechampion[0]>thechampion[2]) {
	 	    		thechampion[2]=testfactor;
	 	    		thechampion[3]=i;
	 	    	}
	 	    	else if(testfactor>thechampion[0] && thechampion[0]<=thechampion[2]) {
	 	    		thechampion[0]=testfactor;
	 	    		thechampion[1]=i;
	 	    	}
	    	}
	    	else if(tumordat.substring(i,i+1).equals("^")) {
	    		 testfactor=350;
	    		//BREAK
	 	    	if(testfactor>thechampion[0] && thechampion[0]>thechampion[2]) {
	 	    		thechampion[2]=testfactor;
	 	    		thechampion[3]=i;
	 	    	}
	 	    	else if(testfactor>thechampion[0] && thechampion[0]<=thechampion[2]) {
	 	    		thechampion[0]=testfactor;
	 	    		thechampion[1]=i;
	 	    	}
	    	}
	    	else if(tumordat.substring(i,i+1).equals("$")) {
	    		 testfactor=14;
	    		//BREAK
	 	    	if(testfactor>thechampion[0] && thechampion[0]>thechampion[2]) {
	 	    		thechampion[2]=testfactor;
	 	    		thechampion[3]=i;
	 	    	}
	 	    	else if(testfactor>thechampion[0] && thechampion[0]<=thechampion[2]) {
	 	    		thechampion[0]=testfactor;
	 	    		thechampion[1]=i;
	 	    	}
	    	}
	    	else if(tumordat.substring(i,i+1).equals("_")) {
	    		 testfactor=10;
	    		//BREAK
	 	    	if(testfactor>thechampion[0] && thechampion[0]>thechampion[2]) {
	 	    		thechampion[2]=testfactor;
	 	    		thechampion[3]=i;
	 	    	}
	 	    	else if(testfactor>thechampion[0] && thechampion[0]<=thechampion[2]) {
	 	    		thechampion[0]=testfactor;
	 	    		thechampion[1]=i;
	 	    	}
	    	}
	    	else {
	    		testfactor=Integer.valueOf(tumordat.substring(i,i+1));
	    		//BREAK
		    	if(testfactor>thechampion[0] && thechampion[0]>thechampion[2]) {
		    		thechampion[2]=testfactor;
		    		thechampion[3]=i;
		    	}
		    	else if(testfactor>thechampion[0] && thechampion[0]<=thechampion[2]) {
		    		thechampion[0]=testfactor;
		    		thechampion[1]=i;
		    	}
	    	}
	    	
	    	
	    }
	    System.out.println("The selected tumor contains the following tumor-specific genes and associated antigens: "+"Gene1 is "+mydata.listofgenes[thechampion[1]]+" and Antigen1 is "+mydata.listofantigens[thechampion[1]]+". This gene expression level per kilobase of transcript, per million mapped reads is "+thechampion[0]+". Gene 2 is " +mydata.listofgenes[thechampion[3]]+" and Antigen2 is "+mydata.listofantigens[thechampion[3]]+". This gene's expression level per kilobase of transcript, per million mapped reads is "+thechampion[2]+".");
	    System.out.println("The following steps would be required for CAR-T immunotherapy:");
		Scanner retrivals = new Scanner(System.in);
		Scanner thecorrectmethods = new Scanner(System.in);
	//	System.out.println("Enter the tumor for which CAR-T cells need to be engineered");
		String en = aarrayoftumors[Integer.valueOf(userName)-1];
	//	System.out.println("Enter the first gene name:");
		String geneinput = mydata.listofgenes[thechampion[1]];
	//	System.out.println("Enter the tumor-specific antigen associated with the first gene");
		String antinput = mydata.listofantigens[thechampion[1]];
	//	System.out.println("Enter the second gene name:");
		String secondg = mydata.listofgenes[thechampion[3]];
	//	System.out.println("Enter the tumor-specific antigen associated with the second gene");
		String seconda = mydata.listofantigens[thechampion[3]];
		System.out.println("Enter a number 1-3 corresponding to a gene editing method to engineer the CAR-T cells from the list: 1 for CRISPR/Cas9 systems, 2 for Transcription activator-like effector nucleases, or 3 for Zinc finger nucleases.");
		String theirwish = thecorrectmethods.nextLine();
		System.out.println("Enter a number 1 or 2 corresponding to the T-cell retrival method: 1 for autologous from the patients blood or 2 for allogenic from a healthy donor.");
		String blmet = retrivals.nextLine();
		int y = Integer.valueOf(blmet);
		String select="";
		if(y==1) {
			select="autologous";
		}
		if(y==2) {
			select="allogenic";
		}
		if(y<1 || y>2) {
			System.out.println("Invalid input");
			return;
		}
		String themethod ="";
		String editplan="";
		int x = Integer.valueOf(theirwish);
		if(x!=1 && x!=2 && x!=3) {
			System.out.println("Invalid input");
			return;
		}
		else if(x==1) {
			themethod="CRISPR/Cas 9 base editing";
			editplan="The use of CRISPR and Cas9 base editing to engineer CAR-T cells is efficient to multiplex the processing of T-cells. \r\n The anchor site is 23nt, the off-target chances are relatively high, but the efficiency is also extremely high.";
		}
		else if(x==2) {
			themethod="Transcription activator-like effector nucleases";
			editplan="Transcription activator-like effector nucleases, or TALENs, are restriction enzymes that fuse TAL effectors to cleavage domain within the DNA."+"\r\n The anchor site is 30-36 nt, the off-target chances are low, and complications are relatively likely.";
		}
		else if(x==3){
			themethod="Zinc finger nucleases";
			editplan="The ZFN, zinc finger nucleases, is an endonuclease that cleaves a certain genomic sequence, which then induces repair processes. \r\n The anchor site is 18-36nt, the off target chances are low, but the complications are high.";
		}
		System.out.println("You chose to use "+themethod+" to engineer CAR-T cells using "+select+" treatment to supress "+en+" using the genes "+geneinput+" and "+secondg+" which are associated with the "+antinput+" and "+seconda+" antigens.");
		System.out.println("Your immunology system is now being designed...");
		System.out.println("The first steps in designing the CAR-T cells to be introduced into the patient include recieving T-cells for genetic modification using "+select+" treatment.");
		System.out.println("Leukocytes then undergo leukocyte apheresis, and T-cells proliferate.");
		System.out.println("The CAR, chimeric antigen receptor, gene is then integrated into the genome using "+themethod+" for the "+antinput+" and "+seconda+" antigens.");
		System.out.println(editplan);
		System.out.println("After undergoing lymphodepletion chemotherapy, the CAR-T cells can be injected at the sitge of the tumor.");
	}
		}
	}


