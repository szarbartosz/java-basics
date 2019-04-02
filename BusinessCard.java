import java.util.Scanner;

public class BusinessCard {
	public static void main(String[] args) {
		String name;
		String surname;
		String adress;
		String phone;
		int starsCount;
		int i;
		String stars = "";
		
		Scanner scanner = new Scanner(System.in);		
		
		System.out.print("Podaj imie: ");
		name = scanner.nextLine();
		System.out.println();
		System.out.print("Podaj nazwisko: ");
		surname = scanner.nextLine();
		System.out.println();
		System.out.print("Podaj nr. telefonu: ");
		phone = scanner.nextLine();
		System.out.println();
		System.out.print("Podaj adres: ");
		adress = scanner.nextLine();
		System.out.println();
		scanner.close();
		
		String firstLine = "* " + name + " " + surname + " ";
		String secondLine = "* tel. " + phone + " adres: " + adress + " ";
		
		int firstLineLength = firstLine.length();
		int secondLineLength = secondLine.length();
		
		//1st way
		
		if(firstLineLength <= secondLineLength) {
			i = secondLineLength;
		}
		else {
			i = firstLineLength;
		}
		
		//2nd way: Ternary operator
		
		starsCount = firstLineLength <= secondLineLength 
				? secondLineLength : firstLineLength;
		
		for(i=starsCount; i>=0; i--) {
			stars = stars + "*";
		}
		
		//3rd way: Max
		
		starsCount = Math.max(firstLineLength, secondLineLength);
		
		String firstLineStar = "";
		for(i = 0; i < starsCount-firstLineLength; i++) {
			firstLineStar += " ";
		}
		firstLineStar += "*";
		
		String secondLineStar = "";
		for(i = 0; i < starsCount-secondLineLength; i++) {
			secondLineStar += " ";
		}
		secondLineStar += "*";
		
		System.out.println(stars);
		System.out.print(firstLine+firstLineStar);
		System.out.println();
		System.out.print(secondLine+secondLineStar);
		System.out.println();
		System.out.println(stars);
	
	}
}
