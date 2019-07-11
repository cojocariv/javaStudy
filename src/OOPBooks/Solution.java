package OOPBooks;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<Book> books = new LinkedList<Book>();
        books.add(new MarkTwainBook("Tom Sawyer"));
        books.add(new AgathaChristieBook("Hercule Poirot"));
        System.out.println(books);
    }

    abstract static class Book {
        private String author;

        public Book(String author) {
            this.author = author;
        }

        public abstract Book getBook();

        public abstract String getTitle();

        private String getOutputByBookType() {
            String agathaChristieOutput = author + ": " + getBook().getTitle() + " is a detective";
            String markTwainOutput = getBook().getTitle() + " was written by " + author;

            //Add your code here
            if (this instanceof AgathaChristieBook) {
                return agathaChristieOutput;
            } else if (this instanceof MarkTwainBook) {
                return markTwainOutput;
            } else {
                return "output";
            }
        }

        public String toString() {
            return getOutputByBookType();
        }
    }

    public static class MarkTwainBook extends Book {
        private String title = "MarkTwainBook";

        public MarkTwainBook(String title) {
            super("Mark Twain");
            this.title = title;
        }

        @Override
        public Book getBook() {
            return this;
        }

        @Override
        public String getTitle() {
            return this.title;
        }
    }

    public static class AgathaChristieBook extends Book {
        private String title = "AgathaChristieBook";

        public AgathaChristieBook(String title) {
            super("AgathaChristie");
            this.title = title;
        }

        @Override
        public Book getBook() {
            return this;
        }

        @Override
        public String getTitle() {
            return this.title;
        }
    }
}

