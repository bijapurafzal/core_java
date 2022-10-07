package p1;

import java.util.ArrayList;
import java.util.HashSet;

public class A {

public static void main(String[] args) {

ArrayList<Integer> arr = new ArrayList<Integer>();
arr.add(10);
arr.add(30);
arr.add(20);
arr.add(10);
        arr.add(20);
HashSet<Integer> h = new HashSet<Integer>();
for (int i = 0; i < arr.size(); i++) {
	h.add(arr.get(i));
}
System.out.println(h);

}

}