public class Exo3 {
		
     boolean analyseur(String s){
        boolean epsilon;
        boolean trueb= true ;
         int omega=s.length() ;
         int beta =0;
         StringBuffer tmp =new StringBuffer();
         tmp.append(s);
             omega=tmp.length();
             while(tmp.length()>=2  && omega>=3 && trueb){
                if((Character.compare(tmp.charAt(omega-1),'b')!=0) && (Character.compare(tmp.charAt(0),'a')!=0) && (Character.compare(tmp.charAt(1),'a')!=0)){ trueb =false;}
                if((Character.compare(tmp.charAt(omega-1),'b')==0) && (Character.compare(tmp.charAt(0),'a')==0) && (Character.compare(tmp.charAt(1),'a')==0) && tmp.length()>2 ){
                    tmp.deleteCharAt(omega-1);
                    tmp.deleteCharAt(0);
                    tmp.deleteCharAt(0);
                    omega=omega-3;
                   
                }else omega--;
               }
               epsilon=trueb;
            while(beta < tmp.length() && epsilon){
               epsilon=(Character.compare(tmp.charAt(beta),'a')==0);
               beta++;
            }
            
        return epsilon; 
    
}
}
