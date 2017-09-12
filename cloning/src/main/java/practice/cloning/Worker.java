package practice.cloning;

public class Worker implements Cloneable{
	 
	
	private int empoyeeId;
    private String employeeName;
    private Department department;
 
    public Worker(int id, String name, Department dept)
    {
        this.empoyeeId = id;
        this.employeeName = name;
        this.department = dept;
    }
    
    /***
     * Override the clone method explicitly making copy of department.
     * @throws CloneNotSupportedException 
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
    	Worker cloned = (Worker)super.clone();
        cloned.setDepartment((Department)cloned.getDepartment().clone());
        return cloned;
    }
    
	public int getEmpoyeeId() {
		return empoyeeId;
	}
	public void setEmpoyeeId(int empoyeeId) {
		this.empoyeeId = empoyeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}

}
