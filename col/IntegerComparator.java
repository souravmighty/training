package col;

import java.util.Comparator;

public class IntegerComparator implements Comparator<Integer> {
	
	@Override
	public int compare(Integer num1, Integer num2) {
		if(num1>num2)
			return 1;
		if(num2>num1)
			return -1;
		return 0;
	}

}
