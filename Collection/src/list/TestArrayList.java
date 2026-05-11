package list;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {
	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		list.add(0, "Ram");
		list.add(1, 'a');
		list.add(2, 2.3);
		list.add(3, true);
		list.add(4, 45);
		list.add(5, "Ram");
		list.add(6, "Ram");
		list.add(6, "Sita");

	}

}
