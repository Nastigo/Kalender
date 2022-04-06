

import Prog1Tools.IOTools;

public class Kalender {

	public static void main(String[] args) {
		int tag, monat, jahr;
		int jahr1, jahr2;
		int h1,h2,h3,b,f;
		
		
		tag=IOTools.readInteger("Tag: ");
		monat=IOTools.readInteger("Monat: ");
		jahr=IOTools.readInteger("Jahr: ");
		
		if(monat<3) {

			monat=monat+10;
			jahr=jahr-1;
		}
		else {
			monat=monat-2;
		
		jahr1=jahr/100;
		jahr2= jahr%100;
		h1=((monat*13)-1)/5;
		h2=jahr2/4;
		h3=jahr1/4;
		b=h1+h2+h3;
		f=((b+jahr2+tag)-(jahr1*2))%7;
		
		//Einseitige Abfragen
		
		if(f==0) {
			System.out.println("Wochentag ist Sonntag");
		}
		if(f==1) {
			System.out.println("Wochentag ist Montag");
		}
		if(f==2) {
			System.out.println("Wochentag ist Dienstag");
		}
		if(f==3) {
			System.out.println("Wochentag ist Mittwoch");
		}
		if(f==4) {
			System.out.println("Wochentag ist Donnerstag");
		}
		if(f==5) {
			System.out.println("Wochentag ist Freitag");
		}
		if(f==6) {
			System.out.println("Wochentag ist Samstag");
		}
	

	}
			
}
}
