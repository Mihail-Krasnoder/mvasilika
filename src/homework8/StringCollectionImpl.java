package homework8;

import java.util.Arrays;

public class StringCollectionImpl implements StringCollection{
    private String[] arr = new String[0];
    @Override
    public String get(int index) {
        return null;
    }

    @Override
    public boolean add(String str) {
        String[] newArr = new String[arr.length + 1];
        for (int x = 0; x < arr.length; x++) {
            newArr[x] = arr[x];
        }
        newArr[newArr.length - 1] = str;
        this.arr = newArr;
        return true;
    }

    @Override
    public boolean add(int index, String str) {
        return false;
    }

    @Override
    public boolean delete(String str) {
        return false;
    }

    @Override
    public boolean contains(String str) {
        return false;
    }

    @Override
    public boolean clear() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StringCollectionImpl that = (StringCollectionImpl) o;
        return Arrays.equals(arr, that.arr);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(arr);
    }
}
