public class MediaInformation {

    MediaInformationTypes mediaInformationTypes;
    private String mediaInformationName;
    private String mediaInformationFoundAt;

    public MediaInformation(){
    }

    public MediaInformationTypes getMediaInformationTypes() {
        return mediaInformationTypes;
    }

    public void setMediaInformationTypes(MediaInformationTypes mediaInformationTypes) {
        this.mediaInformationTypes = mediaInformationTypes;
    }

    public String getMediaInformationName() {
        return mediaInformationName;
    }

    public void setMediaInformationName(String mediaInformationName) {
        this.mediaInformationName = mediaInformationName;
    }

    public String getMediaInformationFoundAt() {
        return mediaInformationFoundAt;
    }

    public void setMediaInformationFoundAt(String mediaInformationFoundAt) {
        this.mediaInformationFoundAt = mediaInformationFoundAt;
    }
}
