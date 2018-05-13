package zomaru.zerotwo.wallpaperpicker.Parcel;

import android.os.Parcel;

/**
 * Created by root on 5/11/18.
 */

public class Parcelable implements android.os.Parcelable {
    private String link;

    public Parcelable(String link) {
        this.link = link;
    }

    protected Parcelable(Parcel parcel) {
        link = parcel.readString();
    }

    public static final Creator<Parcelable> CREATOR = new Creator<Parcelable>() {
        @Override
        public Parcelable createFromParcel(Parcel parcel) {
            return new Parcelable(parcel);
        }

        @Override
        public Parcelable[] newArray(int i) {
            return new Parcelable[i];
        }
    };

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public static Parcelable[] getLinks() {
        return new Parcelable[]{
                new Parcelable("https://i.pinimg.com/originals/13/b7/36/13b7360f8a723e972b795504e07e427b.jpg"),
                new Parcelable("https://i.pinimg.com/originals/13/b7/36/13b7360f8a723e972b795504e07e427b.jpg"),
                new Parcelable("https://i.pinimg.com/originals/13/b7/36/13b7360f8a723e972b795504e07e427b.jpg"),
        };
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(link);
    }
}
