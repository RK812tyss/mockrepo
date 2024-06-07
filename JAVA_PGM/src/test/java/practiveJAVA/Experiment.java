package practiveJAVA;

public class Experiment
{	 
	    public static void main(String[] args) {
	        String str = "1a@2b#3c%";

	        // Separate the types
	        StringBuilder integers = new StringBuilder();
	        StringBuilder characters = new StringBuilder();
	        StringBuilder specials = new StringBuilder();

	        for (char ch : str.toCharArray()) {
	            if (Character.isDigit(ch)) {
	                integers.append(ch);
	            } else if (Character.isLetter(ch)) {
	                characters.append(ch);
	            } else {
	                specials.append(ch);
	            }
	        }

	        // Print the results
	        System.out.println("Integers: " + integers);
	        System.out.println("Characters: " + characters);
	        System.out.println("Specials: " + specials);
	    }
	}




