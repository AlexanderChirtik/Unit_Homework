package fourthHomework;

import org.fourthHomework.Book;
import org.fourthHomework.BookRepository;
import org.fourthHomework.BookService;
import org.fourthHomework.InMemoryBookRepository;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class BookServiceTest {

    @Test
    void findBookById() {

        BookRepository mockBockRepository = mock(InMemoryBookRepository.class);
        BookService bookService = new BookService(mockBockRepository);
        when(mockBockRepository.findById("1")).thenReturn(new Book("1", "Title", "Author"));

        String expectIdBook = "1";
        String actualIdBook = bookService.findBookById("1").getId();

        verify(mockBockRepository, times(1)).findById("1");
        assertEquals(expectIdBook, actualIdBook);
    }


    @Test
    public void findAllBooks() {

        BookRepository mockBockRepository = mock(InMemoryBookRepository.class);
        BookService bookService = new BookService(mockBockRepository);

        when(mockBockRepository.findAll())
                .thenReturn(new ArrayList<>(Arrays.asList(
                        new Book("1"),
                        new Book("2"),
                        new Book("3"),
                        new Book("4")
                )));

        int expectedSizeListBooks = 4;
        int actualSizeListBooks = bookService.findAllBooks().size();

        verify(mockBockRepository, times(1)).findAll();
        assertEquals(expectedSizeListBooks, actualSizeListBooks);
    }

    @Test
    void testGetID() {
        Book mockBook = mock(Book.class);
        when(mockBook.getId()).thenReturn("1", "2", "3");

        String result = mockBook.getId() + mockBook.getId() + mockBook.getId();

        verify(mockBook, times(3)).getId();
        assertThat(result).isEqualTo("123");
    }

    @Test
    void testGetTitle() {
        Book mockBook = mock(Book.class);
        when(mockBook.getTitle()).thenReturn("War and Peace");

        String result = mockBook.getTitle();

        verify(mockBook, times(1)).getTitle();
        assertThat(result).isEqualTo("War and Peace");
    }

    @Test
    void testGetAuthor() {
        Book mockBook = mock(Book.class);
        when(mockBook.getAuthor()).thenReturn("Mikhail Lermontov");

        String result = mockBook.getAuthor();

        verify(mockBook, times(1)).getAuthor();
        assertThat(result).isEqualTo("Mikhail Lermontov");
    }
}
