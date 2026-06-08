package com.example.dangky.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class CandidateUpdateDTO {

    @NotBlank(message = "Địa chỉ không được để trống")
    private String address;

    @Size(max = 200, message = "Giới thiệu bản thân tối đa 200 ký tự")
    private String bio;

    // Default constructor
    public CandidateUpdateDTO() {
    }

    // All-args constructor
    public CandidateUpdateDTO(String address, String bio) {
        this.address = address;
        this.bio = bio;
    }

    // Getters and Setters
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
