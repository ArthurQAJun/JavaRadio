package org.example;

public class Radio {
    private int currentStationRadio;
    private int currentVolumeRadio;

    public int getCurrentNumberStationRadio() {
        return currentStationRadio;
    }

    public void setCurrentNumberStationRadio(int newCurrentNumberStationRadio) {
        if (newCurrentNumberStationRadio < 0) {
            return;
        }
        if (newCurrentNumberStationRadio > 9) {
            return;
        }
        currentStationRadio = newCurrentNumberStationRadio;
    }

    public void SetToMaxStation() {
        currentStationRadio = 9;
    }


    public int getCurrentVolumeRadio() {
        return currentVolumeRadio;
    }

    public void setCurrentVolumeRadio(int newCurrentVolumeRadio) {
        if (newCurrentVolumeRadio < 0) {
            return;
        }
        if (newCurrentVolumeRadio > 10) {
            return;
        }
        currentVolumeRadio = newCurrentVolumeRadio;
    }

    public void SetMaxVolumeRadio() {
        currentVolumeRadio = 10;
    }

    public void nextStation() {
        if (currentStationRadio != 9) {
            currentStationRadio++;
        } else {
            currentStationRadio = 0;
        }
    }

    public void prevStation() {
        if (currentStationRadio != 0) {
            currentStationRadio--;
        } else {
            currentStationRadio = 0;
        }
    }

    public void nextVolume() {
        if (currentVolumeRadio != 10) {
            currentVolumeRadio++;
        } else {
            currentVolumeRadio = 10;
        }
    }

    public void prevVolume() {
        if (currentVolumeRadio != 0) {
            currentVolumeRadio++;
        } else {
            currentVolumeRadio = 0;
        }
    }
}


