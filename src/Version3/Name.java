package Version3;

public class Name {
    private String firstName;
    private String middleName;
    private String lastName;
    private String suffix;

    public Name() {
        this.firstName = "N/A";
        this.middleName = "N/A";
        this.lastName = "N/A";
        this.suffix = "";
    }

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.middleName = "N/A";
        this.lastName = lastName;
        this.suffix = "";
    }

    public Name(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.suffix = "";
    }

    public Name(String firstName, String middleName, String lastName, String suffix) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.suffix = suffix;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName != null && !firstName.trim().isEmpty()) {
            this.firstName = firstName;
        }
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        if (middleName != null && !middleName.trim().isEmpty()) {
            this.middleName = middleName;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName != null && !lastName.trim().isEmpty()) {
            this.lastName = lastName;
        }
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = (suffix == null) ? "" : suffix;
    }

    private String getMiddleInitial() {
        if (middleName == null || middleName.isEmpty() || middleName.equalsIgnoreCase("N/A")) {
            return "";
        }
        return middleName.charAt(0) + ".";
    }

    public void displayName() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        String mi = getMiddleInitial();
        String base = lastName + ", " + firstName + (mi.isEmpty() ? "" : " " + mi);
        if (suffix != null && !suffix.isEmpty()) {
            base += " " + suffix;
        }
        return base;
    }
}