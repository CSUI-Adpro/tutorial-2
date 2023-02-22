package id.ac.ui.cs.advprog.tutorial2.template.core;

import java.util.ArrayList;
import java.util.List;

public abstract class Cinema {

    protected enum ACSpeed {HIGH, MEDIUM, LOW}
    protected enum soundSysType {STEREO, SURROUND}
    protected enum movieQuality {QHD, UHD}

    public List<String> letTheShowBegin() {
        List<String> list = new ArrayList<>();
        // TODO: Complete me

        return list;
    }

    public String turnOnLight() {
        return "Light turned on";
    }

    public String turnOffLight() {
        return "Light turned off";
    }

    public String turnOnScreen() {
        return "Screen turned on";
    }

    public String turnOffScreen() {
        return "Screen turned off";
    }

    public String turnOffSoundSystem() {
        return "Sound System turned off";
    }

    public String turnOffAC() {
        return "AC turned off";
    }

    protected abstract String turnOnAC();
    protected abstract String turnOnSoundSystem();
    protected abstract String playAds();
    protected abstract String playMovie();
}
