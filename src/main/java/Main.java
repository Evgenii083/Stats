import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] Sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        int sum = service.SalesSum(Sales);
        int average = service.Average(Sales);
        // int MinMonth = service.getMinMonth(Sales);
        int WorstMonth = service.getWorstMonth(Sales);
        // int invert = service.invert(Sales);
        int BestMonth = service.getBestMonth(Sales);
        int MoreThanAverage = service.MoreThanAverage(Sales);
        int LessThanAverage = service.LessThanAverage(Sales);


        System.out.println("Сумма = " + sum);
        System.out.println("Средние продажи = " + average);
        System.out.println("Лучший месяц № " + BestMonth);
        System.out.println("Худший месяц № " + WorstMonth);
        System.out.println("Кол-во месяцев с продажами выше среднего = " + MoreThanAverage );
        System.out.println("Кол-во месяцев с продажами ниже среднего = " + LessThanAverage);

        //System.out.println(invert);
    }
}




