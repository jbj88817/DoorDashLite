package us.bojie.doordashlite.data.models;

import com.google.gson.annotations.SerializedName;

public class AuthResponse {


    /**
     * token : eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJvcmlnX2lhdCI6MTU2NzAyMjE1OSwidXNlciI6eyJhdXRoX3ZlcnNpb24iOjIsImlzX3N0YWZmIjpmYWxzZSwiaWQiOjIyMjU1Nzg1LCJlbWFpbCI6ImRkLWludGVydmlld0Bkb29yZGFzaC5jb20ifSwiZXhwIjoxNTY3MjgxMzU5fQ.ZapRO8ed8RmSlY0rzgNdKJ3hu_fxVSfnl-hHrhGiqv8
     * is_password_secure : true
     */

    @SerializedName("token")
    private String token;
    @SerializedName("is_password_secure")
    private boolean isPasswordSecure;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public boolean isIsPasswordSecure() {
        return isPasswordSecure;
    }

    public void setIsPasswordSecure(boolean isPasswordSecure) {
        this.isPasswordSecure = isPasswordSecure;
    }
}
