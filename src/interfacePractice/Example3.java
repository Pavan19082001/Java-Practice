package interfacePractice;

interface Member {
	void callBack();
}

class Customer implements Member {

	String name;

	public Customer(String name) {
		this.name = name;
	}

	@Override
	public void callBack() {
		System.out.println("OK, I will Visit: " + name);
	}

}

class Store {
	Member[] mem = new Member[100];
	int count = 0;

	void register(Member m) {
		mem[count++] = m;
	}

	void invitesale() {
		for (int i = 0; i < count; i++) {
			mem[i].callBack();
		}
	}
}

public class Example3 {
	public static void main(String[] args) {
		Store s = new Store();
		Customer c1 = new Customer("John");
		Customer c2 = new Customer("David");
		s.register(c1);
		s.register(c2);
		s.invitesale();
	}
}
