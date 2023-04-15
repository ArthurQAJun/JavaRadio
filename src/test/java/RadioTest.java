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

        int expected = 10;
        int actual = rad.getCurrentVolumeRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldTestNextVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolumeRadio(10);

        rad.nextVolume();

        int expected = 10;
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
}
