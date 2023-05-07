import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.Radio;

public class RadioTest {

    @Test
    public void orWave() {
        Radio radio = new Radio(20);
        radio.setCurrentWave(18);
        int actual = radio.getCurrentWave();
        int expected = 18;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxWave() {
        Radio radio = new Radio(20);
        radio.setCurrentWave(19);
        int actual = radio.getCurrentWave();
        int expected = 19;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void aboveMaxWave() {
        Radio radio = new Radio(20);
        radio.setCurrentWave(20);
        int actual = radio.getCurrentWave();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void aboeMaxWave() {
        Radio radio = new Radio(20);
        radio.setCurrentWave(21);
        int actual = radio.getCurrentWave();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testWave() {
        Radio radio = new Radio();

        radio.setCurrentWave(6);
        int actual = radio.getCurrentWave();
        int expected = 6;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minusWaveTest() {
        Radio radio = new Radio();

        radio.setCurrentWave(-1);
        int actual = radio.getCurrentWave();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nullWaveTest() {
        Radio radio = new Radio();

        radio.setCurrentWave(6);
        radio.setCurrentWave(0);
        int actual = radio.getCurrentWave();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MinWaveTest() {
        Radio radio = new Radio();

        radio.setCurrentWave(1);
        int actual = radio.getCurrentWave();
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void aboveMaxWaveTest() {
        Radio radio = new Radio();

        radio.setCurrentWave(10);
        int actual = radio.getCurrentWave();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void belowMaxWaveTest() {
        Radio radio = new Radio();

        radio.setCurrentWave(8);
        int actual = radio.getCurrentWave();
        int expected = 8;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MaxWaveTest() {
        Radio radio = new Radio();

        radio.setCurrentWave(9);
        int actual = radio.getCurrentWave();
        int expected = 9;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void NextMinWaveTest() {
        Radio radio = new Radio();
        radio.setCurrentWave(0);
        radio.next();
        int actual = radio.getCurrentWave();
        int expected = 1;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void NextWaveTest() {
        Radio radio = new Radio();
        radio.setCurrentWave(1);
        radio.next();
        int actual = radio.getCurrentWave();
        int expected = 2;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NextBelowMaxWaveTest() {
        Radio radio = new Radio();
        radio.setCurrentWave(8);
        radio.next();
        int actual = radio.getCurrentWave();
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NextMaxWaveTest() {
        Radio radio = new Radio();
        radio.setCurrentWave(9);
        radio.next();
        int actual = radio.getCurrentWave();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void PreviousWaveTest() {
        Radio radio = new Radio();
        radio.setCurrentWave(9);
        radio.prev();
        int actual = radio.getCurrentWave();
        int expected = 8;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void PreviousMinWaveTest() {
        Radio radio = new Radio();
        radio.setCurrentWave(0);
        radio.prev();
        int actual = radio.getCurrentWave();
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void PreviousAboveMinWaveTest() {
        Radio radio = new Radio();
        radio.setCurrentWave(1);
        radio.prev();
        int actual = radio.getCurrentWave();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(6);
        int actual = radio.getCurrentVolume();
        int expected = 6;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minusVolumeTest() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);
        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nullVolumeTest() {
        Radio radio = new Radio();

        radio.setCurrentVolume(6);
        radio.setCurrentVolume(0);
        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MinVolumeTest() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);
        int actual = radio.getCurrentVolume();
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void aboveMaxVolumeTest() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);
        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void belowMaxVolumeTest() {
        Radio radio = new Radio();

        radio.setCurrentVolume(99);
        int actual = radio.getCurrentVolume();
        int expected = 99;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MaxVolumeTest() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        int actual = radio.getCurrentVolume();
        int expected = 100;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void NextMinVolumeTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 1;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void NextVolumeTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 2;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NextBelowMaxVolumeTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 100;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NextMaxVolumeTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 100;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ReduceVolumeTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.reduceVolume();
        int actual = radio.getCurrentVolume();
        int expected = 99;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ReduceMinVolumeTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.reduceVolume();
        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ReduceAboveMinVolumeTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.reduceVolume();
        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }
}