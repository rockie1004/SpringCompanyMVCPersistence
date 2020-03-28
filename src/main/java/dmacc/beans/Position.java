package dmacc.beans;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Position {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long position_id;
	private String title;
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="dept_id")
	private Department department;
	
	@OneToMany(cascade=CascadeType.MERGE, fetch=FetchType.EAGER)  
	@JoinTable    (        
			name="EMPLOYEE_POSITION",    
			joinColumns={ @JoinColumn(name="position_id", referencedColumnName="position_id") },       
			inverseJoinColumns={ @JoinColumn(name="id", referencedColumnName="id", unique=true) }    )     
	private List<Employee> listOfEmployees;
	
	
	public Position() {
		super();}
	/**
	 * @param position_id
	 * @param title
	 * @param department
	 */
	public Position(long position_id, String title, Department department) {
		super();
		this.position_id = position_id;
		this.title = title;
		this.department = department;
	}



	/**
	 * @return the position_id
	 */
	public long getPosition_id() {
		return position_id;
	}



	/**
	 * @param position_id the position_id to set
	 */
	public void setPosition_id(long position_id) {
		this.position_id = position_id;
	}



	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}



	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}



	/**
	 * @return the department
	 */
	public Department getDepartment() {
		return department;
	}



	/**
	 * @param department the department to set
	 */
	public void setDepartment(Department department) {
		this.department = department;
	}



	/**
	 * @return the listOfEmployees
	 */
	public List<Employee> getListOfEmployees() {
		return listOfEmployees;
	}



	/**
	 * @param listOfEmployees the listOfEmployees to set
	 */
	public void setListOfEmployees(List<Employee> listOfEmployees) {
		this.listOfEmployees = listOfEmployees;
	}



	@Override
	public String toString() {
		return "Position [title=" + title + ", department="+department.getTitle()+"]";
	}

}
