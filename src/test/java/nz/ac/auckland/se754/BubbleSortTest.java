package nz.ac.auckland.se754;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class BubbleSortTest {
    private BubbleSort sort;

    @BeforeEach
    public void init(){
        sort = new BubbleSort();
    }

    @AfterEach
    public void tearDown(){
        sort.getNumbers().clear();
    }


    @Test
    public void test_add_one_number_the_number_should_be_added(){
        boolean result = sort.addNumber(10);
        assertTrue(result);
        assertTrue(sort.getNumbers().size() > 0);
        assertTrue(!sort.getNumbers().isEmpty());
        List<Integer> list = Arrays.asList(10);
        assertEquals(list, sort.getNumbers());
    }

    @Test
    public void test_add_same_numbers_twice_should_be_added_only_once(){
        sort.addNumber(30);
        boolean result =sort.addNumber(30);
        assertFalse(result);
        List<Integer> list2 = Arrays.asList(30);
        assertEquals(list2, sort.getNumbers());
    }

    @Test
    public void test_add_two_numbers_should_be_added_both(){
        sort.addNumber(30);
        sort.addNumber(20);
        List<Integer> list2 = Arrays.asList(30,20);
        assertEquals(list2, sort.getNumbers());
    }

    @Test
    public void test_already_sorted_list(){
        sort.addNumber(1);
        sort.addNumber(2);
        sort.sort();
        List<Integer> list2 = Arrays.asList(1,2);
        assertEquals(list2, sort.getNumbers());
    }

    @Test
    public void test_unsorted_list(){
        sort.addNumber(3);
        sort.addNumber(-2);
        sort.addNumber(10);
        sort.sort();
        List<Integer> list2 = Arrays.asList(-2,3,10);
        assertEquals(list2, sort.getNumbers());
    }

    @Test
    public void test_revere_list(){
        sort.addNumber(100);
        sort.addNumber(5);
        sort.addNumber(1);
        sort.sort();
        List<Integer> list2 = Arrays.asList(1,5,100);
        assertEquals(list2, sort.getNumbers());
    }



}