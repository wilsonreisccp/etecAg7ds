import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		int caos = 0;
		int am = 0, av = 0, an = 0, bm = 0, bv = 0, bn = 0, cm = 0, cv = 0, cn = 0; 

		do {
			caos ++;
			String elev, turn;

			elev = JOptionPane.showInputDialog("Qual elevador você utiliza? "
					+ "\n"
					+ "A, B ou C?");

			while (!elev.equals("A") && !elev.equals("B") && !elev.equals("C")) {
				elev = JOptionPane.showInputDialog("Esse elevador não existe, "
						+ "\n"
						+ "por favor coloque de novo"
						+ "\n\n"
						+ "Qual elevador você utiliza? "
						+ "\n"
						+ "A, B ou C?");
			}

			turn = JOptionPane.showInputDialog("Agora insira seu turno "
					+ "\n"
					+ "M, V ou N");

			while (!turn.equals("M") && !turn.equals("V") && !turn.equals("N")) {
				turn = JOptionPane.showInputDialog("Esse turno não existe, "
						+ "\n"
						+ "por favor coloque de novo"
						+ "\n\n"
						+ "Qual é o seu turno? "
						+ "\n"
						+ "M, V ou N?");
			}
			
			if(elev.equals("A") && turn.equals("M")) {am++;}
			else
			  if(elev.equals("A") && turn.equals("V")) {av++;}
			  else
			    if(elev.equals("A") && turn.equals("N")) {an++;}
			    else
			      if(elev.equals("B") && turn.equals("M")) {bm++;}
			      else
        			if(elev.equals("B") && turn.equals("V")) {bv++;}
        			else
    			      if(elev.equals("B") && turn.equals("N")) {bn++;}
    			      else			
			            if(elev.equals("C") && turn.equals("M")) {cm++;}
			            else
	     	 	          if(elev.equals("C") && turn.equals("V")) {cv++;}
	     	 	          else
	     	 	        	cn++;
	     	 	        	  //if(elev.equals("C") && turn.equals("N")) {cn++;}
		} while (caos < 50);
		
		int total_a = am + av + an;
		int total_b = bm + bv + bn;
		int total_c = cm + cv + cn;
		
		String aux = "";
		
		if(total_a > total_b && total_a > total_c) {
			aux = "Elevador mais utilizado é o A";
			
			if(am > av && am > an) {
				aux = aux + " e o turno mais usado nesse elevador é matutino.";
			}else {
				if(av > an)
					aux = aux + " e o turno mais usado nesse elevador é vespertino.";
				else
					aux = aux + " e o turno mais usado nesse elevador é noturno.";
			}
		}else
			if( total_b > total_c ) {
				aux = "Elevador mais utilizado é o B";
				
				if(bm > bv && bm > bn) {
					aux = aux + " e o turno mais usado nesse elevador é matutino.";
				}else {
					if(bv > bn)
						aux = aux + " e o turno mais usado nesse elevador é vespertino.";
					else
						aux = aux + " e o turno mais usado nesse elevador é noturno.";
				}
			}else {
				aux = "Elevador mais utilizado é o C";
				
				if(cm > bv && cm > cn) {
					aux = aux + " e o turno mais usado nesse elevador é matutino.";
				}else {
					if(cv > cn)
						aux = aux + " e o turno mais usado nesse elevador é vespertino.";
					else
						aux = aux + " e o turno mais usado nesse elevador é noturno.";
				}
			}
		
		int total_M = am + bm + cm;
		int total_V = av + bv + cv;
		int total_N = an + bn + cn;
		aux += "\n\n"; 
		
		if(total_M > total_V && total_M > total_N) {
			aux = aux + "Turno mais frequentado é o matutino";
			
			if(am > bm && am > cm) {
				aux = aux + " e o elevador mais usado nesse período é o A.";
			}else {
				if(bm > cm)
					aux = aux + " e o elevador mais usado nesse período é o B.";
				else
					aux = aux + " e o elevador mais usado nesse período é o C.";
			}
		}else
			if( total_V > total_N ) {
				aux += "Turno mais frequentado é o vespertino";
				
				if(av > bv && av > cv) {
					aux = aux + " e o elevador mais usado nesse período é o A.";
				}else {
					if(bv > cv)
						aux = aux + " elevador mais usado nesse peíodo é o B.";
					else
						aux = aux + " elevador mais usado nesse período é o C.";
				}
			}else {
				aux += "Turno mais frequentado é o noturno";
				
				if(an > bn && an > cn) {
					aux = aux + " e o elevador mais usado nesse período é o A.";
				}else {
					if(bn > cn)
						aux = aux + " e o elevador mais usado nesse período é o B.";
					else
						aux = aux + " e o elevador mais usado nesse período é o C.";
				}
			}
		    JOptionPane.showMessageDialog(null, aux);
	}
}
