package ru.netology;

public class Radio {
    private int currentWave;
    private int currentVolume;
    private int maxWave;

    public Radio() {
        this.maxWave = 9;
    }

    public Radio(int wavesCount) {
        this.maxWave = wavesCount - 1;
    }

    public void next() {
        if (currentWave != maxWave) {
            currentWave++;
        } else {
            currentWave = 0;
        }
    }

    public void prev() {
        if (currentWave != 0) {
            currentWave--;
        } else {
            currentWave = maxWave;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        } else currentVolume = 100;
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else currentVolume = 0;
    }


    public int getCurrentWave() {
        return currentWave;
    }

    public void setCurrentWave(int currentWave) {
        if (currentWave < 0) {
            return;
        }
        if (currentWave > maxWave) {
            return;
        }
        this.currentWave = currentWave;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }
}

