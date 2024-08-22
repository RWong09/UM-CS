import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Library {
    private static int i;
    Map<String, Integer> bookNameList = new HashMap<>();
    Map<String, Integer> authorList = new HashMap<>();
    Map<Integer, String> ISBNList = new HashMap<>();
    Map<Integer, String> bookNameSearch = new HashMap<>();
    Map<Integer, String> authorSearch = new HashMap<>();
    Map<String, Integer> ISBNAddNRemove = new HashMap<>();
    private static List<Integer> IntegerValue = new ArrayList<>();
    private static List<Integer> borrowedBooks = new ArrayList<>();
    

    protected void addBook(Book book) {
        bookNameList.put(book.getBookName(), i);
        authorList.put(book.getAuthor(), i);
        ISBNList.put(i, book.getISBN());
        bookNameSearch.put(i, book.getBookName());
        authorSearch.put(i, book.getAuthor());
        ISBNAddNRemove.put(book.getISBN(), i);
        i++;

    }

    protected void findBooksByAuthor(String input) {
        int authorKey = authorList.get(input);
        System.out.printf("Books with author '%s':\n", input);
        System.out.println("\tTitle : " + bookNameSearch.get(authorKey));
        System.out.println("\tAuthor : " + input);
        System.out.println("\tISBN : " + ISBNList.get(authorKey));

    }

    protected void findBooksByTitle(String input) {
        int titleKey = bookNameList.get(input);
        System.out.printf("Books with title '%s':\n", input);
        System.out.println("\tTitle : " + input);
        System.out.println("\tAuthor : " + authorSearch.get(titleKey));
        System.out.println("\tISBN : " + ISBNList.get(titleKey));

    }

    public boolean borrowBook(String input) {
        int intInput = 0;
        try {
            intInput = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Number Format Exception: " + e.getMessage());
            return false;
        }
        if (isValidISBN(intInput)) {
            borrowedBooks.add(ISBNAddNRemove.get(input));
            return true;
        } else {
            return false;
        }
    }

    protected void sortBooks() {
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(bookNameList.entrySet());
        Collections.sort(entryList, Comparator.comparing(Map.Entry::getKey));

        LinkedHashMap<String, Integer> sortedBookNameList = new LinkedHashMap<>();

        for (Map.Entry<String, Integer> entry : entryList) {
            sortedBookNameList.put(entry.getKey(), entry.getValue());
        }

        for (Map.Entry<String, Integer> entry : entryList) {
            IntegerValue.add(entry.getValue());
        }

        System.out.println("Books in the library sorted by title : ");
        for (int i = 0; i < IntegerValue.size(); i++) {
            System.out.println("Title : " + bookNameSearch.get(IntegerValue.get(i)));
            System.out.println("Title : " + authorSearch.get(IntegerValue.get(i)));
            System.out.println("Title : " + ISBNList.get(IntegerValue.get(i)));
            System.out.println();
        }
    }

    protected void removeBook(String input) {
        int IntegerToBeRemoved = ISBNAddNRemove.get(input);
        String bookNameRemoval = bookNameSearch.get(IntegerToBeRemoved);
        String authorRemoval = authorSearch.get( IntegerToBeRemoved);

        if (IntegerValue.contains(IntegerToBeRemoved)) {
            bookNameSearch.remove(IntegerToBeRemoved);
            authorSearch.remove(IntegerToBeRemoved);
            ISBNList.remove(IntegerToBeRemoved);
            bookNameList.remove(bookNameRemoval);
            authorList.remove(authorRemoval);
            IntegerValue.remove(IntegerValue.indexOf(IntegerToBeRemoved));
        } else {
            System.out.println("Book not found in the library.");
        }
    }

    protected void displayLibrary() {
        System.out.println("Books in the library sorted by title : ");
        for (Map.Entry<String, Integer> entry : bookNameList.entrySet()) {
            int i = entry.getValue();
            if (!borrowedBooks.contains(i)) {
                System.out.println("Title : " + bookNameSearch.get(i));
                System.out.println("Author : " + authorSearch.get(i));
                System.out.println("ISBN : " + ISBNList.get(i));
                System.out.println();
            }
        }
    }
    private boolean isValidISBN(int intInput) {
        int lastOne = intInput % 10;
        intInput /= 10;
        int lastSecond = intInput % 10;
        int[] array = {2, 3, 5, 7};
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if ((lastOne == array[i]) && (lastSecond == array[j])) {
                    return false;
                }
            }
        }
        return true;
    }
}
