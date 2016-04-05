package inducesmile.com.androidstaggeredgridlayoutmanager;

import android.os.Parcel;
import android.os.Parcelable;

public class ItemObjects implements Parcelable {
    private String name;
    private int photo;

    public ItemObjects(String name, int photo) {
        this.name = name;
        this.photo = photo;
    }

    protected ItemObjects(Parcel in) {
        name = in.readString();
        photo = in.readInt();
    }

    public static final Creator<ItemObjects> CREATOR = new Creator<ItemObjects>() {
        @Override
        public ItemObjects createFromParcel(Parcel in) {
            return new ItemObjects(in);
        }

        @Override
        public ItemObjects[] newArray(int size) {
            return new ItemObjects[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeInt(photo);
    }
}
