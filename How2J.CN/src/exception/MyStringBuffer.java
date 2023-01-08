package exception;

import com.sun.jdi.InconsistentDebugInfoException;

public class MyStringBuffer {
    int capacity = 16;
    int length = 0;
    char [] value;
    public MyStringBuffer(){
        value = new char[capacity];
    }
    // 有参构造方法
    public MyStringBuffer(String str){
        this();
        if (null == str){
            return;
        }
        if (capacity<str.length()){
            capacity = value.length * 2;
            value = new char[capacity];
        }
        if (capacity>=str.length()){
            System.arraycopy(str.toCharArray(),0,value,0, str.length() );
        }
        length = str.length();

    }
    public void append(String str) throws IndexIsNagetiveException, IndexIsOutofRangeException{
        insert(length,str);
    }

    public void append(char c) throws IndexIsNagetiveException, IndexIsOutofRangeException{
        append(String.valueOf(c));
    }

    public void insert(int pos, char b) throws IndexIsNagetiveException, IndexIsOutofRangeException{
        insert(pos, String.valueOf(b));
    }
/*
    public void delete(int i, int start) throws IndexIsOutofRangeException, IndexIsNagetiveException{
        delete(start, length);
    }

 */
    public void delete(int start, int end) throws IndexIsNagetiveException, IndexIsOutofRangeException{
        if (start<0){
            throw new IndexIsNagetiveException();
        }
        if (end<0){
            throw new IndexIsNagetiveException();
        }
        if(start>length){
            throw new IndexIsOutofRangeException();
        }
        if (end>length){
            throw new IndexIsOutofRangeException();
        }
        if (start >= end){
            throw new IndexIsOutofRangeException();
        }
        System.arraycopy(value, end, value, start, length-end);
    }

    public void reverse(){
        for (int i=0;i<length/2;i++){
            char temp = value[i];
            value[i] = value[length-i-1];
            value[length-i-1] = temp;
        }
    }

    public int length(){
        return length;
    }

    public void insert(int pos, String b) throws IndexIsNagetiveException, IndexIsOutofRangeException, NullPointerException{
        if(pos<0){
            throw  new IndexIsNagetiveException();
        }
        int length = b.length();
        if (pos>length){
            throw new IndexIsOutofRangeException();
        }
        if (null == b){
            throw new NullPointerException();
        }
        // 扩容
        if(length+b.length()>capacity){
            capacity = (int) ((length + b.length()) *2.5f);
            char [] newValue = new char[capacity];
            System.arraycopy(value, 0, newValue, 0, length);
            value = newValue;
        }
        char [] cs = b.toCharArray();

    }
}
