import java.util.Vector;

public class Demo {
  public static void main(String[] args) {
    // create a vector of integers
    Vector<Integer> vec = new Vector<Integer>();

    // add elements to the vector
    vec.add(1);
    vec.add(2);
    vec.add(3);
    vec.add(4);

    // print the vector
    System.out.println("Vector: " + vec);

    // get the size of the vector
    int size = vec.size();
    System.out.println("Size of vector: " + size);

    // get an element at a specific index
    int element = vec.get(2);
    System.out.println("Element at index 2: " + element);

    // set an element at a specific index
    vec.set(1, 5);
    System.out.println("Vector after setting element at index 1 to 5: " + vec);

    // remove an element at a specific index
    vec.remove(3);
    System.out.println("Vector after removing element at index 3: " + vec);

    // check if the vector contains a specific element
    boolean contains = vec.contains(2);
    System.out.println("Vector contains element 2: " + contains);

    // get the index of a specific element
    int index = vec.indexOf(3);
    System.out.println("Index of element 3: " + index);

    // clear the vector
    vec.clear();
    System.out.println("Vector after clearing: " + vec);
  }
}
