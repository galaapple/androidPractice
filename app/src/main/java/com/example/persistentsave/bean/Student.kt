package com.example.persistentsave.bean

import android.os.Parcel
import android.os.Parcelable
import java.lang.StringBuilder

/**
 * @author 李阳(liyang073)
 * @date 2020/11/27 10:52
 * @desc
 */
data class Student(
    var name: String? = null,
    var age: String? = null
): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeString(age)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Student> {
        override fun createFromParcel(parcel: Parcel): Student {
            return Student(parcel)
        }

        override fun newArray(size: Int): Array<Student?> {
            return arrayOfNulls(size)
        }
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append("name:")
        sb.append(name)
        sb.append(" ")
        sb.append("age")
        sb.append(age)
        return sb.toString()
    }

}