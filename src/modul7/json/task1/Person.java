package modul7.json.task1;

import java.util.Arrays;

public class Person {

  private int id;
  private String name;
  private boolean permanent;
  private Address address;
  private int[] phoneNumbers;
  private String role;
  private String[] cities;

  public Person() {
  }

  public Person(int id, String name, boolean permanent, Address address, int[] phoneNumbers,
      String role, String[] cities) {
    this.id = id;
    this.name = name;
    this.permanent = permanent;
    this.address = address;
    this.phoneNumbers = phoneNumbers;
    this.role = role;
    this.cities = cities;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public boolean isPermanent() {
    return permanent;
  }

  public void setPermanent(boolean permanent) {
    this.permanent = permanent;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public int[] getPhoneNumbers() {
    return phoneNumbers;
  }

  public void setPhoneNumbers(int[] phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }

  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public String[] getCities() {
    return cities;
  }

  public void setCities(String[] cities) {
    this.cities = cities;
  }

  @Override
  public String toString() {
    return "Person{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", permanent=" + permanent +
        ", address=" + address +
        ", phoneNumbers=" + Arrays.toString(phoneNumbers) +
        ", role='" + role + '\'' +
        ", cities=" + Arrays.toString(cities) +
        '}';
  }
}
