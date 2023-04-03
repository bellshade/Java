package algorithm.datastructure.Sorting;

import java.util.Arrays;
import java.util.List;

// interface untuk algoritma Sorting
public interface AlgoritmaSorting {
  <T extends Comparable<T>> T[] sorting(T[] tidakTersorting);

  @SuppressWarnings("unchecked")
  default <T extends Comparable<T>> List<T> sorting(List<T> tidakTersorting) {
    return Arrays.asList(
      sorting(tidakTersorting.toArray((T[]) new Comparable[tidakTersorting.size()]))
    );
  }
}
