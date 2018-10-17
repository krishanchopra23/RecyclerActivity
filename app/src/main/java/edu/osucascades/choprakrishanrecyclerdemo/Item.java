package edu.osucascades.choprakrishanrecyclerdemo;

public class Item {

    private String mHeading;
    private String mDescription;

    public Item(String heading, String description) {
        mHeading = heading;
        mDescription = description;
    }

    public String getHeading() {
        return mHeading;
    }

    public void setHeading(String heading) {
        mHeading = heading;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }
}

