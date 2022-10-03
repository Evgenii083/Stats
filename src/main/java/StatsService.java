import java.lang.reflect.Array;

import java.util.Arrays;

public class StatsService {

    public int SalesSum(int[] Sales) {
        int sum = Arrays.stream(Sales).sum();
        return sum;
    }

    public int Average(int[] Sales) {
        int sum = 0;
        if (Sales.length > 0) ;
        {
            for (int A : Sales) {
                sum += A;
            }
            int averageSales = sum / Sales.length;
            return averageSales;

        }
    }
    public int getWorstMonth(int[] Sales) {
        int NumberOfTheWorstMonth = 0;
        for (int d = 0; d < Sales.length; d++) {
            if (Sales[d] < Sales[NumberOfTheWorstMonth]) {
                NumberOfTheWorstMonth = d;
            }
        }
        return NumberOfTheWorstMonth + 1;
    }

    public int getBestMonth(int[] Sales) {
        int size = Sales.length;
        int BestMonth = Sales[0];
        for (int s = 0; s < Sales.length; s++) {
            int term = Sales[s];
            Sales[s] = Sales[size - 1 - s];
            Sales[size - 1 - s] = term;
            if (Sales[s] > Sales[BestMonth]) {
                BestMonth = s;
            }
        }
        return BestMonth + 1;


    }

    public int MoreThanAverage(int[] Sales) {
        int MoreThanAverage = 0;
        int p = Average(Sales);

        for (int i = 0; i < Sales.length; i++) {
            if (Sales[i] > p) {
                MoreThanAverage++;
            }
        }
        return MoreThanAverage;
    }

    public int LessThanAverage(int[] Sales) {
        int p = Average(Sales);
        int LessThanAverage = 0;
        for (int i = 0; i < Sales.length; i++) {
            if (Sales[i] < p) {
                LessThanAverage++;
            }
        }
        return LessThanAverage;
    }
}



