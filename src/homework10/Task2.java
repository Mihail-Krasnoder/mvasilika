package homework10;
import java.util.ArrayList;
import java.util.List;

public class Task2
{
    private static final int COLLECTION_SIZE = 1_000;
    private static final int BOX_WEIGHT = 300;

    public static void main(String[] args)
    {
        List<Box> source = createNewCollection();

        List<Box> destination = new ArrayList<>();

        replaceBoxWithWeightsMoreThan300(source, destination);

        System.out.printf("Source size: %d%nDestination size: %d%n", source.size(), destination.size());

        System.out.println(checkingResult(source));

        System.out.println(source);

        System.out.println(destination);
    }


    public static List<Box> createNewCollection()
    {
        List<Box> collection = new ArrayList<>();

        for (int i = 0; i < COLLECTION_SIZE; i++)
        {
            collection.add(new Box());
        }

        return collection;
    }


    public static void replaceBoxWithWeightsMoreThan300(List<Box> source, List<Box> destination)
    {
        for (int i = 0; i < source.size(); i++)
        {
            if (source.get(i).getWeight() > BOX_WEIGHT)
            {
                destination.add(source.get(i));

                source.remove(i--);
            }
        }
    }


    private static boolean checkingResult(List<Box> boxes)
    {
        for (Box box :
                boxes) {
            if (box.getWeight() > BOX_WEIGHT)
            {
                return false;
            }
        }

        return true;
    }

}