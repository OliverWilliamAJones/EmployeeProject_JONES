package Version2;

public class Name {

    private String firstName;
    private String middleName;
    private String lastName;


    public Name(String name) {
        String[] parts = name.split(" ");

        if (parts.length == 3) {
            firstName = parts[0];
            middleName = parts[1];
            lastName = parts[2];
        } else if (parts.length == 2) {
            firstName = parts[0];
            middleName = "";
            lastName = parts[1];
        } else {
            firstName = name;
            middleName = "";
            lastName = "";
        }
    }


    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.middleName = "";
        this.lastName = lastName;
    }


    public Name(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        if (middleName.equals("")) {
            return lastName + ", " + firstName;
        }

        return lastName + ", " + firstName + " "
                + middleName.charAt(0) + ".";
    }
}