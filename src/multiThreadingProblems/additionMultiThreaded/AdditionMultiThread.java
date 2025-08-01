package multiThreadingProblems.additionMultiThreaded;

import java.util.List;
import java.util.concurrent.Callable;

public class AdditionMultiThread implements Callable<Long>
{
    List<Integer> integerList;
    int startIndex;
    int endIndex;

    public AdditionMultiThread(List<Integer> integerList, int startIndex, int endIndex)
    {
        this.integerList = integerList;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    @Override
    public Long call() throws Exception
    {
        Long result = 0L;
        for (int i = startIndex; i < endIndex; i++)
        {
            result += this.integerList.get(i);
        }

        return result;
    }
}
