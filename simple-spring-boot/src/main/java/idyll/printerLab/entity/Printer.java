package idyll.printerLab.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Printer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String brand;
    private String model;
    private int pagePerMinute;
    private boolean colorPrinter;

    public Printer() {
    }

    public Printer(String brand, String model, int pagePerMinute, boolean colorPrinter) {
        this.brand = brand;
        this.model = model;
        this.pagePerMinute = pagePerMinute;
        this.colorPrinter = colorPrinter;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPagePerMinute() {
        return pagePerMinute;
    }

    public void setPagePerMinute(int pagePerMinute) {
        this.pagePerMinute = pagePerMinute;
    }

    public boolean isColorPrinter() {
        return colorPrinter;
    }

    public void setColorPrinter(boolean colorPrinter) {
        this.colorPrinter = colorPrinter;
    }
}