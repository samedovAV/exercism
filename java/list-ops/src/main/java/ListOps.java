import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

class ListOps {

    // Append: Add all items in the second list to the end of the first list
    static <T> List<T> append(List<T> list1, List<T> list2) {
        List<T> result = new ArrayList<>(list1);
        result.addAll(list2);
        return result;
    }

    // Concat: Combine all items in all lists into one flattened list
    static <T> List<T> concat(List<List<T>> listOfLists) {
        List<T> result = new ArrayList<>();
        for (List<T> list : listOfLists) {
            result.addAll(list);
        }
        return result;
    }

    // Filter: Return the list of all items for which predicate(item) is True
    static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T item : list) {
            if (predicate.test(item)) {
                result.add(item);
            }
        }
        return result;
    }

    // Size: Return the total number of items within the list
    static <T> int size(List<T> list) {
        return list.size();
    }

    // Map: Return the list of the results of applying function(item) on all items
    static <T, U> List<U> map(List<T> list, Function<T, U> transform) {
        List<U> result = new ArrayList<>();
        for (T item : list) {
            result.add(transform.apply(item));
        }
        return result;
    }

    // Reverse: Return a list with all the original items, but in reversed order
    static <T> List<T> reverse(List<T> list) {
        List<T> result = new ArrayList<>(list);
        int start = 0;
        int end = result.size() - 1;
        while (start < end) {
            T temp = result.get(start);
            result.set(start, result.get(end));
            result.set(end, temp);
            start++;
            end--;
        }
        return result;
    }

    // FoldLeft: Fold each item into the accumulator from the left
    static <T, U> U foldLeft(List<T> list, U initial, BiFunction<U, T, U> f) {
        U result = initial;
        for (T item : list) {
            result = f.apply(result, item);
        }
        return result;
    }

    // FoldRight: Fold each item into the accumulator from the right
    static <T, U> U foldRight(List<T> list, U initial, BiFunction<T, U, U> f) {
        List<T> reversedList = reverse(list);
        return foldLeft(reversedList, initial, (acc, item) -> f.apply(item, acc));
    }

    private ListOps() {
        // No instances.
    }

}
