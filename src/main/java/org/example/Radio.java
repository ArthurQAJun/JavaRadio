package org.example;

public class Radio {
    private int currentStationRadio;
    private int currentVolumeRadio;
    private int maxStationRadio;

    public Radio() {
        maxStationRadio = 9;
    }

    public Radio (int stationRadioCount) {
        this.maxStationRadio = stationRadioCount - 1;
    }

    public int getCurrentNumberStationRadio() {
        return currentStationRadio;
    }

    public void setCurrentNumberStationRadio(int newCurrentNumberStationRadio) {
        if (newCurrentNumberStationRadio < 0) {
            return;
        }
        if (newCurrentNumberStationRadio > maxStationRadio) {
            return;
        }
        currentStationRadio = newCurrentNumberStationRadio;
    }

    public void SetToMaxStation() {
        currentStationRadio = maxStationRadio;
    }


    public int getCurrentVolumeRadio() {
        return currentVolumeRadio;
    }

    public void setCurrentVolumeRadio(int newCurrentVolumeRadio) {
        if (newCurrentVolumeRadio < 0) {
            return;
        }
        if (newCurrentVolumeRadio > 100) {
            return;
        }
        currentVolumeRadio = newCurrentVolumeRadio;
    }

    public void SetMaxVolumeRadio() {
        currentVolumeRadio = 100;
    }

    public void nextStation() {
        if (currentStationRadio != maxStationRadio) {
            currentStationRadio++;
        } else {
            currentStationRadio = 0;
        }
    }

    public void prevStation() {
        if (currentStationRadio != 0) {
            currentStationRadio--;
        } else {
            currentStationRadio = 9;
        }
    }

    public void nextVolume() {
        if (currentVolumeRadio != 100) {
            currentVolumeRadio++;
        } else {
            currentVolumeRadio = 100;
        }
    }

    public void prevVolume() {
        if (currentVolumeRadio != 0) {
            currentVolumeRadio--;
        } else {
            currentVolumeRadio = 0;
        }
    }
}


