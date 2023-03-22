package Gluschenko.Vl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void test1 () {
        Radio radio = new Radio();
        int currentRadioStation = 10;
        radio.setCurrentRadioStation(currentRadioStation);
        int expected = 0;
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    public void test2 () {
        Radio radio = new Radio();
        int currentRadioStation = -1;
        radio.setCurrentRadioStation(currentRadioStation);
        int expected = 0;
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldRadioStationMin (){
        Radio radio = new Radio();
        int currentRadioStation = 9;
        radio.setCurrentRadioStation(currentRadioStation);
        radio.prevRadioStation();
        int expected = 0;
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldRadioStationMax () {
        Radio radio = new Radio();
        int currentRadioStation = 0;
        radio.setCurrentRadioStation(currentRadioStation);
        radio.nextRadioStation();
        int expected = 9;
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    public void prevRadioStation () {
        Radio radio = new Radio();
        int currentRadioStation = 1;
        radio.setCurrentRadioStation(currentRadioStation);
        radio.prevRadioStation();
        int expected = 0;
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    public void nextRadioStation () {
        Radio radio = new Radio();
        int currentRadioStation = 8;
        radio.setCurrentRadioStation(currentRadioStation);
        radio.nextRadioStation();
        int expected = 9;
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    public void volumeIsMax () {
        Radio radio = new Radio();
        int volume = 11;
        radio.setVolume(volume);
        int expected = 0;
        assertEquals(expected,radio.getVolume());
    }

    @Test
    public void volumeIsMin () {
        Radio radio = new Radio();
        int volume = -1;
        radio.setVolume(volume);
        int expected = 0;
        assertEquals(expected, radio.getVolume());
    }

    @Test
    public void volumeMax () {
        Radio radio = new Radio();
        int volume = 10;
        radio.setVolume(volume);
        radio.increaseVolume();
        int expected = 10;
        assertEquals(expected, radio.getVolume());
    }

    @Test
    public void volumeMin () {
        Radio radio = new Radio();
        int volume = 0;
        radio.setVolume(volume);
        radio.reduceVolume();
        int expected = 0;
        assertEquals(expected, radio.getVolume());
    }

    @Test
    public void volumeUp () {
        Radio radio = new Radio();
        int volume = 8;
        radio.setVolume(volume);
        radio.increaseVolume();
        int expected = 9;
        assertEquals(expected, radio.getVolume());
    }

    @Test
    public void volumeDown () {
        Radio radio = new Radio();
        int volume = 10;
        radio.setVolume(volume);
        radio.reduceVolume();
        int expected = 9;
        assertEquals(expected, radio.getVolume());
    }
}