// Name: Daniel Pinkston
// Date: <2023-03-08>

public class Lab81 {

    /** Return the value at the specified index of list, or null if indx out of bounds
    *  @param index the index of the value to reutrn
    *  @param list the list to get a value from
    *  @return the value in list at index
    */
    public String get(int index, SnakeList<String> list) {
        if (index == 0) {
            return list.head();
        } else {
            return get(index - 1, list.body());
        }
    }

    /** Return the last value in list, or null if list is empty
    *  @param list the list to get the last value from
    *  @return the last value in list, or null if list is empty
    */
    public String getLast(SnakeList<String> list) {
        // return the last value in the list, or null if it is empty
        if (list.isEmpty()) {
            return null;
        } else if (list.body().isEmpty()) {
            return list.head();
        } else {
            return getLast(list.body());
        }
    }

    /** Return the number of elements in list
    *  @param list the list to count the elements of
    *  @return the number of elements in list
    */
    public int size(SnakeList<String> list) {
        if (list.isEmpty()) {
            return 0;
        } else {
            return 1 + size(list.body());
        }
    }

    /** Return how many times target appears in list
    *  @param target the value to count in list
    *  @param list the list to count target in
    *  @return the number of times target appears in list
    */
    public int count(String target, SnakeList<String> list) {
        if (list.isEmpty()) {
            return 0;
        } else {
            if (list.head().equals(target)) {
                return 1 + count(target, list.body());
            } else {
                return count(target,list.body());
            }
        }
    }

    /** Check if list contains target
    *  @param target the value to find in list
    *  @param list the list to search
    *  @return true if list contains target, otherwise return false
    */
    public boolean contains(String target, SnakeList<String> list) {
        if (list.isEmpty()) {
            return false;
        } else {
            if (list.head().equals(target)) {
                return true;
            } else {
                return contains(target, list.body());
            }
        }
    }

    /** Remove the value at index from list
    *  Precondition: index will be in-bounds of list
    *  @param index the index of the value to remove from list
    *  @param list the list to remove a value from
    *  @return a SnakeList with all the values of list, except the one at index
    */
    public SnakeList<String> remove(int index, SnakeList<String> list) {
        if (index == 0) {
            return list.body();
        } else {
            return new SnakeList<String>(list.head(), remove(index-1, list.body()));
        }
    }

    /** Recursively remove all occurances of target from lst
    *  @param target the value to remove from list
    *  @param list the list to remove values from
    *  @return a SnakeList with all the same values of list except target.
    */
    public SnakeList<String> removeAll(String target, SnakeList<String> list) {
        if (list.isEmpty()) {
            return list;

        } else {
            if (list.head().equals(target)) {
                return removeAll(target, list.body());
            } else {
                return new SnakeList<String>(list.head(), removeAll(target, list.body()));
            }
        }
    }

    /** Add the value to the end of the list
    *  @param val the value to add to list
    *  @param list the list to add val to
    *  @return a Snakeist with all the same values as list, except val is added to the end
    */
    public SnakeList<String> add(String val, SnakeList<String> list) {
        if (list.isEmpty()) {
            return new SnakeList<String>(val, list);
        } else {
            return new SnakeList<String>(list.head(), add(val, list.body()));
        }
    }

    /** Insert a value into list at the specified index
        * If index is greater than the last index of list, then insert val at the end of list
    *  @param val the value to insert
    *  @param index the index to insert the value
    *  @param list the list to insert a value into
    *  @return a SnakeList with the same values as list, except val is inserted at index
    */
    public SnakeList<String> add(String val, int index, SnakeList<String> list) {
        if (index == 0) {
            return new SnakeList<String>(val, list);
        } else {
            return new SnakeList<String>(list.head(), add(val, index-1, list.body()));
        }
    }

    /** Duplicate all elements in list.
    *  If the list has the values [A, B, C, D] then this method will return [A, A, B, B, C, C, D, D]
    *  @param list the list with values to duplicate
    *  @return a SnakeList with all the values of list, duplciated
    */
    public SnakeList<String> duplicateElements(SnakeList<String> list) {
        if (list.isEmpty()) {
            return list;
        } else {
            return new SnakeList<String>(list.head(), new SnakeList<String>(list.head(), duplicateElements(list.body())));
        }
    }

    /** Return a sublist of this list, starting from start and ending at end (exclusive)
    *  sublist(2, 4, [A, B, C, D, E, F]) would return [C, D]
    *  Precondition: start and end will be in-bounds of list
    *  @param start the index to start the sublist from, inclusive
    *  @param end the index to end the sublist at, exclusive
    *  @param list the list to create a sublist from
    *  @return a SnakeList with the values of list between [start, end)
    */
    public SnakeList<String> sublist(int start, int end, SnakeList<String> list) {
        if (start == 0) {
            if (end == 0) {
                return new SnakeList<String>();
            } else {
                return new SnakeList<String>(list.head(), sublist(start, end-1, list.body()));
            }
        } else {
            return sublist(start-1, end-1, list.body());
        }
    }
}
