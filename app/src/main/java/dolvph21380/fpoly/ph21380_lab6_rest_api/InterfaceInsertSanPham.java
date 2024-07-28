package dolvph21380.fpoly.ph21380_lab6_rest_api;

public interface InterfaceInsertSanPham {
    @FormUrlEncoded
    @POST("insert2.php")
    Call<SvrResponseSanPham> insertSanPham(
            @Field("MaSP") String MaSP,
            @Field("TenSP") String TenSP,
            @Field("MoTa") String MoTa
    );
}