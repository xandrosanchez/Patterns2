public class Driver {
    private String name;
    private String licenseCategory;

    public Driver(String name, String licenseCategory) {
        this.name = name;
        this.licenseCategory = licenseCategory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLicenseCategory() {
        return licenseCategory;
    }

    public void setLicenseCategory(String licenseCategory) {
        this.licenseCategory = licenseCategory;
    }

    // Getters and setters
}
