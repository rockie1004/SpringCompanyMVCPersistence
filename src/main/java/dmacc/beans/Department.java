package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Department {

		@Id

		@GeneratedValue(strategy=GenerationType.IDENTITY)

		private long department_id;

		private String title;



		public Department() {
			super();
		}



		public Department(String title) {
			super();
			this.title = title;
		}



		public Department(long department_id, String title) {
			super();
			this.department_id = department_id;
			this.title = title;

		}

		public long getId() {
			return department_id;
		}

		public void setId(long department_id) {
			this.department_id = department_id;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		@Override

		public String toString() {
			return "Department [id=" + department_id + ", title=" + title + "]";
		}

	}

