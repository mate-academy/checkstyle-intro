package core.basesyntax.Model;

public class Cat {
    
        private int age;
	    private String name;
	    private String ownerName;
	    
		public chat() {
			
		}

		public chat(int age, String name, String ownerName) {
			this.age = age;
			this.name = name;
			this.ownerName = ownerName;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getOwnerName() {
			return ownerName;
		}

		public void setOwnerName(String ownerName) {
			this.ownerName = ownerName;
		}

		@Override
		public String toString() {
			return "chat [age=" + age + ", name=" + name + ", ownerName=" + ownerName + "]";
		}
}
