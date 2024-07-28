package dolvph21380.fpoly.ph21380_lab6_rest_api.delete;

public interface InterfaceDelete {
    @FormUrlEncoded
    @POST("delete.php")
    Call<SvrResponseSanPham> deleteSanPham(
            @Field("MaSP") String MaSP
    );
}