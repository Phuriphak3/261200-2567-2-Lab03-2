import org.w3c.dom.ls.LSOutput;

public class Patient {
    private int id;
    private String name;
    private int birthYear;
    private double height;
    private double weight;
    private String bloodGroup;
    private String phoneNumber;


    public Patient(int id, String name, int birthYear, double height, double weight, String bloodGroup, String phoneNumber) {

        this.name = name;
        this.birthYear = birthYear;

        if (id > 0) {
            this.id = id;
        } else {
            this.id = 0;
        }

        if (height > 0) {
            this.height = height;
        } else {

            this.height = 0;
        }

        if (weight > 0) {
            this.weight = weight;
        } else {

            this.height = 0;
        }

        if ( bloodGroup.equals("A") || bloodGroup.equals("B") ||
                bloodGroup.equals("AB") || bloodGroup.equals("O")) {
            this.bloodGroup = bloodGroup;
        }
        else {
            this.bloodGroup = "X";
        }

        if (phoneNumber != null && phoneNumber.length() == 10 &&  phoneNumber.matches("[0-9]+")) {
            this.phoneNumber = phoneNumber;
        }
        else{
            this.phoneNumber = "The phone number should have 10 digits.";
        }


        System.out.println("                                          ");
        System.out.println("------------------------------------------");
    }

    public int getid() {
        return this.id;
    }

    public String getname() {
        return this.name;
    }

    public int getbirthYear() {
        return this.birthYear;
    }

    public double getheight() {
        return this.height;

    }

    public double getweight() {
        return this.weight;

    }

    public String getbloodGroup() {
        return this.bloodGroup;

    }

    public String getphoneNumber() {
        return this.phoneNumber;
    }


    public int getAge(int currentYear){
        return (currentYear-this.birthYear);
    }

    public void displayDetails(int currentYear) {
        System.out.println("Patient Name: " + name);
        System.out.println("Patient Age: " + getAge(currentYear));

        if (height > 0) {
            System.out.println("Patient Height (cm): " + height);
        } else {
            System.out.println("Error: Height cannot be less than zero!");
        }

        if (weight > 0) {
            System.out.println("Patient Weight (kg): " + weight);
        } else {
            System.out.println("Error: Weight cannot be less than zero!");
        }

        if (bloodGroup.equals("A") || bloodGroup.equals("B") || bloodGroup.equals("AB")) {
            System.out.println("Blood Group: " + bloodGroup);
        }
        else {
            System.out.println("Error: Blood Group  only A,B,O,AB");
        }


        System.out.println("PhoneNumber: " + phoneNumber);

        double bmi = getBMI();
        if (bmi > 0) {
            System.out.printf("BMI: " + bmi);
        }
        else {
            System.out.println("Error: BMI ");
        }


    }


    public  double getBMI() {
        if(height <= 0 || weight <= 0) {
            return 0;
        }
        else{
            return weight / (height * height)*10000;
        }

    }

}

