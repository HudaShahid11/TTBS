package com.kewo.youthservices;



import java.io.Serializable;

public class CourseResponse implements Serializable {

    private String  id;
    private String first_name;
    private String last_name;
    private String father_name;
    private String phone_number;
    private String whatsapp_number;
    private String email;
    private String cnic;
    private String category;
    private String certified_by;
    private String avg_rating;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getFather_name() {
        return father_name;
    }

    public void setFather_name(String father_name) {
        this.father_name = father_name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getWhatsapp_number() {
        return whatsapp_number;
    }

    public void setWhatsapp_number(String whatsapp_number) {
        this.whatsapp_number = whatsapp_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCnic() {
        return cnic;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCertified_by() {
        return certified_by;
    }

    public void setCertified_by(String certified_by) {
        this.certified_by = certified_by;
    }

    public String getAvg_rating() {
        return avg_rating;
    }

    public void setAvg_rating(String avg_rating) {
        this.avg_rating = avg_rating;
    }

    @Override
    public String toString() {
        return "CourseResponse{" +
                "id='" + id + '\'' +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", father_name='" + father_name + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", whatsapp_number='" + whatsapp_number + '\'' +
                ", email='" + email + '\'' +
                ", cnic='" + cnic + '\'' +
                ", category='" + category + '\'' +
                ", certified_by='" + certified_by + '\'' +
                ", avg_rating='" + avg_rating + '\'' +
                '}';
    }
}

