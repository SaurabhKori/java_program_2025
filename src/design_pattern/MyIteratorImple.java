package design_pattern;

import java.util.List;

public class MyIteratorImple implements MyIterator {
	private List<User> list;
	private int length;
	private int position = 0;
	public MyIteratorImple(List<User> list) {
		this.list = list;
		this.length = list.size();
	}

	@Override
	public boolean hashNext() {
		// TODO Auto-generated method stub

		if (position >= length) {
			return false;
		}
		return true;
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		User user = list.get(position);
		position += 1;
		return user;
	}
}
