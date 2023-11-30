
class Staff extends Employee {
	private String title;

	public Staff(String name, String address, String phoneNumber, String emailAddress, String office, double salary,
			String dateHired, String title) {
		super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
