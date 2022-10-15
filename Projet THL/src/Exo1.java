/*import java.util.Scanner;

public class Exo1 {
	Exo1(){
		 int stop;
	 		do {
	        System.out.println("entrez votre mot");
	        String s;int choix=0;      
			Scanner Sc=new Scanner(System.in);
	        s= Sc.nextLine();
	        Sc=new Scanner(System.in);
	        System.out.println("Voulez-vous\n1-Trouver L'inverse du mot\n2-La neme puissance du mot");
	        choix=Sc.nextInt();
	        
	        switch (choix) {
	        case 1:
		        String inverse=inverseur(s);
		        System.out.println(inverse);
	        	break;
	        case 2:
	        	System.out.println("Donnez n");
		        int n=Sc.nextInt();
		        String puissance=puissance(s,n);
		        System.out.println("la puissance "+n+" du mot est: "+puissance);
	        	break;
	        default :
	        	System.out.println("Veuillez introduire une valeur Valide ");
	        }
	        System.out.println("\n Si Vous Voulez vous Arreter tapper 0");
			Scanner scanner=new Scanner (System.in);
			stop=scanner.nextInt(); }while (stop !=0);
	 		System.out.println("Merci et Au revoir!");
		
	}

	public static String inverseur(String s) {
		char[]T=s.toCharArray();
		String inverse="";
		for (int i=s.length()-1;i>=0;i--) {
			inverse=inverse+T[i];
		}
		return inverse;
	}

	public static String puissance(String s,int n) {
		String power="";
		for (int i=0;i<n;i++) {
			power=power+s;
		}
		
		return power;
	}
}*/
public class Exo1 {
	private String word ;
	Exo1(String s){
		 this.word=s;
		 if(!verifie()) { System.exit(0);}
		 miroire();
		 puissance(10);
	}
	
	 public boolean verifie() {
		for (int i=0;i<word.length();i++){
			if (word.charAt(i)!='a' && word.charAt(i)!='b' && word.charAt(i)!='c')
				return false;
		}
		return true;
	}

	public void miroire() {
		String mirroir ="";
		
			for(int i=word.length()-1;0<=i;i--) {
				mirroir+=word.charAt(i);
			}
		System.out.println("le mot mirroir du mot "+"'"+word+"'"+"est: "+mirroir);
		
	}
	
	
	public void puissance(int n) {
		
			String temp = word;
			for(int i=1; i<n ;i++) {
				word = word.concat(temp);
			}
			System.out.println(word);
		}
	
}
