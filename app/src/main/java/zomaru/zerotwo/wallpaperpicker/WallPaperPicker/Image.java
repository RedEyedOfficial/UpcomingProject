package zomaru.zerotwo.wallpaperpicker.WallPaperPicker;

import android.os.Parcel;
import android.os.Parcelable;

public class Image implements Parcelable{
    private String name;
    private String link;

    public Image (String name, String link) {
        this.name = name;
        this.link = link;

    }

    protected Image(Parcel parcel) {
        name = parcel.readString();
        link = parcel.readString();
    }

    public static final Creator<Image> CREATOR = new Creator<Image>() {
        @Override
        public Image createFromParcel(Parcel parcel) {
            return new Image(parcel);
        }

        @Override
        public Image[] newArray(int i) {
            return new Image[i];
        }
    };

    public String getName() {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public static Image[] getPhoto () {
        return new Image[]{
                new Image("name.jpg", "link"),

    };
    }
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(link);
    }
}

