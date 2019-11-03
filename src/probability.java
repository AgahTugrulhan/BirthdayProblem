import java.util.Random;

public class probability
{
    public static void main(String[] args) {
        double x = calculate (20,10000);
        System.out.println(x);
    }
    public static double calculate(int size, int count) {
        // TODO -- add your code here
        // count arttır, iki kişi aynı doğum gününe sahip olursa
        int dup = 0;
        Random random = new Random();
        for (int i = 0; i <count ; i++) {
            random.setSeed(i+1);
            int [] arrays = new int[size];
            for (int j = 0; j <arrays.length ; j++)
            {
                arrays[j] = random.nextInt(365);

            }
            if (checkElements(arrays) == 1)
            {
                dup++;
            }

        }
        return (double) dup/count*100;
    }
    public static double checkElements (int [] size)
    {
        for (int i = 0; i <size.length ; i++) {
            for (int j = i+1; j < size.length ; j++) {
                if (size[i] == size[j])
                {
                    int result = 1;
                    return result;

                }
            }

        }
        return 0;
    }
}
