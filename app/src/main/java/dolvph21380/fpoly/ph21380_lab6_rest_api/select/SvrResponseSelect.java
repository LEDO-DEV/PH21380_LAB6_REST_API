package dolvph21380.fpoly.ph21380_lab6_rest_api.select;

public class SvrResponseSelect {//get
    private SanPham[] products;
    private String message;

    public SanPham[] getProducts() {
        return products;
    }

    public String getMessage() {
        return message;
    }
}