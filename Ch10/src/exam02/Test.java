package exam02;

public class Test {
	int id;
	
	public Test(int id) {
		this.id = id;
		
	}
	public boolean equals(Object object) {
		if(object instanceof Test) {
			Test test = (Test)object;	
			if(this.id == test.id) {
				return true;
			}
	}
	return false;
	}
}


