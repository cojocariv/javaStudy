package Multithreading;

public class WordWrapper implements Comparable<WordWrapper> {
    private final String word;
    private final Integer count;

    public String getWord() {
        return word;
    }

    public Integer getCount() {
        return count;
    }

    public WordWrapper(String word, Integer count) {
        this.word = word;
        this.count = count;
    }

    @Override
    public int compareTo(WordWrapper word) {
        if (count < word.getCount()) {
            return 1;
        }
        if (count > word.getCount()) {
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return word + "->" + count;
    }
}
