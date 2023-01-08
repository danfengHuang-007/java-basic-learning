package exception;
import exception.IndexIsNagetiveException;
import exception.IndexIsOutofRangeException;
public interface IsStringBuffer {
    public void append(String str) throws IndexIsOutofRangeException, IndexIsNagetiveException;

    public void ppend(char c) throws IndexIsNagetiveException, IndexIsOutofRangeException;

    public void insert(int pos, char b) throws IndexIsOutofRangeException, IndexIsOutofRangeException;

    public void insert(int pos, String b) throws IndexIsOutofRangeException, IndexIsNagetiveException;

    public void delete(int start) throws IndexIsOutofRangeException, IndexIsOutofRangeException;

    public void delete(int start, int end) throws IndexIsOutofRangeException, IndexIsNagetiveException;

    public void reverse();

    public int length (); //返回长度
}

