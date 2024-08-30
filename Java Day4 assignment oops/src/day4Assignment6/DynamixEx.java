package day4Assignment6;

public class DynamixEx {

    public static void main(String[] args) {
        // Create an instance of DayScholar with the required parameters
        DayScholar dayScholar = new DayScholar(1000, 'B', "Veda Harshitha", 5000, "23/51, Mydukur");

        // Setting additional details
        dayScholar.setStudentName("Veda Harshitha");
        dayScholar.setResidentialAddress("23/51, Mydukur");

        // Print details
        dayScholar.getDetails();
    }
}
