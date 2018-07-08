package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional //W testach cofa te zmiany od razu
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ProductDao productDao;
    @Autowired
    private ItemDao itemDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product1 = new Product("Product 1");

        Item item1 = new Item(product1, new BigDecimal(10), 3);
        Item item2 = new Item(product1, new BigDecimal(20), 6);
        Item item3 = new Item(product1, new BigDecimal(30), 9);

        List<Item> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
        items.add(item3);

        Invoice invoice = new Invoice("16/06/2018");

        invoice.setItems(items);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);
        product1.setItems(items);

        //When

        //bez cascade to wszystkie po kolei zapisy robimy sami
        invoiceDao.save(invoice);
        productDao.save(product1);
        itemDao.save(item1);
        itemDao.save(item2);
        itemDao.save(item3);
        int invoiceId = invoice.getId();

        //Then
        Assert.assertNotEquals(0, invoiceId);
    }
}
