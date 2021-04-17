package nz.ac.auckland.se754;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort {

    private List<Integer> numbers;

    public BubbleSort(){
        numbers = new ArrayList<>();
    }

    public List<Integer> getNumbers(){
        return numbers;
    }


    /**
     *
     * numbers list must contain only unique numbers
     * @param number
     * @return
     */
    public boolean addNumber(Integer number){
        if(!numbers.contains(number)){
            numbers.add(number);
            return true;
        }
        return false;
    }

    /**
     * BUGGY sort
     */
    public void sort() {
        int temp;
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < numbers.size() - 1; i++) {
                if (numbers.get(i).compareTo(numbers.get(i + 1)) > 0) {
                    temp = numbers.get(i);
                    numbers.set(i, numbers.get(i + 1));
                    numbers.set(i + 1, temp);
                    sorted = false;
                }
            }
        }
    }

}
