import java.util.LinkedList;

public class q57
{
    public static String sort(String userInput)
    {
        if (userInput == null)
        {
            return "";
        }
        LinkedList<String> input = toList(userInput);

        String output = MergeSort(input).toString();

        return output;
    }

    private static LinkedList<String> toList(String input)
    {
        LinkedList<String> output = new LinkedList<String>();
        String[] array = input.split("\\s");

        for (String element : array)
        {
            output.addFirst(element);
        }
        return (output);
    }

    private static LinkedList<String> MergeSort(LinkedList<String> inputstring)
    {
        LinkedList<String> sequence1 = new LinkedList<String>();
        LinkedList<String> sequence2 = new LinkedList<String>();

        if (inputstring.size() <= 1)
        {
            return inputstring;
        }

        for (int index = 0; index <= (inputstring.size() / 2); index++)
        {
            sequence1.addLast(inputstring.removeFirst());
        }
        while (!(inputstring.isEmpty()))
        {
            sequence2.addLast(inputstring.removeFirst());
        }

        sequence1 = MergeSort(sequence1);
        sequence2 = MergeSort(sequence2);

        return merge(sequence1, sequence2);
    }

    private static LinkedList<String> merge(LinkedList<String> sequence1,
            LinkedList<String> sequence2)
    {
        LinkedList<String> merged = new LinkedList<String>();

        while (!(sequence1.isEmpty()) && !(sequence2.isEmpty()))
        {
            if (sequence1.peekFirst().compareTo(sequence2.peekFirst()) < 0)
            {
                merged.addLast(sequence1.removeFirst());
            }
            else
            {
                merged.addLast(sequence2.removeFirst());
            }
        }

        while (!(sequence1.isEmpty()))
        {
            merged.addLast(sequence1.removeFirst());
        }
        while (!(sequence1.isEmpty()))
        {
            merged.addLast(sequence2.removeFirst());
        }

        return (merged);
    }
    public static void main(String[] args)
    {
        String test = "hello world the cat sat on the bloody mat";

        System.out.println(sort(test));

        System.exit(0);

    }
}