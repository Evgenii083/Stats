import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatServiceTest {
    @Test
    void shouldCalculateSaleSum() {
        StatsService service = new StatsService();
        int[] Sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;


        int actual = service.SalesSum(Sales);


        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAverageSales() {
        StatsService service = new StatsService();
        int[] Sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.average(Sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void shoudCalculateNomberOfTheBestMonth() {
        StatsService service = new StatsService();
        int[] Sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = service.getBestMonth(Sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shoudCalculateNomberOfTheWorstMonth() {
        StatsService service = new StatsService();
        int[] Sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.getWorstMonth(Sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateOverAverageMonth() {
        StatsService service = new StatsService();
        int[] Sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.MoreThanAverage(Sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateLessAverageMonth() {
        StatsService service = new StatsService();
        int[] Sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.LessThanAverage(Sales);
        Assertions.assertEquals(expected, actual);
    }
}