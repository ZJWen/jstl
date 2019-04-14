package Student;

public class student {
	private int sno;
	private String name;
	private int sage;
	
	public student() {
		super();
	}

	public student(int sno, String name, int age) {
		super();
		this.sno = sno;
		this.name = name;
		this.sage = age;
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return sage;
	}

	public void setAge(int age) {
		this.sage = age;
	}
	
	
}
