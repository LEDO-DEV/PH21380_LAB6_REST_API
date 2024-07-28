package dolvph21380.fpoly.ph21380_lab6_rest_api.select;

public interface InterfaceSelect {
    @GET("select.php")
    Call<SvrResponseSelect> selectSanPham();
}
