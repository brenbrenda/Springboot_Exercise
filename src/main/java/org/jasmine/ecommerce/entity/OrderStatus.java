package org.jasmine.ecommerce.entity;

public enum OrderStatus {
    pending(1),
    confirmed(2),
    shipped(3),
    delivered(4),
    canceled(5);

    private int value;

    private OrderStatus(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static OrderStatus fromValue(int value) {
        for (OrderStatus status : OrderStatus.values()) {
            if (status.getValue() == value) {
                return status;
            }
        }
        throw new IllegalArgumentException("Invalid value for OrderStatus: " + value);
    }
}

