package CompositionLab;
class Address{
    private int streetNumber;
    private int houseNumber;
    private int cityCode;
    private String cityName;

    public Address() {}
    
    public Address(int streetNumber, int houseNumber, String cityName, int cityCode) {
        this.streetNumber = streetNumber;
        this.houseNumber = houseNumber;
        this.cityName = cityName;
        this.cityCode = cityCode;
    }

    public int getStreetNumber(){
        return streetNumber;
    }
    public void setStreetNumber(int streetNumber){
        this.streetNumber = 6;
    }
    public int getHouseNumber(){
        return houseNumber;
    }
    public void setHouseNumber(int houseNumber){
        this.houseNumber = 10;
    }
    public int getcityCode(){
        return cityCode;
    }
    public void setCityCode(int cityCode){
        this.cityCode = 4400;
    }
    public String getCityName(){
        return cityName;
    }
    public void setCityName(String cityName){
        this.cityName = "Karachi";
    }

    public void displayAddress() {
        System.out.println("House #" + houseNumber + ", Street #" + streetNumber +  ", " + cityName + ", Code: " + cityCode);
    }
}