package com.example.aidl.myapplication;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * @author 李阳(liyang073)
 * @date 2020/11/28 20:32
 * @desc
 */
public class Book implements Parcelable {
    public String bookName;
    public int bookId;

    protected Book(Parcel in) {
        bookName = in.readString();
        bookId = in.readInt();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(bookName);
        dest.writeInt(bookId);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Book> CREATOR = new Creator<Book>() {
        @Override
        public Book createFromParcel(Parcel in) {
            return new Book(in);
        }

        @Override
        public Book[] newArray(int size) {
            return new Book[size];
        }
    };
}
