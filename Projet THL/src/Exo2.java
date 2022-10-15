import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class Exo2 {
	
	static ArrayList<String> Words = new ArrayList<String>();
	static Boolean notEmpty (ArrayList<String> a) {
		if (Words.isEmpty()) return false;
		else return true;
	}
	 static int i=0;
	 Exo2(int n){
			
		/* int stop;
		do {*/
			Words.clear();
		/*Scanner scanner=new Scanner (System.in);
		System.out.println("Entrez la valeur de n (Un Entier Positif)");
		int n = scanner.nextInt() ;*/
		int B;
		String word="";
		 if (n<=2) {	
		}
		else {
				for(int A=n-1; A>=2; A--) {
						B=n-A;//Le if Parceque il yaura des repetitions selon mon appel de fonctions
						if(A>2) { 	OP1(word,A,B,n);
									OP2(word,A,B,n);}
						else 		OP1(word,A,B,n);
			
			}
		} 
		 /*for (int j=0;j<Words.size() ;j++) {
			System.out.println(Words.get(j)+"\t");
		} 	
		System.out.println("Il Ya "+Words.size()+" mots");
		System.out.println("\n Si Vous Voulez vous Arreter tapper 0");
		scanner=new Scanner (System.in);
		stop=scanner.nextInt(); }while (stop !=0);
		System.out.println("Merci et Au revoir!");*/
	 }
	
	public static void main(String[] args) {
	 }
	
	public static void OP1(String word,int A,int B,int n) {
		if(A>2) {
			word= "a"+word;
			A-=1; 
			if (A>2) {	OP2(word,A,B,n); 
						OP1(word,A,B,n);}
		}
		if (A==2) {
				word=word.concat("ab");	
				A-=2;OP3(word,B,n);
		}
	}
	public static void OP2(String word,int A,int B,int n) {
		
		if(A>2) {
				word="b"+word;A-=1;
				if (A>2) {
							OP2(word,A,B,n);
							OP1(word,A,B,n);}
			}
		if (A==2) {
					word=word.concat("ab");	
					A-=2; OP3(word,B,n);
		}
	}
	/////////// OP1+OP2=A 
	public static void OP3(String word,int B,int n) {
		word=word.concat("b") ;B-=1; 
		if (B==0) {
			if(Words.isEmpty()) {Words.add(word);i++;}
			else {
				for(int j=0;j<Words.size();j++) {
					if (notEmpty(Words) && Words.get(j).equals(word)) 
						{break;}
					if (j==(Words.size()-1)) {
						Words.add(word);
						i++; 
				}
			}
			}
			}
		else if(B>0) {
			
					OP4( word, B);
					OP5( word, B);
			}
		
		
	}
	public static void OP4(String word,int B) {
		word=word.concat("a") ;B-=1;
		if(B>0) {
					OP4( word, B);
					OP5( word, B);
			}
		else {
			if(Words.isEmpty()) {Words.add(word);i++;}
			else {
				for(int j=0;j<Words.size();j++) {
				if (notEmpty(Words) && Words.get(j).equals(word)) 
					{break;}
				 if (j==(Words.size()-1)) {
					Words.add(word);
					i++; 
				}
			}
			}
		}//System.out.println(word+"\t");
	}
	public static void OP5(String word,int B) {
		word=word.concat("b") ;B-=1;
		if(B>0) {
					OP4( word, B);
					OP5( word, B);
			}
		else {
			if(Words.isEmpty()) {Words.add(word);i++;}
			else {
			for(int j=0;j<Words.size();j++) {
				if (notEmpty(Words) && Words.get(j).equals(word)) 
					{break;}
				 if (j==(Words.size()-1)) {
					Words.add(word);
					i++; 
				}
			}
			}
			}
	}	
	/////////// OP3+OP4+OP5=B
	String getWords(int n){
		 if (n<0){
				return("Veuillez introduire un n Entier Positif!");
		}
		 else if(n<3)  {
			 return ("Il N'existe pas de mot de  longeur "+n)	;}
		 return Words.toString();	
	}
	 public int getsize() {
		 return Words.size();
	 }
}
