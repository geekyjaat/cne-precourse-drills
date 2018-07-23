package com.galvanize;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Business implements Addressable {
    private final String name;
    private final List<Address> addresses;

    public Business(String name) {
        this.name = name;
        this.addresses = new ArrayList<>();
    }

	@Override
	public List<Address> getAddresses() {
		return addresses;
	}

	@Override
	public void addAddress(Address address) {
		addresses.add(address);
    }
    
    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Business business = (Business) o;
        return Objects.equals(name, business.name) &&
                Objects.equals(addresses, business.addresses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, addresses);
    }

    @Override
    public String toString() {
        return "Business{" +
                "name='" + name + '\'' +
                ", addresses='" + addresses + '\'' +
                '}';
    }
}