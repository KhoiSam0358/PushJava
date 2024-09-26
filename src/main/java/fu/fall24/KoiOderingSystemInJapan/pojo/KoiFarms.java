package fu.fall24.KoiOderingSystemInJapan.pojo;


import jakarta.persistence.*;

@Entity
@Table(name = "koi_farms")
public class KoiFarms {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "farm_name")
    private String farmName;

    @Column(name = "farm_phone_number")
    private String farmPhoneNumber;

    @Column(name = "farm_email")
    private String farmEmail;

    @Column(name = "farm_address")
    private String farmAddress;

    @Column(name = "farm_image")
    private String farmImage;

    @Column(name = "website")
    private String website;

    @Column(name = "is_active")
    private int isActive;

    public KoiFarms() {
    }

    public KoiFarms(int id, String farmName, String farmPhoneNumber, String farmEmail, String farmAddress, String farmImage, String website, int isActive) {
        this.id = id;
        this.farmName = farmName;
        this.farmPhoneNumber = farmPhoneNumber;
        this.farmEmail = farmEmail;
        this.farmAddress = farmAddress;
        this.farmImage = farmImage;
        this.website = website;
        this.isActive = isActive;
    }

    public int getId() {
        return id;
    }

    public String getFarmName() {
        return farmName;
    }

    public void setFarmName(String farmName) {
        this.farmName = farmName;
    }

    public String getFarmPhoneNumber() {
        return farmPhoneNumber;
    }

    public void setFarmPhoneNumber(String farmPhoneNumber) {
        this.farmPhoneNumber = farmPhoneNumber;
    }

    public String getFarmEmail() {
        return farmEmail;
    }

    public void setFarmEmail(String farmEmail) {
        this.farmEmail = farmEmail;
    }

    public String getFarmAddress() {
        return farmAddress;
    }

    public void setFarmAddress(String farmAddress) {
        this.farmAddress = farmAddress;
    }

    public String getFarmImage() {
        return farmImage;
    }

    public void setFarmImage(String farmImage) {
        this.farmImage = farmImage;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public int getIsActive() {
        return isActive;
    }

    public void setIsActive(int isActive) {
        this.isActive = isActive;
    }
}
