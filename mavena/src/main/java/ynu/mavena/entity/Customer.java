package ynu.mavena.entity;

public class Customer {

    private int customer_id;

    private int store_id;

    private String first_name;

    private String password;

    private int address_id;

    public Customer(String first_name,String password){
        this.first_name = first_name;
        this.password = password;
    }
    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public int getStore_id() {
        return store_id;
    }

    public void setStore_id(int store_id) {
        this.store_id = store_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAddress_id() {
        return address_id;
    }

    public void setAddress_id(int address_id) {
        this.address_id = address_id;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customer_id=" + customer_id +
                ", store_id=" + store_id +
                ", first_name='" + first_name + '\'' +
                ", password='" + password + '\'' +
                ", address_id=" + address_id +
                '}';
    }
}
