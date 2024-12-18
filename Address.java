public class Address {
    private String cityName;
    private String zipCode;
    private String districtName;
    private String stateName;
    private String countryName;

    public Address(String cityName,String zipCode,String districtName,String stateName,String countryName ){
        this.cityName=cityName;
        this.zipCode=zipCode;
        this.districtName=districtName;
        this.stateName=stateName;
        this.countryName=countryName;

    }

    private String getCityName(){
        return this.cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}
