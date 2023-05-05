import org.example.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void ShouldTestNumberStation() {
        Radio rad = new Radio();

        rad.setCurrentNumberStationRadio(7);

        int expected = 7;
        int actual = rad.getCurrentNumberStationRadio();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void ShouldTestMaxNumberStation() {
        Radio rad = new Radio();

        rad.SetToMaxStation();

        int expected = 9;
        int actual = rad.getCurrentNumberStationRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldTestVolumeStation() {
        Radio rad = new Radio();
        rad.setCurrentVolumeRadio(7);

        int expected = 7;
        int actual = rad.getCurrentVolumeRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldTestMaxVolumeStation() {
        Radio rad = new Radio();
        rad.SetMaxVolumeRadio();

        int expected = 100;
        int actual = rad.getCurrentVolumeRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldTestNextVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolumeRadio(100);

        rad.nextVolume();

        int expected = 100;
        int actual = rad.getCurrentVolumeRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldTestPrevVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolumeRadio(0);

        rad.prevVolume();

        int expected = 0;
        int actual = rad.getCurrentVolumeRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldTestNextStation() {
        Radio rad = new Radio();
        rad.setCurrentNumberStationRadio(9);

        rad.nextStation();

        int expected = 0;
        int actual = rad.getCurrentNumberStationRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldTestPrevStation() {
        Radio rad = new Radio();
        rad.setCurrentNumberStationRadio(9);

        rad.prevStation();

        int expected = 8;
        int actual = rad.getCurrentNumberStationRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldTestVolumeStationBelowMax() {
        Radio rad = new Radio();
        rad.setCurrentVolumeRadio(-1);

        int expected = 0;
        int actual = rad.getCurrentVolumeRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldTestVolumeStationAboveMax() {
        Radio rad = new Radio();
        rad.setCurrentVolumeRadio(101);

        int expected = 0;
        int actual = rad.getCurrentVolumeRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldTestNextVolumeInRange() {
        Radio rad = new Radio();
        rad.setCurrentVolumeRadio(8);

        rad.nextVolume();

        int expected = 9;
        int actual = rad.getCurrentVolumeRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldTestPrevVolumeInRange() {
        Radio rad = new Radio();
        rad.setCurrentVolumeRadio(2);

        rad.prevVolume();

        int expected = 1;
        int actual = rad.getCurrentVolumeRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldTestNextStationInRange() {
        Radio rad = new Radio();
        rad.setCurrentNumberStationRadio(8);

        rad.nextStation();

        int expected = 9;
        int actual = rad.getCurrentNumberStationRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldTestPrevStationZero() {
        Radio rad = new Radio();
        rad.setCurrentNumberStationRadio(0);

        rad.prevStation();

        int expected = 9;
        int actual = rad.getCurrentNumberStationRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldTestNumberStationAboveMax() {
        Radio rad = new Radio();

        rad.setCurrentNumberStationRadio(10);

        int expected = 0;
        int actual = rad.getCurrentNumberStationRadio();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void ShouldTestNumberStationBelowMax() {
        Radio rad = new Radio();

        rad.setCurrentNumberStationRadio(-1);

        int expected = 0;
        int actual = rad.getCurrentNumberStationRadio();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void ShouldTestConstructorValidValues() {
        Radio rad = new Radio(30);

        rad.setCurrentNumberStationRadio(5);

        int actual = rad.getCurrentNumberStationRadio();
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldTestConstructorLimitValues0() {
        Radio rad = new Radio(30);

        rad.setCurrentNumberStationRadio(0);

        int actual = rad.getCurrentNumberStationRadio();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldTestConstructorLimitValues1() {
        Radio rad = new Radio(30);

        rad.setCurrentNumberStationRadio(1);

        int actual = rad.getCurrentNumberStationRadio();
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldTestConstructorLimitValues29() {
        Radio rad = new Radio(30);

        rad.setCurrentNumberStationRadio(29);

        int actual = rad.getCurrentNumberStationRadio();
        int expected = 29;

        Assertions.assertEquals(expected, actual);
    }
}
