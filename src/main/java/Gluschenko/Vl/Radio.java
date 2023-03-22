package Gluschenko.Vl;

public class Radio {
    private int currentRadioStation;
    private int volume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation > 9) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void prevRadioStation() {
        if (currentRadioStation == 9) {
            this.currentRadioStation = 0;
            return;
        }
        this.currentRadioStation--;
    }

    public void nextRadioStation() {
        if (currentRadioStation == 0) {
            this.currentRadioStation = 9;
            return;
        }
        this.currentRadioStation++;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume < 0) {
            return;
        }
        if (volume > 10) {
            return;
        }
        this.volume = volume;
    }

    public void increaseVolume () {
        if (volume == 10) {
            this.volume = volume;
        }
        if (volume < 10) {
            this.volume++;
        }
    }

    public void reduceVolume () {
        if (volume == 0) {
            this.volume = volume;
        }
        if (volume > 0) {
            this.volume--;
        }
    }
}