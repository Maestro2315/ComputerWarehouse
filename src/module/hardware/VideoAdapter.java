package module.hardware;

import java.util.Objects;

public class VideoAdapter {
    private final String name;
    private final String videoRam;

    public VideoAdapter(String name, String videoRam) {
        this.name = name;
        this.videoRam = videoRam;

    }


    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("\nname: ");
        stringBuilder.append(this.name);
        stringBuilder.append("\nvideoRam: ");
        stringBuilder.append(this.videoRam);
        return stringBuilder.toString();

        //return "\nname: " + this.name + "\nvideoRam: " + this.videoRam;

    }

    public boolean equals(Object obj) {
        VideoAdapter otherVideoAdapter = (VideoAdapter) obj;
        if (otherVideoAdapter == null) {
            return false;
        }

        if (!(this.name.equals(otherVideoAdapter.name) && Objects.equals(this.videoRam, otherVideoAdapter.videoRam))) {
            System.out.println("VideoAdapters are different!");
            return false;
        }
        return true;
    }
}

