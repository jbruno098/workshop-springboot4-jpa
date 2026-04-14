package com.educandoweb.course.Entities.pk;

import com.educandoweb.course.Entities.Order;
import com.educandoweb.course.Entities.Product;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class OrderItemPK {

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    public Order getOrder() {
        return order;
    }

    public OrderItemPK setOrder(Order order) {
        this.order = order;
        return this;
    }

    public Product getProduct() {
        return product;
    }

    public OrderItemPK setProduct(Product product) {
        this.product = product;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        OrderItemPK that = (OrderItemPK) o;
        return order.equals(that.order) && product.equals(that.product);
    }

    @Override
    public int hashCode() {
        int result = order.hashCode();
        result = 31 * result + product.hashCode();
        return result;
    }
}
