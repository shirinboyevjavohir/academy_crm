package academy.crm.dto;

import jakarta.validation.constraints.*;

public class StudentDTO {

    @NotBlank(message = "Ism bo'sh bo'lmasligi kerak")
    private String firstName;

    @NotBlank(message = "Familiya bo'sh bo'lmasligi kerak")
    private String lastName;

    @NotBlank(message = "Telefon raqami bo'sh bo'lmasligi kerak")
    @Pattern(regexp = "^\\+998[0-9]{9}$", message = "Telefon raqami +998XXXXXXXXX formatida bo'lishi kerak")
    private String phoneNumber;

    @NotNull(message = "Yosh ko'rsatilishi shart")
    @Min(value = 7, message = "Yosh kamida 7 da bo'lishi kerak")
    private Integer age;

    private String address;

    public StudentDTO() {
    }

    public StudentDTO(String firstName, String lastName, String phoneNumber, Integer age, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}