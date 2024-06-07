package javaOOPs;


	 class Book {
	    private String title;
	    private String author;
	    private int publicationYear;

	    public Book(String title, String author, int publicationYear) {
	        this.title = title;
	        this.author = author;
	        this.publicationYear = publicationYear;
	    }

	    @Override
	    public String toString() {
	        return "Book[title=" + title + ", author=" + author + ", publicationYear=" + publicationYear + "]";
	    }
	}

	public class  ToString2 {
	    public static void main(String[] args) {
	        Book book = new Book("1984", "George Orwell", 1949);
	        System.out.println(book.toString());
	        System.out.println(book);
	    }
	}


