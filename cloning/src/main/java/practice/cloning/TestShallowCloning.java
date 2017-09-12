package practice.cloning;

public class TestShallowCloning {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Department dept = new Department(1, "Human Resource");
		Employee original = new Employee(1, "Admin", dept);
		
		// Lets create a clone of original object
		Employee cloned = (Employee) original.clone();
		
		// Let verify using employee id, if cloning actually workded
		System.out.println(cloned.getEmpoyeeId());

		// Verify JDK's rules

		/**
		 * The cloned object is not equal to original. So the below would be true. Only the objects who are at the same memory location
		 * can be equal.
		 */
		System.out.println(original != cloned);

		/**
		 * Both objects belong to the same class and so would be equal.
		 */
		System.out.println(original.getClass() == cloned.getClass());

		/**
		 *  Default equals method checks for references so it should be false. If we want
		 *  to make it true,
		 *  we need to override equals method in Employee class.
		 */
		
		System.out.println(original.equals(cloned));
		
		/***
		 *   As both the original and cloned object refer to the same department object. If the name of the department is changed in original,
		 *    even the cloned object department gets changed.
		 *   
		 * 
		 */
		cloned.getDepartment().setName("ABC");
		
		/**
		 * Would print ABC
		 */
		System.out.println(original.getDepartment().getName());
	}
}
