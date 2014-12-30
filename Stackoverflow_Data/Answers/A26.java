

	import java.util.ArrayList;
	import java.util.List;


	public class A26 {

		public static <E extends Comparable<E>> List mergeSort(List<E> toSort)
		{
		  if(toSort.size() > 1)
		  {
		    List<E> temp = toSort.subList(0, toSort.size()/2);

		    ArrayList<E> left = new ArrayList<E>(0);
		      for(E e : temp) left.add(e);

		    temp = toSort.subList(toSort.size()/2, toSort.size());

		    ArrayList<E> right = new ArrayList<E>(0);
		      for(E e : temp) right.add(e);

		    if(right.size() != 1) mergeSort(right);
		    if(left.size() != 1) mergeSort(left);

		    toSort.clear();
		    toSort.addAll(mergeSortedLists(left, right));
		  }
		  return toSort;
		}


		public static <E extends Comparable<E>> List<E> mergeSortedLists(List<E> leftList, List<E> rightList)
		{
		  ArrayList<E> list = new ArrayList<E>();

		  while(!leftList.isEmpty() && !rightList.isEmpty())
		  {
		    if((leftList.get(0)).compareTo(rightList.get(0)) <= 0)
		      list.add(leftList.remove(0));

		    else
		      list.add(rightList.remove(0));
		  }

		  while(!leftList.isEmpty())
		    list.add(leftList.remove(0));

		  while(!rightList.isEmpty())
		    list.add(rightList.remove(0));

		  return list;
		}
}
