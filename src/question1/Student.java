/*
 * Oliver Faherty
 * ID: 16102532
 * CT874: Programming 1
 */
package question1;

public class Student {

	// creating 3 private data members
	private String name;
	private int id;
	private String course;

	// creating single constructor as per instructions
	public Student() {
		this.name = null;
		this.id = 0;
		this.course = null;
	}

	// creating getter for 'name'
	public String getName() {
		return name;
	}

	// creating setter for 'name'
	public void setName(String name) {
		this.name = name;
	}

	// creating getter for 'id'
	public int getId() {
		return id;
	}

	// creating setter for 'id'
	public void setId(int id) {
		this.id = id;
	}

	// creating getter for 'course'
	public String getCourse() {
		return course;
	}

	// creating setter for 'course'
	public void setCourse(String course) {
		this.course = course;
	}

	// Overriding the toSting Method
	public String toString() {
		return getName() + " whose Student ID is: " + getId() + " is studying " + getCourse();
	}

} // end class
